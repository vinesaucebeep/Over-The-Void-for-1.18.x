package overthevoid.overthevoid.util;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import overthevoid.overthevoid.Overthevoid;
import overthevoid.overthevoid.core.init.BlockInit;

/**
 * Author: beep67
 */


@Mod.EventBusSubscriber(modid = Overthevoid.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHORUS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHORUS_VINES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHORUS_VINES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHORUS_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.TALL_CHORUS_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CHORUS_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHORUS_FUNGUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EERIE_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EERIE_VINES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EERIE_VINES_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.TALL_EERIE_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_EERIE_ROOTS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EERIE_FUNGUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_CHORUS_FUNGUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_EERIE_FUNGUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ENDER_CAMPFIRE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ENDER_TORCH.get(), RenderType.cutout());

    }
}
