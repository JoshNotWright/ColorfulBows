package me.joshwright.colorfulbows;

import me.joshwright.colorfulbows.items.ItemManager;
import me.joshwright.colorfulbows.items.ParticleEffects;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorfulBows extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        this.getServer().getPluginManager().registerEvents(new ParticleEffects(), this);
        ItemManager.init();
    }
}
