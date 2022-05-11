package overthevoid.overthevoid.core.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import overthevoid.overthevoid.Overthevoid;
import overthevoid.overthevoid.common.properties.blocks.*;

import java.net.PortUnreachableException;

/**
 * Author: beep67
 */

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Overthevoid.MOD_ID);

    // CHORUS
    public static final RegistryObject<Block> STRIPPED_CHORUS_STEM = BLOCKS.register("stripped_chorus_stem", () -> new FlammableLogBlock(Block.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_STEM = BLOCKS.register("chorus_stem", () -> new FlammableLogBlock(Block.Properties.copy(Blocks.STRIPPED_CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_PLANKS = BLOCKS.register("chorus_planks", () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_DOOR = BLOCKS.register("chorus_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_NYLIUM = BLOCKS.register("chorus_nylium", () -> new NyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0f, 9.0f).sound(SoundType.NYLIUM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_TRAPDOOR = BLOCKS.register("chorus_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_WART_BLOCK = BLOCKS.register("chorus_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_VINES = BLOCKS.register("chorus_vines", () -> new ChorusVinesBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_VINES_PLANT = BLOCKS.register("chorus_vines_plant", () -> new ChorusVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.TWISTING_VINES_PLANT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_FENCE = BLOCKS.register("chorus_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_FENCE_GATE = BLOCKS.register("chorus_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_STAIRS = BLOCKS.register("chorus_stairs", () -> new StairBlock(() -> BlockInit.CHORUS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_SLAB = BLOCKS.register("chorus_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_HYPHAE = BLOCKS.register("chorus_hyphae", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_CHORUS_HYPHAE = BLOCKS.register("stripped_chorus_hyphae", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHORUS_ROOTS = BLOCKS.register("chorus_roots", () -> new RootsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TALL_CHORUS_ROOTS = BLOCKS.register("tall_chorus_roots", () -> new TallRootsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POTTED_CHORUS_ROOTS = BLOCKS.register("potted_chorus_roots", () -> new FlowerPotBlock(null, CHORUS_ROOTS, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_ROOTS)));
    public static final RegistryObject<Block> CHORUS_FUNGUS = BLOCKS.register("chorus_fungus", () -> new FungusBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).instabreak().noOcclusion(), () -> {
        return TreeFeatures.CRIMSON_FUNGUS;
    }));
    public static final RegistryObject<Block> POTTED_CHORUS_FUNGUS = BLOCKS.register("potted_chorus_fungus", () -> new FlowerPotBlock(null, CHORUS_FUNGUS, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_FUNGUS)));
    public static final RegistryObject<Block> VOID_LIGHT = BLOCKS.register("void_light", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SHROOMLIGHT)));
    public static final RegistryObject<Block> POPPED_VOID_LIGHT = BLOCKS.register("popped_void_light", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SHROOMLIGHT)));

    // EERIE
    public static final RegistryObject<Block> EERIE_PLANKS = BLOCKS.register("eerie_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_STEM = BLOCKS.register("eerie_stem", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EERIE_STEM = BLOCKS.register("stripped_eerie_stem", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_DOOR = BLOCKS.register("eerie_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_TRAPDOOR = BLOCKS.register("eerie_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_FENCE = BLOCKS.register("eerie_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_FENCE_GATE = BLOCKS.register("eerie_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_STAIRS = BLOCKS.register("eerie_stairs", () -> new StairBlock(() -> BlockInit.EERIE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_SLAB = BLOCKS.register("eerie_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_WART_BLOCK = BLOCKS.register("eerie_wart_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_NYLIUM = BLOCKS.register("eerie_nylium", () -> new NyliumBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0f, 9.0f).sound(SoundType.NYLIUM).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_HYPHAE = BLOCKS.register("eerie_hyphae", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EERIE_HYPHAE = BLOCKS.register("stripped_eerie_hyphae", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_ROOTS = BLOCKS.register("eerie_roots", () -> new RootsBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.NETHER).noCollission().instabreak().sound(SoundType.ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_VINES = BLOCKS.register("eerie_vines", () -> new EerieVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EERIE_VINES_PLANT = BLOCKS.register("eerie_vines_plant", () -> new EerieVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TALL_EERIE_ROOTS = BLOCKS.register("tall_eerie_roots", () -> new TallRootsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POTTED_EERIE_ROOTS = BLOCKS.register("potted_eerie_roots", () -> new FlowerPotBlock(null, EERIE_ROOTS, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_ROOTS).instabreak().noOcclusion()));
    public static final RegistryObject<Block> EERIE_FUNGUS = BLOCKS.register("eerie_fungus", () -> new FungusBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).instabreak().noOcclusion(), () -> {
        return TreeFeatures.WARPED_FUNGUS;
    }));
    public static final RegistryObject<Block> POTTED_EERIE_FUNGUS = BLOCKS.register("potted_eerie_fungus", () ->  new FlowerPotBlock(null, EERIE_FUNGUS, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_FUNGUS)));

    // ECLIPSE
    public static final RegistryObject<Block> ECLIPSE_PLANKS = BLOCKS.register("eclipse_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ECLIPSE_LOG = BLOCKS.register("eclipse_log", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ECLIPSE_LOG = BLOCKS.register("stripped_eclipse_log", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ECLIPSE_WOOD = BLOCKS.register("eclipse_wood", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ECLIPSE_WOOD = BLOCKS.register("stripped_eclipse_wood", () -> new FlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> ECLIPSE_DOOR = BLOCKS.register("eclipse_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ECLIPSE_TRAPDOOR = BLOCKS.register("eclipse_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ECLIPSE_GRASS = BLOCKS.register("eclipse_grass", () -> new GrassBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0f, 9.0f).sound(SoundType.NYLIUM).requiresCorrectToolForDrops()));

    // MISCELLANEOUS

    public static final RegistryObject<Block> ENDER_CAMPFIRE = BLOCKS.register("ender_campfire", () -> new CampfireBlock(false, 2, BlockBehaviour.Properties.copy(Blocks.SOUL_CAMPFIRE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENDER_TORCH = BLOCKS.register("ender_torch", () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).requiresCorrectToolForDrops(), ParticleTypes.END_ROD));


}