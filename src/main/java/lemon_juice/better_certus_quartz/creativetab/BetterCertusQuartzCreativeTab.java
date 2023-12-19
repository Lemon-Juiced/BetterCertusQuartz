package lemon_juice.better_certus_quartz.creativetab;

import lemon_juice.better_certus_quartz.BetterCertusQuartz;
import lemon_juice.better_certus_quartz.block.BetterCertusQuartzBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterCertusQuartzCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterCertusQuartz.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_CERTUS_QUARTZ_TAB = CREATIVE_MODE_TABS.register("better_certus_quartz", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_certus_quartz"))
            .icon(() -> new ItemStack(BetterCertusQuartzBlocks.CERTUS_QUARTZ_ORE.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_CERTUS_QUARTZ_TAB.get()) {
            event.accept(BetterCertusQuartzBlocks.CERTUS_QUARTZ_ORE.get());
            event.accept(BetterCertusQuartzBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());
            event.accept(BetterCertusQuartzBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
            event.accept(BetterCertusQuartzBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
