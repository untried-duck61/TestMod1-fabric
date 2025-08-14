package ru.untriedduck61.mods.firsttestmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import ru.untriedduck61.mods.firsttestmod.FirstTestMod;
import ru.untriedduck61.mods.firsttestmod.itemgroups.ModItemGroups;

import static ru.untriedduck61.mods.firsttestmod.FirstTestMod.MOD_ID;

public class ModItems {
    /*****************************************
     * Mod items
     ****************************************/

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));

    /*****************************************
     * Mod items factory
     ****************************************/

    public static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), item);
    }

    /*****************************************
     * Register items method
     ****************************************/

    public static void register() {
        FirstTestMod.LOGGER.info("Registering Mod Items for " + MOD_ID);

    }
}
