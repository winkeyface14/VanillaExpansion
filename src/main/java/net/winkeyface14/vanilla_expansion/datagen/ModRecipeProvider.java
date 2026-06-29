package net.winkeyface14.vanilla_expansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.winkeyface14.vanilla_expansion.block.BlockRegHandler;
import net.winkeyface14.vanilla_expansion.item.ItemRegHandler;

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

                //Coal and Charcoal
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.CHARCOAL,RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.CHARCOAL_BLOCK);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.COAL_CHUNK, 8)
                        .requires(Items.COAL)
                        .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                        .group("coal_chunk")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.CHARCOAL_CHUNK, 8)
                        .requires(Items.CHARCOAL)
                        .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                        .group("charcoal_chunk")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, Items.COAL)
                        .requires(ItemRegHandler.COAL_CHUNK, 8)
                        .unlockedBy(getHasName(ItemRegHandler.COAL_CHUNK), has(ItemRegHandler.COAL_CHUNK))
                        .group("coal")
                        .save(output);
                this.shapeless(RecipeCategory.MISC, Items.CHARCOAL)
                        .requires(ItemRegHandler.CHARCOAL_CHUNK, 8)
                        .unlockedBy(getHasName(ItemRegHandler.CHARCOAL_CHUNK), has(ItemRegHandler.CHARCOAL_CHUNK))
                        .group("charcoal")
                        .save(output,"charcoal_from_chunk");

                //Reinforced Leather
                this.oreBlasting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.REINFORCED_LEATHER, 0.7f, 100, "reinforced_leather");
                this.oreSmelting(REINFORCED_LEATHER_BLASTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ItemRegHandler.REINFORCED_LEATHER, 0.7f, 200, "reinforced_leather");

                //Stick Compacting
                this.nineBlockStorageRecipes(RecipeCategory.MISC, Items.STICK, RecipeCategory.MISC, ItemRegHandler.BUNDLED_STICKS);
                this.nineBlockStorageRecipesRecipesWithCustomUnpacking(RecipeCategory.MISC, ItemRegHandler.BUNDLED_STICKS, RecipeCategory.DECORATIONS, BlockRegHandler.BUNDLED_STICKS_BLOCK,"bundled_sticks_from_unpacking", "bundled_sticks");

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

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,BlockRegHandler.QUARTZ_BRICKS_WALL, Blocks.QUARTZ_BRICKS);


                //Smoked Quartz
                this.twoByTwoPacker(RecipeCategory.MISC,ItemRegHandler.SMOKED_QUARTZ,ItemRegHandler.SMOKED_QUARTZ_SHARD);
                this.shapeless(RecipeCategory.MISC, ItemRegHandler.SMOKED_QUARTZ_SHARD, 4)
                        .requires(ItemRegHandler.SMOKED_QUARTZ)
                        .unlockedBy(getHasName(ItemRegHandler.SMOKED_QUARTZ), has(ItemRegHandler.SMOKED_QUARTZ))
                        .group("smoked_quartz_shard")
                        .save(output);

                SimpleCookingRecipeBuilder.smoking(Ingredient.of(Items.QUARTZ), RecipeCategory.MISC,ItemRegHandler.SMOKED_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .group("smoked_quartz")
                        .save(output, "smoked_quartz_smoker");
                SimpleCookingRecipeBuilder.smoking(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC,BlockRegHandler.SMOKED_QUARTZ_BLOCK, 0.7f, 100)
                        .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                        .group("smoked_quartz_block")
                        .save(output, "smoked_quartz_block_smoker");

                this.twoByTwoPacker(RecipeCategory.MISC,BlockRegHandler.SMOKED_QUARTZ_BLOCK, ItemRegHandler.SMOKED_QUARTZ);

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
                        .group("burnt_quartz_shard")
                        .save(output);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.QUARTZ), RecipeCategory.MISC,CookingBookCategory.MISC, ItemRegHandler.BURNT_QUARTZ, 0.7f, 100)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .group("burnt_quartz")
                        .save(output, "burnt_quartz_blasting");
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.QUARTZ_BLOCK), RecipeCategory.MISC,CookingBookCategory.MISC, BlockRegHandler.BURNT_QUARTZ_BLOCK, 0.7f, 100)
                        .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                        .group("burnt_quartz_block")
                        .save(output, "burnt_quartz_block_blasting");

                this.twoByTwoPacker(RecipeCategory.MISC,BlockRegHandler.BURNT_QUARTZ_BLOCK, ItemRegHandler.BURNT_QUARTZ);

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

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, BlockRegHandler.FIRED_BRICKS, ItemRegHandler.FIRED_BRICK);

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
                        .group("empowered_netherite")
                        .unlockedBy(getHasName(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP), has(ItemRegHandler.EMPOWERED_NETHERITE_SCRAP))
                        .save(output, "empowered_netherite_ingot_from_scrap");
                this.shaped(RecipeCategory.MISC,ItemRegHandler.EMPOWERED_NETHERITE_SCRAP,4)
                        .pattern("xyx")
                        .pattern("yxy")
                        .pattern("xyx")
                        .define('x', Items.REDSTONE_BLOCK)
                        .define('y', Items.NETHERITE_SCRAP)
                        .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                        .save(output);
                this.nineBlockStorageRecipes(RecipeCategory.MISC,ItemRegHandler.EMPOWERED_NETHERITE, RecipeCategory.DECORATIONS, BlockRegHandler.EMPOWERED_NETHERITE_BLOCK,"empowered_netherite_block","empowered_netherite_block","empowered_netherite_ingot","empowered_netherite_ingot");

                //Diamond
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ItemRegHandler.DIAMOND_SHARD, RecipeCategory.MISC, Items.DIAMOND);

                //Emerald Tools
                this.nineBlockStorageRecipes(RecipeCategory.MISC, ItemRegHandler.EMERALD_SHARD, RecipeCategory.MISC, Items.EMERALD);
                registerCustomToolSetRecipes(Items.EMERALD, ItemRegHandler.EMERALD_SWORD, ItemRegHandler.EMERALD_SHOVEL, ItemRegHandler.EMERALD_PICKAXE, ItemRegHandler.EMERALD_AXE, ItemRegHandler.EMERALD_HOE, ItemRegHandler.EMERALD_SPEAR);

                //Lapis Lazuli Tools
                registerCustomToolSetRecipes(Items.LAPIS_LAZULI, ItemRegHandler.LAPIS_LAZULI_SWORD, ItemRegHandler.LAPIS_LAZULI_SHOVEL, ItemRegHandler.LAPIS_LAZULI_PICKAXE, ItemRegHandler.LAPIS_LAZULI_AXE, ItemRegHandler.LAPIS_LAZULI_HOE, ItemRegHandler.LAPIS_LAZULI_SPEAR);

                //Redstone Tools
                registerCustomToolSetRecipes(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_SWORD, ItemRegHandler.REDSTONE_SHOVEL, ItemRegHandler.REDSTONE_PICKAXE, ItemRegHandler.REDSTONE_AXE, ItemRegHandler.REDSTONE_HOE, ItemRegHandler.REDSTONE_SPEAR);

                //Quartz Tools
                registerCustomToolSetRecipes(Items.QUARTZ, ItemRegHandler.QUARTZ_SWORD, ItemRegHandler.QUARTZ_SHOVEL, ItemRegHandler.QUARTZ_PICKAXE, ItemRegHandler.QUARTZ_AXE, ItemRegHandler.QUARTZ_HOE, ItemRegHandler.QUARTZ_SPEAR);

                //Smoked Quartz Tools
                registerCustomToolSetRecipes(ItemRegHandler.SMOKED_QUARTZ, ItemRegHandler.SMOKED_QUARTZ_SWORD, ItemRegHandler.SMOKED_QUARTZ_SHOVEL, ItemRegHandler.SMOKED_QUARTZ_PICKAXE, ItemRegHandler.SMOKED_QUARTZ_AXE, ItemRegHandler.SMOKED_QUARTZ_HOE, ItemRegHandler.SMOKED_QUARTZ_SPEAR);

                //Burnt Quartz Tools
                registerCustomToolSetRecipes(ItemRegHandler.BURNT_QUARTZ, ItemRegHandler.BURNT_QUARTZ_SWORD, ItemRegHandler.BURNT_QUARTZ_SHOVEL, ItemRegHandler.BURNT_QUARTZ_PICKAXE, ItemRegHandler.BURNT_QUARTZ_AXE, ItemRegHandler.BURNT_QUARTZ_HOE, ItemRegHandler.BURNT_QUARTZ_SPEAR);

                //Emerald Armor
                registerCustomArmorSetRecipes(Items.EMERALD, ItemRegHandler.EMERALD_HELMET, ItemRegHandler.EMERALD_CHESTPLATE, ItemRegHandler.EMERALD_LEGGINGS, ItemRegHandler.EMERALD_BOOTS);

                //Lapis Lazuli Armor
                registerCustomArmorSetRecipes(Items.LAPIS_LAZULI, ItemRegHandler.LAPIS_LAZULI_HELMET, ItemRegHandler.LAPIS_LAZULI_CHESTPLATE, ItemRegHandler.LAPIS_LAZULI_LEGGINGS, ItemRegHandler.LAPIS_LAZULI_BOOTS);

                //Reinforced Leather
                //registerCustomArmorSetRecipes(ItemRegHandler.REINFORCED_LEATHER, ItemRegHandler.REINFORCED_LEATHER_HELMET, ItemRegHandler.REINFORCED_LEATHER_CHESTPLATE, ItemRegHandler.REINFORCED_LEATHER_LEGGINGS, ItemRegHandler.REINFORCED_LEATHER_BOOTS);

                //Template Recipes
                this.shaped(RecipeCategory.MISC,ItemRegHandler.BASE_TEMPLATE, 8)
                        .pattern("xy")
                        .define('x', ItemTags.PLANKS)
                        .define('y', Items.FLINT)
                        .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                        .save(output);

                //Blade Recipes
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_SWORD_BLADE)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomSwordBladeRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_SWORD_BLADE);
                registerCustomSwordBladeRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_SWORD_BLADE);
                //registerCustomSwordBladeRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SWORD_BLADE);

                //Pickaxe Head Recipes
                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_PICKAXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomPickaxeHeadRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_PICKAXE_HEAD);
                registerCustomPickaxeHeadRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_PICKAXE_HEAD);
                //registerCustomPickaxeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_PICKAXE_HEAD);

                //Axe Head Recipes
                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_AXE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomAxeHeadRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_AXE_HEAD);
                registerCustomAxeHeadRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_AXE_HEAD);
                //registerCustomAxeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_AXE_HEAD);

                //Shovel Head Recipes
                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_SHOVEL_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomShovelHeadRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_SHOVEL_HEAD);
                registerCustomShovelHeadRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_SHOVEL_HEAD);
                //registerCustomShovelHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SHOVEL_HEAD);

                //Hoe Head Recipes
                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_HOE_HEAD)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomHoeHeadRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_HOE_HEAD);
                registerCustomHoeHeadRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_HOE_HEAD);
                //registerCustomHoeHeadRecipe(Items.EMERALD, ItemRegHandler.EMERALD_HOE_HEAD);

                //Spear Tip Recipes

                this.shaped(RecipeCategory.MISC,ItemRegHandler.STONE_SPEAR_TIP)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', ItemTags.STONE_TOOL_MATERIALS)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
                registerCustomSpearTipRecipe(Items.IRON_INGOT, ItemRegHandler.IRON_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.COPPER_INGOT, ItemRegHandler.COPPER_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.GOLD_INGOT, ItemRegHandler.GOLD_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.REDSTONE_BLOCK, ItemRegHandler.REDSTONE_SPEAR_TIP);
                registerCustomSpearTipRecipe(Items.DIAMOND, ItemRegHandler.DIAMOND_SPEAR_TIP);
                //registerCustomSpearTipRecipe(Items.EMERALD, ItemRegHandler.EMERALD_SPEAR_TIP);


                //Smithing Recipes
                //Empowered Netherite Tool and Armor Set
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SWORD, ItemRegHandler.EMPOWERED_NETHERITE_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SPEAR, ItemRegHandler.EMPOWERED_NETHERITE_SPEAR, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_PICKAXE, ItemRegHandler.EMPOWERED_NETHERITE_PICKAXE, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_AXE, ItemRegHandler.EMPOWERED_NETHERITE_AXE, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_SHOVEL, ItemRegHandler.EMPOWERED_NETHERITE_SHOVEL, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_HOE, ItemRegHandler.EMPOWERED_NETHERITE_HOE, RecipeCategory.COMBAT);

                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_HELMET, ItemRegHandler.EMPOWERED_NETHERITE_HELMET, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_CHESTPLATE, ItemRegHandler.EMPOWERED_NETHERITE_CHESTPLATE, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_LEGGINGS, ItemRegHandler.EMPOWERED_NETHERITE_LEGGINGS, RecipeCategory.COMBAT);
                registerCustomUpgrade(ItemRegHandler.EMPOWERED_NETHERITE, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_BOOTS, ItemRegHandler.EMPOWERED_NETHERITE_BOOTS, RecipeCategory.COMBAT);

                //Swords
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_SWORD_BLADE, Items.WOODEN_SWORD, Items.STONE_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_SWORD_BLADE, Items.STONE_SWORD, Items.COPPER_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_SWORD_BLADE, Items.STONE_SWORD, Items.IRON_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_SWORD_BLADE, Items.STONE_SWORD, ItemRegHandler.REDSTONE_SWORD, RecipeCategory.COMBAT);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SWORD_BLADE, Items.STONE_SWORD, ItemRegHandler.EMERALD_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_SWORD_BLADE, Items.STONE_SWORD, Items.GOLDEN_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SWORD_BLADE, Items.IRON_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SWORD_BLADE, Items.COPPER_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SWORD_BLADE, Items.GOLDEN_SWORD, Items.DIAMOND_SWORD, RecipeCategory.COMBAT);

                //Pickaxes
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_PICKAXE_HEAD, Items.WOODEN_PICKAXE, Items.STONE_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.COPPER_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.IRON_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_PICKAXE_HEAD, Items.STONE_PICKAXE, ItemRegHandler.REDSTONE_PICKAXE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_PICKAXE_HEAD, Items.STONE_PICKAXE, ItemRegHandler.EMERALD_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_PICKAXE_HEAD, Items.STONE_PICKAXE, Items.GOLDEN_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_PICKAXE_HEAD, Items.IRON_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_PICKAXE_HEAD, Items.COPPER_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_PICKAXE_HEAD, Items.GOLDEN_PICKAXE, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS);

                //Axes
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_AXE_HEAD, Items.WOODEN_AXE, Items.STONE_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_AXE_HEAD, Items.STONE_AXE, Items.COPPER_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_AXE_HEAD, Items.STONE_AXE, Items.IRON_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_AXE_HEAD, Items.STONE_AXE, ItemRegHandler.REDSTONE_AXE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_AXE_HEAD, Items.STONE_AXE, ItemRegHandler.EMERALD_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_AXE_HEAD, Items.STONE_AXE, Items.GOLDEN_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_AXE_HEAD, Items.IRON_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_AXE_HEAD, Items.COPPER_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_AXE_HEAD, Items.GOLDEN_AXE, Items.DIAMOND_AXE, RecipeCategory.TOOLS);

                //Shovels
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_SHOVEL_HEAD, Items.WOODEN_SHOVEL, Items.STONE_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.COPPER_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.IRON_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_SHOVEL_HEAD, Items.STONE_SHOVEL, ItemRegHandler.REDSTONE_SHOVEL, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SHOVEL_HEAD, Items.STONE_SHOVEL, ItemRegHandler.EMERALD_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_SHOVEL_HEAD, Items.STONE_SHOVEL, Items.GOLDEN_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SHOVEL_HEAD, Items.IRON_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SHOVEL_HEAD, Items.COPPER_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SHOVEL_HEAD, Items.GOLDEN_SHOVEL, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS);

                //Hoes
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_HOE_HEAD, Items.WOODEN_HOE, Items.STONE_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_HOE_HEAD, Items.STONE_HOE, Items.COPPER_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_HOE_HEAD, Items.STONE_HOE, Items.IRON_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_HOE_HEAD, Items.STONE_HOE, ItemRegHandler.REDSTONE_HOE, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_HOE_HEAD, Items.STONE_HOE, ItemRegHandler.EMERALD_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_HOE_HEAD, Items.STONE_HOE, Items.GOLDEN_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_HOE_HEAD, Items.IRON_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_HOE_HEAD, Items.COPPER_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_HOE_HEAD, Items.GOLDEN_HOE, Items.DIAMOND_HOE, RecipeCategory.TOOLS);

                //Spears
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.STONE_SPEAR_TIP, Items.WOODEN_SPEAR, Items.STONE_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.COPPER_SPEAR_TIP, Items.STONE_SPEAR, Items.COPPER_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.IRON_SPEAR_TIP, Items.STONE_SPEAR, Items.IRON_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.REDSTONE_SPEAR_TIP, Items.STONE_SPEAR, ItemRegHandler.REDSTONE_SPEAR, RecipeCategory.TOOLS);
                //registerCustomUpgrade(Items.FLINT, ItemRegHandler.EMERALD_SPEAR_TIP, Items.STONE_SPEAR, ItemRegHandler.EMERALD_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.GOLD_SPEAR_TIP, Items.STONE_SPEAR, Items.GOLDEN_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SPEAR_TIP, Items.IRON_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SPEAR_TIP, Items.COPPER_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);
                registerCustomUpgrade(Items.FLINT, ItemRegHandler.DIAMOND_SPEAR_TIP, Items.GOLDEN_SPEAR, Items.DIAMOND_SPEAR, RecipeCategory.TOOLS);

            }

            private void registerCustomUpgrade(Item material, Item template, Item baseItem, Item upgradedResult, RecipeCategory category) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(template),
                                Ingredient.of(baseItem),
                                Ingredient.of(material),
                                category,
                                upgradedResult
                        )
                        .unlocks("has_" + getItemName(template), has(template))
                        .save(output, getItemName(upgradedResult) + "_from_smithing_with_" + getItemName(baseItem));
            }

            private void registerCustomToolSetRecipes(Item materialItem, Item resultSword, Item resultShovel, Item resultPickaxe, Item resultAxe, Item resultHoe,Item resultSpear) {
                this.shaped(RecipeCategory.COMBAT,resultSword)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultShovel)
                        .pattern("x")
                        .pattern("y")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultPickaxe)
                        .pattern("xxx")
                        .pattern(" y ")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultAxe)
                        .pattern("xx")
                        .pattern("xy")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.TOOLS,resultHoe)
                        .pattern("xx")
                        .pattern(" y")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultSpear)
                        .pattern("  x")
                        .pattern(" y ")
                        .pattern("y  ")
                        .define('x', materialItem)
                        .define('y', Items.STICK)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
            }

            private void registerCustomArmorSetRecipes(Item materialItem, Item resultHelmet, Item resultChestplate, Item resultLeggings, Item resultBoots) {
                this.shaped(RecipeCategory.COMBAT,resultHelmet)
                        .pattern("xxx")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultChestplate)
                        .pattern("x x")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultLeggings)
                        .pattern("xxx")
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
                this.shaped(RecipeCategory.COMBAT,resultBoots)
                        .pattern("x x")
                        .pattern("x x")
                        .define('x', materialItem)
                        .unlockedBy(getHasName(materialItem), has(materialItem))
                        .save(output);
            }

            private void registerCustomSwordBladeRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomPickaxeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xxx")
                        .pattern(" y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomAxeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern("xy")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomShovelHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("x")
                        .pattern("y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomHoeHeadRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern("xx")
                        .pattern(" y")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }

            private void registerCustomSpearTipRecipe(Item materialItem, Item resultItem) {
                Item base_template = ItemRegHandler.BASE_TEMPLATE;
                this.shaped(RecipeCategory.MISC,resultItem)
                        .pattern(" x")
                        .pattern("y ")
                        .define('x', materialItem)
                        .define('y', base_template)
                        .unlockedBy(getHasName(base_template), has(base_template))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "The Vanilla Expansion Recipes";
    }
}
