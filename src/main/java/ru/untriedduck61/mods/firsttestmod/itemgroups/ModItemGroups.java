package ru.untriedduck61.mods.firsttestmod.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ru.untriedduck61.mods.firsttestmod.FirstTestMod;
import ru.untriedduck61.mods.firsttestmod.items.ModItems;

import static ru.untriedduck61.mods.firsttestmod.FirstTestMod.MOD_ID;

public class ModItemGroups {
    /*****************************************
     * Mod item groups
     ****************************************/

    public static final ItemGroup MAIN_PAGE = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "main_page"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.firsttestmod_main_page"))
                    .icon(() -> new ItemStack(ModItems.TEST_ITEM))
                    .entries((displayContext, entries) ->
                            entries.add(ModItems.TEST_ITEM))
                    .build()
    );

    /*****************************************
     * Register item groups method
     ****************************************/

    public static void register(){
        FirstTestMod.LOGGER.info("Registering Mod Item Groups for " + MOD_ID);
    }
}
