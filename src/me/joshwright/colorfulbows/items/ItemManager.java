package me.joshwright.colorfulbows.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack pinkString;
    public static ItemStack pinkBow;


    public static void init() {
        createPinkString();
        createPinkBow();
    }

    private static void createPinkString() {
        ItemStack item = new ItemStack(Material.STRING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dPink String");
        List<String> lore = new ArrayList<>();
        lore.add("Where did all those pink sheep go?");
        meta.setLore(lore);
        item.setItemMeta(meta);
        pinkString = item;

        item.setAmount(4);
        ShapelessRecipe pinkWoolString = new ShapelessRecipe(NamespacedKey.minecraft("pinkstringwool"), item);
        pinkWoolString.addIngredient(1, Material.PINK_WOOL);

        Bukkit.addRecipe(pinkWoolString);
    }

    private static void createPinkBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dPink Bow");
        List<String> lore = new ArrayList<>();
        lore.add("Harness the powers of the pink sheep");
        meta.setLore(lore);
        item.setItemMeta(meta);
        pinkBow = item;

        ShapedRecipe pinkStringBow = new ShapedRecipe(NamespacedKey.minecraft("pinkstringbow"), item);
        pinkStringBow.shape(" KS", "K S", " KS");
        pinkStringBow.setIngredient('K', Material.STICK);
        pinkStringBow.setIngredient('S',new RecipeChoice.ExactChoice(pinkString));

        Bukkit.addRecipe(pinkStringBow);
    }
}
