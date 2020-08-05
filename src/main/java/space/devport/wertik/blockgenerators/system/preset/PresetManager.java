package space.devport.wertik.blockgenerators.system.preset;

import org.jetbrains.annotations.Nullable;
import space.devport.wertik.blockgenerators.GeneratorPlugin;
import space.devport.wertik.blockgenerators.system.preset.struct.GeneratorPreset;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PresetManager {

    private final GeneratorPlugin plugin;

    private final Map<String, GeneratorPreset> presets = new HashMap<>();

    public PresetManager() {
        this.plugin = GeneratorPlugin.getInstance();
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