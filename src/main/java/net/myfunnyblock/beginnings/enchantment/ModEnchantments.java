package net.myfunnyblock.beginnings.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.myfunnyblock.beginnings.Beginnings;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Beginnings.MOD_ID);

    public static RegistryObject<Enchantment> CURSEDSMITE = ENCHANTMENTS.register("cursed_smite",
            () -> new CursedSmiteEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON,
                    EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
