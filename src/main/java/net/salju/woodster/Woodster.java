package net.salju.woodster;

import net.salju.woodster.init.*;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;

@Mod("woodster")
public class Woodster {
	public static final String MODID = "woodster";

	public Woodster(IEventBus bus) {
		WoodsterBlocks.REGISTRY.register(bus);
		WoodsterItems.REGISTRY.register(bus);
		WoodsterTabs.REGISTRY.register(bus);
		WoodsterItems.setupBlockItems();
	}
}