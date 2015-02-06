package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        // Potato Charcoal Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.potatoCharcoalBlock), "sss",  "sss", "sss", 's', new ItemStack(ModItems.potatoCharcoal));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.potatoCharcoal,0,9), new ItemStack(ModBlocks.potatoCharcoalBlock));
        GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.potatoCharcoal), 0.1F);

        // Carrot Charcoal Blocks
    }
}
