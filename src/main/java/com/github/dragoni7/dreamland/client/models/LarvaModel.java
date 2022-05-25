package com.github.dragoni7.dreamland.client.models;

import com.github.dragoni7.dreamland.common.entities.mobs.LarvaEntity;
import com.github.dragoni7.dreamland.util.DreamlandLoc;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class LarvaModel extends AnimatedGeoModel<LarvaEntity>{

	@Override
	public ResourceLocation getAnimationFileLocation(LarvaEntity animatable) {
		return DreamlandLoc.createLoc("animations/larva.anim.json");
	}

	@Override
	public ResourceLocation getModelLocation(LarvaEntity object) {
		return DreamlandLoc.createLoc("geo/larva.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LarvaEntity object) {
		return DreamlandLoc.createLoc("textures/entity/larva.png");
	}
}
