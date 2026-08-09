package net.avi.weathered.datagen;

import net.avi.weathered.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.LIMESTONE_STAIRS)
                .add(ModBlocks.LIMESTONE_SLAB)
                .add(ModBlocks.LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LIMESTONE_WALL);
    }
}
