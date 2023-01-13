package net.myfunnyblock.beginnings.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.myfunnyblock.beginnings.Beginnings;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Beginnings.MOD_ID);

    //Add new mods below
    public static final RegistryObject<Item> DARK_BLADE = ITEMS.register("dark_blade",
            () -> new SwordItem(ModTiers.DarkEssence, 5,2f,
                    new Item.Properties().tab(ModCreativeModeTab.Beginnings_TAB)));
    public static final RegistryObject<Item> DARK_BLADE_BROKEN = ITEMS.register("dark_blade_broken",
            () -> new SwordItem(ModTiers.DarkEssence,1, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.Beginnings_TAB)));

    public static final RegistryObject<Item> ABILITY1 = ITEMS.register("ability1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Beginnings_TAB)));

    public static final RegistryObject<Item> DARKESSENCEINGOT = ITEMS.register("dark_essence_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Beginnings_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
