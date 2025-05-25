//Package Import
package com.example.glowmods.item.tool.sapphire;


//Custom Import for the Sapphire tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class SapphirePickaxe extends PickaxeItem {

    // Constructor for the Sapphire Pickaxe
    public SapphirePickaxe() {
        // Passing the Sapphire tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Sapphire Pickaxe");  // You can customize the name here
    }
}
