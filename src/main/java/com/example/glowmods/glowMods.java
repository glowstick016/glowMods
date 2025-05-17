//Package import
package com.example.glowmods;

//Minecraft imports
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.ModEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.Logger;


//Custom Imports
import com.example.glowmods.item.ModItems;

// META-INF/mods.toml file
@Mod(GlowMods.MOD_ID)
public class GlowMods {

    // Defining mod ID
    public static final String MOD_ID = "glowmods";

    // Making the logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Constructor to hold all of the mod data
    public GlowMods() {

        //Import a bus event
        IEventBus modEventBus = Minecraft.getInstance().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register Mod Items
        ModItems.register(modEventBus);
    }

    private void commonSetup(final net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DM: {}", MOD_ID);
    }

    // You can use SubscribeEvent and let the Event Bus discover all methods to call on the Event Bus
    @SubscribeEvent
    public void onModSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM MOD SETUP");
    }
}