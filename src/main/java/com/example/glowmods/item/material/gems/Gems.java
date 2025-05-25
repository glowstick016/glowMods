//Custom Imports
package com.example.glowmods.item.material.gems;


//Minecraft Imports
import com.example.glowmods.GlowMods;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class Gems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlowMods.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", 
        () -> new Item(new Item.Properties().stacksTo(64))
    );

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
        () -> new Item(new Item.Properties().stacksTo(64))
    );

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
        () -> new Item(new Item.Properties().stacksTo(64))
    );

    // Register method to be called from ModItems
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}