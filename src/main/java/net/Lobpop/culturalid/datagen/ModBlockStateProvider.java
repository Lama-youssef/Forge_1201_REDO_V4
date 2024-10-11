package net.Lobpop.culturalid.datagen;

import net.Lobpop.culturalid.CulturalMod;
import net.Lobpop.culturalid.block.ModBlocks;
import net.Lobpop.culturalid.block.custom.SumacCropBlock;
import net.minecraft.ResourceLocationException;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CulturalMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);

    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfigurdeModel[] models = new ConfigureModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(SumacCropBlock) block).getAgeProperty()),
                new ResourceLocation(CulturalMod.MOD_ID, "block/" + textureName + state.getValue(((SumacCropBlock) block).getAgeProperty()))).renderType("cutout"));

    return models;
    }




    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()))
    }
}
