package space.devport.wertik.blockgenerators.system.gui;

import org.bukkit.entity.Player;
import space.devport.utils.menu.Menu;
import space.devport.wertik.blockgenerators.system.generator.struct.Generator;

public class BlockGeneratorMenu extends Menu {

    private final Player player;

    private final Generator generator;

    public BlockGeneratorMenu(Player player, Generator generator) {
        super("block_gen_menu");

        this.player = player;
        this.generator = generator;

        build();
    }

    private void build() {

    }
}