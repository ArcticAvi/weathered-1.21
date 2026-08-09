package net.avi.weathered.datagen;

import net.avi.weathered.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE, 4)
                .pattern("#$")
                .pattern("$#")
                .input('#', Blocks.CALCITE)
                .input('$', Blocks.ANDESITE)
                .criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter); // names the recipe json after the output, so for grindstones, use identifier.of and path
    }
}
