package com.lithium3141.Grinding;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class Grinding extends JavaPlugin {

    public static final int GRAVEL_FLINT_RATIO = 9;

    @Override
    public void onEnable() {
        System.out.println("Grinding enabled!");

        ItemStack flintStack = new ItemStack(Material.FLINT, 1);
        ShapelessRecipe flintRecipe = new ShapelessRecipe(flintStack);
        for(int i = 0; i < GRAVEL_FLINT_RATIO; i++) {
            flintRecipe.addIngredient(new MaterialData(Material.GRAVEL));
        }

        this.getServer().addRecipe(flintRecipe);
    }

    @Override
    public void onDisable() {
        System.out.println("Grinding disabled!");
    }
}
