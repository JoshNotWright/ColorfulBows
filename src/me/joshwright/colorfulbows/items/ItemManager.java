package me.joshwright.colorfulbows.items;

import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.xenondevs.particle.ParticleEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack pinkString;
    public static ItemStack pinkBow;
    public static ItemStack purpleString;
    public static ItemStack purpleBow;
    public static ItemStack orangeString;
    public static ItemStack orangeBow;
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
        createOrangeString();
        createOrangeBow();
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

    private static void createOrangeString() {
        ItemStack item = new ItemStack(Material.STRING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Orange String");
        List<String> lore = new ArrayList<>();
        lore.add("Where did all those orange sheep go?");
        meta.setLore(lore);
        meta.setCustomModelData(2251005);
        item.setItemMeta(meta);
        orangeString = item;

        item.setAmount(4);
        ShapelessRecipe orangeWoolString = new ShapelessRecipe(NamespacedKey.minecraft("orangestringwool"), item);
        orangeWoolString.addIngredient(1, Material.ORANGE_WOOL);

        Bukkit.addRecipe(orangeWoolString);
    }

    private static void createOrangeBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Orange Bow");
        List<String> lore = new ArrayList<>();
        lore.add("Harness the powers of the orange sheep");
        meta.setLore(lore);
        meta.setCustomModelData(2251006);
        item.setItemMeta(meta);
        orangeBow = item;

        ShapedRecipe orangeStringBow = new ShapedRecipe(NamespacedKey.minecraft("orangestringbow"), item);
        orangeStringBow.shape(" KS", "K S", " KS");
        orangeStringBow.setIngredient('K', Material.STICK);
        orangeStringBow.setIngredient('S',new RecipeChoice.ExactChoice(orangeString));

        Bukkit.addRecipe(orangeStringBow);
    }

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

//    private static void createRedString() {
//        ItemStack item = new ItemStack(Material.STRING, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§4Red String");
//        List<String> lore = new ArrayList<>();
//        lore.add("Where did all those red sheep go?");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251009);
//        item.setItemMeta(meta);
//        redString = item;
//
//        item.setAmount(4);
//        ShapelessRecipe redWoolString = new ShapelessRecipe(NamespacedKey.minecraft("redstringwool"), item);
//        redWoolString.addIngredient(1, Material.RED_WOOL);
//
//        Bukkit.addRecipe(redWoolString);
//    }
//
//    private static void createRedBow() {
//        ItemStack item = new ItemStack(Material.BOW, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§4Red Bow");
//        List<String> lore = new ArrayList<>();
//        lore.add("Harness the powers of the red sheep");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251010);
//        item.setItemMeta(meta);
//        redBow = item;
//
//        ShapedRecipe redStringBow = new ShapedRecipe(NamespacedKey.minecraft("redstringbow"), item);
//        redStringBow.shape(" KS", "K S", " KS");
//        redStringBow.setIngredient('K', Material.STICK);
//        redStringBow.setIngredient('S',new RecipeChoice.ExactChoice(redString));
//
//        Bukkit.addRecipe(redStringBow);
//    }

//    private static void createBlackString() {
//        ItemStack item = new ItemStack(Material.STRING, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§0Black String");
//        List<String> lore = new ArrayList<>();
//        lore.add("Where did all those black sheep go?");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251011);
//        item.setItemMeta(meta);
//        blackString = item;
//
//        item.setAmount(4);
//        ShapelessRecipe blackWoolString = new ShapelessRecipe(NamespacedKey.minecraft("blackstringwool"), item);
//        blackWoolString.addIngredient(1, Material.BLACK_WOOL);
//
//        Bukkit.addRecipe(blackWoolString);
//    }
//
//    private static void createBlackBow() {
//        ItemStack item = new ItemStack(Material.BOW, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName("§0Black Bow");
//        List<String> lore = new ArrayList<>();
//        lore.add("Harness the powers of the black sheep");
//        meta.setLore(lore);
//        meta.setCustomModelData(2251012);
//        item.setItemMeta(meta);
//        blackBow = item;
//
//        ShapedRecipe blackStringBow = new ShapedRecipe(NamespacedKey.minecraft("blackstringbow"), item);
//        blackStringBow.shape(" KS", "K S", " KS");
//        blackStringBow.setIngredient('K', Material.STICK);
//        blackStringBow.setIngredient('S',new RecipeChoice.ExactChoice(blackString));
//
//        Bukkit.addRecipe(blackStringBow);
//    }
}
