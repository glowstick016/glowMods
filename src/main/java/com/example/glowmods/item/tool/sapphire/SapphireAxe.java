//Package Import
package com.example.glowmods.item.tool.sapphire;


//Custom Import for the Sapphire tier
import com.example.glowmods.item.tool.ModTiers.GemTier;

//Minecraft Imports
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class SapphireAxe extends AxeItem {

    // Constructor for the Sapphire Axe
    public SapphireAxe() {
        // Passing the Sapphire tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Sapphire Axe");  // You can customize the name here
    }
}
