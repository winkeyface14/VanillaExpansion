package net.winkeyface14.vanilla_expansion.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.winkeyface14.vanilla_expansion.TheVanillaExpansion;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ItemBase {


    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, name), function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TheVanillaExpansion.MOD_ID, name)))));
    }

    public static void registerModItems() {
        TheVanillaExpansion.LOGGER.info("Registering Item for " + TheVanillaExpansion.MOD_ID);
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}

