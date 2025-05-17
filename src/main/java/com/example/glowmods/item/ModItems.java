//Package import
package com.example.glowmods.item;

//Custom Imports
import com.example.glowmods.item.tool.ModToolItems;

//Minecraft Imports
import net.minecraftforge.eventbus.api.IEventBus;

//Making the ModItems class
public class ModItems {

    //Making the register event
    public static void register(IEventBus eventBus) {
        // Register tools
        ModToolItems.register(eventBus);

    }
}