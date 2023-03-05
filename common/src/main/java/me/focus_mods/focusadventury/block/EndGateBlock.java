package me.focus_mods.focusadventury.block;

import me.focus_mods.focusadventury.registry.TileRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

public class EndGateBlock extends BaseEntityBlock implements EntityBlock {
	public EndGateBlock() {
		super(Properties.of(Material.STONE));
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return TileRegistry.END_GATE.get().create(blockPos, blockState);
	}
}
