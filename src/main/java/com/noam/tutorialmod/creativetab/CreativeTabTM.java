package com.noam.tutorialmod.creativetab;

import com.noam.tutorialmod.init.ModItems;
import com.noam.tutorialmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM
{
    public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem() {
            return ModItems.cheeseburger;
        }

    };
}
