package me.focus_mods.focusadventury.forge;

import dev.architectury.platform.forge.EventBuses;
import me.focus_mods.focusadventury.FocusAdventury;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FocusAdventury.MOD_ID)
public class FocusAdventuryForge {
	public FocusAdventuryForge() {
		// Submit our event bus to let architectury register our content on the right time
		EventBuses.registerModEventBus(FocusAdventury.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
		FocusAdventury.init();
	}
}