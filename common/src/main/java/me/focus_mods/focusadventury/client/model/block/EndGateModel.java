package me.focus_mods.focusadventury.client.model.block;

import me.focus_mods.focusadventury.FocusAdventury;
import me.focus_mods.focusadventury.block.entity.EndGateEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.model.GeoModel;

public class EndGateModel extends GeoModel<EndGateEntity> {
	@Override
	public ResourceLocation getModelResource(EndGateEntity animatable) {
		return new ResourceLocation(FocusAdventury.MOD_ID, "model/entity/block/end_gate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndGateEntity animatable) {
		return new ResourceLocation(FocusAdventury.MOD_ID, "textures/entity/block/end_gate.png");
	}

	@Override
	public ResourceLocation getAnimationResource(EndGateEntity animatable) {
		return null;
	}
}
