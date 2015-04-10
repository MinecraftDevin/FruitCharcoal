package com.minecraftdevin.fruitcharcoal.init;
import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.block.BlockHelper;
import com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal;
import com.minecraftdevin.fruitcharcoal.block.BlockWatermelonCharcoal;
import com.minecraftdevin.fruitcharcoal.block.compressed.*;
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
        }

    }

}
