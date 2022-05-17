package com.github.dragoni7.dreamland.common.world.feature;

import java.util.ArrayList;
import java.util.List;

import com.github.dragoni7.dreamland.core.registry.DreamlandBlocks;
import com.github.dragoni7.dreamland.util.DreamlandLoc;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class DreamlandFeaturePlacements {
	
private static final ArrayList<ResourceKey<PlacedFeature>> KEYS = new ArrayList<ResourceKey<PlacedFeature>>();
	
	// KEYS
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_COMB_CEILING_KEY = createPlacedFeatureKey("hive_comb_ceiling");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_COMB_KEY = createPlacedFeatureKey("hive_comb");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_STRAND_KEY = createPlacedFeatureKey("hive_strand");
	public static final ResourceKey<PlacedFeature> PLACED_CAVE_SLIME_KEY = createPlacedFeatureKey("cave_slime");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_JELLY_CLUSTER_KEY = createPlacedFeatureKey("hive_jelly_cluster");
	public static final ResourceKey<PlacedFeature> PLACED_INFESTED_HIVE_JELLY_CLUSTER_KEY = createPlacedFeatureKey("infested_hive_jelly_cluster");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_GROWTH_KEY = createPlacedFeatureKey("hive_growth");
	public static final ResourceKey<PlacedFeature> PLACED_FILLED_HIVE_BLOCK_KEY = createPlacedFeatureKey("filled_hive_block");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_IRON_UPPER_KEY = createPlacedFeatureKey("hive_iron_upper");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_IRON_MIDDLE_KEY = createPlacedFeatureKey("hive_iron_middle");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_GOLD_KEY = createPlacedFeatureKey("hive_gold");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_GOLD_LOWER_KEY = createPlacedFeatureKey("hive_gold_lower");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_REDSTONE_KEY = createPlacedFeatureKey("hive_redstone");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_REDSTONE_LOWER_KEY = createPlacedFeatureKey("hive_redstone_lower");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_DIAMOND_KEY = createPlacedFeatureKey("hive_diamond");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_DIAMOND_LARGE_KEY = createPlacedFeatureKey("hive_diamond_large");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_LAPIS_KEY = createPlacedFeatureKey("hive_lapis");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_COPPER_KEY = createPlacedFeatureKey("hive_copper");
	public static final ResourceKey<PlacedFeature> PLACED_HIVE_COPPER_LARGE_KEY = createPlacedFeatureKey("hive_copper_large");
	public static final ResourceKey<PlacedFeature> PLACED_RED_FLOWERS_KEY = createPlacedFeatureKey("red_flowers");
	public static final ResourceKey<PlacedFeature> PLACED_MOSS_GRASS_KEY = createPlacedFeatureKey("moss_grass");
	public static final ResourceKey<PlacedFeature> PLACED_DROUGHT_DISK_KEY = createPlacedFeatureKey("drought_disk");
	public static final ResourceKey<PlacedFeature> PLACED_TAR_DELTA_KEY = createPlacedFeatureKey("tar_delta");
	public static final ResourceKey<PlacedFeature> PLACED_TAR_BARK_TREE_KEY = createPlacedFeatureKey("tar_bark_tree");
	public static final ResourceKey<PlacedFeature> PLACED_BORDERED_DROUGHT_DISK_KEY = createPlacedFeatureKey("bordered_drought_disk");
	public static final ResourceKey<PlacedFeature> PLACED_DROUGHT_VEGETATION_KEY = createPlacedFeatureKey("drought_vegetation");
	public static final ResourceKey<PlacedFeature> PLACED_TAR_SPROUTS_KEY = createPlacedFeatureKey("tar_sprouts");
	public static final ResourceKey<PlacedFeature> PLACED_TAR_SKELETON_KEY =  createPlacedFeatureKey("tar_skeleton");
	public static final ResourceKey<PlacedFeature> PLACED_TAR_BONE_KEY = createPlacedFeatureKey("tar_bone");
	
	public static ArrayList<ResourceKey<PlacedFeature>> getKeys() {
		return KEYS;
	}
	
	// PLACED FEATURES
	public static final Holder<PlacedFeature> PLACED_HIVE_COMB_CEILING = registerPlacedFeature("hive_comb_ceiling", DreamlandConfiguredFeatures.HIVE_COMB, CountPlacement.of(UniformInt.of(90, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_HIVE_COMB = registerPlacedFeature("hive_comb", DreamlandConfiguredFeatures.HIVE_COMB, CountPlacement.of(UniformInt.of(90, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_HIVE_STRAND = registerPlacedFeature("hive_strand", DreamlandConfiguredFeatures.HIVE_STRAND, CountPlacement.of(UniformInt.of(60, 96)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-5), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_OR_WATER_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_CAVE_SLIME = registerPlacedFeature("cave_slime", DreamlandConfiguredFeatures.CAVE_SLIME, CountPlacement.of(UniformInt.of(90, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public static final Holder<PlacedFeature> PLACED_HIVE_JELLY_CLUSTER = registerPlacedFeature("hive_jelly_cluster", DreamlandConfiguredFeatures.HIVE_JELLY_CLUSTER, CountPlacement.of(UniformInt.of(1, 47)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_INFESTED_HIVE_JELLY_CLUSTER = registerPlacedFeature("infested_hive_jelly_cluster", DreamlandConfiguredFeatures.INFESTED_HIVE_JELLY_CLUSTER, CountPlacement.of(UniformInt.of(0, 47)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_HIVE_GROWTH = registerPlacedFeature("hive_growth", DreamlandConfiguredFeatures.GROWTH_PATCH, CountPlacement.of(UniformInt.of(10, 96)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	
	public static final Holder<PlacedFeature> PLACED_FILLED_HIVE_BLOCK = registerPlacedFeature("filled_hive_block", DreamlandConfiguredFeatures.FILLED_HIVE_BLOCK, (commonOrePlacement(32, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top()))));
	public static final Holder<PlacedFeature> HIVE_IRON_UPPER = registerPlacedFeature("hive_iron_upper", DreamlandConfiguredFeatures.HIVE_IRON, commonOrePlacement(90, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
	public static final Holder<PlacedFeature> HIVE_IRON_MIDDLE = registerPlacedFeature("hive_iron_middle", DreamlandConfiguredFeatures.HIVE_IRON, (commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56)))));
	public static final Holder<PlacedFeature> HIVE_ORE_GOLD = registerPlacedFeature("hive_gold", DreamlandConfiguredFeatures.HIVE_GOLD, (commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32)))));
	public static final Holder<PlacedFeature> HIVE_ORE_GOLD_LOWER = registerPlacedFeature("hive_gold_lower", DreamlandConfiguredFeatures.HIVE_GOLD, (orePlacement(CountPlacement.of(UniformInt.of(0, 1)), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48)))));
	public static final Holder<PlacedFeature> HIVE_REDSTONE = registerPlacedFeature("hive_redstone", DreamlandConfiguredFeatures.HIVE_REDSTONE, (commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)))));
	public static final Holder<PlacedFeature> HIVE_REDSTONE_LOWER = registerPlacedFeature("hive_redstone_lower", DreamlandConfiguredFeatures.HIVE_REDSTONE, (commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32)))));
	public static final Holder<PlacedFeature> HIVE_DIAMOND = registerPlacedFeature("hive_diamond", DreamlandConfiguredFeatures.HIVE_DIAMOND, (commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
	public static final Holder<PlacedFeature> HIVE_DIAMOND_LARGE = registerPlacedFeature("hive_diamond_large", DreamlandConfiguredFeatures.HIVE_DIAMOND_LARGE, (rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
	public static final Holder<PlacedFeature> HIVE_LAPIS = registerPlacedFeature("hive_lapis", DreamlandConfiguredFeatures.HIVE_LAPIS, (commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32)))));
	public static final Holder<PlacedFeature> HIVE_COPPER = registerPlacedFeature("hive_copper", DreamlandConfiguredFeatures.HIVE_COPPER, (commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112)))));
	public static final Holder<PlacedFeature> HIVE_COPPER_LARGE = registerPlacedFeature("hive_copper_large", DreamlandConfiguredFeatures.HIVE_COPPER_LARGE, (commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112)))));
	 
	public static final Holder<PlacedFeature> PLACED_RED_FLOWERS = registerPlacedFeature("red_flowers", DreamlandConfiguredFeatures.RED_FLOWERS, CountPlacement.of(UniformInt.of(90, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_MOSS_GRASS = registerPlacedFeature("moss_grass", DreamlandConfiguredFeatures.MOSS_GRASS_PATCH, CountPlacement.of(UniformInt.of(90, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(45), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(0)), BiomeFilter.biome());
	
	public static final Holder<PlacedFeature> PLACED_DROUGHT_DISK = registerPlacedFeature("drought_disk", DreamlandConfiguredFeatures.DROUGHT_DISK, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome());
	public static final Holder<PlacedFeature> DROUGHT_BORDERED_DISK_SURFACE = registerPlacedFeature("bordered_drought_disk", DreamlandConfiguredFeatures.DROUGHT_BORDERED_DISK, CountPlacement.of(UniformInt.of(0, 48)), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_TAR_DELTA = registerPlacedFeature("tar_delta", DreamlandConfiguredFeatures.TAR_DELTA, CountPlacement.of(UniformInt.of(0, 96)), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_DROUGHT_VEGETATION = registerPlacedFeature("drought_vegetation", DreamlandConfiguredFeatures.DROUGHT_VEGETATION, CountPlacement.of(UniformInt.of(54, 256)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(55), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_TAR_BARK_TREE = registerPlacedFeature("tar_bark_tree", DreamlandConfiguredFeatures.TAR_BARK_TREE, CountPlacement.of(UniformInt.of(0, 16)), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_TAR_SPROUTS = registerPlacedFeature("tar_sprouts", DreamlandConfiguredFeatures.TAR_SPROUTS, CountPlacement.of(UniformInt.of(24, 96)), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(55), VerticalAnchor.top()), EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesBlocks(List.of(DreamlandBlocks.TAR_SOIL.get())), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_TAR_SKELETON = registerPlacedFeature("tar_skeleton", DreamlandConfiguredFeatures.TAR_SKELETON, RarityFilter.onAverageOnceEvery(27), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesBlocks(List.of(DreamlandBlocks.TAR_SOIL.get())), 12), BiomeFilter.biome());
	public static final Holder<PlacedFeature> PLACED_TAR_BONE = registerPlacedFeature("tar_bone", DreamlandConfiguredFeatures.TAR_BONE, RarityFilter.onAverageOnceEvery(9), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesBlocks(List.of(DreamlandBlocks.TAR_SOIL.get())), 12), BiomeFilter.biome());
	
	private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
		      return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
		   }
	   
	   private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
		      return orePlacement(CountPlacement.of(p_195344_), p_195345_);
		   }
	   
	   private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
		      return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
		   }
	   
	   private static <FC extends FeatureConfiguration> Holder<PlacedFeature> registerPlacedFeature(String name, Holder<ConfiguredFeature<FC,?>> feature, List<PlacementModifier> placementModifiers) {
		   return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, DreamlandLoc.createLoc(name), new PlacedFeature(Holder.hackyErase(feature), List.copyOf(placementModifiers)));
	   }
	   
	   private static <FC extends FeatureConfiguration> Holder<PlacedFeature> registerPlacedFeature(String name, Holder<ConfiguredFeature<FC,?>> feature, PlacementModifier... placementModifiers) {
		   return registerPlacedFeature(name,feature,List.of(placementModifiers));
	   }
	   
	   private static ResourceKey<PlacedFeature> createPlacedFeatureKey(String name) {
		   ResourceKey<PlacedFeature> key = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, DreamlandLoc.createLoc(name));
		   KEYS.add(key);
		   return key;
	   }
}
