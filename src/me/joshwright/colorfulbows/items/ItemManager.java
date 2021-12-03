package me.joshwright.colorfulbows.items;

import org.bukkit.*;
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
    public static ItemStack purpleString;
    public static ItemStack purpleBow;
//    public static ItemStack orangeString;
//    public static ItemStack orangeBow;
//    public static ItemStack yellowString;
//    public static ItemStack yellowBow;
//    public static ItemStack redString;
//    public static ItemStack redBow;
//    public static ItemStack blackString;
//    public static ItemStack blackBow;


    public static void init() {
        createPinkString();
        createPinkBow();
        createPurpleString();
        createPurpleBow();
//        createOrangeString();
//        createOrangeBow();
//        createYellowString();
//        createYellowBow();
//        createRedString();
//        createRedBow();
//        createBlackString();
//        createBlackBow();
    }

    private static void createPinkString() {
        ItemStack item = new ItemStack(Material.STRING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dPink String");
        List<String> lore = new ArrayList<>();
        lore.add("Where did all those pink sheep go?");
        meta.setLore(lore);
        meta.setCustomModelData(2251001);
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
        meta.setCustomModelData(2251002);
        item.setItemMeta(meta);
        pinkBow = item;

        ShapedRecipe pinkStringBow = new ShapedRecipe(NamespacedKey.minecraft("pinkstringbow"), item);
        pinkStringBow.shape(" KS", "K S", " KS");
        pinkStringBow.setIngredient('K', Material.STICK);
        pinkStringBow.setIngredient('S',new RecipeChoice.ExactChoice(pinkString));

        Bukkit.addRecipe(pinkStringBow);
    }

    private static void createPurpleString() {
        ItemStack item = new ItemStack(Material.STRING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Purple String");
        List<String> lore = new ArrayList<>();
        lore.add("Where did all those purple sheep go?");
        meta.setLore(lore);
        meta.setCustomModelData(2251003);
        item.setItemMeta(meta);
        purpleString = item;

        item.setAmount(4);
        ShapelessRecipe purpleWoolString = new ShapelessRecipe(NamespacedKey.minecraft("purplestringwool"), item);
        purpleWoolString.addIngredient(1, Material.PURPLE_WOOL);

        Bukkit.addRecipe(purpleWoolString);
    }

    private static void createPurpleBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Purple Bow");
        List<String> lore = new ArrayList<>();
        lore.add("Harness the powers of the purple sheep");
        meta.setLore(lore);
        meta.setCustomModelData(2251004);
        item.setItemMeta(meta);
        purpleBow = item;

        ShapedRecipe purpleStringBow = new ShapedRecipe(NamespacedKey.minecraft("purplestringbow"), item);
        purpleStringBow.shape(" KS", "K S", " KS");
        purpleStringBow.setIngredient('K', Material.STICK);
        purpleStringBow.setIngredient('S',new RecipeChoice.ExactChoice(purpleString));

        Bukkit.addRecipe(purpleStringBow);
    }

//    private static void createOrangeString() {
//        ItemStack item = new ItemStack(Material.STRING, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§6Orange String");
//        List<String> lore = new ArrayList<>();
//        lore.add("Where did all those orange sheep go?");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251005);
//        item.setItemMeta(meta);
//        orangeString = item;
//
//        item.setAmount(4);
//        ShapelessRecipe orangeWoolString = new ShapelessRecipe(NamespacedKey.minecraft("orangestringwool"), item);
//        orangeWoolString.addIngredient(1, Material.ORANGE_WOOL);
//
//        Bukkit.addRecipe(orangeWoolString);
//    }

//    private static void createOrangeBow() {
//        ItemStack item = new ItemStack(Material.BOW, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§6Orange Bow");
//        List<String> lore = new ArrayList<>();
//        lore.add("Harness the powers of the orange sheep");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251006);
//        item.setItemMeta(meta);
//        orangeBow = item;
//
//        ShapedRecipe orangeStringBow = new ShapedRecipe(NamespacedKey.minecraft("orangestringbow"), item);
//        orangeStringBow.shape(" KS", "K S", " KS");
//        orangeStringBow.setIngredient('K', Material.STICK);
//        orangeStringBow.setIngredient('S',new RecipeChoice.ExactChoice(orangeString));
//
//        Bukkit.addRecipe(orangeStringBow);
//    }

//    private static void createYellowString() {
//        ItemStack item = new ItemStack(Material.STRING, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§eYellow String");
//        List<String> lore = new ArrayList<>();
//        lore.add("Where did all those yellow sheep go?");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251007);
//        item.setItemMeta(meta);
//        yellowString = item;
//
//        item.setAmount(4);
//        ShapelessRecipe yellowWoolString = new ShapelessRecipe(NamespacedKey.minecraft("yellowstringwool"), item);
//        yellowWoolString.addIngredient(1, Material.YELLOW_WOOL);
//
//        Bukkit.addRecipe(yellowWoolString);
//    }
//
//    private static void createYellowBow() {
//        ItemStack item = new ItemStack(Material.BOW, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§eYellow Bow");
//        List<String> lore = new ArrayList<>();
//        lore.add("Harness the powers of the yellow sheep");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251008);
//        item.setItemMeta(meta);
//        yellowBow = item;
//
//        ShapedRecipe yellowStringBow = new ShapedRecipe(NamespacedKey.minecraft("yellowstringbow"), item);
//        yellowStringBow.shape(" KS", "K S", " KS");
//        yellowStringBow.setIngredient('K', Material.STICK);
//        yellowStringBow.setIngredient('S',new RecipeChoice.ExactChoice(yellowString));
//
//        Bukkit.addRecipe(yellowStringBow);
//    }

    //TODO createRedString

    //TODO createRedBow

    //TODO createBlackString

    //TODO createBlackBow
}
