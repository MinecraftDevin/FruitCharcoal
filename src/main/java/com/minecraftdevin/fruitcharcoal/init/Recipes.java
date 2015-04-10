package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import cpw.mods.fml.common.asm.transformers.ItemStackTransformer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemColored;
import net.minecraft.item.ItemStack;
import sun.security.krb5.Config;

public class Recipes
{
    public static void init()
    {
        if (!ConfigurationHelper.Realism) {
            GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.potatoCharcoal), 0.1F);
            GameRegistry.addSmelting(Blocks.melon_block, new ItemStack(ModBlocks.watermelonCharcoalBlock), 0.1F);
            GameRegistry.addSmelting(Blocks.pumpkin, new ItemStack(ModBlocks.pumpkinCharcoalBlock), 0.1F);
            GameRegistry.addSmelting(Items.reeds, new ItemStack(ModItems.sugarcaneCharcoal), 0.1F);
            GameRegistry.addSmelting(Items.apple, new ItemStack(ModItems.appleCharcoal), 0.1F);
            GameRegistry.addSmelting(Items.egg, new ItemStack(ModItems.eggCharcoal), 0.1F);
            GameRegistry.addSmelting(Items.carrot, new ItemStack(ModItems.carrotCharcoal), 0.1F);
            GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 2), new ItemStack(ModItems.cactusCharcoal), 0.1F);
            GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 1), new ItemStack(ModItems.charcoalCharcoal), 0.1F);
            // Compressed Blocks
            GameRegistry.addSmelting(ModItems.appleCharcoal, new ItemStack(ModBlocks.appleCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModItems.cactusCharcoal, new ItemStack(ModBlocks.cactusCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModItems.carrotCharcoal, new ItemStack(ModBlocks.carrotCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModItems.eggCharcoal, new ItemStack(ModBlocks.eggCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModItems.potatoCharcoal, new ItemStack(ModBlocks.potatoCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModBlocks.pumpkinCharcoalBlock, new ItemStack(ModBlocks.pumpkinCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModItems.sugarcaneCharcoal, new ItemStack(ModBlocks.sugarcaneCompressedBlock), 0.2F);
            GameRegistry.addSmelting(ModBlocks.watermelonCharcoalBlock, new ItemStack(ModBlocks.watermelonCompressedBlock), 0.2F);
        }
        if (ConfigurationHelper.Realism) {
            GameRegistry.addSmelting(Items.baked_potato, new ItemStack(ModItems.biofuelBits,ConfigurationHelper.PotatoBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.melon, new ItemStack(ModItems.biofuelBits,ConfigurationHelper.MelonBiofuel), 0.1F);
            GameRegistry.addSmelting(Blocks.pumpkin, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.PumpkinBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.reeds, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.SugarcaneBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.apple, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.AppleBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.carrot, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.CarrotBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.wheat, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.WheatBiofuel), 0.1F);
            GameRegistry.addSmelting(Items.nether_wart, new ItemStack(ModItems.biofuelBits, ConfigurationHelper.NetherwartBiofuel), 0.1F);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.biofuel), new ItemStack(ModItems.biofuelBits), new ItemStack(ModItems.biofuelBits), new ItemStack(ModItems.biofuelBits), new ItemStack(ModItems.biofuelBits));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.biofuelBits, 4), new ItemStack(ModItems.biofuel));
        }

    }
}
