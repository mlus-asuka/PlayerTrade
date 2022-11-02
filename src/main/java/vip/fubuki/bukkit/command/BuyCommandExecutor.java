package vip.fubuki.bukkit.command;

import cn.chuanwise.xiaoming.minecraft.bukkit.XMMCBukkitPlugin;
import cn.chuanwise.xiaoming.minecraft.bukkit.net.Client;
import cn.chuanwise.xiaoming.minecraft.bukkit.net.XMMCClientContact;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class BuyCommandExecutor implements CommandExecutor {

    public BuyCommandExecutor(){}

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("buy")) {
            if (sender instanceof Player) {
                Client client = XMMCBukkitPlugin.getInstance().getClient();
                if (!client.isConnected()) {
                    XMMCBukkitPlugin.getInstance().communicator().warn(sender, "net.state.disconnected");
                    return false;
                } else {
                    if (args.length > 3) {
                        sender.sendMessage("Too many arguments!");
                        return false;
                    }
                    if (args.length < 1) {
                        sender.sendMessage("Not enough arguments!");
                        return false;
                    }
                    int amount;
                    if (args.length == 1) {
                        amount = 1;
                    } else amount = Integer.parseInt(args[1]);
                    if (amount <= 0) {
                        sender.sendMessage("Illegal amount.");
                        return false;
                    } else {
                        int ID = Integer.parseInt(args[0]);
                        if (!client.isConnected()) {
                            XMMCBukkitPlugin.getInstance().communicator().warn(sender, "net.state.disconnected");
                            return false;
                        } else {
                            Player p = (Player) sender;
                            XMMCClientContact clientContact = client.getClientContact();
                            HashMap<Object, Object> map = new HashMap<>();
                            map.put("RequestType", "buy");
                            map.put("ID", ID);
                            map.put("amount", amount);
                            map.put("Player", p.getName());
                            clientContact.sendMessage(map.toString());
                            return true;
                        }
                    }
                }
            }
            else{
                sender.sendMessage("该指令仅限玩家执行");
                return false;
            }
        }
        return true;
    }
}
