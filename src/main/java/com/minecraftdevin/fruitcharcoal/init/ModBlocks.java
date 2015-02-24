package com.minecraftdevin.fruitcharcoal.init;
import com.minecraftdevin.fruitcharcoal.block.BlockHelper;
import com.minecraftdevin.fruitcharcoal.block.BlockPumpkinCharcoal;
import com.minecraftdevin.fruitcharcoal.block.BlockWatermelonCharcoal;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockHelper pumpkinCharcoalBlock = new BlockPumpkinCharcoal();
    public static final BlockHelper watermelonCharcoalBlock = new BlockWatermelonCharcoal();
    public static void init()
    {
        GameRegistry.registerBlock(pumpkinCharcoalBlock, "pumpkinCharcoalBlock");
        GameRegistry.registerBlock(watermelonCharcoalBlock, "watermelonCharcoalBlock");

    }

}
