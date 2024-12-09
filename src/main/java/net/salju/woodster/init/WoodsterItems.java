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

	public static void setupBlockItems() {
		for (DeferredHolder<Block, ? extends Block> block : WoodsterBlocks.REGISTRY.getEntries()) {
			REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), createBaseProps(block.getId().getPath())));
		}
	}

	public static Item.Properties createBaseProps(String name) {
		return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Woodster.MODID, name)));
	}
}