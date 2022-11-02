package vip.fubuki.bukkit.command;

import cn.chuanwise.xiaoming.minecraft.bukkit.XMMCBukkitPlugin;
import cn.chuanwise.xiaoming.minecraft.bukkit.net.Client;
import cn.chuanwise.xiaoming.minecraft.bukkit.net.XMMCClientContact;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import vip.fubuki.bukkit.util.NBTAPIWrapper;

import java.util.HashMap;
import java.util.Map;


public class CarriageCommandExecutor implements CommandExecutor {

    public CarriageCommandExecutor(){}

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String label, String[] args) {
        if (command.getName().equalsIgnoreCase("sell")) {
            if (sender instanceof Player){
                if (args.length > 3) {
                    sender.sendMessage("Too many arguments!");
                    return false;
                }
                if (args.length < 1) {
                    sender.sendMessage("Not enough arguments!");
                    return false;
                }
                else{
                    int amount;
                    Player player=(Player) sender;
                    if(args.length==2){
                        amount=Integer.parseInt(args[1]);
                    }
                    else{
                        amount=player.getInventory().getItemInMainHand().getAmount();
                    }
                    int price=Integer.parseInt(args[0]);
                    if(amount<1||amount>64||amount>player.getInventory().getItemInMainHand().getAmount()){
                        sender.sendMessage("Illegal amount");
                    }
                    else if (price<0) {
                        sender.sendMessage("Illegal price");
                    }
                    else{
                        selling(player,amount,price);
                    }
                    return true;
                }
            }
            else{
                sender.sendMessage("该指令仅限玩家执行");
                return true;
            }
        }
        else return false;
    }
    public void selling(Player player,int amount,int price){
        ItemStack item= player.getInventory().getItemInMainHand();
        if(CommunicateToXiaoMing(player,item,price,amount)){
            item.setAmount(item.getAmount()-amount);
            player.getInventory().setItemInMainHand(item);
        }
        else player.sendMessage("上架失败,服务器尚未连接到小明机器人。");
    }

    public boolean CommunicateToXiaoMing(Player player,ItemStack itemStack,Integer price,int amount){
        Client client= XMMCBukkitPlugin.getInstance().getClient();
        if (!client.isConnected()) {
            XMMCBukkitPlugin.getInstance().communicator().warn(player, "net.state.disconnected");
            return false;
        } else {
            NBTItem item=new NBTItem(itemStack);
            XMMCClientContact clientContact = client.getClientContact();
            HashMap<Object, Object> map = new HashMap<>();
            String nbt=NBTItem.convertItemtoNBT(item.getItem()).toString();
            Map NBT=NBTAPIWrapper.StringToMap(nbt,2);
            nbt=nbt.replace("{","?");
            nbt=nbt.replace("}","*");
            nbt=nbt.replace(",","~");
            nbt=nbt.replace(":","$");
            nbt=nbt.replace("\"","%");
            map.put("NBT",nbt);
            map.put("RequestType","sell");
            map.put("price", price);
            map.put("amount",amount);
            map.put("Player",player.getName());
            map.put("id",NBT.get("id"));
            clientContact.sendMessage(map.toString());
            return true;
        }
    }
}
