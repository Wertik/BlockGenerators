package space.devport.wertik.blockgenerators.system;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import space.devport.wertik.blockgenerators.system.preset.GeneratorPreset;

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
    @Setter
    private transient long regenerationTime;

    @Getter
    @Setter
    private long timeLeft = -1;

    public Generator(Block block) {
        this.uuid = UUID.randomUUID();
        this.block = block;
        this.location = new JsonLocation(block.getLocation());
    }

    public Generator(Location location) {
        this(location.getBlock());
    }

    public void destroy() {

    }

    public void breakBlock(Player player) {

    }
}