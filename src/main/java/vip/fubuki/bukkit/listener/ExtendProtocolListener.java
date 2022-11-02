package vip.fubuki.bukkit.listener;

import cn.chuanwise.xiaoming.minecraft.bukkit.event.XiaoMingMessageEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import vip.fubuki.bukkit.PlayerTrade;
import vip.fubuki.bukkit.util.NBTAPIWrapper;

import java.util.Map;
import java.util.Objects;

public class ExtendProtocolListener
    implements Listener {

    private static final ExtendProtocolListener INSTANCE = new ExtendProtocolListener();

    private ExtendProtocolListener() {}

    public static ExtendProtocolListener getInstance() {
        return INSTANCE;
    }

    @EventHandler
    public void onServerMessage(XiaoMingMessageEvent event) {
        final String message = event.getMessage();
        Map map = NBTAPIWrapper.StringToMap(message,1);
        Player player = PlayerTrade.getInstance().getServer().getPlayer(String.valueOf(map.get("Player")));
        if (map.get("Result")!=null) {
            if ("DENIED".equals(map.get("Result").toString())) {
                Objects.requireNonNull(player).sendMessage("请求失败,当前服务器配置未允许进行商店操作");
                if (map.get("RequestType").toString().equals("sell")) {
                        getItem(map,player);
                }
            }
            else if ("ACCEPT".equals(map.get("Result").toString())) {
                    player.sendMessage("请求成功.");
                    if(map.get("RequestType").toString().equals("buy")){
                       getItem(map,player);
                    }
            }
        }else{
            assert player != null;
            player.sendMessage((String) map.get("Response"));
        }
    }
    private void getItem(Map map,Player player){
        int amount =Integer.parseInt(map.get("amount").toString());
        String NBT=(String) map.get("ItemNBT");
        NBT=NBT.replace("?","{");
        NBT=NBT.replace("*","}");
        NBT=NBT.replace("~",",");
        NBT=NBT.replace("$",":");
        NBT=NBT.replace("%","\"");
        ItemStack itemStack= NBTAPIWrapper.convertNBTtoItem(NBT);
        itemStack.setAmount(amount);
        player.getInventory().addItem(itemStack);
    }
}
