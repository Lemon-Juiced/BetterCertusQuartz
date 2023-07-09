package lemon_juice.better_certus_quartz;

import lemon_juice.better_certus_quartz.block.ModBlocks;
import lemon_juice.better_certus_quartz.creativetab.ModCreativeTab;
import lemon_juice.better_certus_quartz.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterCertusQuartz.MOD_ID)
public class BetterCertusQuartz {
    public static final String MOD_ID = "better_certus_quartz";

    public BetterCertusQuartz() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
