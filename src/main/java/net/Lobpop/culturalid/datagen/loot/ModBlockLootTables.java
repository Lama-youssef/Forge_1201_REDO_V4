package net.Lobpop.culturalid.datagen.loot;

import net.Lobpop.culturalid.ModItems;
import net.Lobpop.culturalid.block.ModBlocks;
import net.Lobpop.culturalid.block.custom.SumacCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {super(Set.of(), FeatureFlags.REGISTRY.allFlags()); }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.SUMAC_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SumacCropBlock.AGE, 5));
        this.add(ModBlocks.SUMAC_CROP.get(), createCropDrops(ModBlocks.SUMAC_CROP.get(), ModItems.SUMAC.get(),
                ModItems.SUMAC_SEEDS.get(), lootitemcondition$builder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
