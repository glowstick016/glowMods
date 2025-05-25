//Package Import
package com.example.glowmods.item.tool.topaz;


//Custom Import for the Topaz tier
import com.example.glowmods.item.tool.ModTiers.GemTier;

//Minecraft Imports
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class TopazAxe extends AxeItem {

    // Constructor for the Topaz Axe
    public TopazAxe() {
        // Passing the Topaz tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Topaz Axe");  // You can customize the name here
    }
}
