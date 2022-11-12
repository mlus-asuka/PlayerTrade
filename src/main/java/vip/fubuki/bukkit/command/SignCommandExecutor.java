package vip.fubuki.bukkit.command;

import cn.chuanwise.xiaoming.minecraft.bukkit.XMMCBukkitPlugin;
import cn.chuanwise.xiaoming.minecraft.xiaoming.XMMCXiaoMingPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class SignCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equalsIgnoreCase("daka")||command.getName().equalsIgnoreCase("qiandao")){
            if (sender instanceof Player){
                Map map=new HashMap<>();
                map.put("SignRequest","true");
                map.put("Player",((Player) sender).getPlayer().getName());
                XMMCBukkitPlugin.getInstance().getClient().getClientContact().sendMessage(map.toString());
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
