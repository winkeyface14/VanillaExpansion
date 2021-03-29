package com.winkeyface14.vanillaexpansion.util;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import com.winkeyface14.vanillaexpansion.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VanillaExpansion.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", CharcoalBlock::new);
    public static final RegistryObject<Block> BUNDLED_STICKS_BLOCK = BLOCKS.register("block_of_bundled_sticks", BundledSticksBlock::new);
    public static final RegistryObject<Block> BARREL_OF_APPLES_BLOCK = BLOCKS.register("barrel_of_apples", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_POTATOES_BLOCK = BLOCKS.register("barrel_of_potatoes", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CARROTS_BLOCK = BLOCKS.register("barrel_of_carrots", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_CHORUS_BLOCK = BLOCKS.register("barrel_of_chorus_fruits", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> BARREL_OF_SWTBRY_BLOCK = BLOCKS.register("barrel_of_sweet_berries", BarrelOfAnyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BLOCK = BLOCKS.register("smoked_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_PILLAR = BLOCKS.register("smoked_quartz_pillar", QuartzFamilyPillar::new);
    public static final RegistryObject<Block> CHISELED_SMOKED_QUARTZ_BLOCK = BLOCKS.register("chiseled_smoked_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ = BLOCKS.register("smooth_smoked_quartz", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BRICKS = BLOCKS.register("smoked_quartz_bricks", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BLOCK = BLOCKS.register("burnt_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_PILLAR = BLOCKS.register("burnt_quartz_pillar", QuartzFamilyPillar::new);
    public static final RegistryObject<Block> CHISELED_BURNT_QUARTZ_BLOCK = BLOCKS.register("chiseled_burnt_quartz_block", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ = BLOCKS.register("smooth_burnt_quartz", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BRICKS = BLOCKS.register("burnt_quartz_bricks", QuartzFamilyBlock::new);
    public static final RegistryObject<Block> FIRED_BRICKS = BLOCKS.register("fired_bricks", FiredBricks::new);
    public static final RegistryObject<Block> EMPOWERED_NETHERITE_BLOCK = BLOCKS.register("empowered_netherite_block", EmpNetheriteBlock::new);

    // Stairs
    public static final RegistryObject<Block> SMOKED_QUARTZ_STAIRS = BLOCKS.register("smoked_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ_STAIRS = BLOCKS.register("smooth_smoked_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_STAIRS = BLOCKS.register("burnt_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ_STAIRS = BLOCKS.register("smooth_burnt_quartz_stairs", QuartzFamilyStairs::new);
    public static final RegistryObject<Block> FIRED_BRICKS_STAIRS = BLOCKS.register("fired_bricks_stairs", FiredBricksStairs::new);

    // Walls
    public static final RegistryObject<Block> SMOKED_QUARTZ_WALL = BLOCKS.register("smoked_quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> QUARTZ_WALL = BLOCKS.register("quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_WALL = BLOCKS.register("burnt_quartz_wall", QuartzFamilyWall::new);
    public static final RegistryObject<Block> FIRED_BRICKS_WALL = BLOCKS.register("fired_bricks_wall", FiredBricksWall::new);

    // Slabs
    public static final RegistryObject<Block> SMOKED_QUARTZ_SLAB = BLOCKS.register("smoked_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOOTH_SMOKED_QUARTZ_SLAB = BLOCKS.register("smooth_smoked_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = BLOCKS.register("quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOKED_QUARTZ_BRICKS_SLAB = BLOCKS.register("smoked_quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_SLAB = BLOCKS.register("burnt_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> SMOOTH_BURNT_QUARTZ_SLAB = BLOCKS.register("smooth_burnt_quartz_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> BURNT_QUARTZ_BRICKS_SLAB = BLOCKS.register("burnt_quartz_bricks_slab", QuartzFamilySlab::new);
    public static final RegistryObject<Block> FIRED_BRICKS_SLAB = BLOCKS.register("fired_bricks_slab", FiredBricksSlab::new);


}
