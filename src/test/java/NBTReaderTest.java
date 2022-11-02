import vip.fubuki.bukkit.util.NBTAPIWrapper;

import java.util.Map;

public class NBTReaderTest {
    public static void main(String[] args) {
        String a="{Player=mlus, amount=1, ItemNBT=?id$%minecraft$beacon%~Count$1b*, RequestType=buy}";
        Map map = NBTAPIWrapper.StringToMap(a,1);
        String NBT=(String) map.get("ItemNBT");
        System.out.println(NBT);
        NBT=NBT.replace("?","{");
        NBT=NBT.replace("*","}");
        NBT=NBT.replace("~",",");
        NBT=NBT.replace("$",":");
        NBT=NBT.replace("%","\"");
        System.out.println(NBT);
        Map NBT1= NBTAPIWrapper.StringToMap(NBT,2);
        System.out.println(NBT1);
    }
}
