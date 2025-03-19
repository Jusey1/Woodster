package net.salju.woodster.init;

import net.salju.woodster.Woodster;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WoodsterBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, Woodster.MODID);

	public static final DeferredHolder<Block, Block> SPRUCE_CHISELED_BOOKSHELF = REGISTRY.register("spruce_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("spruce_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> BIRCH_CHISELED_BOOKSHELF = REGISTRY.register("birch_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("birch_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> JUNGLE_CHISELED_BOOKSHELF = REGISTRY.register("jungle_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("jungle_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> ACACIA_CHISELED_BOOKSHELF = REGISTRY.register("acacia_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("acacia_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> DARK_OAK_CHISELED_BOOKSHELF = REGISTRY.register("dark_oak_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("dark_oak_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> MANGROVE_CHISELED_BOOKSHELF = REGISTRY.register("mangrove_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("mangrove_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> CHERRY_CHISELED_BOOKSHELF = REGISTRY.register("cherry_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("cherry_chiseled_bookshelf", SoundType.CHERRY_WOOD)));
	public static final DeferredHolder<Block, Block> BAMBOO_CHISELED_BOOKSHELF = REGISTRY.register("bamboo_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("bamboo_chiseled_bookshelf", SoundType.BAMBOO_WOOD)));
	public static final DeferredHolder<Block, Block> PALE_OAK_CHISELED_BOOKSHELF = REGISTRY.register("pale_oak_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("pale_oak_chiseled_bookshelf", SoundType.CHISELED_BOOKSHELF)));
	public static final DeferredHolder<Block, Block> CRIMSON_CHISELED_BOOKSHELF = REGISTRY.register("crimson_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("crimson_chiseled_bookshelf", SoundType.NETHER_WOOD)));
	public static final DeferredHolder<Block, Block> WARPED_CHISELED_BOOKSHELF = REGISTRY.register("warped_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(createBook("warped_chiseled_bookshelf", SoundType.NETHER_WOOD)));

	public static final DeferredHolder<Block, Block> SPRUCE_BOOKSHELF = REGISTRY.register("spruce_bookshelf", () -> new Block(createBook("spruce_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> BIRCH_BOOKSHELF = REGISTRY.register("birch_bookshelf", () -> new Block(createBook("birch_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> JUNGLE_BOOKSHELF = REGISTRY.register("jungle_bookshelf", () -> new Block(createBook("jungle_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> ACACIA_BOOKSHELF = REGISTRY.register("acacia_bookshelf", () -> new Block(createBook("acacia_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> DARK_OAK_BOOKSHELF = REGISTRY.register("dark_oak_bookshelf", () -> new Block(createBook("dark_oak_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> MANGROVE_BOOKSHELF = REGISTRY.register("mangrove_bookshelf", () -> new Block(createBook("mangrove_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> CHERRY_BOOKSHELF = REGISTRY.register("cherry_bookshelf", () -> new Block(createBook("cherry_bookshelf", SoundType.CHERRY_WOOD)));
	public static final DeferredHolder<Block, Block> BAMBOO_BOOKSHELF = REGISTRY.register("bamboo_bookshelf", () -> new Block(createBook("bamboo_bookshelf", SoundType.BAMBOO_WOOD)));
	public static final DeferredHolder<Block, Block> PALE_OAK_BOOKSHELF = REGISTRY.register("pale_oak_bookshelf", () -> new Block(createBook("pale_oak_bookshelf", SoundType.WOOD)));
	public static final DeferredHolder<Block, Block> CRIMSON_BOOKSHELF = REGISTRY.register("crimson_bookshelf", () -> new Block(createBook("crimson_bookshelf", SoundType.NETHER_WOOD)));
	public static final DeferredHolder<Block, Block> WARPED_BOOKSHELF = REGISTRY.register("warped_bookshelf", () -> new Block(createBook("warped_bookshelf", SoundType.NETHER_WOOD)));

	public static final DeferredHolder<Block, Block> SPRUCE_LADDER = REGISTRY.register("spruce_ladder", () -> new LadderBlock(createLadder("spruce_ladder")));
	public static final DeferredHolder<Block, Block> BIRCH_LADDER = REGISTRY.register("birch_ladder", () -> new LadderBlock(createLadder("birch_ladder")));
	public static final DeferredHolder<Block, Block> JUNGLE_LADDER = REGISTRY.register("jungle_ladder", () -> new LadderBlock(createLadder("jungle_ladder")));
	public static final DeferredHolder<Block, Block> ACACIA_LADDER = REGISTRY.register("acacia_ladder", () -> new LadderBlock(createLadder("acacia_ladder")));
	public static final DeferredHolder<Block, Block> DARK_OAK_LADDER = REGISTRY.register("dark_oak_ladder", () -> new LadderBlock(createLadder("dark_oak_ladder")));
	public static final DeferredHolder<Block, Block> MANGROVE_LADDER = REGISTRY.register("mangrove_ladder", () -> new LadderBlock(createLadder("mangrove_ladder")));
	public static final DeferredHolder<Block, Block> CHERRY_LADDER = REGISTRY.register("cherry_ladder", () -> new LadderBlock(createLadder("cherry_ladder")));
	public static final DeferredHolder<Block, Block> BAMBOO_LADDER = REGISTRY.register("bamboo_ladder", () -> new LadderBlock(createLadder("bamboo_ladder")));
	public static final DeferredHolder<Block, Block> PALE_OAK_LADDER = REGISTRY.register("pale_oak_ladder", () -> new LadderBlock(createLadder("pale_oak_ladder")));
	public static final DeferredHolder<Block, Block> CRIMSON_LADDER = REGISTRY.register("crimson_ladder", () -> new LadderBlock(createLadder("crimson_ladder")));
	public static final DeferredHolder<Block, Block> WARPED_LADDER = REGISTRY.register("warped_ladder", () -> new LadderBlock(createLadder("warped_ladder")));


	public static BlockBehaviour.Properties createBook(String name, SoundType type) {
		return createBaseProps(name).mapColor(MapColor.WOOD).strength(1.5F).sound(type);
	}

	public static BlockBehaviour.Properties createLadder(String name) {
		return createBaseProps(name).mapColor(MapColor.NONE).strength(0.4F).sound(SoundType.LADDER).noOcclusion();
	}

	public static BlockBehaviour.Properties createBaseProps(String name) {
		return BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Woodster.MODID, name)));
	}

	@SubscribeEvent
	public static void onBlockEntityValidBlocks(BlockEntityTypeAddBlocksEvent event) {
		for (DeferredHolder<Block, ? extends Block> block : WoodsterBlocks.REGISTRY.getEntries()) {
			if (block.get() instanceof ChiseledBookShelfBlock) {
				event.modify(BlockEntityType.CHISELED_BOOKSHELF, block.get());
			}
		}
	}
}