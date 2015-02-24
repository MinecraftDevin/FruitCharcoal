package com.minecraftdevin.fruitcharcoal.item;

import com.minecraftdevin.fruitcharcoal.creativetab.CreativeTabHelper;
import com.minecraftdevin.fruitcharcoal.reference.Names;

public class ItemPotatoCharcoal extends ItemHelper
{
    public ItemPotatoCharcoal()
    {
        super();
        this.setUnlocalizedName(Names.Items.POTATO_CHARCOAL);
        this.setCreativeTab(CreativeTabHelper.FruitCharcoalCreativeTab);
    }
}