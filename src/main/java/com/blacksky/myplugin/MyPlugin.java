package com.blacksky.myplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    
    private static MyPlugin instance;
    
    public static MyPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("MyPlugin Started!");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hello")) {
            sender.sendMessage("world" );
        }

        return false;
    }

}
