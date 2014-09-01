package com.noam.tutorialmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cheeseburger), " b ", "mhm", " b ", 'b', Items.bread, 'm', Items.milk_bucket, 'h', Items.cooked_beef));

    }
}
