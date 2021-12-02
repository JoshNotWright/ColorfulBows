package me.joshwright.coloredbows;

import me.joshwright.coloredbows.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ColoredBows extends JavaPlugin {

    @Override
    public void onEnable() {
//        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        ItemManager.init();
    }
}
