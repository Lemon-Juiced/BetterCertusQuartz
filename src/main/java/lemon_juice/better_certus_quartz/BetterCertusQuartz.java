package lemon_juice.better_certus_quartz;

import lemon_juice.better_certus_quartz.block.BetterCertusQuartzBlocks;
import lemon_juice.better_certus_quartz.creativetab.BetterCertusQuartzCreativeTab;
import lemon_juice.better_certus_quartz.item.BetterCertusQuartzItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterCertusQuartz.MOD_ID)
public class BetterCertusQuartz {
    public static final String MOD_ID = "better_certus_quartz";

    public BetterCertusQuartz(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        BetterCertusQuartzItems.register(modEventBus);
        BetterCertusQuartzBlocks.register(modEventBus);

        // Register Creative Tab
        BetterCertusQuartzCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterCertusQuartzCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
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
