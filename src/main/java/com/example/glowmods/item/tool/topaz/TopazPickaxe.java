//Package Import
package com.example.glowmods.item.tool.topaz;


//Custom Import for the Topaz tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class TopazPickaxe extends PickaxeItem {

    // Constructor for the Topaz Pickaxe
    public TopazPickaxe() {
        // Passing the Topaz tier, attack damage, and speed
        super(ModToolTiers.GEM, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Topaz Pickaxe");  // You can customize the name here
    }
}
