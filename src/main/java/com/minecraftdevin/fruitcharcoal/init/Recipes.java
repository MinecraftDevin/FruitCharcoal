package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemColored;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        // Potato Charcoal
        GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.potatoCharcoal), 0.1F);

        // Melon Charcoal
        // -- Add blocks.
        GameRegistry.addSmelting(Blocks.melon_block, new ItemStack(ModBlocks.watermelonCharcoalBlock), 0.1F);

        // Pumpkin Charcoal
        GameRegistry.addSmelting(Blocks.pumpkin, new ItemStack(ModBlocks.pumpkinCharcoalBlock), 0.1F);

        // Sugarcane Charcoal
        GameRegistry.addSmelting(Items.reeds, new ItemStack(ModItems.sugarcaneCharcoal), 0.1F);

        // Apple Charcoal
        GameRegistry.addSmelting(Items.apple, new ItemStack(ModItems.appleCharcoal), 0.1F);

        // Egg Charcoal
        GameRegistry.addSmelting(Items.egg, new ItemStack(ModItems.eggCharcoal), 0.1F);

        // Carrot Charcoal
        GameRegistry.addSmelting(Items.carrot, new ItemStack(ModItems.carrotCharcoal), 0.1F);

        // Cactus Charcoal
        GameRegistry.addSmelting(new ItemStack(Items.dye,1,2), new ItemStack(ModItems.cactusCharcoal), 0.1F);

        // Charcoal Charcoal
        GameRegistry.addSmelting(new ItemStack(Items.coal,1,1), new ItemStack(ModItems.charcoalCharcoal), 0.1F);


    }
}
