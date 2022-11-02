package vip.fubuki.bukkit.command;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import vip.fubuki.bukkit.PlayerTrade;
import vip.fubuki.bukkit.util.NBTAPIWrapper;

public class ggtest implements CommandExecutor {

    public ggtest(){
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equals("detest")){
            Player player=(Player)sender;
            String NBT=args[0];
            ItemStack itemStack= NBTAPIWrapper.convertNBTtoItem(NBT);
            player.getInventory().addItem(itemStack);
            player.getInventory().addItem(new ItemStack(Material.DIAMOND,1));
        }
        return false;
    }
}
