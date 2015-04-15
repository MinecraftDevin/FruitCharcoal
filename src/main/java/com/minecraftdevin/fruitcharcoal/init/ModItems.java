package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.item.*;
import com.minecraftdevin.fruitcharcoal.item.SpecialItems.*;
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
    public static final ItemHelper biofuel = new ItemBiofuel();
    public static final ItemHelper biofuelBits = new ItemBiofuelBits();
    // Compressed Charcoals. :D
    public static final ItemHelper charcoalCharcoalCompressed = new ItemCharcoalCharcoalX2();
    public static final ItemHelper charcoalCharcoalCompressedX2 = new ItemCharcoalCharcoalX3();
    public static final ItemHelper charcoalCharcoalCompressedX3 = new ItemCharcoalCharcoalX4();
    // Fruit Charcoals
    public static final ItemHelper brownFruitCharcoal = new ItemBrownFruitCharcoal();
    public static final ItemHelper redFruitCharcoal = new ItemRedFruitCharcoal();
    public static final ItemHelper greenFruitCharcoal = new ItemGreenFruitCharcoal();
    public static final ItemHelper superFruitCharcoal = new ItemSuperFruitCharcoal();


    public static void init()
    {
        if (!ConfigurationHelper.Realism) {
            GameRegistry.registerItem(potatoCharcoal, Names.Items.POTATO_CHARCOAL);
            GameRegistry.registerItem(sugarcaneCharcoal, Names.Items.SUGARCANE_CHARCOAL);
            GameRegistry.registerItem(appleCharcoal, Names.Items.APPLE_CHARCOAL);
            GameRegistry.registerItem(eggCharcoal, Names.Items.EGG_CHARCOAL);
            GameRegistry.registerItem(carrotCharcoal, Names.Items.CARROT_CHARCOAL);
            GameRegistry.registerItem(cactusCharcoal, Names.Items.CACTUS_CHARCOAL);
            GameRegistry.registerItem(charcoalCharcoal, Names.Items.CHARCOAL_CHARCOAL);
            GameRegistry.registerItem(charcoalCharcoalCompressed, Names.Items.CHARCOAL_COMPRESSED);
            GameRegistry.registerItem(charcoalCharcoalCompressedX2, Names.Items.CHARCOAL_COMPRESED_X2);
            GameRegistry.registerItem(charcoalCharcoalCompressedX3, Names.Items.CHARCOAL_COMPRESED_X3);
            GameRegistry.registerItem(brownFruitCharcoal, Names.Items.BROWN_FRUIT_CHARCOAL);
            GameRegistry.registerItem(redFruitCharcoal, Names.Items.RED_FRUIT_CHARCOAL);
            GameRegistry.registerItem(greenFruitCharcoal, Names.Items.GREEN_FRUIT_CHARCOAL);
            GameRegistry.registerItem(superFruitCharcoal, Names.Items.SUPER_FRUIT_CHARCOAL);

        }
        else {
            GameRegistry.registerItem(biofuelBits, Names.Items.BIOFUEL_BITS);
            GameRegistry.registerItem(biofuel, Names.Items.BIOFUEL);
        }
    }
}