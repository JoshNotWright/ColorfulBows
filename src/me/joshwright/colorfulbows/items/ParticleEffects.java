package me.joshwright.colorfulbows.items;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import static me.joshwright.colorfulbows.items.ItemManager.*;

public class ParticleEffects implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {

        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR) || (!event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasCustomModelData()))  {
            return;
        }

        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getCustomModelData() == (pinkBow.getItemMeta().getCustomModelData())) {
            event.getPlayer().getWorld().spawnParticle(Particle.REDSTONE,event.getPlayer().getLocation(), 14, 0.1f, 0.1f, 0.1f, 0,
                    new Particle.DustOptions(Color.fromRGB(255,20,147), 1));
        }

        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getCustomModelData() == (purpleBow.getItemMeta().getCustomModelData())) {
            event.getPlayer().getWorld().spawnParticle(Particle.REDSTONE,event.getPlayer().getLocation(), 14, 0.1f, 0.1f, 0.1f, 0,
                    new Particle.DustOptions(Color.fromRGB(75,0,130), 1));
        }

        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getCustomModelData() == (orangeBow.getItemMeta().getCustomModelData())) {
            event.getPlayer().getWorld().spawnParticle(Particle.REDSTONE,event.getPlayer().getLocation(), 14, 0.1f, 0.1f, 0.1f, 0,
                    new Particle.DustOptions(Color.fromRGB(255,140,0), 1));
        }
    }
}
