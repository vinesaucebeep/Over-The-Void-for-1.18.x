package overthevoid.overthevoid.common.properties.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import overthevoid.overthevoid.core.init.BlockInit;

import java.util.Random;

public class ChorusVinesBlock extends GrowingPlantHeadBlock {

    public static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 15.0D, 12.0D);

    public ChorusVinesBlock(BlockBehaviour.Properties p_154864_) {
        super(p_154864_, Direction.UP, SHAPE, false, 0.1D);
    }

    public int getBlocksToGrowWhenBonemealed(Random p_154866_) {
        return NetherVines.getBlocksToGrowWhenBonemealed(p_154866_);
    }

    public Block getBodyBlock() {
        return BlockInit.CHORUS_VINES_PLANT.get();
    }

    public boolean canGrowInto(BlockState p_154869_) {
        return NetherVines.isValidGrowthState(p_154869_);
    }
}