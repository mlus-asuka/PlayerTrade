package vip.fubuki.bukkit.util;

import de.tr7zw.nbtapi.*;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class NBTAPIWrapper {
    private static Constructor<NBTContainer> nbtContainer;
    private static Constructor<NBTTileEntity> nbtTileEntity;
    private static Constructor<NBTEntity> nbtEntity;
    private static Method mergeCompound;

    public static ItemStack convertNBTtoItem(String nbt) {
        return NBTItem.convertNBTtoItem(NBTAPIWrapper.newNBTContainer(nbt));
    }

    public static NBTContainer newNBTContainer(String value) {
        try {
            if (nbtContainer == null) nbtContainer = NBTContainer.class.getConstructor(String.class);
            return nbtContainer.newInstance(value);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static NBTTileEntity newNBTTileEntity(BlockState state) {
        try {
            if (nbtTileEntity == null) nbtTileEntity = NBTTileEntity.class.getConstructor(BlockState.class);
            return nbtTileEntity.newInstance(state);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static NBTEntity newNBTEntity(Entity entity) {
        try {
            if (nbtEntity == null) nbtEntity = NBTEntity.class.getConstructor(Entity.class);
            return nbtEntity.newInstance(entity);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void mergeCompound(Object obj, String nbt) {
        try {
            if (mergeCompound == null) mergeCompound = NBTCompound
                    .class.getMethod("mergeCompound", NBTCompound.class);
            mergeCompound.invoke(obj, newNBTContainer(nbt));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    public static Map<String, Object> StringToMap(String param,int Type) {
        Map<String, Object> map = new HashMap<>();


        //去除{}
        String s1 = param.replace("{", "");
        String s2 = s1.replace("}", "");
        String s3 = s2.trim();


        //1.根据逗号分隔
        String[] split = s3.split(",");

        for (int i = split.length - 1; i >= 0; i--) {

            String trim = split[i].trim();
            String[] split1=null;
            if(Type==1) {
                split1 = trim.split("=");
            }
            else if (Type==2){
                split1 = trim.split(":");
            }
            if(split1.length>2){
                map.put(split1[0], split1[1]+":"+split1[2]);
            }else {
                map.put(split1[0], split1[1]);
            }
        }

        return map;
    }
}
