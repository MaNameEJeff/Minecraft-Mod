package net.manameejeff2.manameejeffmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.manameejeff2.manameejeffmod.ManameejeffMod;
import net.manameejeff2.manameejeffmod.block.custom.DiscBurner;
import net.manameejeff2.manameejeffmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

    public static final Block DISC_BURNER = registerBlock("disc_burner",
            new DiscBurner(FabricBlockSettings.of(Material.REDSTONE_LAMP).breakInstantly()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ManameejeffMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(ManameejeffMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ALUMINIUM_BLOCK)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ManameejeffMod.MOD_ID);
    }
}
