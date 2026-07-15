package net.winkeyface14.vanilla_expansion.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import static net.winkeyface14.vanilla_expansion.util.ConfigHandler.*;

public record FeatureEnabledCondition(String featureName) implements ResourceCondition {
    public static final MapCodec<FeatureEnabledCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Codec.STRING.fieldOf("feature").forGetter(FeatureEnabledCondition::featureName)
    ).apply(instance, FeatureEnabledCondition::new));

    // Register with your mod ID
    public static final ResourceConditionType<FeatureEnabledCondition> TYPE = ResourceConditionType.create(
            Identifier.fromNamespaceAndPath("vanillaexpansion", "feature_enabled"),
            CODEC
    );

    @Override
    public @NonNull ResourceConditionType<?> getType() {
        return TYPE;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return switch (featureName) {
            case "bundled_sticks" -> enableBundledSticks;
            case "pile_of_paper" -> enablePileOfPaper;

            case "coal_chunk" -> enableCoalChunk;
            case "charcoal_chunk" -> enableCharcoalChunk;
            case "emerald_shard" -> enableEmeraldShard;
            case "diamond_shard" -> enableDiamondShard;
            case "quartz_shard" -> enableQuartzShard;

            case "quartz_tools" -> enableQuartzTools;
            case "quartz_heads" -> isVanillaHeadsEnabled(enableQuartzHeads, enableQuartzTools);

            case "smoked_quartz" -> enableSmokedQuartz;
            case "smoked_quartz_shard" -> isModdedShardEnabled(enableSmokedQuartz, enableSmokedQuartzShard);
            case "smoked_quartz_tools" -> isModdedToolsEnabled(enableSmokedQuartz, enableSmokedQuartzTools);
            case "smoked_quartz_heads" -> isModdedHeadsEnabled(enableSmokedQuartz, enableSmokedQuartzHeads,  enableSmokedQuartzTools);

            case "base_template" -> enableBaseTemplate;
            case "stone_heads" -> isVanillaHeadsEnabled(enableStoneHeads, true);
            case "copper_heads" -> isVanillaHeadsEnabled(enableCopperHeads, true);
            case "iron_heads" -> isVanillaHeadsEnabled(enableIronHeads, true);
            case "golden_heads" -> isVanillaHeadsEnabled(enableGoldenHeads, true);
            case "diamond_heads" -> isVanillaHeadsEnabled(enableDiamondHeads, true);

            case "emerald_tools" -> enableEmeraldTools;
            case "emerald_heads" -> isVanillaHeadsEnabled(enableEmeraldHeads, enableEmeraldTools);
            case "emerald_armor" -> enableEmeraldArmor;

            case "lapis_lazuli_tools" -> enableLapisLazuliTools;
            //case "lapis_lazuli_heads" -> isLapisHeadsEnabled();
            case "lapis_lazuli_armor" -> enableLapisLazuliArmor;

            case "redstone_tools" -> enableRedstoneTools;
            case "redstone_heads" -> isVanillaHeadsEnabled(enableRedstoneHeads, enableRedstoneTools);

            case "compact_crop_blocks" -> enableCompactCropBlocks;
            case "charcoal_block" -> enableCharcoalBlock;
            case "block_of_bundled_sticks" -> isBlockSetEnabled(enableBundledSticks, enableBlockOfBundledSticks);
            case "add_quartz_block_set" -> enableAddQuartzBlockSet;
            case "smoked_quartz_block_set" -> isBlockSetEnabled(enableSmokedQuartz, enableSmokedQuartzBlockSet);
            default -> true;
        };
    }
}
