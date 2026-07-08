package net.winkeyface14.vanilla_expansion.datagen;

import com.mojang.serialization.Codec;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.winkeyface14.vanilla_expansion.VanillaExpansion;
import net.winkeyface14.vanilla_expansion.item.ArmorMaterialBase;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture){
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer){
        consumer.accept(ArmorMaterialBase.EMERALD_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "emerald"))
                        .build());
        consumer.accept(ArmorMaterialBase.LAPIS_LAZULI_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "lapis_lazuli"))
                        .build());
        consumer.accept(ArmorMaterialBase.ARMADILLO_SCUTE_PLAYER_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "armadillo_scute"))
                        .build());
        consumer.accept(ArmorMaterialBase.EMPOWERED_NETHERITE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "empowered_netherite"))
                        .build());
        consumer.accept(ArmorMaterialBase.REINFORCED_LEATHER_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(VanillaExpansion.MOD_ID, "reinforced_leather"))
                        .build());
    }

    @Override
    public @NonNull CompletableFuture<?> run(final @NonNull CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        Codec<EquipmentClientInfo> var10001 = EquipmentClientInfo.CODEC;
        PackOutput.PathProvider var10002 = this.pathProvider;
        Objects.requireNonNull(var10002);
        return DataProvider.saveAll(cache, var10001, var10002::json, equipmentAssets);
    }

    @Override
    public @NonNull String getName() {
        return "The Vanilla Expansion Equipment Asset Definition";
    }
}
