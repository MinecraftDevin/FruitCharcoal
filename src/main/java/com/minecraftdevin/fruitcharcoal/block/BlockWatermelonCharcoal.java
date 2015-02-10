package com.minecraftdevin.fruitcharcoal.block;

import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockWatermelonCharcoal extends BlockHelper
{
    public BlockWatermelonCharcoal()
    {
        super();
        this.setBlockName("watermelonCharcoal");
        setHardness(0.5F);
        setResistance(3.0F);

    }
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon topIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon bottomIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        sideIcon = icon.registerIcon(Reference.MOD_ID + ":watermelonCharcoal_side");
        topIcon = icon.registerIcon(Reference.MOD_ID + ":watermelonCharcoal_top");
        // Yes.. I know, the texture says top. Leave me alone.
        bottomIcon = icon.registerIcon(Reference.MOD_ID + ":watermelonCharcoal_top");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int metadata) {
        if (side == 1 || side == 0) {
            return topIcon;
        }
        else { return sideIcon; }

    }

}