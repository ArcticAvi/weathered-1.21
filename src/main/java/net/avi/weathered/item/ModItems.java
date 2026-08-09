package net.avi.weathered.item;

import net.avi.weathered.Weathered;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOME = registerItem("tome", new Item(new Item.Settings()));
    public static final Item CLEAVER = registerItem("cleaver", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Weathered.MOD_ID, name), item);
    }

    public static void registerModItems () {
        Weathered.LOGGER.info("Registering Mod Items for " + Weathered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(TOME);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            //entries.add(CLEAVER);
        });
    }
}
