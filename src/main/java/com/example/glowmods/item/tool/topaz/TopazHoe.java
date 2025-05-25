//Package Import
package com.example.glowmods.item.tool.topaz;


//Custom Import for the Topaz tier
import com.example.glowmods.item.tool.ModTiers.GemTier;

//Minecraft Imports
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class TopazHoe extends HoeItem {

    // Constructor for the Topaz Hoe
    public TopazHoe() {
        // Passing the Topaz tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Topaz Hoe");  // You can customize the name here
    }
}
