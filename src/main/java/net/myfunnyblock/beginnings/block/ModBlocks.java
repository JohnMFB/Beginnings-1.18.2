package net.myfunnyblock.beginnings.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.myfunnyblock.beginnings.Beginnings;
import net.myfunnyblock.beginnings.item.ModCreativeModeTab;
import net.myfunnyblock.beginnings.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    //Mineable Tag


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Beginnings.MOD_ID);

    public static final RegistryObject<Block> DarkEssenceBlock = registerBlock("dark_essence_block", 
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.Beginnings_TAB);

    public static final RegistryObject<Block> UNSTABLEEssenceBlock = registerBlock("unstable_essence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.Beginnings_TAB);

    private static <T extends Block> RegistryObject<T>
    registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        //Also registering the block after its called
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    //T MUST extend block tab

    private static <T extends Block>RegistryObject<Item>
    registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        //Registering new block item associated with a block
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


        public static void register(IEventBus eventBus){
            BLOCKS.register(eventBus);

    }
}
