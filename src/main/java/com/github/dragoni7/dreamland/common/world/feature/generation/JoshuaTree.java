package com.github.dragoni7.dreamland.common.world.feature.generation;

import java.util.Random;

import com.github.dragoni7.dreamland.common.blocks.DreamlandSapling;
import com.github.dragoni7.dreamland.core.DreamlandBlocks;
import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class JoshuaTree extends Feature<NoneFeatureConfiguration> {
	
	private static final int maxTrunkHeight = 6;
	private static final int minTrunkHeight = 2;
	private static final BlockState log = Blocks.ACACIA_LOG.defaultBlockState();
	private static final BlockState leaves = Blocks.AZALEA_LEAVES.defaultBlockState().setValue(LeavesBlock.DISTANCE, 1);

	public JoshuaTree(Codec<NoneFeatureConfiguration> codec) {
		super(codec);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		WorldGenLevel worldgenlevel = context.level();
		BlockPos blockpos = context.origin();
		Random random = context.random();
		FeatureBuilder joshuaTreeBuilder = new FeatureBuilder();
		
		int trunkBaseHeight = minTrunkHeight + random.nextInt(2);
		boolean xzChange = random.nextBoolean();
		
		if (worldgenlevel.isEmptyBlock(blockpos.below()) || !DreamlandBlocks.JOSHUA_SAPLING.get().defaultBlockState().canSurvive(worldgenlevel, blockpos)) {
			return false;
		}
		
		if(!createTrunk(worldgenlevel, xzChange, trunkBaseHeight, joshuaTreeBuilder, blockpos)) {
			return false;
		}
		
		if (!createBranches(worldgenlevel, xzChange, random, trunkBaseHeight, blockpos, joshuaTreeBuilder)) {
			return false;
		}
		
		if(!createLeaves(worldgenlevel, blockpos.above(maxTrunkHeight+2), joshuaTreeBuilder)) {
			return false;
		}
		
		joshuaTreeBuilder.build(worldgenlevel);
		return true;
	}
	
	private static boolean createTrunk(WorldGenLevel worldgenlevel, Boolean xzChange, int baseHeight, FeatureBuilder builder, BlockPos blockpos) {
		
		for (int i = 0; i <= maxTrunkHeight; i++) {
		
		BlockPos trunkPos = blockpos.above(i);
		BlockPos trunkOffset = trunkPos.east(1);
		
		if (xzChange) {
			trunkOffset = trunkPos.south(1);
		}
		
		if (!builder.addInput(worldgenlevel, log, trunkPos)) {
			return false;
		}
		
		if (i >= baseHeight) {
			if (!builder.addInput(worldgenlevel, log, trunkOffset)) {
				return false;
			}
		}
	}
		if (!builder.addInput(worldgenlevel, log, blockpos.above(maxTrunkHeight+1))) {
			return false;
		}
		return true;
	}
	
	private static boolean createBranches(WorldGenLevel level, Boolean xzChange, Random random, int baseHeight, BlockPos pos, FeatureBuilder builder) {
		int northBranchHeight = baseHeight+random.nextInt(1, 3);
		int westBranchHeight = baseHeight+random.nextInt(2, 3);
		int eastBranchHeight = baseHeight+random.nextInt(1, 2);
		boolean canBuild = true;
		int zChange = 0;
		int xChange = 1;
		
		if (xzChange) {
			zChange = 1;
			xChange = 0;
		}
		
		for (int i = 1; i <= 2; i++) {
			canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.NORTH.getAxis()), pos.offset(0, baseHeight, i+zChange));
			canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.EAST.getAxis()), pos.offset(i+xChange, northBranchHeight, 0));
		}
		
		canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.UP.getAxis()), pos.offset(0, baseHeight+1, 3+zChange));
		canBuild = createLeaves(level, pos.offset(0, baseHeight+2, 3+zChange), builder);
		canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.UP.getAxis()), pos.offset(3+xChange, northBranchHeight+1, 0));
		canBuild = createLeaves(level, pos.offset(3+xChange, northBranchHeight+2, 0), builder);
		
		for (int i = 1; i <= 2; i++) {
			canBuild = builder.addInput(level,log.setValue(RotatedPillarBlock.AXIS, Direction.SOUTH.getAxis()), pos.offset(xChange, eastBranchHeight, -i));
			canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.WEST.getAxis()), pos.offset(-i, westBranchHeight, zChange));
		}
		
		canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.UP.getAxis()), pos.offset(xChange, eastBranchHeight+1, -3));
		canBuild = createLeaves(level, pos.offset(xChange, eastBranchHeight+2, -3), builder);
		canBuild = builder.addInput(level, log.setValue(RotatedPillarBlock.AXIS, Direction.UP.getAxis()), pos.offset(-3, westBranchHeight+1, zChange));
		canBuild = createLeaves(level, pos.offset(-3, westBranchHeight+2, zChange), builder);
		
		return canBuild;
	}
	
	private static boolean createLeaves(WorldGenLevel level, BlockPos pos, FeatureBuilder builder) {
		boolean canBuild = true;
		canBuild = builder.addInput(level, leaves, pos);
		canBuild = builder.addInput(level, leaves, pos.east(1).north(1));
		canBuild = builder.addInput(level, leaves, pos.west(1).north(1));
		canBuild = builder.addInput(level, leaves, pos.east(1).south(1));
		canBuild = builder.addInput(level, leaves, pos.west(1).south(1));
		return canBuild;
	}
	

}
