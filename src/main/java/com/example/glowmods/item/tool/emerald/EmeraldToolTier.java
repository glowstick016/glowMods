//Package Import
package com.example.glowmods.item.tool.emerald;

//Importing Minecraft classes
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

//Make the class that uses the tier
public class EmeraldToolTier implements Tier {
    @Override
    public int getUses() {
        return 2000;  // Example: More durability than diamond
    }

    @Override
    public float getSpeed() {
        return 10.0F;  // Faster than diamond
    }

    @Override
    public float getAttackDamageBonus() {
        return 3.0F;  // Example: More damage than diamond
    }

    @Override
    public int getLevel() {
        return 3;  // Example: Same level as diamond
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Example: Repair with emeralds
        return Ingredient.ofItems(net.minecraft.world.item.Items.EMERALD);
    }
}