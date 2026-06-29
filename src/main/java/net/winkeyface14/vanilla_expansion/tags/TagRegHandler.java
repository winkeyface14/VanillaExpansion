package net.winkeyface14.vanilla_expansion.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;

public class TagRegHandler {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        public static final TagKey<Block> NEEDS_LAPIS_LAZULI_TOOL = createTag("needs_lapis_lazuli_tool");
        public static final TagKey<Block> INCORRECT_FOR_LAPIS_LAZULI_TOOL = createTag("incorrect_for_lapis_lazuli_tool");
        public static final TagKey<Block> NEEDS_REDSTONE_TOOL = createTag("needs_redstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_REDSTONE_TOOL = createTag("incorrect_for_redstone_tool");
        public static final TagKey<Block> NEEDS_QUARTZ_TOOL = createTag("needs_quartz_tool");
        public static final TagKey<Block> INCORRECT_FOR_QUARTZ_TOOL = createTag("incorrect_for_quartz_tool");
        public static final TagKey<Block> NEEDS_EMPOWERED_NETHERITE_TOOL = createTag("needs_empowered_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMPOWERED_NETHERITE_TOOL = createTag("incorrect_for_empowered_netherite_tool");

        public static TagKey<Block> createTag(String name){
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> EMERALD_REPAIR = createTag("emerald_repair");
        public static final TagKey<Item> LAPIS_LAZULI_REPAIR = createTag("lapis_lazuli_repair");
        public static final TagKey<Item> REDSTONE_REPAIR = createTag("redstone_repair");
        public static final TagKey<Item> QUARTZ_REPAIR = createTag("quartz_repair");
        public static final TagKey<Item> SMOKED_QUARTZ_REPAIR = createTag("smoked_quartz_repair");
        public static final TagKey<Item> BURNT_QUARTZ_REPAIR = createTag("burnt_quartz_repair");
        public static final TagKey<Item> EMPOWERED_NETHERITE_REPAIR = createTag("empowered_netherite_repair");
        public static final TagKey<Item> REINFORCED_LEATHER_REPAIR = createTag("reinforced_leather_repair");

        public static TagKey<Item> createTag(String name){
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, name));
        }
    }
}
