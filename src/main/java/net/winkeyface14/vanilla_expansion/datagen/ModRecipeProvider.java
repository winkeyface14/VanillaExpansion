package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.levelgen.feature.BlueIceFeature;
import net.winkeyface14.vanilla_expansion.util.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.util.ItemRegHandler;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> REINFORCED_LEATHER_BLASTABLE = List.of(ItemRegHandler.RAW_REINFORCED_LEATHER);
                List<ItemLike> QUARTZ_SMELTABLE = List.of(Items.QUARTZ);
                List<ItemLike> QUARTZ_BLOCK_SMELTABLE = List.of(Items.QUARTZ_BLOCK);
                List<ItemLike> BRICK_SMELTABLE = List.of(Items.BRICK);
                List<ItemLike> BRICK_BLOCK_SMELTABLE = List.of(Items.BRICKS);

                //Reinforced Leather
                this.oreBlasting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.REINFORCED_LEATHER, 0.7f, 100, "reinforced_leather");
                this.oreSmelting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.REINFORCED_LEATHER, 0.7f, 200, "reinforced_leather");

                //Stick Compacting
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, ItemRegHandler.BUNDLED_STICKS);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ItemRegHandler.BUNDLED_STICKS, RecipeCategory.DECORATIONS, BlockRegHandler.BUNDLED_STICKS_BLOCK);

                //Paper Compacting
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.PAPER, RecipeCategory.MISC, ItemRegHandler.PAPER_PILE);

                //Crops Block
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.APPLE, RecipeCategory.DECORATIONS, BlockRegHandler.BARREL_OF_APPLES_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CARROT, RecipeCategory.DECORATIONS, BlockRegHandler.BARREL_OF_CARROTS_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.POTATO, RecipeCategory.DECORATIONS, BlockRegHandler.BARREL_OF_POTATOES_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CHORUS_FRUIT, RecipeCategory.DECORATIONS, BlockRegHandler.BARREL_OF_CHORUS_BLOCK);
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.SWEET_BERRIES, RecipeCategory.DECORATIONS, BlockRegHandler.BARREL_OF_SWEETBERRY_BLOCK);

                //Quartz
                this.twoByTwoPacker(RecipeCategory.MISC,Items.QUARTZ,ItemRegHandler.QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.QUARTZ_SHARD, 4)
                        .requires(Items.QUARTZ)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .group("quartz_shard")
                        .save(output);
                this.wall(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.QUARTZ_WALL, Items.QUARTZ_BLOCK);
                this.wall(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.QUARTZ_BRICKS_WALL, Items.QUARTZ_BRICKS);


                //Smoked Quartz
                this.twoByTwoPacker(RecipeCategory.MISC,ItemRegHandler.SMOKED_QUARTZ,ItemRegHandler.SMOKED_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.SMOKED_QUARTZ_SHARD, 4)
                        .requires(ItemRegHandler.SMOKED_QUARTZ)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .group("smoked_quartz_shard")
                        .save(output);
                this.oreSmelting(QUARTZ_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.SMOKED_QUARTZ, 0.7f, 100, "smoked_quartz");
                this.twoByTwoPacker(RecipeCategory.MISC,BlockRegHandler.SMOKED_QUARTZ_BLOCK, ItemRegHandler.SMOKED_QUARTZ);
                this.oreSmelting(QUARTZ_BLOCK_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, BlockRegHandler.SMOKED_QUARTZ_BLOCK, 0.7f, 100, "smoked_quartz_block");
                this.pillarBuilder(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.SMOKED_QUARTZ_PILLAR, Ingredient.of(BlockRegHandler.SMOKED_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(BlockRegHandler.SMOKED_QUARTZ_BLOCK), has(BlockRegHandler.SMOKED_QUARTZ_BLOCK))
                        .group("smoked_quartz_pillar")
                        .save(output);
                this.chiseled(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.CHISELED_SMOKED_QUARTZ_BLOCK, BlockRegHandler.SMOKED_QUARTZ_SLAB);
                this.slab(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.SMOKED_QUARTZ_SLAB, BlockRegHandler.SMOKED_QUARTZ_BLOCK);
                this.slab(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.SMOKED_QUARTZ_BRICKS_SLAB, BlockRegHandler.SMOKED_QUARTZ_BRICKS);
                this.stairBuilder(BlockRegHandler.SMOKED_QUARTZ_STAIRS, Ingredient.of(BlockRegHandler.SMOKED_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(BlockRegHandler.SMOKED_QUARTZ_BLOCK), has(BlockRegHandler.SMOKED_QUARTZ_BLOCK))
                        .group("smoked_quartz_block")
                        .save(output);
                this.stairBuilder(BlockRegHandler.SMOKED_QUARTZ_BRICKS_STAIRS, Ingredient.of(BlockRegHandler.SMOKED_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(BlockRegHandler.SMOKED_QUARTZ_BRICKS), has(BlockRegHandler.SMOKED_QUARTZ_BRICKS))
                        .group("smoked_quartz_block")
                        .save(output);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.SMOKED_QUARTZ_WALL, BlockRegHandler.SMOKED_QUARTZ_BLOCK);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.SMOKED_QUARTZ_BRICKS_WALL, BlockRegHandler.SMOKED_QUARTZ_BRICKS);

                //Burnt Quartz
                this.twoByTwoPacker(RecipeCategory.MISC,ItemRegHandler.BURNT_QUARTZ,ItemRegHandler.BURNT_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.BURNT_QUARTZ_SHARD, 4)
                        .requires(ItemRegHandler.BURNT_QUARTZ)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .group("burnt_quartz_shard");
                this.oreSmelting(QUARTZ_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.BURNT_QUARTZ, 0.7f, 100, "burnt_quartz");
                this.twoByTwoPacker(RecipeCategory.MISC,BlockRegHandler.BURNT_QUARTZ_BLOCK, ItemRegHandler.BURNT_QUARTZ);
                this.oreSmelting(QUARTZ_BLOCK_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, BlockRegHandler.BURNT_QUARTZ_BLOCK, 0.7f, 100, "burnt_quartz_block");
                this.pillarBuilder(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.BURNT_QUARTZ_PILLAR, Ingredient.of(BlockRegHandler.BURNT_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(BlockRegHandler.BURNT_QUARTZ_BLOCK), has(BlockRegHandler.BURNT_QUARTZ_BLOCK))
                        .group("burnt_quartz_pillar")
                        .save(output);
                this.chiseled(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.CHISELED_BURNT_QUARTZ_BLOCK, BlockRegHandler.BURNT_QUARTZ_SLAB);
                this.slab(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.BURNT_QUARTZ_SLAB, BlockRegHandler.BURNT_QUARTZ_BLOCK);
                this.slab(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.BURNT_QUARTZ_BRICKS_SLAB, BlockRegHandler.BURNT_QUARTZ_BRICKS);
                this.stairBuilder(BlockRegHandler.BURNT_QUARTZ_STAIRS, Ingredient.of(BlockRegHandler.BURNT_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(BlockRegHandler.BURNT_QUARTZ_BLOCK), has(BlockRegHandler.BURNT_QUARTZ_BLOCK))
                        .group("burnt_quartz_block")
                        .save(output);
                this.stairBuilder(BlockRegHandler.BURNT_QUARTZ_BRICKS_STAIRS, Ingredient.of(BlockRegHandler.BURNT_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(BlockRegHandler.BURNT_QUARTZ_BRICKS), has(BlockRegHandler.BURNT_QUARTZ_BRICKS))
                        .group("burnt_quartz_block")
                        .save(output);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.BURNT_QUARTZ_WALL, BlockRegHandler.BURNT_QUARTZ_BLOCK);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.BURNT_QUARTZ_BRICKS_WALL, BlockRegHandler.BURNT_QUARTZ_BRICKS);

                //Fired Bricks
                this.oreSmelting(BRICK_SMELTABLE,RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.FIRED_BRICK, 0.7f, 200,"fired_brick");
                this.oreSmelting(BRICK_BLOCK_SMELTABLE,RecipeCategory.BUILDING_BLOCKS, CookingBookCategory.BLOCKS, BlockRegHandler.FIRED_BRICKS, 0.7f, 200,"fired_brick");
                this.slab(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.FIRED_BRICKS_SLAB, BlockRegHandler.FIRED_BRICKS);
                this.wall(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.FIRED_BRICKS_WALL, BlockRegHandler.FIRED_BRICKS);
                this.stairBuilder(BlockRegHandler.FIRED_BRICKS_STAIRS, Ingredient.of(BlockRegHandler.FIRED_BRICKS))
                        .unlockedBy(getHasName(BlockRegHandler.FIRED_BRICKS), has(BlockRegHandler.FIRED_BRICKS))
                        .group("fired_brick")
                        .save(output);

                //Empowered Netherite
                this.shapeless(RecipeCategory.MISC,ItemRegHandler.EMPOWERED_NETHERITE)
                        .requires(Items.GOLD_INGOT, 4)
                        .requires(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP, 4)
                        .group("empowered_netherite_ingot")
                        .save(output);
                this.shaped(RecipeCategory.MISC,ItemRegHandler.EMPOWERED_NETHERITE_SCRAP,4)
                        .pattern("xyx")
                        .pattern("yxy")
                        .pattern("xyx")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.NETHERITE_SCRAP)
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .save(output);
                this.nineBlockStorageRecipes(RecipeCategory.MISC,ItemRegHandler.EMPOWERED_NETHERITE, RecipeCategory.DECORATIONS, BlockRegHandler.EMPOWERED_NETHERITE_BLOCK);

                //Diamond
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ItemRegHandler.DIAMOND_SHARD, RecipeCategory.MISC, Items.DIAMOND);

                //Emerald Tools
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ItemRegHandler.EMERALD_SHARD, RecipeCategory.MISC, Items.EMERALD);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMERALD_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', Items.EMERALD)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMERALD_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', Items.EMERALD)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMERALD_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', Items.EMERALD)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMERALD_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', Items.EMERALD)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMERALD_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', Items.EMERALD)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);

                //Lapis Lazuli Tools
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.LAPIS_LAZULI_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', Items.LAPIS_LAZULI)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.LAPIS_LAZULI_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', Items.LAPIS_LAZULI)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.LAPIS_LAZULI_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', Items.LAPIS_LAZULI)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.LAPIS_LAZULI_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', Items.LAPIS_LAZULI)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.LAPIS_LAZULI_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', Items.LAPIS_LAZULI)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);

                //Redstone Tools
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.REDSTONE_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.REDSTONE_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.REDSTONE_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.REDSTONE_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.REDSTONE_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                        .save(output);

                //Quartz Tools
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.QUARTZ_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', Items.QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.QUARTZ_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', Items.QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.QUARTZ_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', Items.QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.QUARTZ_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', Items.QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.QUARTZ_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', Items.QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);

                //Smoekd Quartz Tools
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.SMOKED_QUARTZ_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemRegHandler.SMOKED_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.SMOKED_QUARTZ_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', ItemRegHandler.SMOKED_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.SMOKED_QUARTZ_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', ItemRegHandler.SMOKED_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.SMOKED_QUARTZ_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', ItemRegHandler.SMOKED_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.SMOKED_QUARTZ_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', ItemRegHandler.SMOKED_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .save(output);

                //Burnt Quartz Tools
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.BURNT_QUARTZ_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemRegHandler.BURNT_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.BURNT_QUARTZ_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', ItemRegHandler.BURNT_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.BURNT_QUARTZ_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', ItemRegHandler.BURNT_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.BURNT_QUARTZ_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', ItemRegHandler.BURNT_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.BURNT_QUARTZ_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', ItemRegHandler.BURNT_QUARTZ)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.BURNT_QUARTZ), has(ItemRegHandler.BURNT_QUARTZ))
                        .save(output);

                //Empowered Netherite
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMPOWERED_NETHERITE_SWORD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMPOWERED_NETHERITE_AXE)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,ItemRegHandler.EMPOWERED_NETHERITE_HOE)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);

                //Emerald Armor
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMERALD_HELMET)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMERALD_CHESTPLATE)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMERALD_LEGGINGS)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMERALD_BOOTS)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);

                //Lapis Lazuli Armor
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.LAPIS_LAZULI_HELMET)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.LAPIS_LAZULI_CHESTPLATE)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.LAPIS_LAZULI_LEGGINGS)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.LAPIS_LAZULI_BOOTS)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .save(output);

                //Empowered Netherite Armor
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMPOWERED_NETHERITE_HELMET)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.EMPOWERED_NETHERITE_BOOTS)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', ItemRegHandler.EMPOWERED_NETHERITE)
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE), has(ItemRegHandler.EMPOWERED_NETHERITE))
                        .save(output);

                //Reinforced Leather
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.REINFORCED_LEATHER_HELMET)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', ItemRegHandler.REINFORCED_LEATHER)
                        .unlockedBy(getHasName(ItemRegHandler.REINFORCED_LEATHER), has(ItemRegHandler.REINFORCED_LEATHER))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', ItemRegHandler.REINFORCED_LEATHER)
                        .unlockedBy(getHasName(ItemRegHandler.REINFORCED_LEATHER), has(ItemRegHandler.REINFORCED_LEATHER))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.REINFORCED_LEATHER_LEGGINGS)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', ItemRegHandler.REINFORCED_LEATHER)
                        .unlockedBy(getHasName(ItemRegHandler.REINFORCED_LEATHER), has(ItemRegHandler.REINFORCED_LEATHER))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,ItemRegHandler.REINFORCED_LEATHER_BOOTS)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', ItemRegHandler.REINFORCED_LEATHER)
                        .unlockedBy(getHasName(ItemRegHandler.REINFORCED_LEATHER), has(ItemRegHandler.REINFORCED_LEATHER))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "The Vanilla Expansion Recipes";
    }
}
