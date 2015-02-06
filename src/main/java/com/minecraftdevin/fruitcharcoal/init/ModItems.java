package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.item.ItemPotatoCharcoal;
import com.minecraftdevin.fruitcharcoal.reference.Names;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import com.minecraftdevin.fruitcharcoal.item.ItemHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{
    public static final ItemHelper potatoCharcoal = new ItemPotatoCharcoal();

    public static void init()
    {
        GameRegistry.registerItem(potatoCharcoal, Names.Items.POTATO_CHARCOAL);
    }
}