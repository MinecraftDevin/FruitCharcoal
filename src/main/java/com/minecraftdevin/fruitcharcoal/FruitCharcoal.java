package com.minecraftdevin.fruitcharcoal;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.fuel.FuelHandler;
import com.minecraftdevin.fruitcharcoal.init.ModBlocks;
import com.minecraftdevin.fruitcharcoal.init.ModItems;
import com.minecraftdevin.fruitcharcoal.init.Recipes;
import com.minecraftdevin.fruitcharcoal.init.StateConfigurations;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

import java.sql.Ref;
import java.util.logging.Logger;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FruitCharcoal {

    @Mod.Instance("FruitCharcoal")
    public static FruitCharcoal instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
        {
           ConfigurationHelper.init(event.getSuggestedConfigurationFile());
            FMLCommonHandler.instance().bus().register(new ConfigurationHelper());
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Loaded configuration.");
            StateConfigurations.init();
            ModBlocks.init();
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Finished loading blocks... trying items.");
            ModItems.init();
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Items loaded. Heading into Initialization");
        }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
        {
            Recipes.init();
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Recipes loaded.");
            GameRegistry.registerFuelHandler(new FuelHandler());
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Burn times loaded.");
            FMLLog.log(Reference.MOD_ID, Level.INFO, "Initialization finished. Hooray!");
        }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
        {

        }
}