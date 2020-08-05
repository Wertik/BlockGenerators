package space.devport.wertik.blockgenerators.system.generator.struct;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import space.devport.wertik.blockgenerators.GeneratorPlugin;
import space.devport.wertik.blockgenerators.system.preset.struct.GeneratorPreset;

import java.util.Objects;
import java.util.UUID;

public class Generator {

    @Getter
    private final UUID uuid;

    @Getter
    @Setter
    private transient Block block;

    @Getter
    private final JsonLocation location;

    @Getter
    @Setter
    private String presetName;

    @Getter
    @Setter
    private transient GeneratorPreset preset;

    @Getter
    private transient BukkitTask task;

    @Getter
    private transient Material originalMaterial;

    public Generator(Block block) {
        this.uuid = UUID.randomUUID();
        this.block = block;
        this.location = new JsonLocation(block.getLocation());
    }

    public Generator(Location location) {
        this(location.getBlock());
    }

    public void convertLocation() {

    }

    public void convertPreset() {
        if (presetName == null) return;
        this.preset = GeneratorPlugin.getInstance().getPresetManager().getPreset(presetName).orElse(null);
    }

    public void destroy() {

    }

    public void revert() {

    }

    public void breakBlock(Player player) {
        this.originalMaterial = block.getType();

        block.setType(preset.getReplaceBlock().get());

        task = Bukkit.getScheduler().runTaskLaterAsynchronously(GeneratorPlugin.getInstance(), () -> {
            Bukkit.getScheduler().runTask(GeneratorPlugin.getInstance(), () -> block.setType(preset.getRegenerateInto().get()));
            this.task = null;
        }, preset.getRegenDelay().getInt() * 20);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Generator generator = (Generator) o;
        return uuid.equals(generator.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}