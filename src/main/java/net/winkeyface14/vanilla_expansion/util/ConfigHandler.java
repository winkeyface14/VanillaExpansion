package net.winkeyface14.vanilla_expansion.util;

import eu.midnightdust.lib.config.MidnightConfig;

public class ConfigHandler extends MidnightConfig {
    public static final String ITEMS = "items";
    public static final String GEAR = "gear";
    public static final String BLOCKS = "blocks";

    //Items
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

    //Gear
    //Emerald Gear
    @Comment(category = GEAR, centered = true, name = "§lEmerald Tools, Weapons, and Armor") public static Comment emeraldSectionComment;
    @Entry(category = GEAR) public static boolean enableEmeraldTools = true;
    @Condition(requiredOption = "enableEmeraldTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name="Emerald Tool and Weapon Heads") public static boolean enableEmeraldHeads = true;
    @Entry(category = GEAR, name="Emerald Armor") public static boolean enableEmeraldArmor = true;

    //Redstone Gear
    @Comment(category = GEAR) public static Comment spacer1;
    @Comment(category = GEAR, centered = true, name = "§lRedstone Tools and Weapons") public static Comment redstoneSectionComment;
    @Entry(category = GEAR) public static boolean enableRedstoneTools = true;
    @Condition(requiredOption = "enableRedstoneTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name = "Redstone Tool and Weapon Heads") public static boolean enableRedstoneHeads = true;

    //Lapis Lazuli Gear
    @Comment(category = GEAR) public static Comment spacer2;
    @Comment(category = GEAR, centered = true, name = "§lLapis Lazuli Tools, Weapons, and Armor") public static Comment lapisSectionComment;
    @Entry(category = GEAR, name="Lapiz Lazuli Tools") public static boolean enableLapisLazuliTools = true;

    /*
    @Condition(requiredOption = "enableLapisLazuliTools", requiredValue = "true")
    @Condition(requiredOption = "enableBaseTemplate", requiredValue = "true")
    @Entry(category = GEAR, name = "Lapis Lazuli Tool and Weapon Heads") public static boolean enableLapisLazuliHeads = true;
     */
    @Entry(category = GEAR, name="Lapis Lazuli Armor") public static boolean enableLapisLazuliArmor = true;

    @Entry(category = BLOCKS, name = "Compact Crop Blocks") public static boolean enableCompactCropBlocks = true;

    public static boolean isVanillaHeadsEnabled(boolean enableVanillaHeads, boolean enableToolSet) {
        return enableBaseTemplate && enableVanillaHeads && enableToolSet;
    }
}
