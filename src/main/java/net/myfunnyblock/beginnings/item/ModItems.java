package net.myfunnyblock.beginnings.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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
    public static final RegistryObject<Item> DARKBLADE = ITEMS.register("dark_blade",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ABILITY1 = ITEMS.register("ability1",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
