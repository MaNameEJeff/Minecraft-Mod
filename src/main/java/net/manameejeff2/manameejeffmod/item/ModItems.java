package net.manameejeff2.manameejeffmod.item;

import net.manameejeff2.manameejeffmod.ManameejeffMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EMPTY_DISC = registerItem("empty_disc",
            new Item(new FabricItemSettings().group(ModItemGroup.ALUMINIUM_BLOCK)));

    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALUMINIUM_BLOCK)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALUMINIUM_BLOCK)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ManameejeffMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Loaded " + ManameejeffMod.MOD_ID);
    }

}
