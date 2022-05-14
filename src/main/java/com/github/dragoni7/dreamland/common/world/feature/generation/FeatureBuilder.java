package com.github.dragoni7.dreamland.common.world.feature.generation;

import java.util.ArrayList;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;

public class FeatureBuilder {
	
	private ArrayList<FeatureBuilderInput> inputs = new ArrayList<>();

	public boolean addInput(WorldGenLevel level, BlockState state, BlockPos pos) {
		
		FeatureBuilderInput input = new FeatureBuilderInput(state, pos);
		
		if (input.canPlace(level)) {
			inputs.add(input);
			return true;
		}
		
		return false;
	}

	public void build(WorldGenLevel level) {
		if (!inputs.isEmpty()) {
			for (FeatureBuilderInput input : inputs) {
				level.setBlock(input.pos, input.state, 3);
			}
		}
	}
}