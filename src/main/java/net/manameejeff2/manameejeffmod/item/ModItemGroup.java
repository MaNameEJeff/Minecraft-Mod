package net.manameejeff2.manameejeffmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.manameejeff2.manameejeffmod.ManameejeffMod;
import net.manameejeff2.manameejeffmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALUMINIUM_BLOCK = FabricItemGroupBuilder.build(new Identifier(ManameejeffMod.MOD_ID, "aluminium_block"),
            () -> new ItemStack(ModBlocks.ALUMINIUM_BLOCK));
}
