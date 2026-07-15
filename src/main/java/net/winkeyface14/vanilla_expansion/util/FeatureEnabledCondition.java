package net.winkeyface14.vanilla_expansion.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

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
            case "base_template" -> ConfigHandler.enableBaseTemplate;
            case "stone_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableStoneHeads, true);
            case "copper_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableCopperHeads, true);
            case "iron_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableIronHeads, true);
            case "golden_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableGoldenHeads, true);
            case "diamond_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableDiamondHeads, true);

            case "emerald_tools" -> ConfigHandler.enableEmeraldTools;
            case "emerald_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableEmeraldHeads, ConfigHandler.enableEmeraldTools);
            case "emerald_armor" -> ConfigHandler.enableEmeraldArmor;

            case "lapis_lazuli_tools" -> ConfigHandler.enableLapisLazuliTools;
            //case "lapis_lazuli_heads" -> ConfigHandler.isLapisHeadsEnabled();
            case "lapis_lazuli_armor" -> ConfigHandler.enableLapisLazuliArmor;

            case "redstone_tools" -> ConfigHandler.enableRedstoneTools;
            case "redstone_heads" -> ConfigHandler.isVanillaHeadsEnabled(ConfigHandler.enableRedstoneHeads, ConfigHandler.enableRedstoneTools);

            case "compact_crop_blocks" -> ConfigHandler.enableCompactCropBlocks;
            default -> true;
        };
    }
}
