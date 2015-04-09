package com.minecraftdevin.fruitcharcoal.client.gui;

import com.minecraftdevin.fruitcharcoal.Configuration.ConfigurationHelper;
import com.minecraftdevin.fruitcharcoal.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHelper.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                true,
                GuiConfig.getAbridgedConfigPath(ConfigurationHelper.configuration.toString()));
    }
}
