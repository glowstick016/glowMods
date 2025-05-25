//Custom Imports
package com.example.glowmods.item.material;
import com.example.glowmods.item.material.Gems;

//Minecraft Imports
import com.example.glowmods.GlowMods;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModMaterialItems {

    // Register method to be called from ModItems
    public static void register(IEventBus eventBus) {
        Gems.register(eventBus);
    }
}