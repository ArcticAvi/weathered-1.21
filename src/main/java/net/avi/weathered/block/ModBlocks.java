package net.avi.weathered.block;

import net.avi.weathered.Weathered;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
    ));

    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new StairsBlock(ModBlocks.LIMESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(0.75f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)
    ));

    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .strength(0.75f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)
    ));

    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .strength(0.75f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)
    ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Weathered.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Weathered.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Weathered.LOGGER.info("Registering Mod Blocks for " + Weathered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            //entries.add(ModBlocks.LIMESTONE);
        });
    }
}
