package vip.fubuki.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import vip.fubuki.bukkit.command.BuyCommandExecutor;
import vip.fubuki.bukkit.command.CarriageCommandExecutor;
import vip.fubuki.bukkit.command.SignCommandExecutor;
import vip.fubuki.bukkit.listener.ExtendProtocolListener;

import java.util.Objects;

public final class PlayerTrade extends JavaPlugin {

    private static PlayerTrade instance;

    public static PlayerTrade getInstance() {
        if (instance == null) {
            throw new IllegalStateException("plugin hadn't been loaded!");
        }
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("sell")).setExecutor(new CarriageCommandExecutor());
        Objects.requireNonNull(this.getCommand("buy")).setExecutor(new BuyCommandExecutor());
        Objects.requireNonNull(this.getCommand("daka")).setExecutor(new SignCommandExecutor());
        Objects.requireNonNull(this.getCommand("qiandao")).setExecutor(new SignCommandExecutor());
        getServer().getPluginManager().registerEvents(ExtendProtocolListener.getInstance(), this);
        Bukkit.getConsoleSender().sendMessage("§3PlayerTrade Loaded.");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§3PlayerTrade Disabled.");
    }

}

