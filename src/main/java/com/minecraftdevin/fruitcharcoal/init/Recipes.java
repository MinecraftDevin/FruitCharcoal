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
            GameRegistry.addRecipe(new ItemStack(ModBlocks.appleCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.appleCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.cactusCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.cactusCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.carrotCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.carrotCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.eggCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.eggCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.potatoCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.potatoCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.pumpkinCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.pumpkinCharcoalBlock));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.sugarcaneCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.sugarcaneCharcoal));
            GameRegistry.addRecipe(new ItemStack(ModBlocks.watermelonCompressedBlock), "sss", "sss", "sss", 's', new ItemStack(ModBlocks.watermelonCharcoalBlock));
            // Compressed Blocks -> First stages
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleCharcoal, 9), new ItemStack(ModBlocks.appleCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cactusCharcoal, 9), new ItemStack(ModBlocks.cactusCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.carrotCharcoal, 9), new ItemStack(ModBlocks.carrotCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.eggCharcoal, 9), new ItemStack(ModBlocks.eggCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.eggCharcoal, 9), new ItemStack(ModBlocks.potatoCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pumpkinCharcoalBlock, 9), new ItemStack(ModBlocks.pumpkinCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sugarcaneCharcoal, 9), new ItemStack(ModBlocks.sugarcaneCompressedBlock));
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.watermelonCharcoalBlock, 9), new ItemStack(ModBlocks.watermelonCompressedBlock));

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
