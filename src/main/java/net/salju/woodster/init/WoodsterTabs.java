package net.salju.woodster.init;

import net.salju.woodster.Woodster;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;

public class WoodsterTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Woodster.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WOODSTER = REGISTRY.register("woodster",
			() -> CreativeModeTab.builder().title(Component.translatable("itemGroup.woodster")).icon(() -> new ItemStack(Blocks.CHISELED_BOOKSHELF.asItem())).displayItems((parameters, tabData) -> {
				tabData.accept(Blocks.CHISELED_BOOKSHELF.asItem());
				tabData.accept(WoodsterBlocks.SPRUCE_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.BIRCH_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.JUNGLE_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.ACACIA_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.DARK_OAK_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.MANGROVE_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.CHERRY_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.BAMBOO_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.PALE_OAK_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.CRIMSON_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.WARPED_CHISELED_BOOKSHELF.get().asItem());
				tabData.accept(Blocks.BOOKSHELF.asItem());
				tabData.accept(WoodsterBlocks.SPRUCE_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.BIRCH_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.JUNGLE_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.ACACIA_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.DARK_OAK_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.MANGROVE_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.CHERRY_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.BAMBOO_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.PALE_OAK_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.CRIMSON_BOOKSHELF.get().asItem());
				tabData.accept(WoodsterBlocks.WARPED_BOOKSHELF.get().asItem());
				tabData.accept(Blocks.LADDER.asItem());
				tabData.accept(WoodsterBlocks.SPRUCE_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.BIRCH_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.JUNGLE_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.ACACIA_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.DARK_OAK_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.MANGROVE_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.CHERRY_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.BAMBOO_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.PALE_OAK_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.CRIMSON_LADDER.get().asItem());
				tabData.accept(WoodsterBlocks.WARPED_LADDER.get().asItem());
			}).build());
}