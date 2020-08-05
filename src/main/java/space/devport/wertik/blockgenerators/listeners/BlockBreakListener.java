package space.devport.wertik.blockgenerators.listeners;

import lombok.RequiredArgsConstructor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import space.devport.utils.DevportListener;
import space.devport.wertik.blockgenerators.BlockGeneratorPlugin;

@RequiredArgsConstructor
public class BlockBreakListener extends DevportListener {

    private final BlockGeneratorPlugin plugin;

    @EventHandler
    public void onBreak(BlockBreakEvent e) {

    }
}