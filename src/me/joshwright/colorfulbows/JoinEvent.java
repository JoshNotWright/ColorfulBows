package me.joshwright.colorfulbows;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
//        event.getPlayer().setResourcePack(); // Direct download to plugin resource pack
    }
}
