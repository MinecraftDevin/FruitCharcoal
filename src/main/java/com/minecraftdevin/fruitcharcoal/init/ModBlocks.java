package com.minecraftdevin.fruitcharcoal.init;
import com.minecraftdevin.fruitcharcoal.block.BlockPotatoCharcoal;
import com.minecraftdevin.fruitcharcoal.block.BlockHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockHelper potatoCharcoalBlock = new BlockPotatoCharcoal();

    public static void init()
    {
        GameRegistry.registerBlock(potatoCharcoalBlock, "potatoCharcoalBlock");

    }

}
