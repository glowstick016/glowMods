//Package Import
package com.example.glowmods.item.tool.topaz;


//Custom Import for the Topaz tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

public class TopazShovel extends ShovelItem {

    // Constructor for the Topaz Shovel
    public TopazShovel() {
        // Passing the Topaz tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Topaz Shovel"); 
    }
}
