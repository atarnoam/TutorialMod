package com.noam.tutorialmod.init;

import com.noam.tutorialmod.block.*;
import com.noam.tutorialmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTM PathLight = new BlockPathLight();

    public static void init()
    {
        GameRegistry.registerBlock(PathLight, "PathLight");
    }
}
