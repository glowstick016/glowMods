//Package Import
package com.example.glowmods.item.tool.sapphire;


//Custom Import for the Sapphire tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class SapphireSword extends SwordItem {

    // Constructor for the Sapphire Sword
    public SapphireSword() {
        // Passing the Sapphire tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Sapphire Sword");  // You can customize the name here
    }
}
