package space.devport.wertik.blockgenerators.commands;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.Nullable;
import space.devport.utils.commands.MainCommand;
import space.devport.utils.commands.struct.CommandResult;

public class BlockGeneratorCommand extends MainCommand {

    public BlockGeneratorCommand() {
        super("blockgenerators");
    }

    @Override
    protected CommandResult perform(CommandSender sender, String label, String[] args) {
        return super.perform(sender, label, args);
    }

    @Override
    public @Nullable String getDefaultUsage() {
        return "/%label%";
    }

    @Override
    public @Nullable String getDefaultDescription() {
        return "Displays this.";
    }
}