package me.focus_mods.focusadventury;

import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import me.focus_mods.focusadventury.client.renderer.block.EndGateRenderer;
import me.focus_mods.focusadventury.registry.BlockRegistry;
import me.focus_mods.focusadventury.registry.TileRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import software.bernie.geckolib.GeckoLib;

public class FocusAdventury {
	public static final String MOD_ID = "focusadventury";

	public static void init() {
		GeckoLib.initialize();

		TileRegistry.TILES.register();
		BlockRegistry.BLOCKS.register();

		registerRenderers();
	}

	public static void registerRenderers() {
		BlockEntityRendererRegistry.register(TileRegistry.END_GATE.get(), context -> new EndGateRenderer());
	}
}