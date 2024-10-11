package net.Lobpop.culturalid.block.custom;

import net.Lobpop.culturalid.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.event.level.AlterGroundEvent;

public class SumacCropBlock extends CropBlock {
    public static final int MAX_AGE = 5;
    public static final int IntegerProperty AGE = BlockStateProperties.AGE_5;

    public SumacCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SUMAC_SEEDS.get();
    }

    @Override
    protected  IntegerProperty getAgeProperty() {
        return AGE;
        }

   @Override
   public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}


