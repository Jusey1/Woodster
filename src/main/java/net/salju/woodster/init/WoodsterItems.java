package net.salju.woodster.init;

import net.salju.woodster.WoodsterMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class WoodsterItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WoodsterMod.MODID);

	public static final RegistryObject<Item> SPRUCE_CHISELED_BOOKSHELF = block(WoodsterBlocks.SPRUCE_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> BIRCH_CHISELED_BOOKSHELF = block(WoodsterBlocks.BIRCH_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> JUNGLE_CHISELED_BOOKSHELF = block(WoodsterBlocks.JUNGLE_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> ACACIA_CHISELED_BOOKSHELF = block(WoodsterBlocks.ACACIA_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> DARK_OAK_CHISELED_BOOKSHELF = block(WoodsterBlocks.DARK_OAK_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> MANGROVE_CHISELED_BOOKSHELF = block(WoodsterBlocks.MANGROVE_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> CHERRY_CHISELED_BOOKSHELF = block(WoodsterBlocks.CHERRY_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> BAMBOO_CHISELED_BOOKSHELF = block(WoodsterBlocks.BAMBOO_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> CRIMSON_CHISELED_BOOKSHELF = block(WoodsterBlocks.CRIMSON_CHISELED_BOOKSHELF);
	public static final RegistryObject<Item> WARPED_CHISELED_BOOKSHELF = block(WoodsterBlocks.WARPED_CHISELED_BOOKSHELF);

	public static final RegistryObject<Item> SPRUCE_BOOKSHELF = block(WoodsterBlocks.SPRUCE_BOOKSHELF);
	public static final RegistryObject<Item> BIRCH_BOOKSHELF = block(WoodsterBlocks.BIRCH_BOOKSHELF);
	public static final RegistryObject<Item> JUNGLE_BOOKSHELF = block(WoodsterBlocks.JUNGLE_BOOKSHELF);
	public static final RegistryObject<Item> ACACIA_BOOKSHELF = block(WoodsterBlocks.ACACIA_BOOKSHELF);
	public static final RegistryObject<Item> DARK_OAK_BOOKSHELF = block(WoodsterBlocks.DARK_OAK_BOOKSHELF);
	public static final RegistryObject<Item> MANGROVE_BOOKSHELF = block(WoodsterBlocks.MANGROVE_BOOKSHELF);
	public static final RegistryObject<Item> CHERRY_BOOKSHELF = block(WoodsterBlocks.CHERRY_BOOKSHELF);
	public static final RegistryObject<Item> BAMBOO_BOOKSHELF = block(WoodsterBlocks.BAMBOO_BOOKSHELF);
	public static final RegistryObject<Item> CRIMSON_BOOKSHELF = block(WoodsterBlocks.CRIMSON_BOOKSHELF);
	public static final RegistryObject<Item> WARPED_BOOKSHELF = block(WoodsterBlocks.WARPED_BOOKSHELF);

	public static final RegistryObject<Item> SPRUCE_LADDER = block(WoodsterBlocks.SPRUCE_LADDER);
	public static final RegistryObject<Item> BIRCH_LADDER = block(WoodsterBlocks.BIRCH_LADDER);
	public static final RegistryObject<Item> JUNGLE_LADDER = block(WoodsterBlocks.JUNGLE_LADDER);
	public static final RegistryObject<Item> ACACIA_LADDER = block(WoodsterBlocks.ACACIA_LADDER);
	public static final RegistryObject<Item> DARK_OAK_LADDER = block(WoodsterBlocks.DARK_OAK_LADDER);
	public static final RegistryObject<Item> MANGROVE_LADDER = block(WoodsterBlocks.MANGROVE_LADDER);
	public static final RegistryObject<Item> CHERRY_LADDER = block(WoodsterBlocks.CHERRY_LADDER);
	public static final RegistryObject<Item> BAMBOO_LADDER = block(WoodsterBlocks.BAMBOO_LADDER);
	public static final RegistryObject<Item> CRIMSON_LADDER = block(WoodsterBlocks.CRIMSON_LADDER);
	public static final RegistryObject<Item> WARPED_LADDER = block(WoodsterBlocks.WARPED_LADDER);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}