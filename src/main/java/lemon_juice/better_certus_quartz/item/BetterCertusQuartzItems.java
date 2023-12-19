package lemon_juice.better_certus_quartz.item;

import lemon_juice.better_certus_quartz.BetterCertusQuartz;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterCertusQuartzItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterCertusQuartz.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
