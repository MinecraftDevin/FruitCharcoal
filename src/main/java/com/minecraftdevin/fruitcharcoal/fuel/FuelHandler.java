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
        ItemStack itemStack = fuel;
        if (!ConfigurationHelper.Realism) {
            if (fuel.isItemEqual(new ItemStack(ModItems.potatoCharcoal))) {
                return 450;
            }
            // Watermelon Charcoal
            if (fuel.isItemEqual(new ItemStack(ModBlocks.watermelonCharcoalBlock))) {
                return 600;
            }
            // Pumpkin Charcoal
            if (fuel.isItemEqual(new ItemStack(ModBlocks.pumpkinCharcoalBlock))) {
                return 550;
            }
            // Sugarcane Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.sugarcaneCharcoal))) {
                return 250;
            }
            // Apple Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.appleCharcoal))) {
                return 350;
            }
            // Egg Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.eggCharcoal))) {
                return 300;
            }
            // Carrot Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.carrotCharcoal))) {
                return 300;
            }
            if (fuel.isItemEqual(new ItemStack(ModItems.cactusCharcoal))) {
                return 300;
            }
            // Charcoal Charcoal
            if (fuel.isItemEqual(new ItemStack(ModItems.charcoalCharcoal))) {
                return 2200;
            } else {
                return 0;
            }
        }
        if (ConfigurationHelper.Realism) {
            if (fuel.isItemEqual(new ItemStack(ModItems.biofuelBits))) {
                return ConfigurationHelper.BiofuelBitBurnTime;
            }
            if (fuel.isItemEqual(new ItemStack(ModItems.biofuel))) {
                return ConfigurationHelper.BiofuelBurnTime;
            }
            else {
                return 0;
            }
        }
        else { return 0; }
    }
}
