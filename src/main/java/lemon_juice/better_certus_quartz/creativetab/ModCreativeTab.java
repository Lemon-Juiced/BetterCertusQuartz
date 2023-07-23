package lemon_juice.better_certus_quartz.creativetab;

import lemon_juice.better_certus_quartz.BetterCertusQuartz;
import lemon_juice.better_certus_quartz.block.ModBlocks;
import lemon_juice.better_certus_quartz.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterCertusQuartz.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_CERTUS_QUARTZ_TAB = CREATIVE_MODE_TABS.register("better_certus_quartz", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_certus_quartz"))
            .icon(() -> new ItemStack(ModBlocks.CERTUS_QUARTZ_ORE.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_CERTUS_QUARTZ_TAB.get()) {
            event.accept(ModItems.CERTUS_QUARTZ_DUST.get());
            event.accept(ModItems.FLUIX_CRYSTAL_DUST.get());
            event.accept(ModItems.NETHER_QUARTZ_DUST.get());

            event.accept(ModBlocks.CERTUS_QUARTZ_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());
            event.accept(ModBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
