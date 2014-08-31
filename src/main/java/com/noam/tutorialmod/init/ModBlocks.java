package com.noam.tutorialmod.init;

import com.noam.tutorialmod.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockTM PathLight = new BlockPathLight();

    public static void init()
    {
        GameRegistry.registerBlock(PathLight, "PathLight");
    }
}
