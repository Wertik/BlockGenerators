package space.devport.wertik.blockgenerators.system;

import org.jetbrains.annotations.Nullable;
import space.devport.wertik.blockgenerators.BlockGeneratorPlugin;
import space.devport.wertik.blockgenerators.system.preset.GeneratorPreset;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PresetManager {

    private final BlockGeneratorPlugin plugin;

    private final Map<String, GeneratorPreset> presets = new HashMap<>();

    public PresetManager() {
        this.plugin = BlockGeneratorPlugin.getInstance();
    }

    @Nullable
    public GeneratorPreset getPreset(String name) {
        return presets.getOrDefault(name, null);
    }

    public void load() {

    }

    public Map<String, GeneratorPreset> getPresets() {
        return Collections.unmodifiableMap(presets);
    }
}