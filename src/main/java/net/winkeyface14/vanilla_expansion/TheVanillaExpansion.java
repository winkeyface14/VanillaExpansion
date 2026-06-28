package net.winkeyface14.vanilla_expansion;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.winkeyface14.vanilla_expansion.block.BlockItemBase;
import net.winkeyface14.vanilla_expansion.creativetab.CreativeTab;
import net.winkeyface14.vanilla_expansion.item.ItemBase;
import net.winkeyface14.vanilla_expansion.util.ModFuels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheVanillaExpansion implements ModInitializer {
	public static final String MOD_ID = "vanilla_expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeTab.registerModCreativeTabs();

		ItemBase.registerModItems();
		BlockItemBase.registerModBlocks();

		ModFuels.registerFuels();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
