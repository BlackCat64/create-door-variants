package net.blackcat64.createdoorvariants;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import net.blackcat64.createdoorvariants.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateDoorVariantsMod.MODID);


    public static final RegistryObject<CreativeModeTab> DOORS_TAB = CREATIVE_MODE_TABS.register("doors_tab", () -> CreativeModeTab.builder().icon(() -> AllItems.SUPER_GLUE.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(AllBlocks.TRAIN_DOOR);
        output.accept(ModBlocks.WHITE_TRAIN_DOOR.get());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
