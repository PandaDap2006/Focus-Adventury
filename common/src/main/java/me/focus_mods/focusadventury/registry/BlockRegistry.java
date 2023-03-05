package me.focus_mods.focusadventury.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.focus_mods.focusadventury.FocusAdventury;
import me.focus_mods.focusadventury.block.EndGateBlock;
import me.focus_mods.focusadventury.block.entity.EndGateEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BlockRegistry {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(FocusAdventury.MOD_ID, Registries.BLOCK);

	public static final RegistrySupplier<EndGateBlock> END_GATE = BLOCKS.register("end_gate", EndGateBlock::new);
}
