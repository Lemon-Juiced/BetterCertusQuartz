package lemon_juice.better_certus_quartz.block;

import lemon_juice.better_certus_quartz.BetterCertusQuartz;
import lemon_juice.better_certus_quartz.item.BetterCertusQuartzItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BetterCertusQuartzBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterCertusQuartz.MOD_ID);

    public static final DeferredBlock<Block> CERTUS_QUARTZ_ORE = registerBlock("certus_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_CERTUS_QUARTZ_ORE = registerBlock("deepslate_certus_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CERTUS_QUARTZ_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));

    public static final DeferredBlock<Block> CHARGED_CERTUS_QUARTZ_ORE = registerBlock("charged_certus_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE = registerBlock("deepslate_charged_certus_quartz_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CHARGED_CERTUS_QUARTZ_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));


    /******************************** Registry ********************************/
    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return BetterCertusQuartzItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
