//Package Import
package com.example.glowmods.item.tool.emerald;


//Custom Import for the emerald tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class EmeraldAxe extends AxeItem {

    // Constructor for the Emerald Axe
    public EmeraldAxe() {
        // Passing the Emerald tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Emerald Axe");  // You can customize the name here
    }
}