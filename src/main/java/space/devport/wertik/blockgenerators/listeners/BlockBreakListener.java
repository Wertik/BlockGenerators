package space.devport.wertik.blockgenerators.listeners;

import lombok.RequiredArgsConstructor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import space.devport.utils.DevportListener;
import space.devport.wertik.blockgenerators.GeneratorPlugin;
import space.devport.wertik.blockgenerators.system.generator.struct.Generator;

@RequiredArgsConstructor
public class BlockBreakListener extends DevportListener {

    private final GeneratorPlugin plugin;

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Generator generator = plugin.getGeneratorManager().getGenerator(event.getBlock().getLocation());

        if (generator == null)
            return;

        if (generator.getTask() != null) {
            event.setCancelled(true);
            return;
        }

        event.setDropItems(false);
        event.setExpToDrop(0);

        generator.breakBlock(event.getPlayer());
    }
}