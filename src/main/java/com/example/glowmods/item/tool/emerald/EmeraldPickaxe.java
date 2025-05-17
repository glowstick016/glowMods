//Package Import
package com.example.glowmods.item.tool.emerald;


//Custom Import for the emerald tier
import com.example.glowmods.item.tool.ModToolTiers;

//Minecraft Imports
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class EmeraldPickaxe extends PickaxeItem {

    // Constructor for the Emerald Pickaxe
    public EmeraldPickaxe() {
        // Passing the Emerald tier, attack damage, and speed
        super(ModToolTiers.EMERALD, 1, -2.8F, new Item.Properties());
    }

    @Override
    public Component getName(ItemStack stack) {
        return new TextComponent("Emerald Pickaxe");  // You can customize the name here
    }
}