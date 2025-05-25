//Package Import
package com.example.glowmods.item.tool.topaz;


//Custom Import for the Topaz tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class TopazSword extends SwordItem {

    // Constructor for the Topaz Sword
    public TopazSword() {
        // Passing the Topaz tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Topaz Sword");  // You can customize the name here
    }
}
