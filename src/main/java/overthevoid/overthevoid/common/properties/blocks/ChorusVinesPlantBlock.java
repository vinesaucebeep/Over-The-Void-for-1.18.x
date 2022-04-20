package overthevoid.overthevoid.common.properties.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.VoxelShape;
import overthevoid.overthevoid.core.init.BlockInit;

public class ChorusVinesPlantBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public ChorusVinesPlantBlock(BlockBehaviour.Properties p_154873_) {
        super(p_154873_, Direction.UP, SHAPE, false);
    }

    public GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) BlockInit.CHORUS_VINES.get();
    }
}

