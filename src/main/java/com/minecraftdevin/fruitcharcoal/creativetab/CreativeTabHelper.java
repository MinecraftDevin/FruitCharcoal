package com.minecraftdevin.fruitcharcoal.creativetab;

import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import com.minecraftdevin.fruitcharcoal.init.ModItems;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHelper
{
    public static final CreativeTabs FruitCharcoalCreativeTab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.potatoCharcoal;
        }
    };
}