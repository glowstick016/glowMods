package com.example.glowmods.item.tool;

import com.example.glowmods.GlowMods;
import com.example.glowmods.item.tool.emerald.EmeraldPickaxe;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

public class ModToolItems {
    // Create a Deferred Register for tool items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlowMods.MOD_ID);

    // Register the Emerald Pickaxe
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);

    // Register all items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}