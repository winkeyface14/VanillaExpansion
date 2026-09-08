package net.winkeyface14.vanilla_expansion.util;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigHandler extends MidnightConfig {
    public static final String ITEMS = "items";
    public static final String GEAR = "gear";
    public static final String BLOCKS = "blocks";

    //Items
    @Comment(category = ITEMS, centered = true) public static Comment headsSectionComment;
    @Entry(category = ITEMS) public static boolean enableBaseTemplate = true;
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableStoneHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableCopperHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableIronHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableGoldenHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableDiamondHeads = true;

    @Condition(requiredOption = "enableLapisLazuliTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableLapisLazuliHeads = true;

    @Condition(requiredOption = "enableRedstoneTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableRedstoneHeads = true;

    @Condition(requiredOption = "enableQuartzTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableQuartzHeads = true;

    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Condition(requiredOption = "enableSmokedQuartzTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableSmokedQuartzHeads = true;

    @Condition(requiredOption = "enableBurntQuartz", requiredValue = "true")
    @Condition(requiredOption = "enableBurntQuartzTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableBurntQuartzHeads = true;

    @Condition(requiredOption = "enableEmeraldTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableEmeraldHeads = true;

    @Comment(category = ITEMS, centered = true, name = "§lMiscellaneous Items") public static Comment MiscItemsSectionComment;
    @Entry(category = ITEMS) public static boolean enableBundledSticks = true;
    @Entry(category = ITEMS) public static boolean enablePileOfPaper = true;
    @Entry(category = ITEMS) public static boolean enableFiredBricks = true;
    @Entry(category = ITEMS) public static boolean enableReinforcedLeather = true;
    @Entry(category = ITEMS) public static boolean enableCoalChunk = true;
    @Entry(category = ITEMS) public static boolean enableCharcoalChunk = true;
    @Entry(category = ITEMS) public static boolean enableEmeraldShard = true;
    @Entry(category = ITEMS) public static boolean enableDiamondShard = true;
    @Entry(category = ITEMS) public static boolean enableQuartzShard = true;

    @Entry(category = ITEMS) public static boolean enableSmokedQuartz = true;
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableSmokedQuartzShard = true;

    @Entry(category = ITEMS) public static boolean enableBurntQuartz = true;
    @Condition(requiredOption = "enableBurntQuartz", requiredValue = "true")
    @Entry(category = ITEMS) public static boolean enableBurntQuartzShard = true;

    @Entry(category = ITEMS) public static boolean enableEmpoweredNetherite = true;

    //Gear
    //Emerald Gear
    @Comment(category = GEAR, centered = true) public static Comment emeraldSectionComment;
    @Entry(category = GEAR) public static boolean enableEmeraldTools = true;
    @Entry(category = GEAR) public static boolean enableEmeraldArmor = true;

    //Redstone Gear
    //@Comment(category = GEAR) public static Comment spacerRedstoneSection;
    @Comment(category = GEAR, centered = true) public static Comment redstoneSectionComment;
    @Entry(category = GEAR) public static boolean enableRedstoneTools = true;

    //Lapis Lazuli Gear
    //@Comment(category = GEAR) public static Comment spacerLapisSection;
    @Comment(category = GEAR, centered = true) public static Comment lapisSectionComment;
    @Entry(category = GEAR) public static boolean enableLapisLazuliTools = true;
    @Entry(category = GEAR) public static boolean enableLapisLazuliArmor = true;

    // Quartz Gear
    @Comment(category = GEAR, centered = true) public static Comment quartzSectionComment;
    @Entry(category = GEAR) public static boolean enableQuartzTools = true;

    // Smoked Quartz Gear
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Comment(category = GEAR, centered = true) public static Comment smokedQuartzSectionComment;
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableSmokedQuartzTools = true;

    //Burnt Quartz Gear
    @Condition(requiredOption = "enableBurntQuartz", requiredValue = "true")
    @Comment(category = GEAR, centered = true) public static Comment burntQuartzSectionComment;
    @Condition(requiredOption = "enableBurntQuartz", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableBurntQuartzTools = true;

    //Empowered Netherite Gear
    @Condition(requiredOption = "enableEmpoweredNetherite", requiredValue = "true")
    @Comment(category = GEAR, centered = true) public static Comment empoweredNetheriteSectionComment;
    @Condition(requiredOption = "enableEmpoweredNetherite", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableEmpoweredNetheriteTools = true;
    @Condition(requiredOption = "enableEmpoweredNetherite", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableEmpoweredNetheriteArmor = true;

    //Reinforced Leather Gear
    @Condition(requiredOption = "enableReinforcedLeather", requiredValue = "true")
    @Comment(category = GEAR, centered = true) public static Comment empoweredReinforcedLeatherComment;
    @Condition(requiredOption = "enableReinforcedLeather", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableReinforcedLeatherArmor = true;

    //Armadillo Scute Gear
    @Comment(category = GEAR, centered = true) public static Comment empoweredArmadilloScuteComment;
    @Entry(category = GEAR) public static boolean enableArmadilloScuteArmor = true;

    //Blocks
    @Entry(category = BLOCKS) public static boolean enableCompactCropBlocks = true;
    @Entry(category = BLOCKS) public static boolean enableCharcoalBlock = true;

    @Condition(requiredOption = "enableBundledSticks", requiredValue = "true")
    @Entry(category = BLOCKS) public static boolean enableBlockOfBundledSticks = true;

    @Condition(requiredOption = "enableFiredBricks", requiredValue = "true")
    @Entry(category = BLOCKS) public static boolean enableFiredBricksBlockSet = true;

    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = BLOCKS) public static boolean enableSmokedQuartzBlockSet = true;

    @Condition(requiredOption = "enableBurntQuartz", requiredValue = "true")
    @Entry(category = BLOCKS) public static boolean enableBurntQuartzBlockSet = true;

    @Comment(category = BLOCKS, centered = true) public static Comment additionalVanillaBlocksComment;
    @Entry(category = BLOCKS) public static boolean enableAddQuartzBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddSmoothStoneBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddSmoothSandstoneBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddSmoothRedSandstoneBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddCutSandstoneBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddCutRedSandstoneBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddTerracottaBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddWoolBlockSet = true;
    @Entry(category = BLOCKS) public static boolean enableAddConcreteBlockSet = true;

    public static boolean isVanillaHeadsEnabled(boolean enableVanillaHeads, boolean enableToolSet) {
        return enableBaseTemplate && enableToolSet && enableVanillaHeads;
    }

    public static boolean isModdedArmorEnabled(boolean enableBaseItem, boolean enableArmorSet) {
        return enableBaseItem && enableArmorSet;
    }

    public static boolean isModdedToolsEnabled(boolean enableBaseItem, boolean enableToolSet) {
        return enableBaseItem && enableToolSet;
    }

    public static boolean isModdedHeadsEnabled(boolean enableBaseItem, boolean enableModdedHeads, boolean enableToolSet) {
        return enableBaseTemplate && enableBaseItem && enableToolSet && enableModdedHeads;
    }

    public static boolean isBlockSetEnabled(boolean enabledBaseItem, boolean enableBlockSet) {
        return enabledBaseItem && enableBlockSet;
    }

    public static boolean isModdedShardEnabled(boolean enabledBaseItem, boolean enableShardItem) {
        return enabledBaseItem && enableShardItem;
    }
}
