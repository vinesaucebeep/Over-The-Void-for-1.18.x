package overthevoid.overthevoid;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import overthevoid.overthevoid.core.init.BlockInit;
import overthevoid.overthevoid.core.init.ItemInit;

@Mod("overthevoid")
public class Overthevoid {

    public static final String MOD_ID = "overthevoid";

    public static final CreativeModeTab OTV_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EERIE_PLANKS.get());
        }
    };

    public Overthevoid() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}


