package net.salju.woodster.init;

import net.salju.woodster.WoodsterMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import net.minecraft.world.level.block.Block;

public class WoodsterBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WoodsterMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHISELED_BOOKSHELF = REGISTRY.register("chiseled_bookshelf", () -> BlockEntityType.Builder.of(ChiseledBookShelfBlockEntity::new, (Block[]) findBlocks(ChiseledBookShelfBlock.class)).build(null));

	public static Block[] findBlocks(Class<?> targets) {
		return ForgeRegistries.BLOCKS.getValues().stream().filter(targets::isInstance).toArray(Block[]::new);
	}
}