package overthevoid.overthevoid;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import overthevoid.overthevoid.core.init.BlockInit;
import overthevoid.overthevoid.core.init.ItemInit;

@Mod("overthevoid")
public class Overthevoid {

    public static final String MOD_ID = "overthevoid";

    public static final CreativeModeTab OTV_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EERIE_PLANKS.get());
        }
    };

    public Overthevoid() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.EERIE_ROOTS.getId(), BlockInit.POTTED_EERIE_ROOTS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CHORUS_ROOTS.getId(), BlockInit.POTTED_CHORUS_ROOTS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.CHORUS_FUNGUS.getId(), BlockInit.POTTED_CHORUS_FUNGUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.EERIE_FUNGUS.getId(), BlockInit.POTTED_EERIE_FUNGUS);
        });
    }
}


