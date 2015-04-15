package com.minecraftdevin.fruitcharcoal.fuel;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import com.minecraftdevin.fruitcharcoal.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.security.auth.callback.ConfirmationCallback;

public class FuelHandler implements IFuelHandler {

    public int getBurnTime(ItemStack fuel) {
        int potato_charcoal = 600;
        int watermelon_charcoal = 600;
        int pumpkin_charcoal = 550;
        int sugarcane_charcoal = 350;
        int apple_charcoal = 450;
        int egg_charcoal = 350;
        int carrot_charcoal = 400;
        int cactus_charcoal = 800;
        int charcoal_charcoal = 2200;

        ItemStack itemStack = fuel;
        if (!ConfigurationHelper.Realism) {
            if (fuel.isItemEqual(new ItemStack(ModItems.potatoCharcoal))) { return potato_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.watermelonCharcoalBlock))) { return watermelon_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.pumpkinCharcoalBlock))) { return pumpkin_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.sugarcaneCharcoal))) { return sugarcane_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.appleCharcoal))) { return apple_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.eggCharcoal))) { return egg_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.carrotCharcoal))) { return carrot_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.cactusCharcoal))) { return cactus_charcoal; }
            if (fuel.isItemEqual(new ItemStack(ModItems.charcoalCharcoal))) { return charcoal_charcoal; }
            // Compressed Blocks.
            if (fuel.isItemEqual(new ItemStack(ModBlocks.appleCompressedBlock))) { return apple_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.cactusCompressedBlock))) { return cactus_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.carrotCompressedBlock))) { return carrot_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.eggCompressedBlock))) { return egg_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.potatoCompressedBlock))) { return potato_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.pumpkinCompressedBlock))) { return pumpkin_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.sugarcaneCompressedBlock))) { return sugarcane_charcoal * 10; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.watermelonCompressedBlock))) { return watermelon_charcoal * 10; }
            // Double Compressed Blocks
            if (fuel.isItemEqual(new ItemStack(ModBlocks.appleDoubleCompressedBlock))) { return apple_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.cactusDoubleCompressedBlock))) { return cactus_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.carrotDoubleCompressedBlock))) { return carrot_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.eggDoubleCompressedBlock))) { return egg_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.potatoDoubleCompressedBlock))) { return potato_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.pumpkinDoubleCompressedBlock))) { return pumpkin_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.sugarcaneDoubleCompressedBlock))) { return sugarcane_charcoal * 20; }
            if (fuel.isItemEqual(new ItemStack(ModBlocks.watermelonDoubleCompressedBlock))) { return watermelon_charcoal * 20; }
            // Charcoal Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.charcoalCharcoalCompressed))) { return 2800; }
            if (fuel.isItemEqual(new ItemStack(ModItems.charcoalCharcoalCompressedX2))) { return 3400; }
            if (fuel.isItemEqual(new ItemStack(ModItems.charcoalCharcoalCompressedX3))) { return 4000; }
            // Fruit Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.redFruitCharcoal))) { return 512500; }
            if (fuel.isItemEqual(new ItemStack(ModItems.brownFruitCharcoal))) { return 512500; }
            if (fuel.isItemEqual(new ItemStack(ModItems.greenFruitCharcoal))) { return 512500; }
            if (fuel.isItemEqual(new ItemStack(ModItems.superFruitCharcoal))) { return 5125000; }


        }
        if (ConfigurationHelper.Realism) {
            if (fuel.isItemEqual(new ItemStack(ModItems.biofuelBits))) { return ConfigurationHelper.BiofuelBitBurnTime; }
            if (fuel.isItemEqual(new ItemStack(ModItems.biofuel))) { return ConfigurationHelper.BiofuelBurnTime; }
            else { return 0; }
        } else { return 0; }
    }
}
