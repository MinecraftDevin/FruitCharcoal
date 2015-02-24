package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.item.*;
import com.minecraftdevin.fruitcharcoal.reference.Names;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{
    public static final ItemHelper potatoCharcoal = new ItemPotatoCharcoal();
    public static final ItemHelper sugarcaneCharcoal = new ItemSugarcaneCharcoal();
    public static final ItemHelper appleCharcoal = new ItemAppleCharcoal();
    public static final ItemHelper eggCharcoal = new ItemEggCharcoal();
    public static final ItemHelper carrotCharcoal = new ItemCarrotCharcoal();
    public static final ItemHelper cactusCharcoal = new ItemCactusCharcoal();
    public static final ItemHelper charcoalCharcoal = new ItemCharcoalCharcoal();

    public static void init()
    {
        GameRegistry.registerItem(potatoCharcoal, Names.Items.POTATO_CHARCOAL);
        GameRegistry.registerItem(sugarcaneCharcoal, Names.Items.SUGARCANE_CHARCOAL);
        GameRegistry.registerItem(appleCharcoal, Names.Items.APPLE_CHARCOAL);
        GameRegistry.registerItem(eggCharcoal, Names.Items.EGG_CHARCOAL);
        GameRegistry.registerItem(carrotCharcoal, Names.Items.CARROT_CHARCOAL);
        GameRegistry.registerItem(cactusCharcoal, Names.Items.CACTUS_CHARCOAL);
        GameRegistry.registerItem(charcoalCharcoal, Names.Items.CHARCOAL_CHARCOAL);
    }
}