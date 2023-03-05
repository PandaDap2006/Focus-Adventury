package me.focus_mods.focusadventury.client.renderer.block;

import com.mojang.blaze3d.vertex.PoseStack;
import me.focus_mods.focusadventury.block.entity.EndGateEntity;
import me.focus_mods.focusadventury.client.model.block.EndGateModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.level.block.entity.BlockEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class EndGateRenderer extends GeoBlockRenderer<EndGateEntity> {
	public EndGateRenderer() {
		super(new EndGateModel());
	}
}
