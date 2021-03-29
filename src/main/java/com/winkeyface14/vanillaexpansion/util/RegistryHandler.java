package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.armor.ModArmorMaterial;
import com.winkeyface14.vanillaexpansion.blocks.*;
import com.winkeyface14.vanillaexpansion.items.*;
import com.winkeyface14.vanillaexpansion.tools.ModItemTier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExpansion.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VanillaExpansion.MOD_ID);
    //public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, VanillaExpansion.MOD_ID);
    //public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, VanillaExpansion.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    // FOR FUTURE IMPLEMENTATION OF MORE SHEARS
    //public static final RegistryObject<ShearsItem> GOLDEN_SHEARS = ITEMS.register("golden_shears", () -> new ShearsItem(ItemTier.GOLD, new Item.Properties().group(VanillaExpansion.TOOL_TAB)));

    // Tile Entity

    // Containers

}


