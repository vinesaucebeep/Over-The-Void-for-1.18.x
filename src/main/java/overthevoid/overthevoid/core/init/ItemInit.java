package overthevoid.overthevoid.core.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import overthevoid.overthevoid.Overthevoid;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Overthevoid.MOD_ID);

    // CHORUS
    public static final RegistryObject<Item> STRIPPED_CHORUS_STEM = ITEMS.register("stripped_chorus_stem", () -> new BlockItem(BlockInit.STRIPPED_CHORUS_STEM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_STEM = ITEMS.register("chorus_stem", () -> new BlockItem(BlockInit.CHORUS_STEM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_PLANKS = ITEMS.register("chorus_planks", () -> new BlockItem(BlockInit.CHORUS_PLANKS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_DOOR = ITEMS.register("chorus_door", () -> new BlockItem(BlockInit.CHORUS_DOOR.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_NYLIUM = ITEMS.register("chorus_nylium", () -> new BlockItem(BlockInit.CHORUS_NYLIUM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_TRAPDOOR = ITEMS.register("chorus_trapdoor", () -> new BlockItem(BlockInit.CHORUS_TRAPDOOR.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_WART_BLOCK = ITEMS.register("chorus_wart_block", () -> new BlockItem(BlockInit.CHORUS_WART_BLOCK.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_VINES= ITEMS.register("chorus_vines", () -> new BlockItem(BlockInit.CHORUS_VINES.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_FENCE = ITEMS.register("chorus_fence", () -> new BlockItem(BlockInit.CHORUS_FENCE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_FENCE_GATE = ITEMS.register("chorus_fence_gate", () -> new BlockItem(BlockInit.CHORUS_FENCE_GATE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_STAIRS = ITEMS.register("chorus_stairs", () -> new BlockItem(BlockInit.CHORUS_STAIRS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_SLAB = ITEMS.register("chorus_slab", () -> new BlockItem(BlockInit.CHORUS_SLAB.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> CHORUS_HYPHAE = ITEMS.register("chorus_hyphae", () -> new BlockItem(BlockInit.CHORUS_HYPHAE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> STRIPPED_CHORUS_HYPHAE = ITEMS.register("stripped_chorus_hyphae", () -> new BlockItem(BlockInit.STRIPPED_CHORUS_HYPHAE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));





    //EERIE
    public static final RegistryObject<Item> EERIE_PLANKS = ITEMS.register("eerie_planks", () -> new BlockItem(BlockInit.EERIE_PLANKS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_STEM = ITEMS.register("eerie_stem", () -> new BlockItem(BlockInit.EERIE_STEM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> STRIPPED_EERIE_STEM = ITEMS.register("stripped_eerie_stem", () -> new BlockItem(BlockInit.STRIPPED_EERIE_STEM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_DOOR = ITEMS.register("eerie_door", () -> new BlockItem(BlockInit.EERIE_DOOR.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_TRAPDOOR = ITEMS.register("eerie_trapdoor", () -> new BlockItem(BlockInit.EERIE_TRAPDOOR.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_NYLIUM = ITEMS.register("eerie_nylium", () -> new BlockItem(BlockInit.EERIE_NYLIUM.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_WART_BLOCK = ITEMS.register("eerie_wart_block", () -> new BlockItem(BlockInit.EERIE_WART_BLOCK.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_STAIRS = ITEMS.register("eerie_stairs", () -> new BlockItem(BlockInit.EERIE_STAIRS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_SLAB = ITEMS.register("eerie_slab", () -> new BlockItem(BlockInit.EERIE_SLAB.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_HYPHAE = ITEMS.register("eerie_hyphae", () -> new BlockItem(BlockInit.EERIE_HYPHAE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> STRIPPED_EERIE_HYPHAE = ITEMS.register("stripped_eerie_hyphae", () -> new BlockItem(BlockInit.STRIPPED_EERIE_HYPHAE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_FENCE = ITEMS.register("eerie_fence", () -> new BlockItem(BlockInit.EERIE_FENCE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_FENCE_GATE = ITEMS.register("eerie_fence_gate", () -> new BlockItem(BlockInit.EERIE_FENCE_GATE.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_ROOTS = ITEMS.register("eerie_roots", () -> new BlockItem(BlockInit.EERIE_ROOTS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> EERIE_VINES = ITEMS.register("eerie_vines", () -> new BlockItem(BlockInit.EERIE_VINES.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));
    public static final RegistryObject<Item> TALL_EERIE_ROOTS = ITEMS.register("tall_eerie_roots", () -> new BlockItem(BlockInit.TALL_EERIE_ROOTS.get(),new Item.Properties().tab(Overthevoid.OTV_TAB)));









}