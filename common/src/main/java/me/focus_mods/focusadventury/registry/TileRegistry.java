package me.focus_mods.focusadventury.registry;

import com.mojang.datafixers.types.Type;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.focus_mods.focusadventury.FocusAdventury;
import me.focus_mods.focusadventury.block.entity.EndGateEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(FocusAdventury.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

	public static final RegistrySupplier<BlockEntityType<EndGateEntity>> END_GATE = TILES.register("end_gate_tile",
			() -> BlockEntityType.Builder.of(EndGateEntity::new, BlockRegistry.END_GATE.get()).build(null));
}