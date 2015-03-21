package com.minecraftdevin.fruitcharcoal.block;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.ServerChatEvent;
import org.apache.logging.log4j.Level;

public class BlockPumpkinCharcoal extends BlockHelper {
    public BlockPumpkinCharcoal()
    {
        super(Material.gourd);
        this.setBlockName("pumpkinCharcoal");
        setHardness(1.0F);
        setStepSound(soundTypeWood);
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

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int metadata) {
        if ((side == 3) && (metadata == 0)) { return frontIcon; }
        else if ((side == 1) || (side == 0)) { return topIcon; }
        else if ((metadata & 7) == side) {
            return frontIcon;
        }
        else { return sideIcon; }
    }
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int whichDirectionFacing = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        int blockSideWithFace = whichDirectionFacing;
        //int height = y;
        // int X_COORD = x;
        // int Z_COORD = z;
        //FMLLog.log(Reference.MOD_ID, Level.INFO, "Coordinates: Y: " + height + " Side with face: " + blockSideWithFace);
        //Minecraft.getMinecraft().thePlayer.sendChatMessage("X: " + X_COORD + " Y: " + height + " Z: " + Z_COORD);
        if (whichDirectionFacing == 0)
            blockSideWithFace = 3;
        else if (whichDirectionFacing == 1)
            blockSideWithFace = 4;
        else if (whichDirectionFacing == 3)
            blockSideWithFace = 5;


        world.setBlockMetadataWithNotify(x, y, z, blockSideWithFace, 2);
    }





    /*
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
    */
}

