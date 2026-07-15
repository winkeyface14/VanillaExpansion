package net.winkeyface14.vanilla_expansion;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.resources.Identifier;

import net.winkeyface14.vanilla_expansion.creativetab.CreativeTab;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;
import net.winkeyface14.vanilla_expansion.item.FuelsRegHandler;
import net.winkeyface14.vanilla_expansion.util.ConfigHandler;
import net.winkeyface14.vanilla_expansion.util.FeatureEnabledCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExpansion implements ModInitializer {
	public static final String MOD_ID = "vanilla_expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, ConfigHandler.class);

		// Register the condition TYPE
		ResourceConditions.register(FeatureEnabledCondition.TYPE);

		CreativeTab.registerModCreativeTabs();

		ItemRegHandler.registerModItems();
		BlockRegHandler.registerModBlocks();

		FuelsRegHandler.registerFuels();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
