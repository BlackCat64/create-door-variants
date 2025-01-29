package net.blackcat64.createdoorvariants.block;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.blackcat64.createdoorvariants.CreateDoorVariantsMod;
import net.blackcat64.createdoorvariants.item.ModItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.simibubi.create.Create.REGISTRATE;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateDoorVariantsMod.MODID);

    public static final CreateRegistrate MOD_REGISTRATE = CreateRegistrate.create(CreateDoorVariantsMod.MODID)
            .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public static final BlockEntry<SlidingDoorBlock> WHITE_TRAIN_DOOR =
            REGISTRATE.block("white_train_door", p -> SlidingDoorBlock.metal(p, false))
                    .transform(BuilderTransformers.slidingDoor("white_train"))
                    .properties(p -> p.mapColor(MapColor.TERRACOTTA_CYAN)
                            .sound(SoundType.NETHERITE_BLOCK)
                            .noOcclusion())
                    .register();


    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
