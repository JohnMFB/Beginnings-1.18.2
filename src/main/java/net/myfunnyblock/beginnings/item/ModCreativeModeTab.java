package net.myfunnyblock.beginnings.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Beginnings_TAB = new CreativeModeTab("beginningstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARKESSENCEINGOT.get());

        }
    };
}
