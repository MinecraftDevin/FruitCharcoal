package com.minecraftdevin.fruitcharcoal.creativetab;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import com.minecraftdevin.fruitcharcoal.init.ModItems;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHelper {
    public static final CreativeTabs FruitCharcoalCreativeTab = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public ItemStack getIconItemStack() {
            if (!ConfigurationHelper.Realism) {
                return new ItemStack(ModItems.potatoCharcoal);
            }
            else if (ConfigurationHelper.Realism) {
                return new ItemStack(ModItems.biofuel);
            }
          else { return null; }
        }
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
}