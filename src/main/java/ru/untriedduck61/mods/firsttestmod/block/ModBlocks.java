package ru.untriedduck61.mods.firsttestmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.untriedduck61.mods.firsttestmod.FirstTestMod;

import static ru.untriedduck61.mods.firsttestmod.FirstTestMod.MOD_ID;

public class ModBlocks {
    /*****************************************
     * Mod items
     ****************************************/

    public static final Block TEST_BLOCK = registerBlock("test_block", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).strength(1.0F, 4.0F).instrument(Instrument.BASEDRUM)));

    /*****************************************
     * Mod blocks factory
     ****************************************/

    public static Block registerBlock(String id, Block block){
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, id), block);
    }

    public static Item registerBlockItem(String id, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), new BlockItem(block, new FabricItemSettings()));
    }

    /*****************************************
     * Register blocks method
     ****************************************/

    public static void register() {
        FirstTestMod.LOGGER.info("Registering Mod Blocks for " + MOD_ID);

    }
}
