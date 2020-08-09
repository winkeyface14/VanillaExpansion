package com.winkeyface14.vanillaexpansion;

import com.winkeyface14.vanillaexpansion.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("vanilla_expansion")
public class VanillaExpansion
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "vanilla_expansion";

    public VanillaExpansion() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup ITEM_TAB = new ItemGroup("VnlExtItemsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COAL_CHUNK.get());
        }
    };

    public static final ItemGroup TOOL_TAB = new ItemGroup("VnlExtToolsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.EMERALD_PICKAXE.get());
        }
    };

    public static final ItemGroup BLOCK_TAB = new ItemGroup("VnlExtBlocksTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CHARCOAL_BLOCK.get());
        }
    };

}
