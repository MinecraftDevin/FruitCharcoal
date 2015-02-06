package com.minecraftdevin.fruitcharcoal.fuel;

import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import com.minecraftdevin.fruitcharcoal.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    public int getBurnTime(ItemStack fuel) {
        ItemStack itemStack = fuel;
        if (fuel.isItemEqual(new ItemStack(ModBlocks.potatoCharcoalBlock))) { return 3500; }
        if (fuel.isItemEqual(new ItemStack(ModItems.potatoCharcoal))) { return 350; }
        else {
            return 0;
        }


    }
}
