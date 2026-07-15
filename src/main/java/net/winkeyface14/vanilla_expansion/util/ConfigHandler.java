package net.winkeyface14.vanilla_expansion.util;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigHandler extends MidnightConfig {
    public static final String ITEMS = "items";
    public static final String GEAR = "gear";
    public static final String BLOCKS = "blocks";

    //Items
    @Comment(category = ITEMS, centered = true, name = "§lTool and Weapon Heads") public static Comment headsSectionComment;
    @Entry(category = ITEMS) public static boolean enableBaseTemplate = true;
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS, name="Stone Tool and Weapon Heads") public static boolean enableStoneHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS, name="Copper Tool and Weapon Heads") public static boolean enableCopperHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS, name="Iron Tool and Weapon Heads") public static boolean enableIronHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS, name="Golden Tool and Weapon Heads") public static boolean enableGoldenHeads = true;

    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = ITEMS, name="Diamond Tool and Weapon Heads") public static boolean enableDiamondHeads = true;

    @Comment(category = ITEMS, centered = true, name = "§lMiscellaneous Items") public static Comment MiscItemsSectionComment;
    @Entry(category = ITEMS, name="Bundled Sticks") public static boolean enableBundledSticks = true;
    @Entry(category = ITEMS, name="Pile of Paper") public static boolean enablePileOfPaper = true;
    @Entry(category = ITEMS, name="Coal Chunk") public static boolean enableCoalChunk = true;
    @Entry(category = ITEMS, name="Charcoal Chunk") public static boolean enableCharcoalChunk = true;
    @Entry(category = ITEMS, name="Emerald Shard") public static boolean enableEmeraldShard = true;
    @Entry(category = ITEMS, name="Diamond Shard") public static boolean enableDiamondShard = true;
    @Entry(category = ITEMS, name="Quartz Shard") public static boolean enableQuartzShard = true;

    @Entry(category = ITEMS, name="Smoked Quartz") public static boolean enableSmokedQuartz = true;
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = ITEMS, name="Smoked Quartz Shard") public static boolean enableSmokedQuartzShard = true;

    //Gear
    //Emerald Gear
    @Comment(category = GEAR, centered = true, name = "§lEmerald Tools, Weapons, and Armor") public static Comment emeraldSectionComment;
    @Entry(category = GEAR) public static boolean enableEmeraldTools = true;
    @Condition(requiredOption = "enableEmeraldTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name="Emerald Tool and Weapon Heads") public static boolean enableEmeraldHeads = true;
    @Entry(category = GEAR, name="Emerald Armor") public static boolean enableEmeraldArmor = true;

    //Redstone Gear
    //@Comment(category = GEAR) public static Comment spacerRedstoneSection;
    @Comment(category = GEAR, centered = true, name = "§lRedstone Tools and Weapons") public static Comment redstoneSectionComment;
    @Entry(category = GEAR) public static boolean enableRedstoneTools = true;
    @Condition(requiredOption = "enableRedstoneTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name = "Redstone Tool and Weapon Heads") public static boolean enableRedstoneHeads = true;

    //Lapis Lazuli Gear
    //@Comment(category = GEAR) public static Comment spacerLapisSection;
    @Comment(category = GEAR, centered = true, name = "§lLapis Lazuli Tools, Weapons, and Armor") public static Comment lapisSectionComment;
    @Entry(category = GEAR, name="Lapiz Lazuli Tools") public static boolean enableLapisLazuliTools = true;

    /*
    @Condition(requiredOption = "enableLapisLazuliTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name = "Lapis Lazuli Tool and Weapon Heads") public static boolean enableLapisLazuliHeads = true;
     */
    @Entry(category = GEAR, name="Lapis Lazuli Armor") public static boolean enableLapisLazuliArmor = true;

    @Comment(category = GEAR, centered = true, name = "§lQuartz Tools, Weapons, and Armor") public static Comment quartzSectionComment;
    @Entry(category = GEAR) public static boolean enableQuartzTools = true;
    @Condition(requiredOption = "enableQuartzTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name="Quartz Tool and Weapon Heads") public static boolean enableQuartzHeads = true;

    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Comment(category = GEAR, centered = true, name = "§lSmoked Quartz Tools, Weapons, and Armor") public static Comment smokedQuartzSectionComment;
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = GEAR) public static boolean enableSmokedQuartzTools = true;
    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Condition(requiredOption = "enableSmokedQuartzTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name="Quartz Tool and Weapon Heads") public static boolean enableSmokedQuartzHeads = true;

    //Blocks
    @Entry(category = BLOCKS, name = "Compact Crop Blocks") public static boolean enableCompactCropBlocks = true;
    @Entry(category = BLOCKS, name = "Charcoal Block") public static boolean enableCharcoalBlock = true;

    @Condition(requiredOption = "enableBundledSticks", requiredValue = "true")
    @Entry(category = BLOCKS, name = "Block of Bundled Sticks") public static boolean enableBlockOfBundledSticks = true;

    @Entry(category = BLOCKS, name = "Additional Quartz Block Set") public static boolean enableAddQuartzBlockSet = true;

    @Condition(requiredOption = "enableSmokedQuartz", requiredValue = "true")
    @Entry(category = BLOCKS, name = "Smoked Quartz Block Set") public static boolean enableSmokedQuartzBlockSet = true;

    public static boolean isVanillaHeadsEnabled(boolean enableVanillaHeads, boolean enableToolSet) {
        return enableBaseTemplate && enableToolSet && enableVanillaHeads;
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
