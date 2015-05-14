package com.minecraftdevin.fruitcharcoal.Configuration;

import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHelper
{
    public static Configuration configuration;
    public static boolean Realism = true;
    public static boolean RegisterEnergyValuesForBiofuel = true;
    public static int PotatoBiofuel = 2;
    public static int MelonBiofuel = 1;
    public static int PumpkinBiofuel = 5;
    public static int SugarcaneBiofuel = 3;
    public static int AppleBiofuel = 1;
    public static int CarrotBiofuel = 2;
    public static int CactusBiofuel = 3;
    public static int NetherwartBiofuel = 2;
    public static int BiofuelBurnTime = 1200;
    public static int BiofuelBitBurnTime = 200;
    public static int WheatBiofuel = 5;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        Realism = configuration.getBoolean("Realism", Configuration.CATEGORY_GENERAL, true, "Enable this configuration option to change all the items to more realistic 'biofuel' versions.");
        RegisterEnergyValuesForBiofuel = configuration.getBoolean("EE3 Energy Values", Configuration.CATEGORY_GENERAL, true, "Enable this to have Energy Values on biofuels.");
        PotatoBiofuel = configuration.getInt("Potato Biofuel Bits", Configuration.CATEGORY_GENERAL, 2, 1, 64,  "Configure the amount of biofuel bits Potatoes will give.");
        MelonBiofuel = configuration.getInt("Melon Biofuel Bits", Configuration.CATEGORY_GENERAL, 1, 1, 64, "Configure the amount of biofuel bits Melons will give.");
        PumpkinBiofuel = configuration.getInt("Pumpkin Biofuel Bits", Configuration.CATEGORY_GENERAL, 5, 1, 64, "Configure the amount of biofuel bits Pumpkins will give.");
        SugarcaneBiofuel = configuration.getInt("Sugarcane Biofuel Bits", Configuration.CATEGORY_GENERAL, 3, 1, 64, "Configure the amount of biofuel bits Sugarcane will give.");
        AppleBiofuel = configuration.getInt("Apple Biofuel Bits", Configuration.CATEGORY_GENERAL, 1, 1, 64, "Configure the amount of biofuel bits Apples will give.");
        CarrotBiofuel = configuration.getInt("Carrot Biofuel Bits", Configuration.CATEGORY_GENERAL, 2, 1, 64, "Configure the amount of biofuel bits Carrots will give.");
        CactusBiofuel = configuration.getInt("Cactus Biofuel Bits", Configuration.CATEGORY_GENERAL, 3, 1, 64, "Configure the amount of biofuel bits Cacti will give.");
        NetherwartBiofuel = configuration.getInt("Netherwart Biofuel Bits", Configuration.CATEGORY_GENERAL, 1, 1, 64, "Configure the amount of biofuel bits Netherwart will give.");
        WheatBiofuel = configuration.getInt("Wheat Biofuel Bits", Configuration.CATEGORY_GENERAL, 5, 1, 64, "Configure the amount of biofuel bits Wheat will give.");
        BiofuelBurnTime = configuration.getInt("Biofuel Burn Time", Configuration.CATEGORY_GENERAL, 1200, 1, 12800, "Configure the burn time of Biofuel.");
        BiofuelBitBurnTime = configuration.getInt("Biofuel Bits Burn Time", Configuration.CATEGORY_GENERAL, 200, 1, 12800, "Configure the burn time of Biofuel Bits.");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}