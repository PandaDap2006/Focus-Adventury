package me.focus_mods.focusadventury.fabric;

import me.focus_mods.focusadventury.FocusAdventury;
import net.fabricmc.api.ModInitializer;

public class FocusAdventuryFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		FocusAdventury.init();
	}
}