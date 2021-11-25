package net.manameejeff2.manameejeffmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.manameejeff2.manameejeffmod.block.ModBlocks;
import net.manameejeff2.manameejeffmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class ManameejeffMod implements ModInitializer {

	public static final String MOD_ID = "manameejeffmod";

	public static ConfiguredFeature<?, ?> ALUMINIUM_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ALUMINIUM_ORE.getDefaultState(), 9))
			.range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64))))
			.spreadHorizontally()
			.repeat(20);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//RegistryKey<ConfiguredFeature<?, ?>> AluminiumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
		//		new Identifier(MOD_ID, "aluminium_ore_overworld"));
		//Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, AluminiumOreOverworld.getValue(), ALUMINIUM_ORE_OVERWORLD);
		//BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AluminiumOreOverworld);

		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("minecraft", "aluminium_ore_overworld"), ALUMINIUM_ORE_OVERWORLD);

		System.out.println("Registering items for " + MOD_ID);
	}
}
