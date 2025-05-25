//Package Import
package com.example.glowmods.item.tool.sapphire;


//Custom Import for the Sapphire tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

public class SapphireShovel extends ShovelItem {

    // Constructor for the Sapphire Shovel
    public SapphireShovel() {
        // Passing the Sapphire tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Sapphire Shovel"); 
    }
}
