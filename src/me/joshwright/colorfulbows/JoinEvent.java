package me.joshwright.colorfulbows;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().setResourcePack("https://github.com/JoshNotWright/ColorfulBows/releases/download/v1.0/Colorful.Bows.Resources.zip"); // Direct download to plugin resource pack
    }
}
