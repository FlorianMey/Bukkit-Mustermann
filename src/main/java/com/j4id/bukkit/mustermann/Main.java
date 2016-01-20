package com.j4id.bukkit.mustermann;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class Main extends JavaPlugin
{
    @Override
    public void onEnable() {
        getServer().broadcastMessage("moin");
    }

    @Override
    public void onDisable() {
    }
}