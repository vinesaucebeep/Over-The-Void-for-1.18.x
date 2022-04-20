package overthevoid.overthevoid.common.properties.blocks;

import java.util.Random;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import overthevoid.overthevoid.core.init.BlockInit;

public class EerieVinesBlock extends GrowingPlantHeadBlock {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public EerieVinesBlock(BlockBehaviour.Properties p_154966_) {
        super(p_154966_, Direction.DOWN, SHAPE, false, 0.1D);
    }

    public int getBlocksToGrowWhenBonemealed(Random p_154968_) {
        return NetherVines.getBlocksToGrowWhenBonemealed(p_154968_);
    }

    public Block getBodyBlock() {
        return BlockInit.EERIE_VINES_PLANT.get();
    }

    public boolean canGrowInto(BlockState p_154971_) {
        return NetherVines.isValidGrowthState(p_154971_);
    }
}