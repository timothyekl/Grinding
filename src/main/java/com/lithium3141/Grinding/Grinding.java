package com.lithium3141.Grinding;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class Grinding extends JavaPlugin {

    /**
     * The number of gravel pieces required to craft a single flint. Should be greater than 1 and less than 9.
     */
    public static final int GRAVEL_FLINT_RATIO = 9;

    /**
     * Common prefix for log statements emitted by this plugin.
     */
    public static final String LOG_PREFIX = "[Grinding] ";

    @Override
    public void onEnable() {
        System.out.println(LOG_PREFIX + "enabled!");

        // Create gravel -> flint recipe
        ItemStack flintStack = new ItemStack(Material.FLINT, 1);
        ShapelessRecipe flintRecipe = new ShapelessRecipe(flintStack);
        flintRecipe.addIngredient(GRAVEL_FLINT_RATIO, new MaterialData(Material.GRAVEL));
        this.getServer().addRecipe(flintRecipe);
    }

    @Override
    public void onDisable() {
        System.out.println(LOG_PREFIX + "disabled!");
    }
}
