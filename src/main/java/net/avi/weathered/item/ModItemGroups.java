package net.avi.weathered.item;

import net.avi.weathered.Weathered;
import net.avi.weathered.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup WEATHERED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Weathered.MOD_ID,"weathered_group"),
            FabricItemGroup.builder()
                    .icon(()-> new ItemStack(ModItems.TOME))
                    .displayName(Text.translatable("itemgroup.weathered.weathered_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CLEAVER);
                        entries.add(ModItems.TOME);

                        entries.add(ModBlocks.LIMESTONE);
                        entries.add(ModBlocks.LIMESTONE_STAIRS);
                        entries.add(ModBlocks.LIMESTONE_SLAB);
                        entries.add(ModBlocks.LIMESTONE_WALL);
                    }).build()
            );

    public static void registerItemGroups() {
        Weathered.LOGGER.info("Registering Item Groups for " + Weathered.MOD_ID);
    }
}
