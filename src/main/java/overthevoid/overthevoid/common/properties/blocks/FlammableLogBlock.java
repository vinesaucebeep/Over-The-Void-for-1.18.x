package overthevoid.overthevoid.common.properties.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ToolAction;
import overthevoid.overthevoid.core.init.BlockInit;

import javax.annotation.Nullable;

    public class FlammableLogBlock extends RotatedPillarBlock {
        public FlammableLogBlock(Properties properties) {
            super(properties);
        }


        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 5;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 5;
        }

        @Nullable
        @Override
        public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player,
                                               ItemStack stack, ToolAction toolAction) {
            if (stack.getItem() instanceof AxeItem) {
                if (state.is(BlockInit.CHORUS_STEM.get())) {
                    return BlockInit.STRIPPED_CHORUS_STEM.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
                if (state.is(BlockInit.CHORUS_HYPHAE.get())) {
                    return BlockInit.STRIPPED_CHORUS_HYPHAE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
                if (state.is(BlockInit.EERIE_STEM.get())) {
                    return BlockInit.STRIPPED_EERIE_STEM.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
                if (state.is(BlockInit.EERIE_HYPHAE.get())) {
                    return BlockInit.STRIPPED_EERIE_HYPHAE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
                if (state.is(BlockInit.ECLIPSE_LOG.get())) {
                    return BlockInit.STRIPPED_ECLIPSE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
                if (state.is(BlockInit.ECLIPSE_WOOD.get())) {
                    return BlockInit.STRIPPED_ECLIPSE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
            }

                return super.getToolModifiedState(state, world, pos, player, stack, toolAction);

        }
    }





