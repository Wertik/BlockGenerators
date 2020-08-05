package space.devport.wertik.blockgenerators;

import lombok.Getter;
import space.devport.utils.DevportPlugin;
import space.devport.wertik.blockgenerators.commands.BlockGeneratorCommand;
import space.devport.wertik.blockgenerators.listeners.BlockBreakListener;
import space.devport.wertik.blockgenerators.system.generator.GeneratorManager;
import space.devport.wertik.blockgenerators.system.preset.PresetManager;

public class GeneratorPlugin extends DevportPlugin {

    @Getter
    private static GeneratorPlugin instance;

    @Getter
    private PresetManager presetManager;

    @Getter
    private GeneratorManager generatorManager;

    @Override
    public void onPluginEnable() {
        instance = this;

        consoleOutput.setColors(true);

        presetManager = new PresetManager();
        generatorManager = new GeneratorManager();

        new BlockBreakListener(this);

        addMainCommand(new BlockGeneratorCommand());
    }

    @Override
    public void onPluginDisable() {

    }

    @Override
    public void onReload() {

    }

    @Override
    public boolean useLanguage() {
        return true;
    }

    @Override
    public boolean useMenus() {
        return true;
    }

    @Override
    public boolean useHolograms() {
        return false;
    }
}
