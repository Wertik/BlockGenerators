package space.devport.wertik.blockgenerators.system.preset;

import org.jetbrains.annotations.Nullable;
import space.devport.wertik.blockgenerators.GeneratorPlugin;
import space.devport.wertik.blockgenerators.system.preset.struct.GeneratorPreset;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PresetManager {

    private final GeneratorPlugin plugin;

    private final Map<String, GeneratorPreset> presets = new HashMap<>();

    public PresetManager() {
        this.plugin = GeneratorPlugin.getInstance();
    }

    public Optional<GeneratorPreset> getPreset(String name) {
        return Optional.ofNullable(presets.get(name));
    }

    public void load() {

    }

    public Map<String, GeneratorPreset> getPresets() {
        return Collections.unmodifiableMap(presets);
    }
}