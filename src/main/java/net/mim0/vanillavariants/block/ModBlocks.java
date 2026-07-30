package net.mim0.vanillavariants.block;

import net.mim0.vanillavariants.VanillaVariants;
import net.mim0.vanillavariants.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(VanillaVariants.MODID);

    public static final DeferredBlock<Block> CHISELED_PRISMARINE_BLOCK = registerBlock("chiseled_prismarine_block",
            properties -> new Block(Blocks.PRISMARINE.properties()));

    public static final DeferredBlock<Block> CHISELED_PURPUR_BLOCK = registerBlock("chiseled_purpur_block",
            properties -> new Block(Blocks.PURPUR_BLOCK.properties()));
    public static final DeferredBlock<Block> PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(Blocks.PURPUR_BLOCK.properties()));

    public static final DeferredBlock<Block> CHISELED_GRANITE_BLOCK = registerBlock("chiseled_granite_block",
            properties -> new Block(Blocks.GRANITE.properties()));
    public static final DeferredBlock<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(Blocks.POLISHED_GRANITE.properties()));

    public static final DeferredBlock<Block> CHISELED_ANDESITE_BLOCK = registerBlock("chiseled_andesite_block",
            properties -> new Block(Blocks.ANDESITE.properties()));
    public static final DeferredBlock<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(Blocks.POLISHED_ANDESITE.properties()));

    public static final DeferredBlock<Block> CHISELED_DIORITE_BLOCK = registerBlock("chiseled_diorite_block",
            properties -> new Block(Blocks.DIORITE.properties()));
    public static final DeferredBlock<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(Blocks.POLISHED_DIORITE.properties()));

    public static final DeferredBlock<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            properties -> new WallBlock(Blocks.SMOOTH_STONE.properties()));
    public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),Blocks.SMOOTH_STONE.properties()));

    public static final DeferredBlock<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
           properties -> new WallBlock(Blocks.CUT_SANDSTONE.properties()));
    public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),Blocks.CUT_SANDSTONE.properties()));

    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            properties -> new WallBlock(Blocks.CUT_RED_SANDSTONE.properties()));
    public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),Blocks.CUT_RED_SANDSTONE.properties()));

    public static final DeferredBlock<Block> STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(Blocks.STONE.properties()));

    public static final DeferredBlock<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(Blocks.SMOOTH_SANDSTONE.properties()));

    public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(Blocks.SMOOTH_RED_SANDSTONE.properties()));

    public static final DeferredBlock<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(Blocks.DARK_PRISMARINE.properties()));

    public static final DeferredBlock<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            properties -> new WallBlock(Blocks.QUARTZ_BLOCK.properties()));

    public static final DeferredBlock<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(Blocks.SMOOTH_QUARTZ.properties()));

    public static final DeferredBlock<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            properties -> new WallBlock(Blocks.NETHERRACK.properties()));
    public static final DeferredBlock<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            properties -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),Blocks.NETHERRACK.properties()));
    public static final DeferredBlock<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            properties -> new SlabBlock(Blocks.NETHERRACK.properties()));

    public static final DeferredBlock<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            properties -> new WallBlock(Blocks.END_STONE.properties()));
    public static final DeferredBlock<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),Blocks.END_STONE.properties()));
    public static final DeferredBlock<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            properties -> new SlabBlock(Blocks.END_STONE.properties()));

    public static final DeferredBlock<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(Blocks.PACKED_MUD.properties()));
    public static final DeferredBlock<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),Blocks.PACKED_MUD.properties()));
    public static final DeferredBlock<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(Blocks.PACKED_MUD.properties()));

    public static final DeferredBlock<Block> CLAY_WALL = registerBlock("clay_wall",
            properties -> new WallBlock(Blocks.CLAY.properties()));
    public static final DeferredBlock<Block> CLAY_STAIRS = registerBlock("clay_stairs",
            properties -> new StairBlock(Blocks.CLAY.defaultBlockState(),
                    Blocks.CLAY.properties()));
    public static final DeferredBlock<Block> CLAY_SLAB = registerBlock("clay_slab",
            properties -> new SlabBlock(Blocks.CLAY.properties()));

    public static final DeferredBlock<Block> RESIN_WALL = registerBlock("resin_wall",
            properties -> new WallBlock(Blocks.RESIN_BLOCK.properties()));
    public static final DeferredBlock<Block> RESIN_STAIRS = registerBlock("resin_stairs",
            properties -> new StairBlock(Blocks.RESIN_BLOCK.defaultBlockState(),
                    Blocks.RESIN_BLOCK.properties()));
    public static final DeferredBlock<Block> RESIN_SLAB = registerBlock("resin_slab",
            properties -> new SlabBlock(Blocks.RESIN_BLOCK.properties()));

    public static final DeferredBlock<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(Blocks.PRISMARINE_BRICKS.properties()));

    public static final DeferredBlock<Block> BASALT_WALL = registerBlock("basalt_wall",
            properties -> new WallBlock(Blocks.BASALT.properties()));
    public static final DeferredBlock<Block> BASALT_STAIRS = registerBlock("basalt_stairs",
            properties -> new StairBlock(Blocks.BASALT.defaultBlockState(),Blocks.BASALT.properties()));
    public static final DeferredBlock<Block> BASALT_SLAB = registerBlock("basalt_slab",
            properties -> new SlabBlock(Blocks.BASALT.properties()));

    public static final DeferredBlock<Block> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            properties -> new WallBlock(Blocks.POLISHED_BASALT.properties()));
    public static final DeferredBlock<Block> POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            properties -> new StairBlock(Blocks.BASALT.defaultBlockState(),Blocks.POLISHED_BASALT.properties()));
    public static final DeferredBlock<Block> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            properties -> new SlabBlock(Blocks.POLISHED_BASALT.properties()));

    public static final DeferredBlock<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(Blocks.SMOOTH_BASALT.properties()));
    public static final DeferredBlock<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),Blocks.SMOOTH_BASALT.properties()));
    public static final DeferredBlock<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(Blocks.SMOOTH_BASALT.properties()));

    public static final DeferredBlock<Block> QUARTZ_PILLAR_WALL = registerBlock("quartz_pillar_wall",
            properties -> new WallBlock(Blocks.QUARTZ_PILLAR.properties()));
    public static final DeferredBlock<Block> QUARTZ_PILLAR_STAIRS = registerBlock("quartz_pillar_stairs",
            properties -> new StairBlock(Blocks.QUARTZ_PILLAR.defaultBlockState(),Blocks.QUARTZ_PILLAR.properties()));
    public static final DeferredBlock<Block> QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab",
            properties -> new SlabBlock(Blocks.QUARTZ_PILLAR.properties()));

    public static final DeferredBlock<Block> CHISELED_END_STONE_BLOCK = registerBlock("chiseled_end_stone_block",
            properties -> new Block(Blocks.END_STONE.properties()));


    public static final DeferredBlock<Block> COPPER_STAIRS = registerBlock("copper_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED ,Blocks.COPPER_BLOCK.weathering().unaffected().defaultBlockState(),
                    Blocks.COPPER_BLOCK.weathering().unaffected().properties()));
    public static final DeferredBlock<Block> COPPER_SLAB = registerBlock("copper_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    Blocks.COPPER_BLOCK.weathering().unaffected().properties()));

    public static final DeferredBlock<Block> EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.weathering().exposed().properties()));
    public static final DeferredBlock<Block> EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED,
                    Blocks.COPPER_BLOCK.weathering().exposed().properties()));

    public static final DeferredBlock<Block> WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.weathering().weathered().properties()));
    public static final DeferredBlock<Block> WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED,
                    Blocks.COPPER_BLOCK.weathering().weathered().properties()));

    public static final DeferredBlock<Block> OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.weathering().oxidized().properties()));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    Blocks.COPPER_BLOCK.weathering().oxidized().properties()));

    public static final DeferredBlock<Block> WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs",
            properties -> new StairBlock(Blocks.COPPER_BLOCK.weathering().unaffected().defaultBlockState(),
                    Blocks.COPPER_BLOCK.waxed().unaffected().properties()));
    public static final DeferredBlock<Block> WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            properties -> new SlabBlock(Blocks.COPPER_BLOCK.waxed().unaffected().properties()));

    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs",
            properties -> new StairBlock(ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.waxed().exposed().properties()));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            properties -> new SlabBlock(Blocks.COPPER_BLOCK.waxed().exposed().properties()));

    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs",
            properties -> new StairBlock(ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.waxed().exposed().properties()));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            properties -> new SlabBlock(Blocks.COPPER_BLOCK.waxed().exposed().properties()));

    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs",
            properties -> new StairBlock(ModBlocks.COPPER_STAIRS.get().defaultBlockState(),
                    Blocks.COPPER_BLOCK.waxed().oxidized().properties()));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            properties -> new SlabBlock(Blocks.COPPER_BLOCK.waxed().oxidized().properties()));

    public static final DeferredBlock<Block> GRANITE_BRICKS_BLOCK = registerBlock("granite_bricks_block",
            properties -> new Block(Blocks.GRANITE.properties()));
    public static final DeferredBlock<Block> GRANITE_BRICKS_WALL = registerBlock("granite_bricks_wall",
            properties -> new WallBlock(ModBlocks.GRANITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> GRANITE_BRICKS_STAIRS = registerBlock("granite_bricks_stairs",
            properties -> new StairBlock(ModBlocks.GRANITE_BRICKS_BLOCK.get().defaultBlockState(), ModBlocks.GRANITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> GRANITE_BRICKS_SLAB = registerBlock("granite_bricks_slab",
            properties -> new SlabBlock(ModBlocks.GRANITE_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> ANDESITE_BRICKS_BLOCK = registerBlock("andesite_bricks_block",
            properties -> new Block(Blocks.ANDESITE.properties()));
    public static final DeferredBlock<Block> ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall",
            properties -> new WallBlock(ModBlocks.ANDESITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs",
            properties -> new StairBlock(ModBlocks.ANDESITE_BRICKS_BLOCK.get().defaultBlockState(),ModBlocks.ANDESITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab",
            properties -> new SlabBlock(ModBlocks.ANDESITE_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> DIORITE_BRICKS_BLOCK = registerBlock("diorite_bricks_block",
            properties -> new Block(Blocks.DIORITE.properties()));
    public static final DeferredBlock<Block> DIORITE_BRICKS_WALL = registerBlock("diorite_bricks_wall",
            properties -> new WallBlock(ModBlocks.DIORITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DIORITE_BRICKS_STAIRS = registerBlock("diorite_bricks_stairs",
            properties -> new StairBlock(ModBlocks.DIORITE_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.DIORITE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DIORITE_BRICKS_SLAB = registerBlock("diorite_bricks_slab",
            properties -> new SlabBlock(ModBlocks.DIORITE_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            properties -> new WallBlock(Blocks.DRIPSTONE_BLOCK.properties()));
    public static final DeferredBlock<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    Blocks.DRIPSTONE_BLOCK.properties()));
    public static final DeferredBlock<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            properties -> new SlabBlock(Blocks.DRIPSTONE_BLOCK.properties()));

    public static final DeferredBlock<Block> COLORED_BRICKS_BLOCK = registerBlock("colored_bricks_block",
            properties -> new Block(Blocks.BRICKS.properties()));
    public static final DeferredBlock<Block> COLORED_BRICKS_WALL = registerBlock("colored_bricks_wall",
            properties -> new WallBlock(ModBlocks.COLORED_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> COLORED_BRICKS_STAIRS = registerBlock("colored_bricks_stairs",
            properties -> new StairBlock(ModBlocks.COLORED_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.COLORED_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> COLORED_BRICKS_SLAB = registerBlock("colored_bricks_slab",
            properties -> new SlabBlock(ModBlocks.COLORED_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> GRANITE_TILES_BLOCK = registerBlock("granite_tiles_block",
            properties -> new Block(Blocks.GRANITE.properties()));
    public static final DeferredBlock<Block> GRANITE_TILES_WALL = registerBlock("granite_tiles_wall",
            properties -> new WallBlock(ModBlocks.GRANITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> GRANITE_TILES_STAIRS = registerBlock("granite_tiles_stairs",
            properties -> new StairBlock(ModBlocks.GRANITE_TILES_BLOCK.get().defaultBlockState(),
                    ModBlocks.GRANITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> GRANITE_TILES_SLAB = registerBlock("granite_tiles_slab",
            properties -> new SlabBlock(ModBlocks.GRANITE_TILES_BLOCK.get().properties()));

    public static final DeferredBlock<Block> ANDESITE_TILES_BLOCK = registerBlock("andesite_tiles_block",
            properties -> new Block(Blocks.ANDESITE.properties()));
    public static final DeferredBlock<Block> ANDESITE_TILES_WALL = registerBlock("andesite_tiles_wall",
            properties -> new WallBlock(ModBlocks.ANDESITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> ANDESITE_TILES_STAIRS = registerBlock("andesite_tiles_stairs",
            properties -> new StairBlock(ModBlocks.ANDESITE_TILES_BLOCK.get().defaultBlockState(),
                    ModBlocks.ANDESITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> ANDESITE_TILES_SLAB = registerBlock("andesite_tiles_slab",
            properties -> new SlabBlock(ModBlocks.ANDESITE_TILES_BLOCK.get().properties()));

    public static final DeferredBlock<Block> DIORITE_TILES_BLOCK = registerBlock("diorite_tiles_block",
            properties -> new Block(Blocks.DIORITE.properties()));
    public static final DeferredBlock<Block> DIORITE_TILES_WALL = registerBlock("diorite_tiles_wall",
            properties -> new WallBlock(ModBlocks.DIORITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DIORITE_TILES_STAIRS = registerBlock("diorite_tiles_stairs",
            properties -> new StairBlock(ModBlocks.DIORITE_TILES_BLOCK.get().defaultBlockState(),
                    ModBlocks.DIORITE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DIORITE_TILES_SLAB = registerBlock("diorite_tiles_slab",
            properties -> new SlabBlock(ModBlocks.DIORITE_TILES_BLOCK.get().properties()));

    public static final DeferredBlock<Block> DRIPSTONE_TILES_BLOCK = registerBlock("dripstone_tiles_block",
            properties -> new Block(Blocks.DRIPSTONE_BLOCK.properties()));
    public static final DeferredBlock<Block> DRIPSTONE_TILES_WALL = registerBlock("dripstone_tiles_wall",
            properties -> new WallBlock(ModBlocks.DRIPSTONE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DRIPSTONE_TILES_STAIRS = registerBlock("dripstone_tiles_stairs",
            properties -> new StairBlock(ModBlocks.DRIPSTONE_TILES_BLOCK.get().defaultBlockState(),
                    ModBlocks.DRIPSTONE_TILES_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DRIPSTONE_TILES_SLAB = registerBlock("dripstone_tiles_slab",
            properties -> new SlabBlock(ModBlocks.DRIPSTONE_TILES_BLOCK.get().properties()));

    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE_BLOCK = registerBlock("smooth_deepslate_block",
            properties -> new Block(properties.strength(3.5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE_WALL = registerBlock("smooth_deepslate_wall",
            properties -> new WallBlock(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE_STAIRS = registerBlock("smooth_deepslate_stairs",
            properties -> new StairBlock(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get().defaultBlockState(),
                    ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SMOOTH_DEEPSLATE_SLAB = registerBlock("smooth_deepslate_slab",
            properties -> new SlabBlock(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get().properties()));

    public static final DeferredBlock<Block> SANDSTONE_BRICKS_BLOCK = registerBlock("sandstone_bricks_block",
            properties -> new Block(Blocks.SANDSTONE.properties()));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS_WALL = registerBlock("sandstone_bricks_wall",
            properties -> new WallBlock(ModBlocks.SANDSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS_STAIRS = registerBlock("sandstone_bricks_stairs",
            properties -> new StairBlock(ModBlocks.SANDSTONE_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.SANDSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SANDSTONE_BRICKS_SLAB = registerBlock("sandstone_bricks_slab",
            properties -> new SlabBlock(ModBlocks.SANDSTONE_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS_BLOCK = registerBlock("red_sandstone_bricks_block",
            properties -> new Block(Blocks.RED_SANDSTONE.properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS_WALL = registerBlock("red_sandstone_bricks_wall",
            properties -> new WallBlock(ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS_STAIRS = registerBlock("red_sandstone_bricks_stairs",
            properties -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS_SLAB = registerBlock("red_sandstone_bricks_slab",
            properties -> new SlabBlock(ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> DRIPSTONE_BRICKS_BLOCK = registerBlock("dripstone_bricks_block",
            properties -> new Block(Blocks.DRIPSTONE_BLOCK.properties()));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS_WALL = registerBlock("dripstone_bricks_wall",
            properties -> new WallBlock(ModBlocks.DRIPSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS_STAIRS = registerBlock("dripstone_bricks_stairs",
            properties -> new StairBlock(ModBlocks.DRIPSTONE_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.DRIPSTONE_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS_SLAB = registerBlock("dripstone_bricks_slab",
            properties -> new SlabBlock(ModBlocks.DRIPSTONE_BRICKS_BLOCK.get().properties()));


    public static final DeferredBlock<Block> PURPUR_PILLAR_WALL = registerBlock("purpur_pillar_wall",
            properties -> new WallBlock(Blocks.PURPUR_PILLAR.properties()));
    public static final DeferredBlock<Block> PURPUR_PILLAR_STAIRS = registerBlock("purpur_pillar_stairs",
            properties -> new StairBlock(Blocks.PURPUR_PILLAR.defaultBlockState(),
                    Blocks.PURPUR_PILLAR.properties()));
    public static final DeferredBlock<Block> PURPUR_PILLAR_SLAB = registerBlock("purpur_pillar_slab",
            properties -> new SlabBlock(Blocks.PURPUR_PILLAR.properties()));

    public static final DeferredBlock<Block> SANDSTONE_PILLAR_BLOCK = registerBlock("sandstone_pillar_block",
            properties -> new RotatedPillarBlock(Blocks.SANDSTONE.properties()));
    public static final DeferredBlock<Block> SANDSTONE_PILLAR_WALL = registerBlock("sandstone_pillar_wall",
            properties -> new WallBlock(ModBlocks.SANDSTONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SANDSTONE_PILLAR_STAIRS = registerBlock("sandstone_pillar_stairs",
            properties -> new StairBlock(ModBlocks.SANDSTONE_PILLAR_BLOCK.get().defaultBlockState(),
                    ModBlocks.SANDSTONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> SANDSTONE_PILLAR_SLAB = registerBlock("sandstone_pillar_slab",
            properties -> new SlabBlock(ModBlocks.SANDSTONE_PILLAR_BLOCK.get().properties()));

    public static final DeferredBlock<Block> RED_SANDSTONE_PILLAR_BLOCK = registerBlock("red_sandstone_pillar_block",
            properties -> new RotatedPillarBlock(Blocks.RED_SANDSTONE.properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_PILLAR_WALL = registerBlock("red_sandstone_pillar_wall",
            properties -> new WallBlock(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_PILLAR_STAIRS = registerBlock("red_sandstone_pillar_stairs",
            properties -> new StairBlock(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get().defaultBlockState(),
                    ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> RED_SANDSTONE_PILLAR_SLAB = registerBlock("red_sandstone_pillar_slab",
            properties -> new SlabBlock(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get().properties()));

    public static final DeferredBlock<Block> END_STONE_PILLAR_BLOCK = registerBlock("end_stone_pillar_block",
            properties -> new RotatedPillarBlock(Blocks.END_STONE.properties()));
    public static final DeferredBlock<Block> END_STONE_PILLAR_WALL = registerBlock("end_stone_pillar_wall",
            properties -> new WallBlock(ModBlocks.END_STONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> END_STONE_PILLAR_STAIRS = registerBlock("end_stone_pillar_stairs",
            properties -> new StairBlock(ModBlocks.END_STONE_PILLAR_BLOCK.get().defaultBlockState(),
                    ModBlocks.END_STONE_PILLAR_BLOCK.get().properties()));
    public static final DeferredBlock<Block> END_STONE_PILLAR_SLAB = registerBlock("end_stone_pillar_slab",
            properties -> new SlabBlock(ModBlocks.END_STONE_PILLAR_BLOCK.get().properties()));

    public static final DeferredBlock<Block> POLISHED_END_STONE_BLOCK = registerBlock("polished_end_stone_block",
            properties -> new RotatedPillarBlock(Blocks.END_STONE.properties()));
    public static final DeferredBlock<Block> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            properties -> new WallBlock(ModBlocks.POLISHED_END_STONE_BLOCK.get().properties()));
    public static final DeferredBlock<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_END_STONE_BLOCK.get().defaultBlockState(),
                    ModBlocks.POLISHED_END_STONE_BLOCK.get().properties()));
    public static final DeferredBlock<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            properties -> new SlabBlock(ModBlocks.POLISHED_END_STONE_BLOCK.get().properties()));




    public static final DeferredBlock<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            properties -> new WallBlock(Blocks.TERRACOTTA.properties()));
    public static final DeferredBlock<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            properties -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),
                    Blocks.TERRACOTTA.properties()));
    public static final DeferredBlock<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            properties -> new SlabBlock(Blocks.TERRACOTTA.properties()));

    public static final DeferredBlock<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.white().properties()));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.white().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.white().properties()));
    public static final DeferredBlock<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.white().properties()));

    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.lightGray().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.lightGray().properties()));

    public static final DeferredBlock<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.gray().properties()));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.gray().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.gray().properties()));
    public static final DeferredBlock<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.gray().properties()));

    public static final DeferredBlock<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.black().properties()));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.black().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.black().properties()));
    public static final DeferredBlock<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.black().properties()));

    public static final DeferredBlock<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.brown().properties()));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.brown().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.brown().properties()));
    public static final DeferredBlock<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.brown().properties()));

    public static final DeferredBlock<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.red().properties()));
    public static final DeferredBlock<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.red().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.red().properties()));
    public static final DeferredBlock<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.red().properties()));

    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.orange().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.orange().properties()));

    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.yellow().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.yellow().properties()));

    public static final DeferredBlock<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.lime().properties()));
    public static final DeferredBlock<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.lime().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.lime().properties()));
    public static final DeferredBlock<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.lime().properties()));

    public static final DeferredBlock<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.green().properties()));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.green().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.green().properties()));
    public static final DeferredBlock<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.green().properties()));

    public static final DeferredBlock<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.cyan().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.cyan().properties()));

    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.lightBlue().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.lightBlue().properties()));

    public static final DeferredBlock<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.blue().properties()));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.blue().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.blue().properties()));
    public static final DeferredBlock<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.blue().properties()));

    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.purple().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.purple().properties()));

    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.magenta().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.magenta().properties()));

    public static final DeferredBlock<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            properties -> new WallBlock(Blocks.DYED_TERRACOTTA.pink().properties()));
    public static final DeferredBlock<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            properties -> new StairBlock(Blocks.DYED_TERRACOTTA.pink().defaultBlockState(),
                    Blocks.DYED_TERRACOTTA.pink().properties()));
    public static final DeferredBlock<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            properties -> new SlabBlock(Blocks.DYED_TERRACOTTA.pink().properties()));
    

    public static final DeferredBlock<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.white().properties()));
    public static final DeferredBlock<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(),
                    Blocks.CONCRETE.white().properties()));
    public static final DeferredBlock<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.white().properties()));

    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lightGray().defaultBlockState(),
                    Blocks.CONCRETE.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.lightGray().properties()));

    public static final DeferredBlock<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.gray().properties()));
    public static final DeferredBlock<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.gray().defaultBlockState(),
                    Blocks.CONCRETE.gray().properties()));
    public static final DeferredBlock<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.gray().properties()));

    public static final DeferredBlock<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.black().properties()));
    public static final DeferredBlock<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.black().defaultBlockState(),
                    Blocks.CONCRETE.black().properties()));
    public static final DeferredBlock<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.black().properties()));

    public static final DeferredBlock<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.brown().properties()));
    public static final DeferredBlock<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.brown().defaultBlockState(),
                    Blocks.CONCRETE.brown().properties()));
    public static final DeferredBlock<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.brown().properties()));

    public static final DeferredBlock<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.red().properties()));
    public static final DeferredBlock<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.red().defaultBlockState(),
                    Blocks.CONCRETE.red().properties()));
    public static final DeferredBlock<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.red().properties()));

    public static final DeferredBlock<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.orange().defaultBlockState(),
                    Blocks.CONCRETE.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.orange().properties()));

    public static final DeferredBlock<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.yellow().defaultBlockState(),
                    Blocks.CONCRETE.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.yellow().properties()));

    public static final DeferredBlock<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.lime().properties()));
    public static final DeferredBlock<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lime().defaultBlockState(),
                    Blocks.CONCRETE.lime().properties()));
    public static final DeferredBlock<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.lime().properties()));

    public static final DeferredBlock<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.green().properties()));
    public static final DeferredBlock<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.green().defaultBlockState(),
                    Blocks.CONCRETE.green().properties()));
    public static final DeferredBlock<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.green().properties()));

    public static final DeferredBlock<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.cyan().defaultBlockState(),
                    Blocks.CONCRETE.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.cyan().properties()));

    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lightBlue().defaultBlockState(),
                    Blocks.CONCRETE.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.lightBlue().properties()));

    public static final DeferredBlock<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.blue().properties()));
    public static final DeferredBlock<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.blue().defaultBlockState(),
                    Blocks.CONCRETE.blue().properties()));
    public static final DeferredBlock<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.blue().properties()));

    public static final DeferredBlock<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.purple().defaultBlockState(),
                    Blocks.CONCRETE.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.purple().properties()));

    public static final DeferredBlock<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.magenta().defaultBlockState(),
                    Blocks.CONCRETE.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.magenta().properties()));

    public static final DeferredBlock<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(Blocks.CONCRETE.pink().properties()));
    public static final DeferredBlock<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.pink().defaultBlockState(),
                    Blocks.CONCRETE.pink().properties()));
    public static final DeferredBlock<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(Blocks.CONCRETE.pink().properties()));

    
    public static final DeferredBlock<Block> WHITE_WOOL_WALL = registerBlock("white_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.white().properties()));
    public static final DeferredBlock<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(),
                    Blocks.WOOL.white().properties()));
    public static final DeferredBlock<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.white().properties()));

    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.lightGray().defaultBlockState(),
                    Blocks.WOOL.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.lightGray().properties()));

    public static final DeferredBlock<Block> GRAY_WOOL_WALL = registerBlock("gray_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.gray().properties()));
    public static final DeferredBlock<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.gray().defaultBlockState(),
                    Blocks.WOOL.gray().properties()));
    public static final DeferredBlock<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.gray().properties()));

    public static final DeferredBlock<Block> BLACK_WOOL_WALL = registerBlock("black_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.black().properties()));
    public static final DeferredBlock<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.black().defaultBlockState(),
                    Blocks.WOOL.black().properties()));
    public static final DeferredBlock<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.black().properties()));

    public static final DeferredBlock<Block> BROWN_WOOL_WALL = registerBlock("brown_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.brown().properties()));
    public static final DeferredBlock<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.brown().defaultBlockState(),
                    Blocks.WOOL.brown().properties()));
    public static final DeferredBlock<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.brown().properties()));

    public static final DeferredBlock<Block> RED_WOOL_WALL = registerBlock("red_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.red().properties()));
    public static final DeferredBlock<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.red().defaultBlockState(),
                    Blocks.WOOL.red().properties()));
    public static final DeferredBlock<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.red().properties()));

    public static final DeferredBlock<Block> ORANGE_WOOL_WALL = registerBlock("orange_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.orange().defaultBlockState(),
                    Blocks.WOOL.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.orange().properties()));

    public static final DeferredBlock<Block> YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.yellow().defaultBlockState(),
                    Blocks.WOOL.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.yellow().properties()));

    public static final DeferredBlock<Block> LIME_WOOL_WALL = registerBlock("lime_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.lime().properties()));
    public static final DeferredBlock<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.lime().defaultBlockState(),
                    Blocks.WOOL.lime().properties()));
    public static final DeferredBlock<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.lime().properties()));

    public static final DeferredBlock<Block> GREEN_WOOL_WALL = registerBlock("green_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.green().properties()));
    public static final DeferredBlock<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.green().defaultBlockState(),
                    Blocks.WOOL.green().properties()));
    public static final DeferredBlock<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.green().properties()));

    public static final DeferredBlock<Block> CYAN_WOOL_WALL = registerBlock("cyan_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.cyan().defaultBlockState(),
                    Blocks.WOOL.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.cyan().properties()));

    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.lightBlue().defaultBlockState(),
                    Blocks.WOOL.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.lightBlue().properties()));

    public static final DeferredBlock<Block> BLUE_WOOL_WALL = registerBlock("blue_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.blue().properties()));
    public static final DeferredBlock<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.blue().defaultBlockState(),
                    Blocks.WOOL.blue().properties()));
    public static final DeferredBlock<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.blue().properties()));

    public static final DeferredBlock<Block> PURPLE_WOOL_WALL = registerBlock("purple_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.purple().defaultBlockState(),
                    Blocks.WOOL.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.purple().properties()));

    public static final DeferredBlock<Block> MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.magenta().defaultBlockState(),
                    Blocks.WOOL.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.magenta().properties()));

    public static final DeferredBlock<Block> PINK_WOOL_WALL = registerBlock("pink_wool_wall",
            properties -> new WallBlock(Blocks.WOOL.pink().properties()));
    public static final DeferredBlock<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.pink().defaultBlockState(),
                    Blocks.WOOL.pink().properties()));
    public static final DeferredBlock<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            properties -> new SlabBlock(Blocks.WOOL.pink().properties()));

    public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.white().properties()));
    public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.white().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.white().properties()));
    public static final DeferredBlock<Block> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.white().properties()));

    public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.lightGray().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.lightGray().properties()));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.lightGray().properties()));

    public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.gray().properties()));
    public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.gray().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.gray().properties()));
    public static final DeferredBlock<Block> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.gray().properties()));

    public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.black().properties()));
    public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.black().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.black().properties()));
    public static final DeferredBlock<Block> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.black().properties()));

    public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.brown().properties()));
    public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.brown().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.brown().properties()));
    public static final DeferredBlock<Block> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.brown().properties()));

    public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.red().properties()));
    public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.red().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.red().properties()));
    public static final DeferredBlock<Block> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.red().properties()));

    public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.orange().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.orange().properties()));
    public static final DeferredBlock<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.orange().properties()));

    public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.yellow().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.yellow().properties()));
    public static final DeferredBlock<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.yellow().properties()));

    public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.lime().properties()));
    public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.lime().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.lime().properties()));
    public static final DeferredBlock<Block> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.lime().properties()));

    public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.green().properties()));
    public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.green().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.green().properties()));
    public static final DeferredBlock<Block> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.green().properties()));

    public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.cyan().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.cyan().properties()));
    public static final DeferredBlock<Block> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.cyan().properties()));

    public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.lightBlue().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.lightBlue().properties()));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.lightBlue().properties()));

    public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.blue().properties()));
    public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.blue().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.blue().properties()));
    public static final DeferredBlock<Block> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.blue().properties()));

    public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.purple().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.purple().properties()));
    public static final DeferredBlock<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.purple().properties()));

    public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.magenta().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.magenta().properties()));
    public static final DeferredBlock<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.magenta().properties()));

    public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            properties -> new WallBlock(Blocks.GLAZED_TERRACOTTA.pink().properties()));
    public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.pink().defaultBlockState(),
                    Blocks.GLAZED_TERRACOTTA.pink().properties()));
    public static final DeferredBlock<Block> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            properties -> new SlabBlock(Blocks.GLAZED_TERRACOTTA.pink().properties()));


    public static final DeferredBlock<Block> PURPUR_BRICKS_BLOCK = registerBlock("purpur_bricks_block",
            properties -> new RotatedPillarBlock(properties.strength(1.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> PURPUR_BRICKS_WALL = registerBlock("purpur_bricks_wall",
            properties -> new WallBlock(ModBlocks.PURPUR_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> PURPUR_BRICKS_STAIRS = registerBlock("purpur_bricks_stairs",
            properties -> new StairBlock(ModBlocks.PURPUR_BRICKS_BLOCK.get().defaultBlockState(),
                    ModBlocks.PURPUR_BRICKS_BLOCK.get().properties()));
    public static final DeferredBlock<Block> PURPUR_BRICKS_SLAB = registerBlock("purpur_bricks_slab",
            properties -> new SlabBlock(ModBlocks.PURPUR_BRICKS_BLOCK.get().properties()));

    public static final DeferredBlock<Block> MUD_WALL = registerBlock("mud_wall",
            properties -> new WallBlock(Blocks.MUD.properties()));
    public static final DeferredBlock<Block> MUD_STAIRS = registerBlock("mud_stairs",
            properties -> new StairBlock(Blocks.MUD.defaultBlockState(),
                    Blocks.MUD.properties()));
    public static final DeferredBlock<Block> MUD_SLAB = registerBlock("mud_slab",
            properties -> new SlabBlock(Blocks.MUD.properties()));


    public static final DeferredBlock<Block> CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(Blocks.CALCITE.properties()));
    public static final DeferredBlock<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(),
                    Blocks.CALCITE.properties()));
    public static final DeferredBlock<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(Blocks.CALCITE.properties()));

    public static final DeferredBlock<Block> OBSIDIAN_WALL = registerBlock("obsidian_wall",
            properties -> new WallBlock(Blocks.OBSIDIAN.properties()));
    public static final DeferredBlock<Block> OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            properties -> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(),
                    Blocks.OBSIDIAN.properties()));
    public static final DeferredBlock<Block> OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            properties -> new SlabBlock(Blocks.OBSIDIAN.properties()));

    public static final DeferredBlock<Block> CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall",
            properties -> new WallBlock(Blocks.CRYING_OBSIDIAN.properties()));
    public static final DeferredBlock<Block> CRYING_OBSIDIAN_STAIRS = registerBlock("crying_obsidian_stairs",
            properties -> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(),
                    Blocks.CRYING_OBSIDIAN.properties()));
    public static final DeferredBlock<Block> CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab",
            properties -> new SlabBlock(Blocks.CRYING_OBSIDIAN.properties()));

    public static final DeferredBlock<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            properties -> new WallBlock(Blocks.DEEPSLATE.properties()));
    public static final DeferredBlock<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            properties -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),
                    Blocks.DEEPSLATE.properties()));
    public static final DeferredBlock<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            properties -> new SlabBlock(Blocks.DEEPSLATE.properties()));







    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function, Component... components) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn, components);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Component... components) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                for (var component : components) {
                    builder.accept(component);
                }
                super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            }
        });
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register (IEventBus eventBus) { BLOCKS.register(eventBus); }
}