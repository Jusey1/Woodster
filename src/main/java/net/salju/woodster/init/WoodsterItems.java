package net.salju.woodster.init;

import net.salju.woodster.Woodster;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class WoodsterItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, Woodster.MODID);

	public static final DeferredHolder<Item, Item> SPRUCE_CHISELED_BOOKSHELF = block(WoodsterBlocks.SPRUCE_CHISELED_BOOKSHELF, "spruce_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> BIRCH_CHISELED_BOOKSHELF = block(WoodsterBlocks.BIRCH_CHISELED_BOOKSHELF, "birch_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> JUNGLE_CHISELED_BOOKSHELF = block(WoodsterBlocks.JUNGLE_CHISELED_BOOKSHELF, "jungle_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> ACACIA_CHISELED_BOOKSHELF = block(WoodsterBlocks.ACACIA_CHISELED_BOOKSHELF, "acacia_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> DARK_OAK_CHISELED_BOOKSHELF = block(WoodsterBlocks.DARK_OAK_CHISELED_BOOKSHELF, "dark_oak_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> MANGROVE_CHISELED_BOOKSHELF = block(WoodsterBlocks.MANGROVE_CHISELED_BOOKSHELF, "mangrove_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> CHERRY_CHISELED_BOOKSHELF = block(WoodsterBlocks.CHERRY_CHISELED_BOOKSHELF, "cherry_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> BAMBOO_CHISELED_BOOKSHELF = block(WoodsterBlocks.BAMBOO_CHISELED_BOOKSHELF, "bamboo_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> CRIMSON_CHISELED_BOOKSHELF = block(WoodsterBlocks.CRIMSON_CHISELED_BOOKSHELF, "crimson_chiseled_bookshelf");
	public static final DeferredHolder<Item, Item> WARPED_CHISELED_BOOKSHELF = block(WoodsterBlocks.WARPED_CHISELED_BOOKSHELF, "warped_chiseled_bookshelf");

	public static final DeferredHolder<Item, Item> SPRUCE_BOOKSHELF = block(WoodsterBlocks.SPRUCE_BOOKSHELF, "spruce_bookshelf");
	public static final DeferredHolder<Item, Item> BIRCH_BOOKSHELF = block(WoodsterBlocks.BIRCH_BOOKSHELF, "birch_bookshelf");
	public static final DeferredHolder<Item, Item> JUNGLE_BOOKSHELF = block(WoodsterBlocks.JUNGLE_BOOKSHELF, "jungle_bookshelf");
	public static final DeferredHolder<Item, Item> ACACIA_BOOKSHELF = block(WoodsterBlocks.ACACIA_BOOKSHELF, "acacia_bookshelf");
	public static final DeferredHolder<Item, Item> DARK_OAK_BOOKSHELF = block(WoodsterBlocks.DARK_OAK_BOOKSHELF, "dark_oak_bookshelf");
	public static final DeferredHolder<Item, Item> MANGROVE_BOOKSHELF = block(WoodsterBlocks.MANGROVE_BOOKSHELF, "mangrove_bookshelf");
	public static final DeferredHolder<Item, Item> CHERRY_BOOKSHELF = block(WoodsterBlocks.CHERRY_BOOKSHELF, "cherry_bookshelf");
	public static final DeferredHolder<Item, Item> BAMBOO_BOOKSHELF = block(WoodsterBlocks.BAMBOO_BOOKSHELF, "bamboo_bookshelf");
	public static final DeferredHolder<Item, Item> CRIMSON_BOOKSHELF = block(WoodsterBlocks.CRIMSON_BOOKSHELF, "crimson_bookshelf");
	public static final DeferredHolder<Item, Item> WARPED_BOOKSHELF = block(WoodsterBlocks.WARPED_BOOKSHELF, "warped_bookshelf");

	public static final DeferredHolder<Item, Item> SPRUCE_LADDER = block(WoodsterBlocks.SPRUCE_LADDER, "spruce_ladder");
	public static final DeferredHolder<Item, Item> BIRCH_LADDER = block(WoodsterBlocks.BIRCH_LADDER, "birch_ladder");
	public static final DeferredHolder<Item, Item> JUNGLE_LADDER = block(WoodsterBlocks.JUNGLE_LADDER, "jungle_ladder");
	public static final DeferredHolder<Item, Item> ACACIA_LADDER = block(WoodsterBlocks.ACACIA_LADDER, "acacia_ladder");
	public static final DeferredHolder<Item, Item> DARK_OAK_LADDER = block(WoodsterBlocks.DARK_OAK_LADDER, "dark_oak_ladder");
	public static final DeferredHolder<Item, Item> MANGROVE_LADDER = block(WoodsterBlocks.MANGROVE_LADDER, "mangrove_ladder");
	public static final DeferredHolder<Item, Item> CHERRY_LADDER = block(WoodsterBlocks.CHERRY_LADDER, "cherry_ladder");
	public static final DeferredHolder<Item, Item> BAMBOO_LADDER = block(WoodsterBlocks.BAMBOO_LADDER, "bamboo_ladder");
	public static final DeferredHolder<Item, Item> CRIMSON_LADDER = block(WoodsterBlocks.CRIMSON_LADDER, "crimson_ladder");
	public static final DeferredHolder<Item, Item> WARPED_LADDER = block(WoodsterBlocks.WARPED_LADDER, "warped_ladder");

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block, String name) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), createBaseProps(name)));
	}

	public static Item.Properties createBaseProps(String name) {
		return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Woodster.MODID, name)));
	}
}