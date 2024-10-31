package net.salju.woodster.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.core.BlockPos;

public class BookshelfBlock extends Block {
	public BookshelfBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 1f;
	}
}