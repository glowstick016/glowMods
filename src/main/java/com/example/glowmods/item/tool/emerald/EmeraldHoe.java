//Package Import
package com.example.glowmods.item.tool.emerald;


//Custom Import for the emerald tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class EmeraldHoe extends HoeItem {

    // Constructor for the Emerald Hoe
    public EmeraldHoe() {
        // Passing the Emerald tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Emerald Hoe");  // You can customize the name here
    }
}