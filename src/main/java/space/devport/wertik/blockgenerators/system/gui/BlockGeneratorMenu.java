package space.devport.wertik.blockgenerators.system.gui;

import org.bukkit.entity.Player;
import space.devport.utils.menu.Menu;

public class BlockGeneratorMenu extends Menu {

    private final Player player;

    public BlockGeneratorMenu(Player player) {
        super("block_gen_menu");
        this.player = player;

        build();
    }

    private void build() {

    }
}
