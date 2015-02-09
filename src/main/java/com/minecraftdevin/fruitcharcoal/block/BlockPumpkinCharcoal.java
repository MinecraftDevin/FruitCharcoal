package com.minecraftdevin.fruitcharcoal.block;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockPumpkinCharcoal extends BlockHelper {
    public BlockPumpkinCharcoal()
    {
        super();
        this.setBlockName("pumpkinCharcoal");
        setHardness(2.0F);
        setResistance(5.0F);
    }

    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon topIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon bottomIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon frontIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        sideIcon = icon.registerIcon(Reference.MOD_ID + ":pumpkinCharcoal_4");
        topIcon = icon.registerIcon(Reference.MOD_ID + ":pumpkinCharcoal_1");
        bottomIcon = icon.registerIcon(Reference.MOD_ID + ":pumpkinCharcoal_2");
        frontIcon = icon.registerIcon(Reference.MOD_ID + ":pumpkinCharcoal_3");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        if(side == 3){
            return frontIcon;
        }
        if(side == 1){
            return topIcon;
        }
        if(side == 0){
            return bottomIcon;
        } else {
            return sideIcon;
        }
    }
}

