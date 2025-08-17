package ru.untriedduck61.mods.firsttestmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.untriedduck61.mods.firsttestmod.block.ModBlocks;
import ru.untriedduck61.mods.firsttestmod.itemgroups.ModItemGroups;
import ru.untriedduck61.mods.firsttestmod.items.ModItems;

public class FirstTestMod implements ModInitializer {
	public static final String MOD_ID = "firsttestmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod initialization started");
        ModItemGroups.register();
        ModItems.register();
        ModBlocks.register();
        LOGGER.info("Mod initialization finished");
	}
}