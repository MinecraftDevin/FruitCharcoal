package com.minecraftdevin.fruitcharcoal.init;
import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.block.BlockHelper;
import com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal;
import com.minecraftdevin.fruitcharcoal.block.BlockWatermelonCharcoal;
import com.minecraftdevin.fruitcharcoal.block.compressed.*;
import com.minecraftdevin.fruitcharcoal.block.doublecompressed.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockHelper pumpkinCharcoalBlock = new BlockPumpkinCharcoal();
    public static final BlockHelper watermelonCharcoalBlock = new BlockWatermelonCharcoal();
    //Compressed Blocks
    public static final BlockHelper appleCompressedBlock = new BlockAppleCompressed();
    public static final BlockHelper cactusCompressedBlock = new BlockCactusCompressed();
    public static final BlockHelper carrotCompressedBlock = new BlockCarrotCompressed();
    public static final BlockHelper eggCompressedBlock = new BlockEggCompressed();
    public static final BlockHelper potatoCompressedBlock = new BlockPotatoCompressed();
    public static final BlockHelper pumpkinCompressedBlock = new BlockPumpkinCompressed();
    public static final BlockHelper sugarcaneCompressedBlock = new BlockSugarcaneCompressed();
    public static final BlockHelper watermelonCompressedBlock = new BlockWatermelonCompressed();
    //Double Compressed Block
    public static final BlockHelper appleDoubleCompressedBlock = new BlockAppleDoubleCompressed();
    public static final BlockHelper cactusDoubleCompressedBlock = new BlockCactusDoubleCompressed();
    public static final BlockHelper carrotDoubleCompressedBlock = new BlockCarrotDoubleCompressed();
    public static final BlockHelper eggDoubleCompressedBlock = new BlockEggDoubleCompressed();
    public static final BlockHelper potatoDoubleCompressedBlock = new BlockPotatoDoubleCompressed();
    public static final BlockHelper pumpkinDoubleCompressedBlock = new BlockPumpkinDoubleCompressed();
    public static final BlockHelper sugarcaneDoubleCompressedBlock = new BlockSugarcaneDoubleCompressed();
    public static final BlockHelper watermelonDoubleCompressedBlock = new BlockWatermelonDoubleCompressed();

    public static void init()
    {
        if (!ConfigurationHelper.Realism) {
            GameRegistry.registerBlock(pumpkinCharcoalBlock, "pumpkinCharcoalBlock");
            GameRegistry.registerBlock(watermelonCharcoalBlock, "watermelonCharcoalBlock");
            //Compressed Blocks
            GameRegistry.registerBlock(appleCompressedBlock, "appleCompressedBlock");
            GameRegistry.registerBlock(cactusCompressedBlock, "cactusCompressedBlock");
            GameRegistry.registerBlock(carrotCompressedBlock, "carrotCompressedBlock");
            GameRegistry.registerBlock(eggCompressedBlock, "eggCompressedBlock");
            GameRegistry.registerBlock(potatoCompressedBlock, "potatoCompressedBlock");
            GameRegistry.registerBlock(pumpkinCompressedBlock, "pumpkinCompressedBlock");
            GameRegistry.registerBlock(sugarcaneCompressedBlock, "sugarcaneCompressedBlock");
            GameRegistry.registerBlock(watermelonCompressedBlock, "watermelonCompressedBlock");
            //Double Compressed Blocks
            GameRegistry.registerBlock(appleDoubleCompressedBlock, "appleDoubleCompressedBlock");
            GameRegistry.registerBlock(cactusDoubleCompressedBlock, "cactusDoubleCompressedBlock");
            GameRegistry.registerBlock(carrotDoubleCompressedBlock, "carrotDoubleCompressedBlock");
            GameRegistry.registerBlock(eggDoubleCompressedBlock, "eggDoubleCompressedBlock");
            GameRegistry.registerBlock(potatoDoubleCompressedBlock, "potatoDoubleCompressedBlock");
            GameRegistry.registerBlock(pumpkinDoubleCompressedBlock, "pumpkinDoubleCompressedBlock");
            GameRegistry.registerBlock(sugarcaneDoubleCompressedBlock, "sugarcaneDoubleCompressedBlock");
            GameRegistry.registerBlock(watermelonDoubleCompressedBlock, "watermelonDoubleCompressedBlock");

        }

    }

}
