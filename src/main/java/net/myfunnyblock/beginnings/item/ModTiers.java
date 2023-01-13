package net.myfunnyblock.beginnings.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier DarkEssence = new ForgeTier(4, 5000, 1.5f, 1.5f,
            36, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.DARKESSENCEINGOT.get()));


}
