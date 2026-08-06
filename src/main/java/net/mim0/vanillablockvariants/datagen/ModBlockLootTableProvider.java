package net.mim0.vanillablockvariants.datagen;

import net.mim0.vanillablockvariants.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.CHISELED_PRISMARINE_BLOCK.get());
        dropSelf(ModBlocks.CHISELED_PURPUR_BLOCK.get());
        dropSelf(ModBlocks.CHISELED_GRANITE_BLOCK.get());
        dropSelf(ModBlocks.CHISELED_ANDESITE_BLOCK.get());
        dropSelf(ModBlocks.CHISELED_DIORITE_BLOCK.get());

        dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());
        dropSelf(ModBlocks.PURPUR_WALL.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_WALL.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_WALL.get());
        dropSelf(ModBlocks.SMOOTH_STONE_WALL.get());
        dropSelf(ModBlocks.CUT_SANDSTONE_WALL.get());
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_WALL.get());
        dropSelf(ModBlocks.STONE_WALL.get());
        dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL.get());
        dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
        dropSelf(ModBlocks.QUARTZ_WALL.get());
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());

        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS.get());
        dropSelf(ModBlocks.CUT_SANDSTONE_STAIRS.get());
        dropSelf(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get());

        dropSelf(ModBlocks.NETHERRACK_WALL.get());
        dropSelf(ModBlocks.NETHERRACK_STAIRS.get());
        add(ModBlocks.NETHERRACK_SLAB.get(), createSlabItemTable(ModBlocks.NETHERRACK_SLAB.get()));

        dropSelf(ModBlocks.END_STONE_WALL.get());
        dropSelf(ModBlocks.END_STONE_STAIRS.get());
        add(ModBlocks.END_STONE_SLAB.get(), createSlabItemTable(ModBlocks.END_STONE_SLAB.get()));

        dropSelf(ModBlocks.PACKED_MUD_WALL.get());
        dropSelf(ModBlocks.PACKED_MUD_STAIRS.get());
        add(ModBlocks.PACKED_MUD_SLAB.get(), createSlabItemTable(ModBlocks.PACKED_MUD_SLAB.get()));

        dropSelf(ModBlocks.CLAY_WALL.get());
        dropSelf(ModBlocks.CLAY_STAIRS.get());
        add(ModBlocks.CLAY_SLAB.get(), createSlabItemTable(ModBlocks.CLAY_SLAB.get()));

        dropSelf(ModBlocks.RESIN_WALL.get());
        dropSelf(ModBlocks.RESIN_STAIRS.get());
        add(ModBlocks.RESIN_SLAB.get(), createSlabItemTable(ModBlocks.RESIN_SLAB.get()));

        dropSelf(ModBlocks.PRISMARINE_BRICK_WALL.get());

        dropSelf(ModBlocks.BASALT_WALL.get());
        dropSelf(ModBlocks.BASALT_STAIRS.get());
        add(ModBlocks.BASALT_SLAB.get(), createSlabItemTable(ModBlocks.BASALT_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_BASALT_WALL.get());
        dropSelf(ModBlocks.POLISHED_BASALT_STAIRS.get());
        add(ModBlocks.POLISHED_BASALT_SLAB.get(), createSlabItemTable(ModBlocks.POLISHED_BASALT_SLAB.get()));

        dropSelf(ModBlocks.SMOOTH_BASALT_WALL.get());
        dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        add(ModBlocks.SMOOTH_BASALT_SLAB.get(), createSlabItemTable(ModBlocks.SMOOTH_BASALT_SLAB.get()));

        dropSelf(ModBlocks.QUARTZ_PILLAR_WALL.get());
        dropSelf(ModBlocks.QUARTZ_PILLAR_STAIRS.get());
        add(ModBlocks.QUARTZ_PILLAR_SLAB.get(), createSlabItemTable(ModBlocks.QUARTZ_PILLAR_SLAB.get()));

        dropSelf(ModBlocks.CHISELED_END_STONE_BLOCK.get());

        dropSelf(ModBlocks.COPPER_STAIRS.get());
        add(ModBlocks.COPPER_SLAB.get(), createSlabItemTable(ModBlocks.COPPER_SLAB.get()));

        dropSelf(ModBlocks.EXPOSED_COPPER_STAIRS.get());
        add(ModBlocks.EXPOSED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.EXPOSED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.WEATHERED_COPPER_STAIRS.get());
        add(ModBlocks.WEATHERED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.WEATHERED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.OXIDIZED_COPPER_STAIRS.get());
        add(ModBlocks.OXIDIZED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.OXIDIZED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.WAXED_COPPER_STAIRS.get());
        add(ModBlocks.WAXED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.WAXED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get());
        add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get());
        add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get());
        add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(), createSlabItemTable(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get()));

        dropSelf(ModBlocks.GRANITE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.GRANITE_BRICKS_WALL.get());
        dropSelf(ModBlocks.GRANITE_BRICKS_STAIRS.get());
        add(ModBlocks.GRANITE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.GRANITE_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.ANDESITE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.ANDESITE_BRICKS_WALL.get());
        dropSelf(ModBlocks.ANDESITE_BRICKS_STAIRS.get());
        add(ModBlocks.ANDESITE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.ANDESITE_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.DIORITE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.DIORITE_BRICKS_WALL.get());
        dropSelf(ModBlocks.DIORITE_BRICKS_STAIRS.get());
        add(ModBlocks.DIORITE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.DIORITE_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.DRIPSTONE_WALL.get());
        dropSelf(ModBlocks.DRIPSTONE_STAIRS.get());
        add(ModBlocks.DRIPSTONE_SLAB.get(), createSlabItemTable(ModBlocks.DRIPSTONE_SLAB.get()));

        dropSelf(ModBlocks.COLORED_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.COLORED_BRICKS_WALL.get());
        dropSelf(ModBlocks.COLORED_BRICKS_STAIRS.get());
        add(ModBlocks.COLORED_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.COLORED_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.GRANITE_TILES_BLOCK.get());
        dropSelf(ModBlocks.GRANITE_TILES_WALL.get());
        dropSelf(ModBlocks.GRANITE_TILES_STAIRS.get());
        add(ModBlocks.GRANITE_TILES_SLAB.get(), createSlabItemTable(ModBlocks.GRANITE_TILES_SLAB.get()));

        dropSelf(ModBlocks.ANDESITE_TILES_BLOCK.get());
        dropSelf(ModBlocks.ANDESITE_TILES_WALL.get());
        dropSelf(ModBlocks.ANDESITE_TILES_STAIRS.get());
        add(ModBlocks.ANDESITE_TILES_SLAB.get(), createSlabItemTable(ModBlocks.ANDESITE_TILES_SLAB.get()));

        dropSelf(ModBlocks.DIORITE_TILES_BLOCK.get());
        dropSelf(ModBlocks.DIORITE_TILES_WALL.get());
        dropSelf(ModBlocks.DIORITE_TILES_STAIRS.get());
        add(ModBlocks.DIORITE_TILES_SLAB.get(), createSlabItemTable(ModBlocks.DIORITE_TILES_SLAB.get()));

        dropSelf(ModBlocks.DRIPSTONE_TILES_BLOCK.get());
        dropSelf(ModBlocks.DRIPSTONE_TILES_WALL.get());
        dropSelf(ModBlocks.DRIPSTONE_TILES_STAIRS.get());
        add(ModBlocks.DRIPSTONE_TILES_SLAB.get(), createSlabItemTable(ModBlocks.DRIPSTONE_TILES_SLAB.get()));

        dropSelf(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get());
        dropSelf(ModBlocks.SMOOTH_DEEPSLATE_WALL.get());
        dropSelf(ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get());
        add(ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), createSlabItemTable(ModBlocks.SMOOTH_DEEPSLATE_SLAB.get()));

        dropSelf(ModBlocks.SANDSTONE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.SANDSTONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.SANDSTONE_BRICKS_STAIRS.get());
        add(ModBlocks.SANDSTONE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.SANDSTONE_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.RED_SANDSTONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS.get());
        add(ModBlocks.RED_SANDSTONE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.RED_SANDSTONE_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.DRIPSTONE_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.DRIPSTONE_BRICKS_WALL.get());
        dropSelf(ModBlocks.DRIPSTONE_BRICKS_STAIRS.get());
        add(ModBlocks.DRIPSTONE_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.RED_SANDSTONE_BRICKS_SLAB.get()));

        
        dropSelf(ModBlocks.TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        add(ModBlocks.TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.WHITE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.WHITE_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.GRAY_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.GRAY_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BLACK_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BLACK_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BROWN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BROWN_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.RED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.RED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.RED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.ORANGE_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.YELLOW_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.YELLOW_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIME_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIME_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIME_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.GREEN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.GREEN_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.CYAN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.CYAN_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BLUE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BLUE_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.PURPLE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.PURPLE_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.PINK_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PINK_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.PINK_TERRACOTTA_SLAB.get()));
        

        dropSelf(ModBlocks.WHITE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        add(ModBlocks.WHITE_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.WHITE_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.GRAY_CONCRETE_WALL.get());
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.GRAY_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.GRAY_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.BLACK_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        add(ModBlocks.BLACK_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.BLACK_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.BROWN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        add(ModBlocks.BROWN_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.BROWN_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.RED_CONCRETE_WALL.get());
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        add(ModBlocks.RED_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.RED_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.ORANGE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.ORANGE_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.YELLOW_CONCRETE_WALL.get());
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.YELLOW_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.LIME_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        add(ModBlocks.LIME_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.LIME_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.GREEN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        add(ModBlocks.GREEN_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.GREEN_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.CYAN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        add(ModBlocks.CYAN_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.CYAN_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.BLUE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.BLUE_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.BLUE_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.PURPLE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.PURPLE_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL.get());
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.MAGENTA_CONCRETE_SLAB.get()));

        dropSelf(ModBlocks.PINK_CONCRETE_WALL.get());
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        add(ModBlocks.PINK_CONCRETE_SLAB.get(), createSlabItemTable(ModBlocks.PINK_CONCRETE_SLAB.get()));


        dropSelf(ModBlocks.WHITE_WOOL_WALL.get());
        dropSelf(ModBlocks.WHITE_WOOL_STAIRS.get());
        add(ModBlocks.WHITE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.WHITE_WOOL_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get()));

        dropSelf(ModBlocks.GRAY_WOOL_WALL.get());
        dropSelf(ModBlocks.GRAY_WOOL_STAIRS.get());
        add(ModBlocks.GRAY_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.GRAY_WOOL_SLAB.get()));

        dropSelf(ModBlocks.BLACK_WOOL_WALL.get());
        dropSelf(ModBlocks.BLACK_WOOL_STAIRS.get());
        add(ModBlocks.BLACK_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BLACK_WOOL_SLAB.get()));

        dropSelf(ModBlocks.BROWN_WOOL_WALL.get());
        dropSelf(ModBlocks.BROWN_WOOL_STAIRS.get());
        add(ModBlocks.BROWN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BROWN_WOOL_SLAB.get()));

        dropSelf(ModBlocks.RED_WOOL_WALL.get());
        dropSelf(ModBlocks.RED_WOOL_STAIRS.get());
        add(ModBlocks.RED_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.RED_WOOL_SLAB.get()));

        dropSelf(ModBlocks.ORANGE_WOOL_WALL.get());
        dropSelf(ModBlocks.ORANGE_WOOL_STAIRS.get());
        add(ModBlocks.ORANGE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.ORANGE_WOOL_SLAB.get()));

        dropSelf(ModBlocks.YELLOW_WOOL_WALL.get());
        dropSelf(ModBlocks.YELLOW_WOOL_STAIRS.get());
        add(ModBlocks.YELLOW_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.YELLOW_WOOL_SLAB.get()));

        dropSelf(ModBlocks.LIME_WOOL_WALL.get());
        dropSelf(ModBlocks.LIME_WOOL_STAIRS.get());
        add(ModBlocks.LIME_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIME_WOOL_SLAB.get()));

        dropSelf(ModBlocks.GREEN_WOOL_WALL.get());
        dropSelf(ModBlocks.GREEN_WOOL_STAIRS.get());
        add(ModBlocks.GREEN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.GREEN_WOOL_SLAB.get()));

        dropSelf(ModBlocks.CYAN_WOOL_WALL.get());
        dropSelf(ModBlocks.CYAN_WOOL_STAIRS.get());
        add(ModBlocks.CYAN_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.CYAN_WOOL_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get()));

        dropSelf(ModBlocks.BLUE_WOOL_WALL.get());
        dropSelf(ModBlocks.BLUE_WOOL_STAIRS.get());
        add(ModBlocks.BLUE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.BLUE_WOOL_SLAB.get()));

        dropSelf(ModBlocks.PURPLE_WOOL_WALL.get());
        dropSelf(ModBlocks.PURPLE_WOOL_STAIRS.get());
        add(ModBlocks.PURPLE_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.PURPLE_WOOL_SLAB.get()));

        dropSelf(ModBlocks.MAGENTA_WOOL_WALL.get());
        dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS.get());
        add(ModBlocks.MAGENTA_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.MAGENTA_WOOL_SLAB.get()));

        dropSelf(ModBlocks.PINK_WOOL_WALL.get());
        dropSelf(ModBlocks.PINK_WOOL_STAIRS.get());
        add(ModBlocks.PINK_WOOL_SLAB.get(), createSlabItemTable(ModBlocks.PINK_WOOL_SLAB.get()));


        dropSelf(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), createSlabItemTable(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get()));

        dropSelf(ModBlocks.PURPUR_PILLAR_WALL.get());
        dropSelf(ModBlocks.PURPUR_PILLAR_STAIRS.get());
        add(ModBlocks.PURPUR_PILLAR_SLAB.get(), createSlabItemTable(ModBlocks.PURPUR_PILLAR_SLAB.get()));

        dropSelf(ModBlocks.END_STONE_PILLAR_BLOCK.get());
        dropSelf(ModBlocks.END_STONE_PILLAR_WALL.get());
        dropSelf(ModBlocks.END_STONE_PILLAR_STAIRS.get());
        add(ModBlocks.END_STONE_PILLAR_SLAB.get(), createSlabItemTable(ModBlocks.END_STONE_PILLAR_SLAB.get()));

        dropSelf(ModBlocks.SANDSTONE_PILLAR_BLOCK.get());
        dropSelf(ModBlocks.SANDSTONE_PILLAR_WALL.get());
        dropSelf(ModBlocks.SANDSTONE_PILLAR_STAIRS.get());
        add(ModBlocks.SANDSTONE_PILLAR_SLAB.get(), createSlabItemTable(ModBlocks.SANDSTONE_PILLAR_SLAB.get()));

        dropSelf(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get());
        dropSelf(ModBlocks.RED_SANDSTONE_PILLAR_WALL.get());
        dropSelf(ModBlocks.RED_SANDSTONE_PILLAR_STAIRS.get());
        add(ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(), createSlabItemTable(ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_END_STONE_BLOCK.get());
        dropSelf(ModBlocks.POLISHED_END_STONE_WALL.get());
        dropSelf(ModBlocks.POLISHED_END_STONE_STAIRS.get());
        add(ModBlocks.POLISHED_END_STONE_SLAB.get(), createSlabItemTable(ModBlocks.POLISHED_END_STONE_SLAB.get()));

        dropSelf(ModBlocks.PURPUR_BRICKS_BLOCK.get());
        dropSelf(ModBlocks.PURPUR_BRICKS_WALL.get());
        dropSelf(ModBlocks.PURPUR_BRICKS_STAIRS.get());
        add(ModBlocks.PURPUR_BRICKS_SLAB.get(), createSlabItemTable(ModBlocks.PURPUR_BRICKS_SLAB.get()));

        dropSelf(ModBlocks.MUD_WALL.get());
        dropSelf(ModBlocks.MUD_STAIRS.get());
        add(ModBlocks.MUD_SLAB.get(), createSlabItemTable(ModBlocks.MUD_SLAB.get()));

        dropSelf(ModBlocks.CALCITE_WALL.get());
        dropSelf(ModBlocks.CALCITE_STAIRS.get());
        add(ModBlocks.CALCITE_SLAB.get(), createSlabItemTable(ModBlocks.CALCITE_SLAB.get()));

        dropSelf(ModBlocks.OBSIDIAN_WALL.get());
        dropSelf(ModBlocks.OBSIDIAN_STAIRS.get());
        add(ModBlocks.OBSIDIAN_SLAB.get(), createSlabItemTable(ModBlocks.OBSIDIAN_SLAB.get()));

        dropSelf(ModBlocks.CRYING_OBSIDIAN_WALL.get());
        dropSelf(ModBlocks.CRYING_OBSIDIAN_STAIRS.get());
        add(ModBlocks.CRYING_OBSIDIAN_SLAB.get(), createSlabItemTable(ModBlocks.CRYING_OBSIDIAN_SLAB.get()));

        dropSelf(ModBlocks.DEEPSLATE_WALL.get());
        dropSelf(ModBlocks.DEEPSLATE_STAIRS.get());
        add(ModBlocks.DEEPSLATE_SLAB.get(), createSlabItemTable(ModBlocks.DEEPSLATE_SLAB.get()));

        dropSelf(ModBlocks.AMETHYST_WALL.get());
        dropSelf(ModBlocks.AMETHYST_STAIRS.get());
        add(ModBlocks.AMETHYST_SLAB.get(), createSlabItemTable(ModBlocks.AMETHYST_SLAB.get()));

        dropSelf(ModBlocks.COAL_WALL.get());
        dropSelf(ModBlocks.COAL_STAIRS.get());
        add(ModBlocks.COAL_SLAB.get(), createSlabItemTable(ModBlocks.COAL_SLAB.get()));

        dropSelf(ModBlocks.IRON_WALL.get());
        dropSelf(ModBlocks.IRON_STAIRS.get());
        add(ModBlocks.IRON_SLAB.get(), createSlabItemTable(ModBlocks.IRON_SLAB.get()));

        dropSelf(ModBlocks.GOLD_WALL.get());
        dropSelf(ModBlocks.GOLD_STAIRS.get());
        add(ModBlocks.GOLD_SLAB.get(), createSlabItemTable(ModBlocks.GOLD_SLAB.get()));

        dropSelf(ModBlocks.EMERALD_WALL.get());
        dropSelf(ModBlocks.EMERALD_STAIRS.get());
        add(ModBlocks.EMERALD_SLAB.get(), createSlabItemTable(ModBlocks.EMERALD_SLAB.get()));

        dropSelf(ModBlocks.DIAMOND_WALL.get());
        dropSelf(ModBlocks.DIAMOND_STAIRS.get());
        add(ModBlocks.DIAMOND_SLAB.get(), createSlabItemTable(ModBlocks.DIAMOND_SLAB.get()));

        dropSelf(ModBlocks.NETHERITE_WALL.get());
        dropSelf(ModBlocks.NETHERITE_STAIRS.get());
        add(ModBlocks.NETHERITE_SLAB.get(), createSlabItemTable(ModBlocks.NETHERITE_SLAB.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
