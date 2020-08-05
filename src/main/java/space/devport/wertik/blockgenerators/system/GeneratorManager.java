package space.devport.wertik.blockgenerators.system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bukkit.Location;
import space.devport.wertik.blockgenerators.BlockGeneratorPlugin;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GeneratorManager {

    private final BlockGeneratorPlugin plugin;

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private Set<Generator> cache = new HashSet<>();

    public GeneratorManager() {
        this.plugin = BlockGeneratorPlugin.getInstance();
    }

    public Generator getGenerator(UUID uuid) {

    }

    public Generator getGenerator(Location location) {

    }

    public Generator createGenerator(Location location) {

    }

    public void removeGenerator(UUID uuid) {

    }

    public void save() {

    }

    public void load() {

    }

    public void afterLoad() {

    }

    public Set<Generator> getCache() {
        return Collections.unmodifiableSet(cache);
    }
}
