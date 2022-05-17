package com.github.dragoni7.dreamland.core.registry;

import com.github.dragoni7.dreamland.Dreamland;
import com.github.dragoni7.dreamland.common.items.HiveJelly;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DreamlandItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dreamland.MODID);
		
	//Block Items
	public static final RegistryObject<Item> BUMBLE_BLOCK = registerBlockItem("bumble_block", DreamlandBlocks.BUMBLE_BLOCK);
	
	public static final RegistryObject<Item> DARK_QUARTZITE = registerBlockItem("dark_quartzite", DreamlandBlocks.DARK_QUARTZITE);
	
	public static final RegistryObject<Item> CLAY_SOIL = registerBlockItem("clay_soil", DreamlandBlocks.CLAY_SOIL);
	
	public static final RegistryObject<Item> CLAY_SOIL_GRASS = registerBlockItem("clay_soil_grass", DreamlandBlocks.CLAY_SOIL_GRASS);
	
	public static final RegistryObject<Item> DUSK_ICE = registerBlockItem("dusk_ice", DreamlandBlocks.DUSK_ICE);
	
	public static final RegistryObject<Item> CAVE_SLIME = registerBlockItem("cave_slime", DreamlandBlocks.CAVE_SLIME);
	
	public static final RegistryObject<Item> HIVE_BLOCK = registerBlockItem("hive_block", DreamlandBlocks.HIVE_BLOCK);
	
	public static final RegistryObject<Item> HIVE_JELLY_CLUSTER = registerBlockItem("hive_jelly_cluster", DreamlandBlocks.HIVE_JELLY_CLUSTER);
	
	public static final RegistryObject<Item> INFESTED_HIVE_JELLY_CLUSTER = registerBlockItem("infested_hive_jelly_cluster", DreamlandBlocks.INFESTED_HIVE_JELLY_CLUSTER);
	
	public static final RegistryObject<Item> HIVE_MEMBRANE = registerBlockItem("hive_membrane", DreamlandBlocks.HIVE_MEMBRANE);
	
	public static final RegistryObject<Item> HIVE_BLOCK_WITH_JELLY = registerBlockItem("hive_block_with_jelly", DreamlandBlocks.HIVE_BLOCK_WITH_JELLY);
	
	public static final RegistryObject<Item> HIVE_GROWTH = registerBlockItem("hive_growth", DreamlandBlocks.HIVE_GROWTH);
	
	public static final RegistryObject<Item> HIVE_COCOON = registerBlockItem("hive_cocoon", DreamlandBlocks.HIVE_COCOON);
	
	public static final RegistryObject<Item> HIVE_IRON = registerBlockItem("hive_iron", DreamlandBlocks.HIVE_IRON);
	public static final RegistryObject<Item> HIVE_GOLD = registerBlockItem("hive_gold", DreamlandBlocks.HIVE_GOLD);
	public static final RegistryObject<Item> HIVE_COPPER = registerBlockItem("hive_copper", DreamlandBlocks.HIVE_COPPER);
	public static final RegistryObject<Item> HIVE_REDSTONE = registerBlockItem("hive_redstone", DreamlandBlocks.HIVE_REDSTONE);
	public static final RegistryObject<Item> HIVE_LAPIS = registerBlockItem("hive_lapis", DreamlandBlocks.HIVE_LAPIS);
	public static final RegistryObject<Item> HIVE_DIAMOND = registerBlockItem("hive_diamond", DreamlandBlocks.HIVE_DIAMOND);
	
	public static final RegistryObject<Item> DRIED_TAR = registerBlockItem("dried_tar", DreamlandBlocks.DRIED_TAR);
	public static final RegistryObject<Item> TAR_SOIL = registerBlockItem("tar_soil", DreamlandBlocks.TAR_SOIL);
	public static final RegistryObject<Item> DROUGHT_SOIL = registerBlockItem("drought_soil", DreamlandBlocks.DROUGHT_SOIL);
	public static final RegistryObject<Item> JOSHUA_SAPLING = registerBlockItem("joshua_sapling", DreamlandBlocks.JOSHUA_SAPLING);
	public static final RegistryObject<Item> TAR_SPROUTS = registerBlockItem("tar_sprouts", DreamlandBlocks.TAR_SPROUTS);
	public static final RegistryObject<Item> TAR_BARK_LOG = registerBlockItem("tar_bark_log", DreamlandBlocks.TAR_BARK_LOG);
	public static final RegistryObject<Item> TAR_BARK_LEAVES = registerBlockItem("tar_bark_leaves", DreamlandBlocks.TAR_BARK_LEAVES);
	public static final RegistryObject<Item> STRIPPED_TAR_BARK_LOG = registerBlockItem("stripped_tar_bark_log", DreamlandBlocks.STRIPPED_TAR_BARK_LOG);
	
	//Items
	public static final RegistryObject<Item> HIVE_JELLY_ITEM = registerHiveJelly("hive_jelly", new FoodProperties.Builder().nutrition(1).saturationMod(0.2F).build());
	
	public static final RegistryObject<Item> TAR_BUCKET = ITEMS.register("tar_bucket", 
			() -> new BucketItem(DreamlandFluids.TAR_FLUID, new Item.Properties().tab(Dreamland.DreamlandTab).stacksTo(1)));
	
	private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
		
		return ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(Dreamland.DreamlandTab)));
		
	}
	
	@SuppressWarnings("unused")
	private static RegistryObject<Item> registerBasicItem(String name) {
		
		return ITEMS.register(name, () -> new Item(new Item.Properties().tab(Dreamland.DreamlandTab)));
	}
	
	@SuppressWarnings("unused")
	private static RegistryObject<Item> registerEdibleItem(String name, FoodProperties foodProperty) {
		
		return ITEMS.register(name, () -> new Item(new Item.Properties().tab(Dreamland.DreamlandTab).food(foodProperty)));
	}
	
	private static RegistryObject<Item> registerHiveJelly(String name, FoodProperties foodProperty) {
		
		return ITEMS.register(name, () -> new HiveJelly(new Item.Properties().tab(Dreamland.DreamlandTab).food(foodProperty).stacksTo(16)));
	}
	
	
	
	

}