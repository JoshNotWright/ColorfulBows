package me.joshwright.colorfulbows;

import me.joshwright.colorfulbows.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorfulBows extends JavaPlugin {

    @Override
    public void onEnable() {
//        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        ItemManager.init();
    }
}
