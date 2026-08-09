package net.avi.weathered.datagen;

import net.avi.weathered.block.ModBlocks;
import net.avi.weathered.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool limestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE); // generates the blockstates model, block model, and item model

        limestonePool.stairs(ModBlocks.LIMESTONE_STAIRS);
        limestonePool.slab(ModBlocks.LIMESTONE_SLAB);
        limestonePool.wall(ModBlocks.LIMESTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TOME, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLEAVER, Models.HANDHELD);
    }
}
