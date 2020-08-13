package com.winkeyface14.vanillaexpansion.blocks;

import com.winkeyface14.vanillaexpansion.VanillaExpansion;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

public class SpecialBlockItemBase extends BlockItem {

    public SpecialBlockItemBase(Block block) {
        super(block, new Properties());
    }
}
