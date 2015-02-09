package com.minecraftdevin.fruitcharcoal.block;
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
    private IIcon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        icons = new IIcon[4];

        for (int i = 0; i < icons.length; i++) {
            icons[i] = par1IconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_" + i);
            //icons[i] = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + "pumpkinCharcoal_top");
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1) {
        switch (par1) {
            case 0:
                return icons[1];
            case 1:
                return icons[2];
            default:
                return icons[3];
        }
    }
}

