package space.devport.wertik.blockgenerators.system.generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import space.devport.utils.item.ItemBuilder;
import space.devport.utils.text.Placeholders;
import space.devport.wertik.blockgenerators.GeneratorPlugin;
import space.devport.wertik.blockgenerators.system.generator.struct.Generator;
import space.devport.wertik.blockgenerators.system.preset.struct.GeneratorPreset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GeneratorManager {

    private final GeneratorPlugin plugin;

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private final Set<Generator> cache = new HashSet<>();

    public GeneratorManager() {
        this.plugin = GeneratorPlugin.getInstance();
    }

    @Nullable
    public Generator getGenerator(UUID uuid) {
        for (Generator generator : cache)
            if (generator.getUuid().equals(uuid))
                return generator;
        return null;
    }

    @Nullable
    public Generator getGenerator(Location location) {
        for (Generator generator : cache)
            if (generator.getBlock().getLocation().equals(location))
                return generator;
        return null;
    }

    /**
     * Create a generator at location.
     */
    public Generator createGenerator(Location location, GeneratorPreset preset) {
        Generator generator = new Generator(location);
        cache.add(generator);
        return generator;
    }

    public void removeGenerator(UUID uuid) {

    }

    public void save() {

    }

    public void load() {

    }

    public void afterLoad() {

    }

    public ItemStack createItem(Generator generator) {
        ItemBuilder itemBuilder = new ItemBuilder(generator.getPreset().getItem());
        Placeholders placeholders = new Placeholders()
                .add("%regenDelay%", generator.getPreset().getRegenDelay());
        itemBuilder.parseWith(placeholders);
        return itemBuilder.build();
    }

    public Set<Generator> getCache() {
        return Collections.unmodifiableSet(cache);
    }
}
