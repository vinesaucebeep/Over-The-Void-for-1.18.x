package overthevoid.overthevoid.common.properties.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.shapes.VoxelShape;
import overthevoid.overthevoid.core.init.BlockInit;

public class EerieVinesPlantBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public EerieVinesPlantBlock(BlockBehaviour.Properties p_154975_) {
        super(p_154975_, Direction.DOWN, SHAPE, false);
    }

    public GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) BlockInit.EERIE_VINES.get();
    }
}