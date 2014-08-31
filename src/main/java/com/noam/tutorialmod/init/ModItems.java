package com.noam.tutorialmod.init;

import com.noam.tutorialmod.item.*;
import com.noam.tutorialmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTM cheeseburger = new ItemCheeseburger();

    public static void init()
    {
        GameRegistry.registerItem(cheeseburger, "cheeseburger");
    }
}
