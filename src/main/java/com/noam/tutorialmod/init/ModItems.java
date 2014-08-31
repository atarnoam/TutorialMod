package com.noam.tutorialmod.init;

import com.noam.tutorialmod.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTM cheeseburger = new ItemCheeseburger();

    public static void init()
    {
        GameRegistry.registerItem(cheeseburger, "cheeseburger");
    }
}
