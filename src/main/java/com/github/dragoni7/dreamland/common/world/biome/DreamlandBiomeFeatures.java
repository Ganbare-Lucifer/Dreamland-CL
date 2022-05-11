package com.github.dragoni7.dreamland.common.world.biome;

import com.github.dragoni7.dreamland.common.world.feature.DreamlandFeaturePlacements;

import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
public class DreamlandBiomeFeatures {

	public static void addHiveOres(BiomeGenerationSettings.Builder builder) {
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.PLACED_FILLED_HIVE_BLOCK);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_IRON_UPPER);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_IRON_MIDDLE);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_COPPER);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_COPPER_LARGE);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_REDSTONE);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_REDSTONE_LOWER);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_ORE_GOLD);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_ORE_GOLD_LOWER);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_LAPIS);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_DIAMOND);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DreamlandFeaturePlacements.HIVE_DIAMOND_LARGE);
	}
	
	public static void hiveBiomeFeatures(BiomeGenerationSettings.Builder builder) {
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, DreamlandFeaturePlacements.PLACED_HIVE_COMB);
		builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, DreamlandFeaturePlacements.PLACED_HIVE_STRAND);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_CAVE_SLIME);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_HIVE_JELLY_CLUSTER);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_INFESTED_HIVE_JELLY_CLUSTER);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_HIVE_GROWTH);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, OrePlacements.ORE_ANDESITE_UPPER);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, OrePlacements.ORE_DIORITE_UPPER);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, OrePlacements.ORE_GRANITE_UPPER);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, OrePlacements.ORE_DIRT);
	}
	
	public static void gardenBiomeFeatures(BiomeGenerationSettings.Builder builder) {
	    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FOREST_FLOWERS);
	    builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_RED_FLOWERS);
	    builder.addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, DreamlandFeaturePlacements.PLACED_MOSS_GRASS);
	}
	
	public static void tarlandsBiomeFeatures(BiomeGenerationSettings.Builder builder) {
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_DROUGHT_VEGETATION);
		builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DreamlandFeaturePlacements.PLACED_JOSHUA_TREE);
		builder.addFeature(GenerationStep.Decoration.RAW_GENERATION, DreamlandFeaturePlacements.PLACED_TAR_DELTA);
		builder.addFeature(GenerationStep.Decoration.LAKES, DreamlandFeaturePlacements.DROUGHT_BORDERED_DISK_SURFACE);
		builder.addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, DreamlandFeaturePlacements.PLACED_DROUGHT_DISK);
	}
}