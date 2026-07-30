package net.mim0.vanillavariants.datagen;

import net.mim0.vanillavariants.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;
import net.neoforged.neoforge.registries.datamaps.builtin.Waxable;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.WAXABLES)
                .add(ModBlocks.COPPER_STAIRS.getKey(), new Waxable(ModBlocks.WAXED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.EXPOSED_COPPER_STAIRS.getKey(), new Waxable(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.WEATHERED_COPPER_STAIRS.getKey(), new Waxable(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.OXIDIZED_COPPER_STAIRS.getKey(), new Waxable(ModBlocks.OXIDIZED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.COPPER_SLAB.getKey(), new Waxable(ModBlocks.WAXED_COPPER_SLAB.get()), false)
                .add(ModBlocks.EXPOSED_COPPER_SLAB.getKey(), new Waxable(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get()), false)
                .add(ModBlocks.WEATHERED_COPPER_SLAB.getKey(), new Waxable(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get()), false)
                .add(ModBlocks.OXIDIZED_COPPER_SLAB.getKey(), new Waxable(ModBlocks.OXIDIZED_COPPER_SLAB.get()), false);

        builder(NeoForgeDataMaps.OXIDIZABLES)
                .add(ModBlocks.COPPER_STAIRS.getKey(), new Oxidizable(ModBlocks.EXPOSED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.EXPOSED_COPPER_STAIRS.getKey(), new Oxidizable(ModBlocks.WEATHERED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.WEATHERED_COPPER_STAIRS.getKey(), new Oxidizable(ModBlocks.OXIDIZED_COPPER_STAIRS.get()), false)
                .add(ModBlocks.COPPER_SLAB.getKey(), new Oxidizable(ModBlocks.EXPOSED_COPPER_SLAB.get()), false)
                .add(ModBlocks.EXPOSED_COPPER_SLAB.getKey(), new Oxidizable(ModBlocks.WEATHERED_COPPER_SLAB.get()), false)
                .add(ModBlocks.WEATHERED_COPPER_SLAB.getKey(), new Oxidizable(ModBlocks.OXIDIZED_COPPER_SLAB.get()), false);

    }
}
