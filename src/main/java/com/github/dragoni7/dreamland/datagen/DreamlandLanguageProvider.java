package com.github.dragoni7.dreamland.datagen;

import com.github.dragoni7.dreamland.Dreamland;
import com.github.dragoni7.dreamland.core.registry.DreamlandBlocks;
import com.github.dragoni7.dreamland.core.registry.DreamlandEffects;
import com.github.dragoni7.dreamland.core.registry.DreamlandEntities;
import com.github.dragoni7.dreamland.core.registry.DreamlandFluids;
import com.github.dragoni7.dreamland.core.registry.DreamlandItems;
import com.github.dragoni7.dreamland.core.registry.DreamlandTiles;
import com.github.dragoni7.dreamland.core.registry.DreamlandWoodSets;
import com.github.dragoni7.dreamland.util.WoodSet;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class DreamlandLanguageProvider extends LanguageProvider {

	public DreamlandLanguageProvider(DataGenerator gen, String locale) {
		super(gen, Dreamland.MODID, locale);
	}

	@Override
	protected void addTranslations() {
		add("itemGroup." + Dreamland.MODID, "Dreamland");
		
		// Block
		add(DreamlandBlocks.BUMBLE_BLOCK.block().get(), "Bumble Block");
		
		add(DreamlandBlocks.HIVE_BLOCK.block().get(), "Hive Block");
		add(DreamlandBlocks.HIVE_COPPER.block().get(), "Hive Copper Ore");
		add(DreamlandBlocks.HIVE_DIAMOND.block().get(), "Hive Diamond Ore");
		add(DreamlandBlocks.HIVE_GOLD.block().get(), "Hive Gold Ore");
		add(DreamlandBlocks.HIVE_IRON.block().get(), "Hive Iron Ore");
		add(DreamlandBlocks.HIVE_LAPIS.block().get(), "Hive Lapis Ore");
		add(DreamlandBlocks.HIVE_REDSTONE.block().get(), "Hive Redstone Ore");
		add(DreamlandBlocks.HIVE_MEMBRANE.block().get(), "Hive Membrane");
		add(DreamlandBlocks.HIVE_WEAVER.block().get(), "Hive Weaver");
		add(DreamlandBlocks.HIVE_JELLY_CLUSTER.block().get(), "Hive Jelly Cluster");
		add(DreamlandBlocks.INFESTED_HIVE_JELLY_CLUSTER.block().get(), "Hive Jelly Cluster");
		add(DreamlandBlocks.HIVE_BLOCK_WITH_JELLY.block().get(), "Hive Block With Jelly");
		add(DreamlandBlocks.CAVE_SLIME.block().get(), "Hive Slime");
		add(DreamlandBlocks.CAVE_SLIME_PLANT.get(), "Hive Slime Plant");
		add(DreamlandBlocks.HIVE_GROWTH.block().get(), "Hive Growth");
		add(DreamlandBlocks.JELLY_SPLOTCH.get(), "Jelly Splotch");
		
		add(DreamlandBlocks.DRIED_TAR.block().get(), "Dried Tar");
		add(DreamlandBlocks.TAR_MUD.block().get(), "Tar Mud");
		add(DreamlandBlocks.PACKED_TAR_MUD.block().get(), "Packed Tar Mud");
		add(DreamlandBlocks.TAR_MUD_BRICKS.block().get(), "Tar Mud Bricks");
		add(DreamlandBlocks.TAR_MUD_BRICK_SLAB.block().get(), "Tar Mud Slab");
		add(DreamlandBlocks.TAR_MUD_BRICK_STAIRS.block().get(), "Tar Mud Brick Stairs");
		add(DreamlandBlocks.TAR_MUD_BRICK_WALL.block().get(), "Tar Mud Brick Wall");
		add(DreamlandBlocks.DROUGHT_SOIL.block().get(), "Drought Soil");
		add(DreamlandFluids.TAR_BLOCK.get(), "Tar");
		add(DreamlandBlocks.TAR_BARK_SAPLING.block().get(), "Tar Bark Sapling");
		add(DreamlandBlocks.TAR_SPROUTS.block().get(), "Tar Sprouts");
		add(DreamlandBlocks.TAR_BARK_LEAVES.block().get(), "Tar Bark Leaves");
		add(DreamlandBlocks.ANCIENT_EGG.block().get(), "Ancient Egg");
		add(DreamlandBlocks.FOSSILIZED_EGG.block().get(), "Fossilized Egg");
		translateWoodSet(DreamlandWoodSets.TAR_BARK, "Tar Bark");
		
		add(DreamlandBlocks.MINERAL_DIRT.block().get(), "Mineral Dirt");
		add(DreamlandBlocks.FLOWERING_GRASS.block().get(), "Flowering Undergrowth");
		add(DreamlandBlocks.PLUM_BIRCH_LEAVES.block().get(), "Plum Birch Leaves");
		add(DreamlandBlocks.PINK_CRAB_GRASS.block().get(), "Pink Crab Grass");
		add(DreamlandBlocks.OPALINE_MARIGOLD.block().get(), "Opaline Marigold");
		add(DreamlandBlocks.PLUM_BIRCH_SAPLING.block().get(), "Plum Birch Sapling");
		add(DreamlandBlocks.FLOWERING_UNDERGROWTH.block().get(), "Flowering Undergrowth");
		add(DreamlandBlocks.PLUM_BIRCH_SHRUB.block().get(), "Plum Birch Shrub");
		add(DreamlandBlocks.OPAL_DIFFUSER_BLOCK.block().get(), "Opal Diffuser");
		add(DreamlandBlocks.OPAL_CLUSTER.block().get(), "Opal Cluster");
		translateWoodSet(DreamlandWoodSets.PLUM_BIRCH, "Plum Birch");
		
		// Items
		add(DreamlandItems.HIVE_JELLY_ITEM.get(), "Hive Jelly");
		add(DreamlandItems.TAR_BUCKET.get(), "Bucket of Tar");
		add(DreamlandItems.SPAWN_EGG_LARVA.get(), "Larva Spawn Egg");
		add(DreamlandItems.SPAWN_EGG_OOZE.get(), "Ooze Spawn Egg");
		add(DreamlandItems.LARVA_HELMET.get(), "Larva Symbiote Helmet");
		add(DreamlandItems.OPAL.get(), "Opal");
		add(DreamlandItems.PRECIOUS_OPAL.get(), "Precious Opal");
		
		// Entities
		add(DreamlandEntities.LARVA.get(), "Larva");
		add(DreamlandEntities.THROWN_HIVE_JELLY.get(), "Thrown Hive Jelly");
		add(DreamlandEntities.OOZE.get(), "Ooze");
		add(DreamlandEntities.TAR_BALL.get(), "Tar Ball");
		
		// Effects
		add(DreamlandEffects.ANTAGONIZED.get(), "Antagonized");
		add(DreamlandEffects.TARRED.get(), "Tarred");
	}
	
	private void translateWoodSet(WoodSet set, String name) {
		add(set.button().block().get(), name + " Button");
		add(set.door().block().get(), name + " Door");
		add(set.fenceGate().block().get(), name + " Fence Gate");
		add(set.fence().block().get(), name + " Fence");
		add(set.ladder().block().get(), name + " Ladder");
		add(set.log().block().get(), name + " Log");
		add(set.plank().block().get(), name + " Planks");
		add(set.pressurePlate().block().get(), name + " Pressure Plate");
		add(set.slab().block().get(), name + " Slab");
		add(set.stair().block().get(), name + " Stairs");
		add(set.strippedLog().block().get(), " Stripped " + name + " Log");
		add(set.trapDoor().block().get(), name + " Trap Door");
		add(set.wood().block().get(), name + " Wood");
		add(set.strippedWood().block().get(), "Stripped " + name + " Wood");
	}

}
