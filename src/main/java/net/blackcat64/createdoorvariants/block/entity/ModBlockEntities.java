package net.blackcat64.createdoorvariants.block.entity;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlockEntity;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorRenderer;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.blackcat64.createdoorvariants.block.ModBlocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static net.blackcat64.createdoorvariants.CreateDoorVariantsMod.MOD_REGISTRATE;

public class ModBlockEntities {
    public static final BlockEntityEntry<SlidingDoorBlockEntity> SLIDING_DOOR =
            MOD_REGISTRATE.blockEntity("sliding_door", SlidingDoorBlockEntity::new)
                    .renderer(() -> SlidingDoorRenderer::new)
                    .validBlocks(ModBlocks.WHITE_TRAIN_DOOR)
                    .register();

    public static void register() {

    }
}
