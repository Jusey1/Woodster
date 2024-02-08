package net.salju.woodster;

import net.salju.woodster.init.*;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;

@Mod("woodster")
public class WoodsterMod {
	public static final String MODID = "woodster";

	public WoodsterMod() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		WoodsterBlocks.REGISTRY.register(bus);
		WoodsterItems.REGISTRY.register(bus);
		WoodsterTabs.REGISTRY.register(bus);
		WoodsterBlockEntities.REGISTRY.register(bus);
	}
}