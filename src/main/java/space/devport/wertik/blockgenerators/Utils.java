package space.devport.wertik.blockgenerators;

import com.google.common.base.Strings;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.jetbrains.annotations.Nullable;

@UtilityClass
public class Utils {

    @Nullable
    public Material parseMaterial(@Nullable String input) {
        if (Strings.isNullOrEmpty(input)) return null;

        try {
            return Material.valueOf(input.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            BlockGeneratorPlugin.getInstance().getConsoleOutput().debug("Could not parse material " + input);
            return null;
        }
    }
}