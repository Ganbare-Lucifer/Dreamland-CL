package com.github.dragoni7.datagen;

import com.github.dragoni7.Dreamland;
import com.github.dragoni7.common.items.DreamlandItems;
import com.github.dragoni7.util.DreamlandLoc;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider{

	public ItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
		
	}

	@Override
	protected void registerModels() {
		
		createBlockItemModel(DreamlandItems.HIVE_BLOCK,"block/hive_block1");
		createBlockItemModel(DreamlandItems.CLAY_SOIL,"block/clay_soil");
		createBlockItemModel(DreamlandItems.DARK_QUARTZITE,"block/dark_quartzite");
		createBlockItemModel(DreamlandItems.SOLID_TAR,"block/solid_tar");
		createBlockItemModel(DreamlandItems.POROUS_STONE,"block/porous_stone");
		createBlockItemModel(DreamlandItems.ROOTED_POROUS_STONE,"block/rooted_porous_stone");
		createBlockItemModel(DreamlandItems.DUSK_ICE,"block/dusk_ice");
		createBlockItemModel(DreamlandItems.TOXIC_ROCK,"block/toxic_rock");
		createBlockItemModel(DreamlandItems.HIVE_JELLY, "block/hive_jelly");
		createBlockItemModel(DreamlandItems.HIVE_MEMBRANE, "block/hive_membrane");
		createBlockItemModel(DreamlandItems.HIVE_IRON, "block/hive_iron");
		createBlockItemModel(DreamlandItems.HIVE_COPPER, "block/hive_copper");
		createBlockItemModel(DreamlandItems.HIVE_GOLD, "block/hive_gold");
		createBlockItemModel(DreamlandItems.HIVE_REDSTONE, "block/hive_redstone");
		createBlockItemModel(DreamlandItems.HIVE_LAPIS, "block/hive_lapis");
		createBlockItemModel(DreamlandItems.HIVE_DIAMOND, "block/hive_diamond");
		createBlockItemModel(DreamlandItems.HIVE_GROWTH, "block/hive_growth");
		createBlockItemModel(DreamlandItems.HIVE_BLOCK_WITH_JELLY, "block/hive_block_with_jelly");
		createBlockItemModel(DreamlandItems.CAVE_SLIME, "block/cave_slime");
		
		singleTexture(DreamlandItems.HIVE_JELLY_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
				"layer0", new ResourceLocation(Dreamland.MODID, "item/jelly"));
	}
	
	private void createBlockItemModel(RegistryObject<Item> item, String Path) {
		
		withExistingParent(item.get().getRegistryName().getPath(), DreamlandLoc.createLoc(Path));
	}

}

