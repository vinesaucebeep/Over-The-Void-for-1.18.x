package overthevoid.overthevoid.core.init;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import overthevoid.overthevoid.Overthevoid;
import overthevoid.overthevoid.common.properties.blocks.*;


public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Overthevoid.MOD_ID);

    // CHORUS
    public static final RegistryObject<Block> STRIPPED_CHORUS_STEM = BLOCKS.register("stripped_chorus_stem", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_STEM = BLOCKS.register("chorus_stem", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_PLANKS = BLOCKS.register("chorus_planks", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<DoorBlock> CHORUS_DOOR = BLOCKS.register("chorus_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<NyliumBlock> CHORUS_NYLIUM = BLOCKS.register("chorus_nylium", () -> new NyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0f, 9.0f).sound(SoundType.NYLIUM).requiresCorrectToolForDrops()));
    public static final RegistryObject<TrapDoorBlock> CHORUS_TRAPDOOR = BLOCKS.register("chorus_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_WART_BLOCK = BLOCKS.register("chorus_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_VINES = BLOCKS.register("chorus_vines", () -> new ChorusVinesBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_VINES_PLANT = BLOCKS.register("chorus_vines_plant", () -> new ChorusVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_FENCE = BLOCKS.register("chorus_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_FENCE_GATE = BLOCKS.register("chorus_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_STAIRS = BLOCKS.register("chorus_stairs", () -> new StairBlock(() -> BlockInit.CHORUS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_SLAB = BLOCKS.register("chorus_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_HYPHAE = BLOCKS.register("chorus_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_CHORUS_HYPHAE = BLOCKS.register("stripped_chorus_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).requiresCorrectToolForDrops()));

    // EERIE
    public static final RegistryObject<Block> EERIE_PLANKS = BLOCKS.register("eerie_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_STEM = BLOCKS.register("eerie_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EERIE_STEM = BLOCKS.register("stripped_eerie_stem", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_DOOR = BLOCKS.register("eerie_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_TRAPDOOR = BLOCKS.register("eerie_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_FENCE = BLOCKS.register("eerie_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_FENCE_GATE = BLOCKS.register("eerie_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_STAIRS = BLOCKS.register("eerie_stairs", () -> new StairBlock(() -> BlockInit.EERIE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_SLAB = BLOCKS.register("eerie_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_WART_BLOCK = BLOCKS.register("eerie_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<NyliumBlock> EERIE_NYLIUM = BLOCKS.register("eerie_nylium", () -> new NyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0f, 9.0f).sound(SoundType.NYLIUM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_HYPHAE = BLOCKS.register("eerie_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EERIE_HYPHAE = BLOCKS.register("stripped_eerie_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_ROOTS = BLOCKS.register("eerie_roots", () -> new RootsBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.NETHER).noCollission().instabreak().sound(SoundType.ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_VINES = BLOCKS.register("eerie_vines", () -> new EerieVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_VINES_PLANT = BLOCKS.register("eerie_vines_plant", () -> new EerieVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TALL_EERIE_ROOTS = BLOCKS.register("tall_eerie_roots", () -> new TallRootsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POTTED_EERIE_ROOTS = BLOCKS.register("potted_eerie_roots", () -> new FlowerPotBlock(null, EERIE_ROOTS, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_ROOTS).instabreak().noOcclusion()));

}