package com.minecraftdevin.fruitcharcoal.init;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import sun.security.krb5.Config;

public class StateConfigurations {
    public static void init() {
        FMLLog.log(Reference.MOD_ID, Level.INFO, "You're running version " + Reference.VERSION + " of Fruit Charcoal.");
        if (ConfigurationHelper.Realism) {
            FMLLog.log(Reference.MOD_ID, Level.INFO, "You're using the realistic version of Fruit Charcoal.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Potato Biofuel is set to give: " + ConfigurationHelper.PotatoBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Melon Biofuel is set to give: " + ConfigurationHelper.MelonBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Pumpkin Biofuel is set to give: " + ConfigurationHelper.PumpkinBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Sugarcane Biofuel is set to give: " + ConfigurationHelper.SugarcaneBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Apple Biofuel is set to give: " + ConfigurationHelper.AppleBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Carrot Biofuel is set to give: " + ConfigurationHelper.CarrotBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Cactus Biofuel is set to give: " + ConfigurationHelper.CactusBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Netherwart Biofuel is set to give: " + ConfigurationHelper.NetherwartBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Wheat Biofuel is set to give: " + ConfigurationHelper.WheatBiofuel + " biofuel bits.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Biofuel bits are set to a burn time of: " + ConfigurationHelper.BiofuelBitBurnTime);
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Biofuel is set to a burn time of: " + ConfigurationHelper.BiofuelBurnTime);

        }
        if (!ConfigurationHelper.Realism) {
            FMLLog.log(Reference.MOD_ID, Level.INFO, "You're not using the realistic version of Fruit Charcoal.");
        }
    }
}
