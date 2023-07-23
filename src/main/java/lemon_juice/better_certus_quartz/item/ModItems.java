package lemon_juice.better_certus_quartz.item;

import lemon_juice.better_certus_quartz.BetterCertusQuartz;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterCertusQuartz.MOD_ID);

    public static final RegistryObject<Item> CERTUS_QUARTZ_DUST = ITEMS.register("certus_quartz_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLUIX_CRYSTAL_DUST = ITEMS.register("fluix_crystal_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_DUST = ITEMS.register("nether_quartz_dust", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
