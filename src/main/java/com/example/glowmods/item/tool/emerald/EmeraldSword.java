//Package Import
package com.example.glowmods.item.tool.emerald;


//Custom Import for the emerald tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class EmeraldSword extends SwordItem {

    // Constructor for the Emerald Sword
    public EmeraldSword() {
        // Passing the Emerald tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Emerald Sword");  // You can customize the name here
    }
}