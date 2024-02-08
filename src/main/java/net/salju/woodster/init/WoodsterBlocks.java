package net.salju.woodster.init;

import net.salju.woodster.block.BookshelfBlock;
import net.salju.woodster.WoodsterMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.ChiseledBookShelfBlock;
import net.minecraft.world.level.block.Block;

public class WoodsterBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WoodsterMod.MODID);
	public static final BlockBehaviour.Properties CHISELED_BOOKSHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.CHISELED_BOOKSHELF);
	public static final BlockBehaviour.Properties BOOKSHELF = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.WOOD);
	public static final BlockBehaviour.Properties LADDER = BlockBehaviour.Properties.of().mapColor(MapColor.NONE).strength(0.4F).sound(SoundType.LADDER).noOcclusion();
	
	public static final RegistryObject<Block> SPRUCE_CHISELED_BOOKSHELF = REGISTRY.register("spruce_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> BIRCH_CHISELED_BOOKSHELF = REGISTRY.register("birch_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> JUNGLE_CHISELED_BOOKSHELF = REGISTRY.register("jungle_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> ACACIA_CHISELED_BOOKSHELF = REGISTRY.register("acacia_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> DARK_OAK_CHISELED_BOOKSHELF = REGISTRY.register("dark_oak_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> MANGROVE_CHISELED_BOOKSHELF = REGISTRY.register("mangrove_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> CHERRY_CHISELED_BOOKSHELF = REGISTRY.register("cherry_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> BAMBOO_CHISELED_BOOKSHELF = REGISTRY.register("bamboo_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> CRIMSON_CHISELED_BOOKSHELF = REGISTRY.register("crimson_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));
	public static final RegistryObject<Block> WARPED_CHISELED_BOOKSHELF = REGISTRY.register("warped_chiseled_bookshelf", () -> new ChiseledBookShelfBlock(WoodsterBlocks.CHISELED_BOOKSHELF));

	public static final RegistryObject<Block> SPRUCE_BOOKSHELF = REGISTRY.register("spruce_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> BIRCH_BOOKSHELF = REGISTRY.register("birch_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> JUNGLE_BOOKSHELF = REGISTRY.register("jungle_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> ACACIA_BOOKSHELF = REGISTRY.register("acacia_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = REGISTRY.register("dark_oak_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> MANGROVE_BOOKSHELF = REGISTRY.register("mangrove_bookshelf", () -> new BookshelfBlock(WoodsterBlocks.BOOKSHELF));
	public static final RegistryObject<Block> CHERRY_BOOKSHELF = REGISTRY.register("cherry_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.CHERRY_WOOD)));
	public static final RegistryObject<Block> BAMBOO_BOOKSHELF = REGISTRY.register("bamboo_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.BAMBOO_WOOD)));
	public static final RegistryObject<Block> CRIMSON_BOOKSHELF = REGISTRY.register("crimson_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.NETHER_WOOD)));
	public static final RegistryObject<Block> WARPED_BOOKSHELF = REGISTRY.register("warped_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.NETHER_WOOD)));

	public static final RegistryObject<Block> SPRUCE_LADDER = REGISTRY.register("spruce_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> BIRCH_LADDER = REGISTRY.register("birch_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> JUNGLE_LADDER = REGISTRY.register("jungle_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> ACACIA_LADDER = REGISTRY.register("acacia_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> DARK_OAK_LADDER = REGISTRY.register("dark_oak_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> MANGROVE_LADDER = REGISTRY.register("mangrove_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> CHERRY_LADDER = REGISTRY.register("cherry_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> BAMBOO_LADDER = REGISTRY.register("bamboo_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> CRIMSON_LADDER = REGISTRY.register("crimson_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
	public static final RegistryObject<Block> WARPED_LADDER = REGISTRY.register("warped_ladder", () -> new LadderBlock(WoodsterBlocks.LADDER));
}