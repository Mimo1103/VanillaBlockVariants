package net.mim0.vanillablockvariants.datagen;

import net.mim0.vanillablockvariants.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "VanillaVariants Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BLOCK.get(), Blocks.PRISMARINE_BRICKS);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PRISMARINE_BLOCK.get(), Ingredient.of(Blocks.PRISMARINE))
                .unlockedBy(getHasName(Blocks.PRISMARINE),has(Blocks.PRISMARINE))
                .group("prismarine")
                .save(output, "vanillavariants:chiseled_prismarine_block_from_prismarine_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR_BLOCK.get(), Blocks.PURPUR_BLOCK);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PURPUR_BLOCK.get(), Ingredient.of(Blocks.PURPUR_BLOCK))
                .unlockedBy(getHasName(Blocks.PURPUR_BLOCK),has(Blocks.PURPUR_BLOCK))
                .group("purpur")
                .save(output, "vanillavariants:chiseled_purpur_block_from_purpur_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BLOCK.get(), Blocks.GRANITE);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE_BLOCK.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite")
                .save(output, "vanillavariants:chiseled_granite_block_from_granite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BLOCK.get(), Blocks.ANDESITE);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BLOCK.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite")
                .save(output, "vanillavariants:chiseled_andesite_block_from_andesite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BLOCK.get(), Blocks.DIORITE);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIORITE_BLOCK.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite")
                .save(output, "vanillavariants:chiseled_diorite_block_from_diorite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL.get(), Ingredient.of(Blocks.DARK_PRISMARINE))
                .unlockedBy(getHasName(Blocks.DARK_PRISMARINE),has(Blocks.DARK_PRISMARINE))
                .group("dark_prismarine")
                .save(output, "vanillavariants:dark_prismarine_wall_from_dark_prismarine_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get(), Blocks.PURPUR_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL.get(), Ingredient.of(Blocks.PURPUR_BLOCK))
                .unlockedBy(getHasName(Blocks.PURPUR_BLOCK),has(Blocks.PURPUR_BLOCK))
                .group("purpur")
                .save(output, "vanillavariants:purpur_wall_from_purpur_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.POLISHED_GRANITE),has(Blocks.POLISHED_GRANITE))
                .group("granite")
                .save(output, "vanillavariants:granite_wall_from_polished_granite_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE),has(Blocks.POLISHED_ANDESITE))
                .group("andesite")
                .save(output, "vanillavariants:andesite_wall_from_polished_andesite_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.POLISHED_DIORITE),has(Blocks.POLISHED_DIORITE))
                .group("diorite")
                .save(output, "vanillavariants:diorite_wall_from_polished_diorite_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(), Ingredient.of(Blocks.SMOOTH_STONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_STONE),has(Blocks.SMOOTH_STONE))
                .group("smooth_stone")
                .save(output, "vanillavariants:smooth_stone_wall_from_smooth_stone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get(), Blocks.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get(), Blocks.SANDSTONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL.get(), Ingredient.of(Blocks.CUT_SANDSTONE))
                .unlockedBy(getHasName(Blocks.CUT_SANDSTONE),has(Blocks.CUT_SANDSTONE))
                .group("cut_sandstone")
                .save(output, "vanillavariants:cut_sandstone_wall_from_cut_sandstone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.RED_SANDSTONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL.get(), Ingredient.of(Blocks.CUT_RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.CUT_RED_SANDSTONE),has(Blocks.CUT_RED_SANDSTONE))
                .group("cut_red_sandstone")
                .save(output, "vanillavariants:cut_red_sandstone_wall_from_cut_red_sandstone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get(), Blocks.STONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL.get(), Ingredient.of(Blocks.STONE))
                .unlockedBy(getHasName(Blocks.STONE),has(Blocks.STONE))
                .group("stone")
                .save(output, "vanillavariants:stone_wall_from_stone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get(), Blocks.SMOOTH_SANDSTONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL.get(), Ingredient.of(Blocks.SMOOTH_SANDSTONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_SANDSTONE),has(Blocks.SMOOTH_SANDSTONE))
                .group("smooth_sandstone")
                .save(output, "vanillavariants:smooth_sandstone_wall_from_smooth_sandstone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), Blocks.SMOOTH_RED_SANDSTONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_RED_SANDSTONE),has(Blocks.SMOOTH_RED_SANDSTONE))
                .group("smooth_red_sandstone")
                .save(output, "vanillavariants:smooth_red_sandstone_wall_from_smooth_red_sandstone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get(), Blocks.QUARTZ_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL.get(), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK),has(Blocks.QUARTZ_BLOCK))
                .group("quartz")
                .save(output, "vanillavariants:quartz_wall_from_quartz_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get(), Blocks.SMOOTH_QUARTZ);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL.get(), Ingredient.of(Blocks.SMOOTH_QUARTZ))
                .unlockedBy(getHasName(Blocks.SMOOTH_QUARTZ),has(Blocks.SMOOTH_QUARTZ))
                .group("smooth_quartz")
                .save(output, "vanillavariants:smooth_quartz_wall_from_smooth_quartz_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE);
        stairBuilder(ModBlocks.SMOOTH_STONE_STAIRS.get(), Ingredient.of(Blocks.SMOOTH_STONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_STONE),has(Blocks.SMOOTH_STONE))
                .group("smooth_stone")
                .save(output, "vanillavariants:smooth_stone_stairs_from_smooth_stone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.CUT_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.SANDSTONE);
        stairBuilder(ModBlocks.CUT_SANDSTONE_STAIRS.get(), Ingredient.of(Blocks.CUT_SANDSTONE))
                .unlockedBy(getHasName(Blocks.CUT_SANDSTONE),has(Blocks.CUT_SANDSTONE))
                .group("cut_sandstone")
                .save(output, "vanillavariants:cut_sandstone_stair_from_cut_sandstone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.CUT_RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.RED_SANDSTONE);
        stairBuilder(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Ingredient.of(Blocks.CUT_RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.CUT_RED_SANDSTONE),has(Blocks.CUT_RED_SANDSTONE))
                .group("cut_red_sandstone")
                .save(output, "vanillavariants:cut_red_sandstone_stairs_from_cut_red_sandstone_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get(), Ingredient.of(Blocks.NETHERRACK))
                .unlockedBy(getHasName(Blocks.NETHERRACK),has(Blocks.NETHERRACK))
                .group("netherrack")
                .save(output, "vanillavariants:netherrack_wall_from_netherrack_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get(), Blocks.NETHERRACK);
        stairBuilder(ModBlocks.NETHERRACK_STAIRS.get(), Ingredient.of(Blocks.NETHERRACK))
                .unlockedBy(getHasName(Blocks.NETHERRACK),has(Blocks.NETHERRACK))
                .group("netherrack")
                .save(output, "vanillavariants:netherrack_stairs_from_netherrack_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(), Blocks.NETHERRACK);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(), Ingredient.of(Blocks.NETHERRACK))
                .unlockedBy(getHasName(Blocks.NETHERRACK),has(Blocks.NETHERRACK))
                .group("netherrack")
                .save(output, "vanillavariants:netherrack_slab_from_netherrack_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get(), Blocks.END_STONE);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL.get(), Ingredient.of(Blocks.END_STONE))
                .unlockedBy(getHasName(Blocks.END_STONE),has(Blocks.END_STONE))
                .group("end_stone")
                .save(output, "vanillavariants:end_stone_wall_from_end_stone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS.get(), Blocks.END_STONE);
        stairBuilder(ModBlocks.END_STONE_STAIRS.get(), Ingredient.of(Blocks.END_STONE))
                .unlockedBy(getHasName(Blocks.END_STONE),has(Blocks.END_STONE))
                .group("end_stone")
                .save(output, "vanillavariants:end_stone_stairs_from_end_stone_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(), Blocks.END_STONE);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB.get(), Ingredient.of(Blocks.END_STONE))
                .unlockedBy(getHasName(Blocks.END_STONE),has(Blocks.END_STONE))
                .group("end_stone")
                .save(output, "vanillavariants:end_stone_slab_from_end_stone_block");

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL)
                .requires(ModBlocks.MUD_WALL, 1)
                .requires(Items.WHEAT, 1)
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_wall_from_mud_wall_and_wheat");
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS)
                .requires(ModBlocks.MUD_STAIRS, 1)
                .requires(Items.WHEAT, 1)
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_stairs_from_mud_stairs_and_wheat");
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB)
                .requires(ModBlocks.MUD_SLAB, 1)
                .requires(Items.WHEAT, 1)
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_slab_from_mud_slab_and_wheat");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL.get(), Ingredient.of(Blocks.PACKED_MUD))
                .unlockedBy(getHasName(Blocks.PACKED_MUD),has(Blocks.PACKED_MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_wall_from_packed_mud_block");
        stairBuilder(ModBlocks.PACKED_MUD_STAIRS.get(), Ingredient.of(Blocks.PACKED_MUD))
                .unlockedBy(getHasName(Blocks.PACKED_MUD),has(Blocks.PACKED_MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_stairs_from_packed_mud_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB.get(), Ingredient.of(Blocks.PACKED_MUD))
                .unlockedBy(getHasName(Blocks.PACKED_MUD),has(Blocks.PACKED_MUD))
                .group("packed_mud")
                .save(output, "vanillavariants:packed_mud_slab_from_packed_mud_block");

        smeltingResultFromBase(Blocks.BRICK_WALL, ModBlocks.CLAY_WALL);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_WALL.get(), Ingredient.of(Blocks.CLAY))
                .unlockedBy(getHasName(Blocks.CLAY),has(Blocks.CLAY))
                .group("clay")
                .save(output, "vanillavariants:clay_wall_from_clay_block");
        smeltingResultFromBase(Blocks.BRICK_STAIRS, ModBlocks.CLAY_STAIRS);
        stairBuilder(ModBlocks.CLAY_STAIRS.get(), Ingredient.of(Blocks.CLAY))
                .unlockedBy(getHasName(Blocks.CLAY),has(Blocks.CLAY))
                .group("clay")
                .save(output, "vanillavariants:clay_stairs_from_clay_block");
        smeltingResultFromBase(Blocks.BRICK_SLAB, ModBlocks.CLAY_SLAB);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_SLAB.get(), Ingredient.of(Blocks.CLAY))
                .unlockedBy(getHasName(Blocks.CLAY),has(Blocks.CLAY))
                .group("clay")
                .save(output, "vanillavariants:clay_slab_from_clay_block");

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RESIN_WALL.get(), Ingredient.of(Blocks.RESIN_BLOCK))
                .unlockedBy(getHasName(Blocks.RESIN_BLOCK),has(Blocks.RESIN_BLOCK))
                .group("resin")
                .save(output, "vanillavariants:resin_wall_from_resin_block");
        stairBuilder(ModBlocks.RESIN_STAIRS.get(), Ingredient.of(Blocks.RESIN_BLOCK))
                .unlockedBy(getHasName(Blocks.RESIN_BLOCK),has(Blocks.RESIN_BLOCK))
                .group("resin")
                .save(output, "vanillavariants:resin_stairs_from_resin_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RESIN_SLAB.get(), Ingredient.of(Blocks.RESIN_BLOCK))
                .unlockedBy(getHasName(Blocks.RESIN_BLOCK),has(Blocks.RESIN_BLOCK))
                .group("resin")
                .save(output, "vanillavariants:resin_slab_from_resin_block");

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL.get(), Ingredient.of(Blocks.PRISMARINE_BRICKS))
                .unlockedBy(getHasName(Blocks.PRISMARINE_BRICKS),has(Blocks.PRISMARINE_BRICKS))
                .group("prismarine_bricks")
                .save(output, "vanillavariants:prismarine_brick_wall_from_prismarine_bricks");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_WALL.get(), Blocks.POLISHED_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_WALL.get(), Blocks.BASALT);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_WALL.get(), Ingredient.of(Blocks.POLISHED_BASALT))
                .unlockedBy(getHasName(Blocks.POLISHED_BASALT),has(Blocks.POLISHED_BASALT))
                .group("polished_basalt")
                .save(output, "vanillavariants:polished_basalt_wall_from_polished_basalt_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_STAIRS.get(), Blocks.POLISHED_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_STAIRS.get(), Blocks.BASALT);
        stairBuilder(ModBlocks.POLISHED_BASALT_STAIRS.get(), Ingredient.of(Blocks.POLISHED_BASALT))
                .unlockedBy(getHasName(Blocks.POLISHED_BASALT),has(Blocks.POLISHED_BASALT))
                .group("polished_basalt")
                .save(output, "vanillavariants:polished_basalt_stairs_from_polished_basalt_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_SLAB.get(), Blocks.POLISHED_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_SLAB.get(), Blocks.BASALT);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BASALT_SLAB.get(), Ingredient.of(Blocks.POLISHED_BASALT))
                .unlockedBy(getHasName(Blocks.POLISHED_BASALT),has(Blocks.POLISHED_BASALT))
                .group("polished_basalt")
                .save(output, "vanillavariants:polished_basalt_slab_from_polished_basalt_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS.get(), Blocks.SMOOTH_BASALT);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(), Blocks.SMOOTH_BASALT);
        smeltingResultFromBase(ModBlocks.SMOOTH_BASALT_WALL, ModBlocks.BASALT_WALL);
        smeltingResultFromBase(ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.BASALT_STAIRS);
        smeltingResultFromBase(ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.BASALT_SLAB);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get(), Ingredient.of(Blocks.SMOOTH_BASALT))
                .unlockedBy(getHasName(Blocks.SMOOTH_BASALT),has(Blocks.SMOOTH_BASALT))
                .group("smooth_basalt")
                .save(output, "vanillavariants:smooth_basalt_wall_from_smooth_basalt_block");
        stairBuilder(ModBlocks.SMOOTH_BASALT_STAIRS.get(), Ingredient.of(Blocks.SMOOTH_BASALT))
                .unlockedBy(getHasName(Blocks.SMOOTH_BASALT),has(Blocks.SMOOTH_BASALT))
                .group("smooth_basalt")
                .save(output, "vanillavariants:smooth_basalt_stairs_from_smooth_basalt_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(), Ingredient.of(Blocks.SMOOTH_BASALT))
                .unlockedBy(getHasName(Blocks.SMOOTH_BASALT),has(Blocks.SMOOTH_BASALT))
                .group("smooth_basalt")
                .save(output, "vanillavariants:smooth_basalt_slab_from_smooth_basalt_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_WALL.get(), Blocks.QUARTZ_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_WALL.get(), Blocks.QUARTZ_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_WALL.get(), Ingredient.of(Blocks.QUARTZ_PILLAR))
                .unlockedBy(getHasName(Blocks.QUARTZ_PILLAR),has(Blocks.QUARTZ_PILLAR))
                .group("quartz_pillar")
                .save(output, "vanillavariants:quartz_pillar_wall_from_quartz_pillar_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_STAIRS.get(), Blocks.QUARTZ_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_STAIRS.get(), Blocks.QUARTZ_BLOCK);
        stairBuilder(ModBlocks.QUARTZ_PILLAR_STAIRS.get(), Ingredient.of(Blocks.QUARTZ_PILLAR))
                .unlockedBy(getHasName(Blocks.QUARTZ_PILLAR),has(Blocks.QUARTZ_PILLAR))
                .group("quartz_pillar")
                .save(output, "vanillavariants:quartz_pillar_stairs_from_quartz_pillar_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_SLAB.get(), Blocks.QUARTZ_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_SLAB.get(), Blocks.QUARTZ_BLOCK);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR_SLAB.get(), Ingredient.of(Blocks.QUARTZ_PILLAR))
                .unlockedBy(getHasName(Blocks.QUARTZ_PILLAR),has(Blocks.QUARTZ_PILLAR))
                .group("quartz_pillar")
                .save(output, "vanillavariants:quartz_pillar_slab_from_quartz_pillar_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BLOCK.get(), Blocks.END_STONE);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_STONE_BLOCK.get(), Ingredient.of(Blocks.END_STONE))
                .unlockedBy(getHasName(Blocks.END_STONE),has(Blocks.END_STONE))
                .group("end_stone")
                .save(output, "vanillavariants:chiseled_end_stone_block_from_end_stone_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.weathering().unaffected());
        stairBuilder(ModBlocks.COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().unaffected()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().unaffected()),has(Blocks.COPPER_BLOCK.weathering().unaffected()))
                .group("copper")
                .save(output, "vanillavariants:copper_stairs_from_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_SLAB.get(), Blocks.COPPER_BLOCK.weathering().unaffected());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().unaffected()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().unaffected()),has(Blocks.COPPER_BLOCK.weathering().unaffected()))
                .group("copper")
                .save(output, "vanillavariants:copper_slab_from_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.weathering().exposed());
        stairBuilder(ModBlocks.EXPOSED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().exposed()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().exposed()),has(Blocks.COPPER_BLOCK.weathering().exposed()))
                .group("exposed_copper")
                .save(output, "vanillavariants:exposed_copper_stairs_from_exposed_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.weathering().exposed());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().exposed()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().exposed()),has(Blocks.COPPER_BLOCK.weathering().exposed()))
                .group("exposed_copper")
                .save(output, "vanillavariants:exposed_copper_slab_from_exposed_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.weathering().weathered());
        stairBuilder(ModBlocks.WEATHERED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().weathered()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().weathered()),has(Blocks.COPPER_BLOCK.weathering().weathered()))
                .group("weathered_copper")
                .save(output, "vanillavariants:weathered_copper_stairs_from_weathered_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.weathering().weathered());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().weathered()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().weathered()),has(Blocks.COPPER_BLOCK.weathering().weathered()))
                .group("weathered_copper")
                .save(output, "vanillavariants:weathered_copper_slab_from_weathered_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.weathering().oxidized());
        stairBuilder(ModBlocks.OXIDIZED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().oxidized()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().oxidized()),has(Blocks.COPPER_BLOCK.weathering().oxidized()))
                .group("oxidized_copper")
                .save(output, "vanillavariants:oxidized_copper_stairs_from_oxidized_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.weathering().oxidized());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.weathering().oxidized()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.weathering().oxidized()),has(Blocks.COPPER_BLOCK.weathering().oxidized()))
                .group("oxidized_copper")
                .save(output, "vanillavariants:oxidized_copper_slab_from_oxidized_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.waxed().unaffected());
        stairBuilder(ModBlocks.WAXED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().unaffected()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().unaffected()),has(Blocks.COPPER_BLOCK.waxed().unaffected()))
                .group("waxed_copper")
                .save(output, "vanillavariants:waxed_copper_stairs_from_waxed_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.waxed().unaffected());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().unaffected()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().unaffected()),has(Blocks.COPPER_BLOCK.waxed().unaffected()))
                .group("waxed_copper")
                .save(output, "vanillavariants:waxed_copper_slab_from_waxed_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.waxed().exposed());
        stairBuilder(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().exposed()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().exposed()),has(Blocks.COPPER_BLOCK.waxed().exposed()))
                .group("waxed_exposed_copper")
                .save(output, "vanillavariants:waxed_exposed_copper_stairs_from_waxed_exposed_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.waxed().exposed());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().exposed()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().exposed()),has(Blocks.COPPER_BLOCK.waxed().exposed()))
                .group("waxed_exposed_copper")
                .save(output, "vanillavariants:waxed_exposed_copper_slab_from_waxed_exposed_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.waxed().weathered());
        stairBuilder(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().weathered()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().weathered()),has(Blocks.COPPER_BLOCK.waxed().weathered()))
                .group("waxed_weathered_copper")
                .save(output, "vanillavariants:waxed_weathered_copper_stairs_from_waxed_weathered_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.waxed().weathered());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().weathered()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().weathered()),has(Blocks.COPPER_BLOCK.waxed().weathered()))
                .group("waxed_weathered_copper")
                .save(output, "vanillavariants:waxed_weathered_copper_slab_from_waxed_weathered_copper_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get(), Blocks.COPPER_BLOCK.waxed().oxidized());
        stairBuilder(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().oxidized()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().oxidized()),has(Blocks.COPPER_BLOCK.waxed().oxidized()))
                .group("waxed_oxidized_copper")
                .save(output, "vanillavariants:waxed_oxidized_copper_stairs_from_waxed_oxidized_copper_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(), Blocks.COPPER_BLOCK.waxed().oxidized());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(), Ingredient.of(Blocks.COPPER_BLOCK.waxed().oxidized()))
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK.waxed().oxidized()),has(Blocks.COPPER_BLOCK.waxed().oxidized()))
                .group("waxed_oxidized_copper")
                .save(output, "vanillavariants:waxed_oxidized_copper_slab_from_waxed_oxidized_copper_block");


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_BLOCK.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_WALL.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_WALL.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_STAIRS.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.GRANITE)
                .unlockedBy(getHasName(Blocks.GRANITE), has(Blocks.GRANITE))
                .group("granite_bricks")
                .save(output, "vanillavariants:granite_bricks_block_from_granite_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_WALL.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_bricks")
                .save(output, "vanillavariants:granite_bricks_wall_from_granite_block");
        stairBuilder(ModBlocks.GRANITE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_bricks")
                .save(output, "vanillavariants:granite_bricks_stairs_from_granite_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS_SLAB.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_bricks")
                .save(output, "vanillavariants:granite_bricks_slab_from_granite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_BLOCK.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_WALL.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_WALL.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_STAIRS.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.ANDESITE)
                .unlockedBy(getHasName(Blocks.ANDESITE), has(Blocks.ANDESITE))
                .group("andesite_bricks")
                .save(output, "vanillavariants:andesite_bricks_block_from_andesite_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_WALL.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_bricks")
                .save(output, "vanillavariants:andesite_bricks_wall_from_andesite_block");
        stairBuilder(ModBlocks.ANDESITE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_bricks")
                .save(output, "vanillavariants:andesite_bricks_stairs_from_andesite_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS_SLAB.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_bricks")
                .save(output, "vanillavariants:andesite_bricks_slab_from_andesite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_BLOCK.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_WALL.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_WALL.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_STAIRS.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.DIORITE)
                .unlockedBy(getHasName(Blocks.DIORITE), has(Blocks.DIORITE))
                .group("diorite_bricks")
                .save(output, "vanillavariants:diorite_bricks_block_from_diorite_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_WALL.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_bricks")
                .save(output, "vanillavariants:diorite_bricks_wall_from_diorite_block");
        stairBuilder(ModBlocks.DIORITE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_bricks")
                .save(output, "vanillavariants:diorite_bricks_stairs_from_diorite_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS_SLAB.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_bricks")
                .save(output, "vanillavariants:diorite_bricks_slab_from_diorite_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone")
                .save(output, "vanillavariants:dripstone_wall_from_dripstone_block");
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone")
                .save(output, "vanillavariants:dripstone_stairs_from_dripstone_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone")
                .save(output, "vanillavariants:dripstone_slab_from_dripstone_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_BLOCK.get(), Blocks.BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_WALL.get(), Blocks.BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_STAIRS.get(), Blocks.BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_SLAB.get(), Blocks.BRICKS);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.BRICKS)
                .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                .group("colored_bricks")
                .save(output, "vanillavariants:colored_bricks_block_from_colored_bricks_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_WALL.get(), Ingredient.of(Blocks.BRICKS))
                .unlockedBy(getHasName(Blocks.BRICKS),has(Blocks.BRICKS))
                .group("colored_bricks")
                .save(output, "vanillavariants:colored_bricks_wall_from_colored_bricks_block");
        stairBuilder(ModBlocks.COLORED_BRICKS_STAIRS.get(), Ingredient.of(Blocks.BRICKS))
                .unlockedBy(getHasName(Blocks.BRICKS),has(Blocks.BRICKS))
                .group("colored_bricks")
                .save(output, "vanillavariants:colored_bricks_stairs_from_colored_bricks_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COLORED_BRICKS_SLAB.get(), Ingredient.of(Blocks.BRICKS))
                .unlockedBy(getHasName(Blocks.BRICKS),has(Blocks.BRICKS))
                .group("colored_bricks")
                .save(output, "vanillavariants:colored_bricks_slab_from_colored_bricks_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_BLOCK.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_WALL.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_STAIRS.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_SLAB.get(), Blocks.GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_BLOCK.get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_WALL.get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_STAIRS.get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_SLAB.get(), Blocks.POLISHED_GRANITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_BLOCK.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_WALL.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_STAIRS.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_SLAB.get(), ModBlocks.GRANITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.GRANITE_TILES_BLOCK)
                .unlockedBy(getHasName(Blocks.GRANITE), has(Blocks.GRANITE))
                .group("granite_tiles")
                .save(output, "vanillavariants:granite_tiles_block_from_granite_tiles_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_WALL.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_tiles")
                .save(output, "vanillavariants:granite_tiles_wall_from_granite_tiles_block");
        stairBuilder(ModBlocks.GRANITE_TILES_STAIRS.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_tiles")
                .save(output, "vanillavariants:granite_tiles_stairs_from_granite_tiles_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILES_SLAB.get(), Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE),has(Blocks.GRANITE))
                .group("granite_tiles")
                .save(output, "vanillavariants:granite_tiles_slab_from_granite_tiles_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_BLOCK.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_WALL.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_STAIRS.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_SLAB.get(), Blocks.ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_BLOCK.get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_WALL.get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_STAIRS.get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_SLAB.get(), Blocks.POLISHED_ANDESITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_BLOCK.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_WALL.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_STAIRS.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_SLAB.get(), ModBlocks.ANDESITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.ANDESITE_TILES_BLOCK.get())
                .unlockedBy(getHasName(Blocks.ANDESITE), has(Blocks.ANDESITE))
                .group("andesite_tiles")
                .save(output, "vanillavariants:andesite_tiles_block_from_andesite_tiles_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_WALL.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_tiles")
                .save(output, "vanillavariants:andesite_tiles_wall_from_andesite_tiles_block");
        stairBuilder(ModBlocks.ANDESITE_TILES_STAIRS.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_tiles")
                .save(output, "vanillavariants:andesite_tiles_stairs_from_andesite_tiles_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_TILES_SLAB.get(), Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE),has(Blocks.ANDESITE))
                .group("andesite_tiles")
                .save(output, "vanillavariants:andesite_tiles_slab_from_andesite_tiles_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_BLOCK.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_WALL.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_STAIRS.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_SLAB.get(), Blocks.DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_BLOCK.get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_WALL.get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_STAIRS.get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_SLAB.get(), Blocks.POLISHED_DIORITE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_BLOCK.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_WALL.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_STAIRS.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_SLAB.get(), ModBlocks.DIORITE_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.DIORITE_TILES_BLOCK.get())
                .unlockedBy(getHasName(Blocks.DIORITE), has(Blocks.DIORITE))
                .group("diorite_tiles")
                .save(output, "vanillavariants:diorite_tiles_block_from_diorite_tiles_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_WALL.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_tiles")
                .save(output, "vanillavariants:diorite_tiles_wall_from_diorite_tiles_block");
        stairBuilder(ModBlocks.DIORITE_TILES_STAIRS.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_tiles")
                .save(output, "vanillavariants:diorite_tiles_stairs_from_diorite_tiles_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_TILES_SLAB.get(), Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE),has(Blocks.DIORITE))
                .group("diorite_tiles")
                .save(output, "vanillavariants:diorite_tiles_slab_from_diorite_tiles_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_BLOCK.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_WALL.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_STAIRS.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_WALL.get(), ModBlocks.DRIPSTONE_TILES_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_STAIRS.get(), ModBlocks.DRIPSTONE_TILES_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_SLAB.get(), ModBlocks.DRIPSTONE_TILES_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.DRIPSTONE_TILES_BLOCK)
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK), has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_tiles")
                .save(output, "vanillavariants:dripstone_tiles_block_from_dripstone_tiles_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_WALL.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_tiles")
                .save(output, "vanillavariants:dripstone_tiles_wall_from_dripstone_tiles_block");
        stairBuilder(ModBlocks.DRIPSTONE_TILES_STAIRS.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_tiles")
                .save(output, "vanillavariants:dripstone_tiles_stairs_from_dripstone_tiles_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILES_SLAB.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_tiles")
                .save(output, "vanillavariants:dripstone_tiles_slab_from_dripstone_tiles_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get(), Blocks.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get(), Blocks.DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get(), Blocks.DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get(), Blocks.POLISHED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), Blocks.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), Blocks.DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), Blocks.DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), Blocks.POLISHED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), Blocks.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), Blocks.DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), Blocks.DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), Blocks.POLISHED_DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), Blocks.DEEPSLATE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), Blocks.DEEPSLATE_BRICKS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), Blocks.DEEPSLATE_TILES);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), Blocks.POLISHED_DEEPSLATE);
        smeltingResultFromBase(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get(), Blocks.DEEPSLATE);
        smeltingResultFromBase(ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), ModBlocks.DEEPSLATE_WALL);
        smeltingResultFromBase(ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), ModBlocks.DEEPSLATE_STAIRS);
        smeltingResultFromBase(ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), ModBlocks.DEEPSLATE_SLAB);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.DEEPSLATE)
                .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                .group("smooth_deepslate")
                .save(output, "vanillavariants:smooth_deepslate_block_from_smooth_deepslate_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_WALL.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("smooth_deepslate")
                .save(output, "vanillavariants:smooth_deepslate_wall_from_smooth_deepslate_block");
        stairBuilder(ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("smooth_deepslate")
                .save(output, "vanillavariants:smooth_deepslate_stairs_from_smooth_deepslate_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DEEPSLATE_SLAB.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("smooth_deepslate")
                .save(output, "vanillavariants:smooth_deepslate_slab_from_smooth_deepslate_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_BLOCK.get(), Blocks.SANDSTONE);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.SANDSTONE)
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE))
                .group("sandstone_bricks")
                .save(output, "vanillavariants:sandstone_bricks_block_from_sandstone_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_WALL.get(), Ingredient.of(Blocks.SANDSTONE))
                .unlockedBy(getHasName(Blocks.SANDSTONE),has(Blocks.SANDSTONE))
                .group("sandstone_bricks")
                .save(output, "vanillavariants:sandstone_bricks_wall_from_sandstone_block");
        stairBuilder(ModBlocks.SANDSTONE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.SANDSTONE))
                .unlockedBy(getHasName(Blocks.SANDSTONE),has(Blocks.SANDSTONE))
                .group("sandstone_bricks")
                .save(output, "vanillavariants:sandstone_bricks_stairs_from_sandstone_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_SLAB.get(), Ingredient.of(Blocks.SANDSTONE))
                .unlockedBy(getHasName(Blocks.SANDSTONE),has(Blocks.SANDSTONE))
                .group("sandstone_bricks")
                .save(output, "vanillavariants:sandstone_bricks_slab_from_sandstone_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get(), Blocks.RED_SANDSTONE);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.RED_SANDSTONE)
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE))
                .group("red_sandstone_bricks")
                .save(output, "vanillavariants:red_sandstone_bricks_block_from_red_sandstone_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_WALL.get(), Ingredient.of(Blocks.RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE),has(Blocks.RED_SANDSTONE))
                .group("red_sandstone_bricks")
                .save(output, "vanillavariants:red_sandstone_bricks_wall_from_red_sandstone_block");
        stairBuilder(ModBlocks.SANDSTONE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE),has(Blocks.RED_SANDSTONE))
                .group("red_sandstone_bricks")
                .save(output, "vanillavariants:red_sandstone_bricks_stairs_from_red_sandstone_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICKS_SLAB.get(), Ingredient.of(Blocks.RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE),has(Blocks.RED_SANDSTONE))
                .group("red_sandstone_bricks")
                .save(output, "vanillavariants:red_sandstone_bricks_slab_from_red_sandstone_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_BLOCK.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_WALL.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_STAIRS.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_WALL.get(), ModBlocks.DRIPSTONE_BRICKS_BLOCK.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_STAIRS.get(), ModBlocks.DRIPSTONE_BRICKS_BLOCK.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_SLAB.get(), ModBlocks.DRIPSTONE_BRICKS_BLOCK.get());
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.DRIPSTONE_BLOCK)
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK), has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_bricks")
                .save(output, "vanillavariants:dripstone_bricks_block_from_dripstone_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_WALL.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_bricks")
                .save(output, "vanillavariants:dripstone_bricks_wall_from_dripstone_block");
        stairBuilder(ModBlocks.DRIPSTONE_BRICKS_STAIRS.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_bricks")
                .save(output, "vanillavariants:dripstone_bricks_stairs_from_dripstone_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICKS_SLAB.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK),has(Blocks.DRIPSTONE_BLOCK))
                .group("dripstone_bricks")
                .save(output, "vanillavariants:dripstone_bricks_slab_from_dripstone_block");





        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS.get(), Blocks.TERRACOTTA);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB.get(), Blocks.TERRACOTTA);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL.get(), Ingredient.of(Blocks.TERRACOTTA))
                .unlockedBy(getHasName(Blocks.TERRACOTTA),has(Blocks.TERRACOTTA))
                .group("terracotta")
                .save(output, "vanillavariants:terracotta_wall_from_terracotta_block");
        stairBuilder(ModBlocks.TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.TERRACOTTA))
                .unlockedBy(getHasName(Blocks.TERRACOTTA),has(Blocks.TERRACOTTA))
                .group("terracotta")
                .save(output, "vanillavariants:terracotta_stairs_from_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.TERRACOTTA))
                .unlockedBy(getHasName(Blocks.TERRACOTTA),has(Blocks.TERRACOTTA))
                .group("terracotta")
                .save(output, "vanillavariants:terracotta_slab_from_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.white());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.white()),has(Blocks.DYED_TERRACOTTA.white()))
                .group("white_terracotta")
                .save(output, "vanillavariants:white_terracotta_wall_from_white_terracotta_block");
        stairBuilder(ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.white()),has(Blocks.DYED_TERRACOTTA.white()))
                .group("white_terracotta")
                .save(output, "vanillavariants:white_terracotta_stairs_from_white_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.white()),has(Blocks.DYED_TERRACOTTA.white()))
                .group("white_terracotta")
                .save(output, "vanillavariants:white_terracotta_slab_from_white_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.lightGray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightGray()),has(Blocks.DYED_TERRACOTTA.lightGray()))
                .group("light_gray_terracotta")
                .save(output, "vanillavariants:light_gray_terracotta_wall_from_light_gray_terracotta_block");
        stairBuilder(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightGray()),has(Blocks.DYED_TERRACOTTA.lightGray()))
                .group("light_gray_terracotta")
                .save(output, "vanillavariants:light_gray_terracotta_stairs_from_light_gray_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightGray()),has(Blocks.DYED_TERRACOTTA.lightGray()))
                .group("light_gray_terracotta")
                .save(output, "vanillavariants:light_gray_terracotta_slab_from_light_gray_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.gray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.gray()),has(Blocks.DYED_TERRACOTTA.gray()))
                .group("gray_terracotta")
                .save(output, "vanillavariants:gray_terracotta_wall_from_gray_terracotta_block");
        stairBuilder(ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.gray()),has(Blocks.DYED_TERRACOTTA.gray()))
                .group("gray_terracotta")
                .save(output, "vanillavariants:gray_terracotta_stairs_from_gray_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.gray()),has(Blocks.DYED_TERRACOTTA.gray()))
                .group("gray_terracotta")
                .save(output, "vanillavariants:gray_terracotta_slab_from_gray_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.black());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.black()),has(Blocks.DYED_TERRACOTTA.black()))
                .group("black_terracotta")
                .save(output, "vanillavariants:black_terracotta_wall_from_black_terracotta_block");
        stairBuilder(ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.black()),has(Blocks.DYED_TERRACOTTA.black()))
                .group("black_terracotta")
                .save(output, "vanillavariants:black_terracotta_stairs_from_black_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.black()),has(Blocks.DYED_TERRACOTTA.black()))
                .group("black_terracotta")
                .save(output, "vanillavariants:black_terracotta_slab_from_black_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.brown());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.brown()),has(Blocks.DYED_TERRACOTTA.brown()))
                .group("brown_terracotta")
                .save(output, "vanillavariants:brown_terracotta_wall_from_brown_terracotta_block");
        stairBuilder(ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.brown()),has(Blocks.DYED_TERRACOTTA.brown()))
                .group("brown_terracotta")
                .save(output, "vanillavariants:brown_terracotta_stairs_from_brown_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.brown()),has(Blocks.DYED_TERRACOTTA.brown()))
                .group("brown_terracotta")
                .save(output, "vanillavariants:brown_terracotta_slab_from_brown_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.red());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.red()),has(Blocks.DYED_TERRACOTTA.red()))
                .group("red_terracotta")
                .save(output, "vanillavariants:red_terracotta_wall_from_red_terracotta_block");
        stairBuilder(ModBlocks.RED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.red()),has(Blocks.DYED_TERRACOTTA.red()))
                .group("red_terracotta")
                .save(output, "vanillavariants:red_terracotta_stairs_from_red_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.red()),has(Blocks.DYED_TERRACOTTA.red()))
                .group("red_terracotta")
                .save(output, "vanillavariants:red_terracotta_slab_from_red_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.orange());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.orange()),has(Blocks.DYED_TERRACOTTA.orange()))
                .group("orange_terracotta")
                .save(output, "vanillavariants:orange_terracotta_wall_from_orange_terracotta_block");
        stairBuilder(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.orange()),has(Blocks.DYED_TERRACOTTA.orange()))
                .group("orange_terracotta")
                .save(output, "vanillavariants:orange_terracotta_stairs_from_orange_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.orange()),has(Blocks.DYED_TERRACOTTA.orange()))
                .group("orange_terracotta")
                .save(output, "vanillavariants:orange_terracotta_slab_from_orange_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.yellow());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.yellow()),has(Blocks.DYED_TERRACOTTA.yellow()))
                .group("yellow_terracotta")
                .save(output, "vanillavariants:yellow_terracotta_wall_from_yellow_terracotta_block");
        stairBuilder(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.yellow()),has(Blocks.DYED_TERRACOTTA.yellow()))
                .group("yellow_terracotta")
                .save(output, "vanillavariants:yellow_terracotta_stairs_from_yellow_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.yellow()),has(Blocks.DYED_TERRACOTTA.yellow()))
                .group("yellow_terracotta")
                .save(output, "vanillavariants:yellow_terracotta_slab_from_yellow_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.lime());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lime()),has(Blocks.DYED_TERRACOTTA.lime()))
                .group("lime_terracotta")
                .save(output, "vanillavariants:lime_terracotta_wall_from_lime_terracotta_block");
        stairBuilder(ModBlocks.LIME_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lime()),has(Blocks.DYED_TERRACOTTA.lime()))
                .group("lime_terracotta")
                .save(output, "vanillavariants:lime_terracotta_stairs_from_lime_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lime()),has(Blocks.DYED_TERRACOTTA.lime()))
                .group("lime_terracotta")
                .save(output, "vanillavariants:lime_terracotta_slab_from_lime_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.green());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.green()),has(Blocks.DYED_TERRACOTTA.green()))
                .group("green_terracotta")
                .save(output, "vanillavariants:green_terracotta_wall_from_green_terracotta_block");
        stairBuilder(ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.green()),has(Blocks.DYED_TERRACOTTA.green()))
                .group("green_terracotta")
                .save(output, "vanillavariants:green_terracotta_stairs_from_green_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.green()),has(Blocks.DYED_TERRACOTTA.green()))
                .group("green_terracotta")
                .save(output, "vanillavariants:green_terracotta_slab_from_green_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.cyan());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.cyan()),has(Blocks.DYED_TERRACOTTA.cyan()))
                .group("cyan_terracotta")
                .save(output, "vanillavariants:cyan_terracotta_wall_from_cyan_terracotta_block");
        stairBuilder(ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.cyan()),has(Blocks.DYED_TERRACOTTA.cyan()))
                .group("cyan_terracotta")
                .save(output, "vanillavariants:cyan_terracotta_stairs_from_cyan_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.cyan()),has(Blocks.DYED_TERRACOTTA.cyan()))
                .group("cyan_terracotta")
                .save(output, "vanillavariants:cyan_terracotta_slab_from_cyan_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.lightBlue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightBlue()),has(Blocks.DYED_TERRACOTTA.lightBlue()))
                .group("light_blue_terracotta")
                .save(output, "vanillavariants:light_blue_terracotta_wall_from_light_blue_terracotta_block");
        stairBuilder(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightBlue()),has(Blocks.DYED_TERRACOTTA.lightBlue()))
                .group("light_blue_terracotta")
                .save(output, "vanillavariants:light_blue_terracotta_stairs_from_light_blue_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.lightBlue()),has(Blocks.DYED_TERRACOTTA.lightBlue()))
                .group("light_blue_terracotta")
                .save(output, "vanillavariants:light_blue_terracotta_slab_from_light_blue_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.blue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.blue()),has(Blocks.DYED_TERRACOTTA.blue()))
                .group("blue_terracotta")
                .save(output, "vanillavariants:blue_terracotta_wall_from_blue_terracotta_block");
        stairBuilder(ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.blue()),has(Blocks.DYED_TERRACOTTA.blue()))
                .group("blue_terracotta")
                .save(output, "vanillavariants:blue_terracotta_stairs_from_blue_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.blue()),has(Blocks.DYED_TERRACOTTA.blue()))
                .group("blue_terracotta")
                .save(output, "vanillavariants:blue_terracotta_slab_from_blue_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.purple());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.purple()),has(Blocks.DYED_TERRACOTTA.purple()))
                .group("purple_terracotta")
                .save(output, "vanillavariants:purple_terracotta_wall_from_purple_terracotta_block");
        stairBuilder(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.purple()),has(Blocks.DYED_TERRACOTTA.purple()))
                .group("purple_terracotta")
                .save(output, "vanillavariants:purple_terracotta_stairs_from_purple_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.purple()),has(Blocks.DYED_TERRACOTTA.purple()))
                .group("purple_terracotta")
                .save(output, "vanillavariants:purple_terracotta_slab_from_purple_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.magenta());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.magenta()),has(Blocks.DYED_TERRACOTTA.magenta()))
                .group("magenta_terracotta")
                .save(output, "vanillavariants:magenta_terracotta_wall_from_magenta_terracotta_block");
        stairBuilder(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.magenta()),has(Blocks.DYED_TERRACOTTA.magenta()))
                .group("magenta_terracotta")
                .save(output, "vanillavariants:magenta_terracotta_stairs_from_magenta_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.magenta()),has(Blocks.DYED_TERRACOTTA.magenta()))
                .group("magenta_terracotta")
                .save(output, "vanillavariants:magenta_terracotta_slab_from_magenta_terracotta_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.DYED_TERRACOTTA.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS.get(), Blocks.DYED_TERRACOTTA.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB.get(), Blocks.DYED_TERRACOTTA.pink());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.pink()),has(Blocks.DYED_TERRACOTTA.pink()))
                .group("pink_terracotta")
                .save(output, "vanillavariants:pink_terracotta_wall_from_pink_terracotta_block");
        stairBuilder(ModBlocks.PINK_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.pink()),has(Blocks.DYED_TERRACOTTA.pink()))
                .group("pink_terracotta")
                .save(output, "vanillavariants:pink_terracotta_stairs_from_pink_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.DYED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.DYED_TERRACOTTA.pink()),has(Blocks.DYED_TERRACOTTA.pink()))
                .group("pink_terracotta")
                .save(output, "vanillavariants:pink_terracotta_slab_from_pink_terracotta_block");


        
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.CONCRETE.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.CONCRETE.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.CONCRETE.white());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.white()))
                .unlockedBy(getHasName(Blocks.CONCRETE.white()),has(Blocks.CONCRETE.white()))
                .group("white_concrete")
                .save(output, "vanillavariants:white_concrete_wall_from_white_concrete_block");
        stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.white()))
                .unlockedBy(getHasName(Blocks.CONCRETE.white()),has(Blocks.CONCRETE.white()))
                .group("white_concrete")
                .save(output, "vanillavariants:white_concrete_stairs_from_white_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.white()))
                .unlockedBy(getHasName(Blocks.CONCRETE.white()),has(Blocks.CONCRETE.white()))
                .group("white_concrete")
                .save(output, "vanillavariants:white_concrete_slab_from_white_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.CONCRETE.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.CONCRETE.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.CONCRETE.lightGray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.lightGray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()),has(Blocks.CONCRETE.lightGray()))
                .group("light_gray_concrete")
                .save(output, "vanillavariants:light_gray_concrete_wall_from_light_gray_concrete_block");
        stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.lightGray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()),has(Blocks.CONCRETE.lightGray()))
                .group("light_gray_concrete")
                .save(output, "vanillavariants:light_gray_concrete_stairs_from_light_gray_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.lightGray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()),has(Blocks.CONCRETE.lightGray()))
                .group("light_gray_concrete")
                .save(output, "vanillavariants:light_gray_concrete_slab_from_light_gray_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.CONCRETE.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.CONCRETE.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.CONCRETE.gray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.gray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.gray()),has(Blocks.CONCRETE.gray()))
                .group("gray_concrete")
                .save(output, "vanillavariants:gray_concrete_wall_from_gray_concrete_block");
        stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.gray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.gray()),has(Blocks.CONCRETE.gray()))
                .group("gray_concrete")
                .save(output, "vanillavariants:gray_concrete_stairs_from_gray_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.gray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.gray()),has(Blocks.CONCRETE.gray()))
                .group("gray_concrete")
                .save(output, "vanillavariants:gray_concrete_slab_from_gray_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.CONCRETE.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.CONCRETE.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.CONCRETE.black());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.black()))
                .unlockedBy(getHasName(Blocks.CONCRETE.black()),has(Blocks.CONCRETE.black()))
                .group("black_concrete")
                .save(output, "vanillavariants:black_concrete_wall_from_black_concrete_block");
        stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.black()))
                .unlockedBy(getHasName(Blocks.CONCRETE.black()),has(Blocks.CONCRETE.black()))
                .group("black_concrete")
                .save(output, "vanillavariants:black_concrete_stairs_from_black_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.black()))
                .unlockedBy(getHasName(Blocks.CONCRETE.black()),has(Blocks.CONCRETE.black()))
                .group("black_concrete")
                .save(output, "vanillavariants:black_concrete_slab_from_black_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.CONCRETE.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.CONCRETE.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.CONCRETE.brown());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.brown()))
                .unlockedBy(getHasName(Blocks.CONCRETE.brown()),has(Blocks.CONCRETE.brown()))
                .group("brown_concrete")
                .save(output, "vanillavariants:brown_concrete_wall_from_brown_concrete_block");
        stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.brown()))
                .unlockedBy(getHasName(Blocks.CONCRETE.brown()),has(Blocks.CONCRETE.brown()))
                .group("brown_concrete")
                .save(output, "vanillavariants:brown_concrete_stairs_from_brown_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.brown()))
                .unlockedBy(getHasName(Blocks.CONCRETE.brown()),has(Blocks.CONCRETE.brown()))
                .group("brown_concrete")
                .save(output, "vanillavariants:brown_concrete_slab_from_brown_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL.get(), Blocks.CONCRETE.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.CONCRETE.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.CONCRETE.red());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.red()))
                .unlockedBy(getHasName(Blocks.CONCRETE.red()),has(Blocks.CONCRETE.red()))
                .group("red_concrete")
                .save(output, "vanillavariants:red_concrete_wall_from_red_concrete_block");
        stairBuilder(ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.red()))
                .unlockedBy(getHasName(Blocks.CONCRETE.red()),has(Blocks.CONCRETE.red()))
                .group("red_concrete")
                .save(output, "vanillavariants:red_concrete_stairs_from_red_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.red()))
                .unlockedBy(getHasName(Blocks.CONCRETE.red()),has(Blocks.CONCRETE.red()))
                .group("red_concrete")
                .save(output, "vanillavariants:red_concrete_slab_from_red_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.CONCRETE.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.CONCRETE.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.CONCRETE.orange());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.orange()))
                .unlockedBy(getHasName(Blocks.CONCRETE.orange()),has(Blocks.CONCRETE.orange()))
                .group("orange_concrete")
                .save(output, "vanillavariants:orange_concrete_wall_from_orange_concrete_block");
        stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.orange()))
                .unlockedBy(getHasName(Blocks.CONCRETE.orange()),has(Blocks.CONCRETE.orange()))
                .group("orange_concrete")
                .save(output, "vanillavariants:orange_concrete_stairs_from_orange_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.orange()))
                .unlockedBy(getHasName(Blocks.CONCRETE.orange()),has(Blocks.CONCRETE.orange()))
                .group("orange_concrete")
                .save(output, "vanillavariants:orange_concrete_slab_from_orange_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.CONCRETE.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.CONCRETE.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.CONCRETE.yellow());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.yellow()))
                .unlockedBy(getHasName(Blocks.CONCRETE.yellow()),has(Blocks.CONCRETE.yellow()))
                .group("yellow_concrete")
                .save(output, "vanillavariants:yellow_concrete_wall_from_yellow_concrete_block");
        stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.yellow()))
                .unlockedBy(getHasName(Blocks.CONCRETE.yellow()),has(Blocks.CONCRETE.yellow()))
                .group("yellow_concrete")
                .save(output, "vanillavariants:yellow_concrete_stairs_from_yellow_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.yellow()))
                .unlockedBy(getHasName(Blocks.CONCRETE.yellow()),has(Blocks.CONCRETE.yellow()))
                .group("yellow_concrete")
                .save(output, "vanillavariants:yellow_concrete_slab_from_yellow_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.CONCRETE.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.CONCRETE.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.CONCRETE.lime());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.lime()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lime()),has(Blocks.CONCRETE.lime()))
                .group("lime_concrete")
                .save(output, "vanillavariants:lime_concrete_wall_from_lime_concrete_block");
        stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.lime()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lime()),has(Blocks.CONCRETE.lime()))
                .group("lime_concrete")
                .save(output, "vanillavariants:lime_concrete_stairs_from_lime_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.lime()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lime()),has(Blocks.CONCRETE.lime()))
                .group("lime_concrete")
                .save(output, "vanillavariants:lime_concrete_slab_from_lime_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.CONCRETE.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.CONCRETE.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.CONCRETE.green());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.green()))
                .unlockedBy(getHasName(Blocks.CONCRETE.green()),has(Blocks.CONCRETE.green()))
                .group("green_concrete")
                .save(output, "vanillavariants:green_concrete_wall_from_green_concrete_block");
        stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.green()))
                .unlockedBy(getHasName(Blocks.CONCRETE.green()),has(Blocks.CONCRETE.green()))
                .group("green_concrete")
                .save(output, "vanillavariants:green_concrete_stairs_from_green_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.green()))
                .unlockedBy(getHasName(Blocks.CONCRETE.green()),has(Blocks.CONCRETE.green()))
                .group("green_concrete")
                .save(output, "vanillavariants:green_concrete_slab_from_green_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CONCRETE.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CONCRETE.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CONCRETE.cyan());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.cyan()))
                .unlockedBy(getHasName(Blocks.CONCRETE.cyan()),has(Blocks.CONCRETE.cyan()))
                .group("cyan_concrete")
                .save(output, "vanillavariants:cyan_concrete_wall_from_cyan_concrete_block");
        stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.cyan()))
                .unlockedBy(getHasName(Blocks.CONCRETE.cyan()),has(Blocks.CONCRETE.cyan()))
                .group("cyan_concrete")
                .save(output, "vanillavariants:cyan_concrete_stairs_from_cyan_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.cyan()))
                .unlockedBy(getHasName(Blocks.CONCRETE.cyan()),has(Blocks.CONCRETE.cyan()))
                .group("cyan_concrete")
                .save(output, "vanillavariants:cyan_concrete_slab_from_cyan_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.CONCRETE.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.CONCRETE.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.CONCRETE.lightBlue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.lightBlue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()),has(Blocks.CONCRETE.lightBlue()))
                .group("light_blue_concrete")
                .save(output, "vanillavariants:light_blue_concrete_wall_from_light_blue_concrete_block");
        stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.lightBlue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()),has(Blocks.CONCRETE.lightBlue()))
                .group("light_blue_concrete")
                .save(output, "vanillavariants:light_blue_concrete_stairs_from_light_blue_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.lightBlue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()),has(Blocks.CONCRETE.lightBlue()))
                .group("light_blue_concrete")
                .save(output, "vanillavariants:light_blue_concrete_slab_from_light_blue_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.CONCRETE.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.CONCRETE.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.CONCRETE.blue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.blue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.blue()),has(Blocks.CONCRETE.blue()))
                .group("blue_concrete")
                .save(output, "vanillavariants:blue_concrete_wall_from_blue_concrete_block");
        stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.blue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.blue()),has(Blocks.CONCRETE.blue()))
                .group("blue_concrete")
                .save(output, "vanillavariants:blue_concrete_stairs_from_blue_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.blue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.blue()),has(Blocks.CONCRETE.blue()))
                .group("blue_concrete")
                .save(output, "vanillavariants:blue_concrete_slab_from_blue_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.CONCRETE.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.CONCRETE.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.CONCRETE.purple());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.purple()))
                .unlockedBy(getHasName(Blocks.CONCRETE.purple()),has(Blocks.CONCRETE.purple()))
                .group("purple_concrete")
                .save(output, "vanillavariants:purple_concrete_wall_from_purple_concrete_block");
        stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.purple()))
                .unlockedBy(getHasName(Blocks.CONCRETE.purple()),has(Blocks.CONCRETE.purple()))
                .group("purple_concrete")
                .save(output, "vanillavariants:purple_concrete_stairs_from_purple_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.purple()))
                .unlockedBy(getHasName(Blocks.CONCRETE.purple()),has(Blocks.CONCRETE.purple()))
                .group("purple_concrete")
                .save(output, "vanillavariants:purple_concrete_slab_from_purple_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.CONCRETE.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.CONCRETE.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.CONCRETE.magenta());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.magenta()))
                .unlockedBy(getHasName(Blocks.CONCRETE.magenta()),has(Blocks.CONCRETE.magenta()))
                .group("magenta_concrete")
                .save(output, "vanillavariants:magenta_concrete_wall_from_magenta_concrete_block");
        stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.magenta()))
                .unlockedBy(getHasName(Blocks.CONCRETE.magenta()),has(Blocks.CONCRETE.magenta()))
                .group("magenta_concrete")
                .save(output, "vanillavariants:magenta_concrete_stairs_from_magenta_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.magenta()))
                .unlockedBy(getHasName(Blocks.CONCRETE.magenta()),has(Blocks.CONCRETE.magenta()))
                .group("magenta_concrete")
                .save(output, "vanillavariants:magenta_concrete_slab_from_magenta_concrete_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.CONCRETE.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.CONCRETE.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.CONCRETE.pink());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.of(Blocks.CONCRETE.pink()))
                .unlockedBy(getHasName(Blocks.CONCRETE.pink()),has(Blocks.CONCRETE.pink()))
                .group("pink_concrete")
                .save(output, "vanillavariants:pink_concrete_wall_from_pink_concrete_block");
        stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CONCRETE.pink()))
                .unlockedBy(getHasName(Blocks.CONCRETE.pink()),has(Blocks.CONCRETE.pink()))
                .group("pink_concrete")
                .save(output, "vanillavariants:pink_concrete_stairs_from_pink_concrete_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CONCRETE.pink()))
                .unlockedBy(getHasName(Blocks.CONCRETE.pink()),has(Blocks.CONCRETE.pink()))
                .group("pink_concrete")
                .save(output, "vanillavariants:pink_concrete_slab_from_pink_concrete_block");



        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_WALL.get(), Blocks.WOOL.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_STAIRS.get(), Blocks.WOOL.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB.get(), Blocks.WOOL.white());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.white()))
                .unlockedBy(getHasName(Blocks.WOOL.white()),has(Blocks.WOOL.white()))
                .group("white_wool")
                .save(output, "vanillavariants:white_wool_wall_from_white_wool_block");
        stairBuilder(ModBlocks.WHITE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.white()))
                .unlockedBy(getHasName(Blocks.WOOL.white()),has(Blocks.WOOL.white()))
                .group("white_wool")
                .save(output, "vanillavariants:white_wool_stairs_from_white_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.white()))
                .unlockedBy(getHasName(Blocks.WOOL.white()),has(Blocks.WOOL.white()))
                .group("white_wool")
                .save(output, "vanillavariants:white_wool_slab_from_white_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_WALL.get(), Blocks.WOOL.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), Blocks.WOOL.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), Blocks.WOOL.lightGray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.lightGray()))
                .unlockedBy(getHasName(Blocks.WOOL.lightGray()),has(Blocks.WOOL.lightGray()))
                .group("light_gray_wool")
                .save(output, "vanillavariants:light_gray_wool_wall_from_light_gray_wool_block");
        stairBuilder(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.lightGray()))
                .unlockedBy(getHasName(Blocks.WOOL.lightGray()),has(Blocks.WOOL.lightGray()))
                .group("light_gray_wool")
                .save(output, "vanillavariants:light_gray_wool_stairs_from_light_gray_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.lightGray()))
                .unlockedBy(getHasName(Blocks.WOOL.lightGray()),has(Blocks.WOOL.lightGray()))
                .group("light_gray_wool")
                .save(output, "vanillavariants:light_gray_wool_slab_from_light_gray_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_WALL.get(), Blocks.WOOL.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_STAIRS.get(), Blocks.WOOL.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB.get(), Blocks.WOOL.gray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.gray()))
                .unlockedBy(getHasName(Blocks.WOOL.gray()),has(Blocks.WOOL.gray()))
                .group("gray_wool")
                .save(output, "vanillavariants:gray_wool_wall_from_gray_wool_block");
        stairBuilder(ModBlocks.GRAY_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.gray()))
                .unlockedBy(getHasName(Blocks.WOOL.gray()),has(Blocks.WOOL.gray()))
                .group("gray_wool")
                .save(output, "vanillavariants:gray_wool_stairs_from_gray_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.gray()))
                .unlockedBy(getHasName(Blocks.WOOL.gray()),has(Blocks.WOOL.gray()))
                .group("gray_wool")
                .save(output, "vanillavariants:gray_wool_slab_from_gray_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_WALL.get(), Blocks.WOOL.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_STAIRS.get(), Blocks.WOOL.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB.get(), Blocks.WOOL.black());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.black()))
                .unlockedBy(getHasName(Blocks.WOOL.black()),has(Blocks.WOOL.black()))
                .group("black_wool")
                .save(output, "vanillavariants:black_wool_wall_from_black_wool_block");
        stairBuilder(ModBlocks.BLACK_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.black()))
                .unlockedBy(getHasName(Blocks.WOOL.black()),has(Blocks.WOOL.black()))
                .group("black_wool")
                .save(output, "vanillavariants:black_wool_stairs_from_black_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.black()))
                .unlockedBy(getHasName(Blocks.WOOL.black()),has(Blocks.WOOL.black()))
                .group("black_wool")
                .save(output, "vanillavariants:black_wool_slab_from_black_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_WALL.get(), Blocks.WOOL.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_STAIRS.get(), Blocks.WOOL.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB.get(), Blocks.WOOL.brown());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.brown()))
                .unlockedBy(getHasName(Blocks.WOOL.brown()),has(Blocks.WOOL.brown()))
                .group("brown_wool")
                .save(output, "vanillavariants:brown_wool_wall_from_brown_wool_block");
        stairBuilder(ModBlocks.BROWN_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.brown()))
                .unlockedBy(getHasName(Blocks.WOOL.brown()),has(Blocks.WOOL.brown()))
                .group("brown_wool")
                .save(output, "vanillavariants:brown_wool_stairs_from_brown_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.brown()))
                .unlockedBy(getHasName(Blocks.WOOL.brown()),has(Blocks.WOOL.brown()))
                .group("brown_wool")
                .save(output, "vanillavariants:brown_wool_slab_from_brown_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_WALL.get(), Blocks.WOOL.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_STAIRS.get(), Blocks.WOOL.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB.get(), Blocks.WOOL.red());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.red()))
                .unlockedBy(getHasName(Blocks.WOOL.red()),has(Blocks.WOOL.red()))
                .group("red_wool")
                .save(output, "vanillavariants:red_wool_wall_from_red_wool_block");
        stairBuilder(ModBlocks.RED_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.red()))
                .unlockedBy(getHasName(Blocks.WOOL.red()),has(Blocks.WOOL.red()))
                .group("red_wool")
                .save(output, "vanillavariants:red_wool_stairs_from_red_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.red()))
                .unlockedBy(getHasName(Blocks.WOOL.red()),has(Blocks.WOOL.red()))
                .group("red_wool")
                .save(output, "vanillavariants:red_wool_slab_from_red_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_WALL.get(), Blocks.WOOL.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_STAIRS.get(), Blocks.WOOL.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB.get(), Blocks.WOOL.orange());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.orange()))
                .unlockedBy(getHasName(Blocks.WOOL.orange()),has(Blocks.WOOL.orange()))
                .group("orange_wool")
                .save(output, "vanillavariants:orange_wool_wall_from_orange_wool_block");
        stairBuilder(ModBlocks.ORANGE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.orange()))
                .unlockedBy(getHasName(Blocks.WOOL.orange()),has(Blocks.WOOL.orange()))
                .group("orange_wool")
                .save(output, "vanillavariants:orange_wool_stairs_from_orange_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.orange()))
                .unlockedBy(getHasName(Blocks.WOOL.orange()),has(Blocks.WOOL.orange()))
                .group("orange_wool")
                .save(output, "vanillavariants:orange_wool_slab_from_orange_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_WALL.get(), Blocks.WOOL.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_STAIRS.get(), Blocks.WOOL.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB.get(), Blocks.WOOL.yellow());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.yellow()))
                .unlockedBy(getHasName(Blocks.WOOL.yellow()),has(Blocks.WOOL.yellow()))
                .group("yellow_wool")
                .save(output, "vanillavariants:yellow_wool_wall_from_yellow_wool_block");
        stairBuilder(ModBlocks.YELLOW_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.yellow()))
                .unlockedBy(getHasName(Blocks.WOOL.yellow()),has(Blocks.WOOL.yellow()))
                .group("yellow_wool")
                .save(output, "vanillavariants:yellow_wool_stairs_from_yellow_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.yellow()))
                .unlockedBy(getHasName(Blocks.WOOL.yellow()),has(Blocks.WOOL.yellow()))
                .group("yellow_wool")
                .save(output, "vanillavariants:yellow_wool_slab_from_yellow_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_WALL.get(), Blocks.WOOL.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_STAIRS.get(), Blocks.WOOL.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB.get(), Blocks.WOOL.lime());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.lime()))
                .unlockedBy(getHasName(Blocks.WOOL.lime()),has(Blocks.WOOL.lime()))
                .group("lime_wool")
                .save(output, "vanillavariants:lime_wool_wall_from_lime_wool_block");
        stairBuilder(ModBlocks.LIME_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.lime()))
                .unlockedBy(getHasName(Blocks.WOOL.lime()),has(Blocks.WOOL.lime()))
                .group("lime_wool")
                .save(output, "vanillavariants:lime_wool_stairs_from_lime_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.lime()))
                .unlockedBy(getHasName(Blocks.WOOL.lime()),has(Blocks.WOOL.lime()))
                .group("lime_wool")
                .save(output, "vanillavariants:lime_wool_slab_from_lime_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_WALL.get(), Blocks.WOOL.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_STAIRS.get(), Blocks.WOOL.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB.get(), Blocks.WOOL.green());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.green()))
                .unlockedBy(getHasName(Blocks.WOOL.green()),has(Blocks.WOOL.green()))
                .group("green_wool")
                .save(output, "vanillavariants:green_wool_wall_from_green_wool_block");
        stairBuilder(ModBlocks.GREEN_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.green()))
                .unlockedBy(getHasName(Blocks.WOOL.green()),has(Blocks.WOOL.green()))
                .group("green_wool")
                .save(output, "vanillavariants:green_wool_stairs_from_green_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.green()))
                .unlockedBy(getHasName(Blocks.WOOL.green()),has(Blocks.WOOL.green()))
                .group("green_wool")
                .save(output, "vanillavariants:green_wool_slab_from_green_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_WALL.get(), Blocks.WOOL.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_STAIRS.get(), Blocks.WOOL.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB.get(), Blocks.WOOL.cyan());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.cyan()))
                .unlockedBy(getHasName(Blocks.WOOL.cyan()),has(Blocks.WOOL.cyan()))
                .group("cyan_wool")
                .save(output, "vanillavariants:cyan_wool_wall_from_cyan_wool_block");
        stairBuilder(ModBlocks.CYAN_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.cyan()))
                .unlockedBy(getHasName(Blocks.WOOL.cyan()),has(Blocks.WOOL.cyan()))
                .group("cyan_wool")
                .save(output, "vanillavariants:cyan_wool_stairs_from_cyan_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.cyan()))
                .unlockedBy(getHasName(Blocks.WOOL.cyan()),has(Blocks.WOOL.cyan()))
                .group("cyan_wool")
                .save(output, "vanillavariants:cyan_wool_slab_from_cyan_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_WALL.get(), Blocks.WOOL.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), Blocks.WOOL.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), Blocks.WOOL.lightBlue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.lightBlue()))
                .unlockedBy(getHasName(Blocks.WOOL.lightBlue()),has(Blocks.WOOL.lightBlue()))
                .group("light_blue_wool")
                .save(output, "vanillavariants:light_blue_wool_wall_from_light_blue_wool_block");
        stairBuilder(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.lightBlue()))
                .unlockedBy(getHasName(Blocks.WOOL.lightBlue()),has(Blocks.WOOL.lightBlue()))
                .group("light_blue_wool")
                .save(output, "vanillavariants:light_blue_wool_stairs_from_light_blue_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.lightBlue()))
                .unlockedBy(getHasName(Blocks.WOOL.lightBlue()),has(Blocks.WOOL.lightBlue()))
                .group("light_blue_wool")
                .save(output, "vanillavariants:light_blue_wool_slab_from_light_blue_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_WALL.get(), Blocks.WOOL.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_STAIRS.get(), Blocks.WOOL.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB.get(), Blocks.WOOL.blue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.blue()))
                .unlockedBy(getHasName(Blocks.WOOL.blue()),has(Blocks.WOOL.blue()))
                .group("blue_wool")
                .save(output, "vanillavariants:blue_wool_wall_from_blue_wool_block");
        stairBuilder(ModBlocks.BLUE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.blue()))
                .unlockedBy(getHasName(Blocks.WOOL.blue()),has(Blocks.WOOL.blue()))
                .group("blue_wool")
                .save(output, "vanillavariants:blue_wool_stairs_from_blue_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.blue()))
                .unlockedBy(getHasName(Blocks.WOOL.blue()),has(Blocks.WOOL.blue()))
                .group("blue_wool")
                .save(output, "vanillavariants:blue_wool_slab_from_blue_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_WALL.get(), Blocks.WOOL.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_STAIRS.get(), Blocks.WOOL.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB.get(), Blocks.WOOL.purple());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.purple()))
                .unlockedBy(getHasName(Blocks.WOOL.purple()),has(Blocks.WOOL.purple()))
                .group("purple_wool")
                .save(output, "vanillavariants:purple_wool_wall_from_purple_wool_block");
        stairBuilder(ModBlocks.PURPLE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.purple()))
                .unlockedBy(getHasName(Blocks.WOOL.purple()),has(Blocks.WOOL.purple()))
                .group("purple_wool")
                .save(output, "vanillavariants:purple_wool_stairs_from_purple_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.purple()))
                .unlockedBy(getHasName(Blocks.WOOL.purple()),has(Blocks.WOOL.purple()))
                .group("purple_wool")
                .save(output, "vanillavariants:purple_wool_slab_from_purple_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_WALL.get(), Blocks.WOOL.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_STAIRS.get(), Blocks.WOOL.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB.get(), Blocks.WOOL.magenta());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.magenta()))
                .unlockedBy(getHasName(Blocks.WOOL.magenta()),has(Blocks.WOOL.magenta()))
                .group("magenta_wool")
                .save(output, "vanillavariants:magenta_wool_wall_from_magenta_wool_block");
        stairBuilder(ModBlocks.MAGENTA_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.magenta()))
                .unlockedBy(getHasName(Blocks.WOOL.magenta()),has(Blocks.WOOL.magenta()))
                .group("magenta_wool")
                .save(output, "vanillavariants:magenta_wool_stairs_from_magenta_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.magenta()))
                .unlockedBy(getHasName(Blocks.WOOL.magenta()),has(Blocks.WOOL.magenta()))
                .group("magenta_wool")
                .save(output, "vanillavariants:magenta_wool_slab_from_magenta_wool_block");
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_WALL.get(), Blocks.WOOL.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_STAIRS.get(), Blocks.WOOL.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB.get(), Blocks.WOOL.pink());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_WALL.get(), Ingredient.of(Blocks.WOOL.pink()))
                .unlockedBy(getHasName(Blocks.WOOL.pink()),has(Blocks.WOOL.pink()))
                .group("pink_wool")
                .save(output, "vanillavariants:pink_wool_wall_from_pink_wool_block");
        stairBuilder(ModBlocks.PINK_WOOL_STAIRS.get(), Ingredient.of(Blocks.WOOL.pink()))
                .unlockedBy(getHasName(Blocks.WOOL.pink()),has(Blocks.WOOL.pink()))
                .group("pink_wool")
                .save(output, "vanillavariants:pink_wool_stairs_from_pink_wool_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB.get(), Ingredient.of(Blocks.WOOL.pink()))
                .unlockedBy(getHasName(Blocks.WOOL.pink()),has(Blocks.WOOL.pink()))
                .group("pink_wool")
                .save(output, "vanillavariants:pink_wool_slab_from_pink_wool_block");


        smeltingResultFromBase(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, ModBlocks.WHITE_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.white());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.white());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.white()),has(Blocks.GLAZED_TERRACOTTA.white()))
                .group("white_glazed_terracotta")
                .save(output, "vanillavariants:white_glazed_terracotta_wall_from_white_glazed_terracotta_block");
        stairBuilder(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.white()),has(Blocks.GLAZED_TERRACOTTA.white()))
                .group("white_glazed_terracotta")
                .save(output, "vanillavariants:white_glazed_terracotta_stairs_from_white_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.white()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.white()),has(Blocks.GLAZED_TERRACOTTA.white()))
                .group("white_glazed_terracotta")
                .save(output, "vanillavariants:white_glazed_terracotta_slab_from_white_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.lightGray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.lightGray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightGray()),has(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .group("light_gray_glazed_terracotta")
                .save(output, "vanillavariants:light_gray_glazed_terracotta_wall_from_light_gray_glazed_terracotta_block");
        stairBuilder(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightGray()),has(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .group("light_gray_glazed_terracotta")
                .save(output, "vanillavariants:light_gray_glazed_terracotta_stairs_from_light_gray_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightGray()),has(Blocks.GLAZED_TERRACOTTA.lightGray()))
                .group("light_gray_glazed_terracotta")
                .save(output, "vanillavariants:light_gray_glazed_terracotta_slab_from_light_gray_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, ModBlocks.GRAY_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.gray());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.gray());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.gray()),has(Blocks.GLAZED_TERRACOTTA.gray()))
                .group("gray_glazed_terracotta")
                .save(output, "vanillavariants:gray_glazed_terracotta_wall_from_gray_glazed_terracotta_block");
        stairBuilder(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.gray()),has(Blocks.GLAZED_TERRACOTTA.gray()))
                .group("gray_glazed_terracotta")
                .save(output, "vanillavariants:gray_glazed_terracotta_stairs_from_gray_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.gray()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.gray()),has(Blocks.GLAZED_TERRACOTTA.gray()))
                .group("gray_glazed_terracotta")
                .save(output, "vanillavariants:gray_glazed_terracotta_slab_from_gray_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, ModBlocks.BLACK_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.black());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.black());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.black()),has(Blocks.GLAZED_TERRACOTTA.black()))
                .group("black_glazed_terracotta")
                .save(output, "vanillavariants:black_glazed_terracotta_wall_from_black_glazed_terracotta_block");
        stairBuilder(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.black()),has(Blocks.GLAZED_TERRACOTTA.black()))
                .group("black_glazed_terracotta")
                .save(output, "vanillavariants:black_glazed_terracotta_stairs_from_black_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.black()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.black()),has(Blocks.GLAZED_TERRACOTTA.black()))
                .group("black_glazed_terracotta")
                .save(output, "vanillavariants:black_glazed_terracotta_slab_from_black_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, ModBlocks.BROWN_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.brown());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.brown());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.brown()),has(Blocks.GLAZED_TERRACOTTA.brown()))
                .group("brown_glazed_terracotta")
                .save(output, "vanillavariants:brown_glazed_terracotta_wall_from_brown_glazed_terracotta_block");
        stairBuilder(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.brown()),has(Blocks.GLAZED_TERRACOTTA.brown()))
                .group("brown_glazed_terracotta")
                .save(output, "vanillavariants:brown_glazed_terracotta_stairs_from_brown_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.brown()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.brown()),has(Blocks.GLAZED_TERRACOTTA.brown()))
                .group("brown_glazed_terracotta")
                .save(output, "vanillavariants:brown_glazed_terracotta_slab_from_brown_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.RED_GLAZED_TERRACOTTA_WALL, ModBlocks.RED_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.red());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.red());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.red()),has(Blocks.GLAZED_TERRACOTTA.red()))
                .group("red_glazed_terracotta")
                .save(output, "vanillavariants:red_glazed_terracotta_wall_from_red_glazed_terracotta_block");
        stairBuilder(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.red()),has(Blocks.GLAZED_TERRACOTTA.red()))
                .group("red_glazed_terracotta")
                .save(output, "vanillavariants:red_glazed_terracotta_stairs_from_red_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.red()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.red()),has(Blocks.GLAZED_TERRACOTTA.red()))
                .group("red_glazed_terracotta")
                .save(output, "vanillavariants:red_glazed_terracotta_slab_from_red_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, ModBlocks.ORANGE_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.orange());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.orange());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.orange()),has(Blocks.GLAZED_TERRACOTTA.orange()))
                .group("orange_glazed_terracotta")
                .save(output, "vanillavariants:orange_glazed_terracotta_wall_from_orange_glazed_terracotta_block");
        stairBuilder(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.orange()),has(Blocks.GLAZED_TERRACOTTA.orange()))
                .group("orange_glazed_terracotta")
                .save(output, "vanillavariants:orange_glazed_terracotta_stairs_from_orange_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.orange()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.orange()),has(Blocks.GLAZED_TERRACOTTA.orange()))
                .group("orange_glazed_terracotta")
                .save(output, "vanillavariants:orange_glazed_terracotta_slab_from_orange_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, ModBlocks.YELLOW_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.yellow());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.yellow());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.yellow()),has(Blocks.GLAZED_TERRACOTTA.yellow()))
                .group("yellow_glazed_terracotta")
                .save(output, "vanillavariants:yellow_glazed_terracotta_wall_from_yellow_glazed_terracotta_block");
        stairBuilder(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.yellow()),has(Blocks.GLAZED_TERRACOTTA.yellow()))
                .group("yellow_glazed_terracotta")
                .save(output, "vanillavariants:yellow_glazed_terracotta_stairs_from_yellow_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.yellow()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.yellow()),has(Blocks.GLAZED_TERRACOTTA.yellow()))
                .group("yellow_glazed_terracotta")
                .save(output, "vanillavariants:yellow_glazed_terracotta_slab_from_yellow_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, ModBlocks.LIME_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.lime());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.lime());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lime()),has(Blocks.GLAZED_TERRACOTTA.lime()))
                .group("lime_glazed_terracotta")
                .save(output, "vanillavariants:lime_glazed_terracotta_wall_from_lime_glazed_terracotta_block");
        stairBuilder(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lime()),has(Blocks.GLAZED_TERRACOTTA.lime()))
                .group("lime_glazed_terracotta")
                .save(output, "vanillavariants:lime_glazed_terracotta_stairs_from_lime_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lime()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lime()),has(Blocks.GLAZED_TERRACOTTA.lime()))
                .group("lime_glazed_terracotta")
                .save(output, "vanillavariants:lime_glazed_terracotta_slab_from_lime_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, ModBlocks.GREEN_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.green());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.green());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.green()),has(Blocks.GLAZED_TERRACOTTA.green()))
                .group("green_glazed_terracotta")
                .save(output, "vanillavariants:green_glazed_terracotta_wall_from_green_glazed_terracotta_block");
        stairBuilder(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.green()),has(Blocks.GLAZED_TERRACOTTA.green()))
                .group("green_glazed_terracotta")
                .save(output, "vanillavariants:green_glazed_terracotta_stairs_from_green_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.green()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.green()),has(Blocks.GLAZED_TERRACOTTA.green()))
                .group("green_glazed_terracotta")
                .save(output, "vanillavariants:green_glazed_terracotta_slab_from_green_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, ModBlocks.CYAN_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.cyan());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.cyan());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.cyan()),has(Blocks.GLAZED_TERRACOTTA.cyan()))
                .group("cyan_glazed_terracotta")
                .save(output, "vanillavariants:cyan_glazed_terracotta_wall_from_cyan_glazed_terracotta_block");
        stairBuilder(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.cyan()),has(Blocks.GLAZED_TERRACOTTA.cyan()))
                .group("cyan_glazed_terracotta")
                .save(output, "vanillavariants:cyan_glazed_terracotta_stairs_from_cyan_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.cyan()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.cyan()),has(Blocks.GLAZED_TERRACOTTA.cyan()))
                .group("cyan_glazed_terracotta")
                .save(output, "vanillavariants:cyan_glazed_terracotta_slab_from_cyan_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.lightBlue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.lightBlue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightBlue()),has(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .group("light_blue_glazed_terracotta")
                .save(output, "vanillavariants:light_blue_glazed_terracotta_wall_from_light_blue_glazed_terracotta_block");
        stairBuilder(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightBlue()),has(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .group("light_blue_glazed_terracotta")
                .save(output, "vanillavariants:light_blue_glazed_terracotta_stairs_from_light_blue_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.lightBlue()),has(Blocks.GLAZED_TERRACOTTA.lightBlue()))
                .group("light_blue_glazed_terracotta")
                .save(output, "vanillavariants:light_blue_glazed_terracotta_slab_from_light_blue_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, ModBlocks.BLUE_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.blue());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.blue());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.blue()),has(Blocks.GLAZED_TERRACOTTA.blue()))
                .group("blue_glazed_terracotta")
                .save(output, "vanillavariants:blue_glazed_terracotta_wall_from_blue_glazed_terracotta_block");
        stairBuilder(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.blue()),has(Blocks.GLAZED_TERRACOTTA.blue()))
                .group("blue_glazed_terracotta")
                .save(output, "vanillavariants:blue_glazed_terracotta_stairs_from_blue_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.blue()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.blue()),has(Blocks.GLAZED_TERRACOTTA.blue()))
                .group("blue_glazed_terracotta")
                .save(output, "vanillavariants:blue_glazed_terracotta_slab_from_blue_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, ModBlocks.PURPLE_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.purple());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.purple());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.purple()),has(Blocks.GLAZED_TERRACOTTA.purple()))
                .group("purple_glazed_terracotta")
                .save(output, "vanillavariants:purple_glazed_terracotta_wall_from_purple_glazed_terracotta_block");
        stairBuilder(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.purple()),has(Blocks.GLAZED_TERRACOTTA.purple()))
                .group("purple_glazed_terracotta")
                .save(output, "vanillavariants:purple_glazed_terracotta_stairs_from_purple_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.purple()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.purple()),has(Blocks.GLAZED_TERRACOTTA.purple()))
                .group("purple_glazed_terracotta")
                .save(output, "vanillavariants:purple_glazed_terracotta_slab_from_purple_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, ModBlocks.MAGENTA_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.magenta());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.magenta());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.magenta()),has(Blocks.GLAZED_TERRACOTTA.magenta()))
                .group("magenta_glazed_terracotta")
                .save(output, "vanillavariants:magenta_glazed_terracotta_wall_from_magenta_glazed_terracotta_block");
        stairBuilder(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.magenta()),has(Blocks.GLAZED_TERRACOTTA.magenta()))
                .group("magenta_glazed_terracotta")
                .save(output, "vanillavariants:magenta_glazed_terracotta_stairs_from_magenta_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.magenta()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.magenta()),has(Blocks.GLAZED_TERRACOTTA.magenta()))
                .group("magenta_glazed_terracotta")
                .save(output, "vanillavariants:magenta_glazed_terracotta_slab_from_magenta_glazed_terracotta_block");
        smeltingResultFromBase(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, ModBlocks.PINK_TERRACOTTA_WALL);
        smeltingResultFromBase(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_STAIRS);
        smeltingResultFromBase(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_SLAB);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Blocks.GLAZED_TERRACOTTA.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), Blocks.GLAZED_TERRACOTTA.pink());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), Blocks.GLAZED_TERRACOTTA.pink());
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.pink()),has(Blocks.GLAZED_TERRACOTTA.pink()))
                .group("pink_glazed_terracotta")
                .save(output, "vanillavariants:pink_glazed_terracotta_wall_from_pink_glazed_terracotta_block");
        stairBuilder(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.pink()),has(Blocks.GLAZED_TERRACOTTA.pink()))
                .group("pink_glazed_terracotta")
                .save(output, "vanillavariants:pink_glazed_terracotta_stairs_from_pink_glazed_terracotta_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), Ingredient.of(Blocks.GLAZED_TERRACOTTA.pink()))
                .unlockedBy(getHasName(Blocks.GLAZED_TERRACOTTA.pink()),has(Blocks.GLAZED_TERRACOTTA.pink()))
                .group("pink_glazed_terracotta")
                .save(output, "vanillavariants:pink_glazed_terracotta_slab_from_pink_glazed_terracotta_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_PILLAR_WALL.get(), Blocks.PURPUR_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_PILLAR_STAIRS.get(), Blocks.PURPUR_PILLAR);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_PILLAR_SLAB.get(), Blocks.PURPUR_PILLAR);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_PILLAR_WALL.get(), Ingredient.of(Blocks.PURPUR_PILLAR))
                .unlockedBy(getHasName(Blocks.PURPUR_PILLAR),has(Blocks.PURPUR_PILLAR))
                .group("purpur_pillar")
                .save(output, "vanillavariants:purpur_pillar_wall_from_purpur_pillar_block");
        stairBuilder(ModBlocks.PURPUR_PILLAR_STAIRS.get(), Ingredient.of(Blocks.PURPUR_PILLAR))
                .unlockedBy(getHasName(Blocks.PURPUR_PILLAR),has(Blocks.PURPUR_PILLAR))
                .group("purpur_pillar")
                .save(output, "vanillavariants:purpur_pillar_stairs_from_purpur_pillara_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_PILLAR_SLAB.get(), Ingredient.of(Blocks.PURPUR_PILLAR))
                .unlockedBy(getHasName(Blocks.PURPUR_PILLAR),has(Blocks.PURPUR_PILLAR))
                .group("purpur_pillar")
                .save(output, "vanillavariants:purpur_pillar_slab_from_purpur_pillar_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_BLOCK.get(), Blocks.END_STONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_WALL.get(), ModBlocks.END_STONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_STAIRS.get(), ModBlocks.END_STONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_SLAB.get(), ModBlocks.END_STONE_PILLAR_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_WALL.get(), Ingredient.of(ModBlocks.END_STONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.END_STONE_PILLAR_BLOCK),has(ModBlocks.END_STONE_PILLAR_BLOCK))
                .group("end_stone_pillar")
                .save(output, "vanillavariants:end_stone_pillar_wall_from_end_stone_pillar_block");
        stairBuilder(ModBlocks.END_STONE_PILLAR_STAIRS.get(), Ingredient.of(ModBlocks.END_STONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.END_STONE_PILLAR_BLOCK),has(ModBlocks.END_STONE_PILLAR_BLOCK))
                .group("end_stone_pillar")
                .save(output, "vanillavariants:end_stone_pillar_stairs_from_end_stone_pillara_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_PILLAR_SLAB.get(), Ingredient.of(ModBlocks.END_STONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.END_STONE_PILLAR_BLOCK),has(ModBlocks.END_STONE_PILLAR_BLOCK))
                .group("end_stone_pillar")
                .save(output, "vanillavariants:end_stone_pillar_slab_from_end_stone_pillar_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), Blocks.SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_WALL.get(), ModBlocks.SANDSTONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_STAIRS.get(), ModBlocks.SANDSTONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_SLAB.get(), ModBlocks.SANDSTONE_PILLAR_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_WALL.get(), Ingredient.of(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_PILLAR_BLOCK),has(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .group("sandstone_pillar")
                .save(output, "vanillavariants:sandstone_pillar_wall_from_sandstone_pillar_block");
        stairBuilder(ModBlocks.SANDSTONE_PILLAR_STAIRS.get(), Ingredient.of(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_PILLAR_BLOCK),has(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .group("sandstone_pillar")
                .save(output, "vanillavariants:sandstone_pillar_stairs_from_sandstone_pillara_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_PILLAR_SLAB.get(), Ingredient.of(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.SANDSTONE_PILLAR_BLOCK),has(ModBlocks.SANDSTONE_PILLAR_BLOCK))
                .group("sandstone_pillar")
                .save(output, "vanillavariants:sandstone_pillar_slab_from_sandstone_pillar_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), Blocks.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_WALL.get(), ModBlocks.RED_SANDSTONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_STAIRS.get(), ModBlocks.RED_SANDSTONE_PILLAR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(), ModBlocks.RED_SANDSTONE_PILLAR_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_WALL.get(), Ingredient.of(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK),has(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .group("red_sandstone_pillar")
                .save(output, "vanillavariants:red_sandstone_pillar_wall_from_red_sandstone_pillar_block");
        stairBuilder(ModBlocks.RED_SANDSTONE_PILLAR_STAIRS.get(), Ingredient.of(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK),has(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .group("red_sandstone_pillar")
                .save(output, "vanillavariants:red_sandstone_pillar_stairs_from_red_sandstone_pillara_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(), Ingredient.of(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK),has(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK))
                .group("red_sandstone_pillar")
                .save(output, "vanillavariants:red_sandstone_pillar_slab_from_red_sandstone_pillar_block");


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_BLOCK.get(), Blocks.RED_SANDSTONE);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL.get(), ModBlocks.POLISHED_END_STONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS.get(), ModBlocks.POLISHED_END_STONE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB.get(), ModBlocks.POLISHED_END_STONE_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL.get(), Ingredient.of(ModBlocks.POLISHED_END_STONE_BLOCK))
                .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE_BLOCK),has(ModBlocks.POLISHED_END_STONE_BLOCK))
                .group("polished_end_stone")
                .save(output, "vanillavariants:polished_end_stone_wall_from_polished_end_stone_block");
        stairBuilder(ModBlocks.POLISHED_END_STONE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_END_STONE_BLOCK))
                .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE_BLOCK),has(ModBlocks.POLISHED_END_STONE_BLOCK))
                .group("polished_end_stone")
                .save(output, "vanillavariants:polished_end_stone_stairs_from_polished_end_stone_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB.get(), Ingredient.of(ModBlocks.POLISHED_END_STONE_BLOCK))
                .unlockedBy(getHasName(ModBlocks.POLISHED_END_STONE_BLOCK),has(ModBlocks.POLISHED_END_STONE_BLOCK))
                .group("polished_end_stone")
                .save(output, "vanillavariants:polished_end_stone_slab_from_polished_end_stone_block");


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_BLOCK.get(), Blocks.PURPUR_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_WALL.get(), ModBlocks.PURPUR_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_STAIRS.get(), ModBlocks.PURPUR_BRICKS_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_SLAB.get(), ModBlocks.PURPUR_BRICKS_BLOCK);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_BLOCK, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', Blocks.PURPUR_BLOCK)
                .unlockedBy(getHasName(Blocks.PURPUR_BLOCK), has(Blocks.PURPUR_BLOCK))
                .group("purpur_bricks")
                .save(output, "vanillavariants:purpur_bricks_block_from_purpur_block");
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_WALL.get(), Ingredient.of(ModBlocks.PURPUR_BRICKS_BLOCK))
                .unlockedBy(getHasName(ModBlocks.PURPUR_BRICKS_BLOCK),has(ModBlocks.PURPUR_BRICKS_BLOCK))
                .group("purpur_bricks")
                .save(output, "vanillavariants:purpur_bricks_wall_from_purpur_bricks_block");
        stairBuilder(ModBlocks.PURPUR_BRICKS_STAIRS.get(), Ingredient.of(ModBlocks.PURPUR_BRICKS_BLOCK))
                .unlockedBy(getHasName(ModBlocks.PURPUR_BRICKS_BLOCK),has(ModBlocks.PURPUR_BRICKS_BLOCK))
                .group("purpur_bricks")
                .save(output, "vanillavariants:purpur_bricks_stairs_from_purpur_bricks_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_BRICKS_SLAB.get(), Ingredient.of(ModBlocks.PURPUR_BRICKS_BLOCK))
                .unlockedBy(getHasName(ModBlocks.PURPUR_BRICKS_BLOCK),has(ModBlocks.PURPUR_BRICKS_BLOCK))
                .group("purpur_bricks")
                .save(output, "vanillavariants:purpur_bricks_slab_from_purpur_bricks_block");


        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_WALL.get(), Ingredient.of(Blocks.MUD))
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("mud")
                .save(output, "vanillavariants:mud_wall_from_mud_block");
        stairBuilder(ModBlocks.MUD_STAIRS.get(), Ingredient.of(Blocks.MUD))
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("mud")
                .save(output, "vanillavariants:mud_stairs_from_mud_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SLAB.get(), Ingredient.of(Blocks.MUD))
                .unlockedBy(getHasName(Blocks.MUD),has(Blocks.MUD))
                .group("mud")
                .save(output, "vanillavariants:mud_slab_from_mud_block");

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL.get(), Ingredient.of(Blocks.CALCITE))
                .unlockedBy(getHasName(Blocks.CALCITE),has(Blocks.CALCITE))
                .group("calcite")
                .save(output, "vanillavariants:calcite_wall_from_calcite_block");
        stairBuilder(ModBlocks.CALCITE_STAIRS.get(), Ingredient.of(Blocks.CALCITE))
                .unlockedBy(getHasName(Blocks.CALCITE),has(Blocks.CALCITE))
                .group("calcite")
                .save(output, "vanillavariants:calcite_stairs_from_calcite_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS.get(), Ingredient.of(Blocks.CALCITE))
                .unlockedBy(getHasName(Blocks.CALCITE),has(Blocks.CALCITE))
                .group("calcite")
                .save(output, "vanillavariants:calcite_slab_from_calcite_block");


        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_WALL.get(), Ingredient.of(Blocks.OBSIDIAN))
                .unlockedBy(getHasName(Blocks.OBSIDIAN),has(Blocks.OBSIDIAN))
                .group("obsidian")
                .save(output, "vanillavariants:obsidian_wall_from_obsidian_block");
        stairBuilder(ModBlocks.OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.OBSIDIAN))
                .unlockedBy(getHasName(Blocks.OBSIDIAN),has(Blocks.OBSIDIAN))
                .group("obsidian")
                .save(output, "vanillavariants:obsidian_stairs_from_obsidian_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.OBSIDIAN))
                .unlockedBy(getHasName(Blocks.OBSIDIAN),has(Blocks.OBSIDIAN))
                .group("obsidian")
                .save(output, "vanillavariants:obsidian_slab_from_obsidian_block");

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYING_OBSIDIAN_WALL.get(), Ingredient.of(Blocks.CRYING_OBSIDIAN))
                .unlockedBy(getHasName(Blocks.CRYING_OBSIDIAN),has(Blocks.CRYING_OBSIDIAN))
                .group("crying_obsidian")
                .save(output, "vanillavariants:crying_obsidian_wall_from_crying_obsidian_block");
        stairBuilder(ModBlocks.CRYING_OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.CRYING_OBSIDIAN))
                .unlockedBy(getHasName(Blocks.CRYING_OBSIDIAN),has(Blocks.CRYING_OBSIDIAN))
                .group("crying_obsidian")
                .save(output, "vanillavariants:crying_obsidian_stairs_from_crying_obsidian_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYING_OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.CRYING_OBSIDIAN))
                .unlockedBy(getHasName(Blocks.CRYING_OBSIDIAN),has(Blocks.CRYING_OBSIDIAN))
                .group("crying_obsidian")
                .save(output, "vanillavariants:crying_obsidian_slab_from_crying_obsidian_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL, Blocks.COBBLED_DEEPSLATE_WALL);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE_STAIRS);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE_SLAB);
        smeltingResultFromBase(ModBlocks.DEEPSLATE_WALL, Blocks.COBBLED_DEEPSLATE_WALL);
        smeltingResultFromBase(ModBlocks.DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE_STAIRS);
        smeltingResultFromBase(ModBlocks.DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE_SLAB);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("deepslate")
                .save(output, "vanillavariants:deepslate_wall_from_deepslate_block");
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("deepslate")
                .save(output, "vanillavariants:deepslate_stairs_from_deepslate_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS.get(), Ingredient.of(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Blocks.DEEPSLATE),has(Blocks.DEEPSLATE))
                .group("deepslate")
                .save(output, "vanillavariants:deepslate_slab_from_deepslate_block");


        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_WALL.get(), Ingredient.of(Blocks.AMETHYST_BLOCK))
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK),has(Blocks.AMETHYST_BLOCK))
                .group("amethyst")
                .save(output, "vanillavariants:amethyst_wall_from_amethyst_block");
        stairBuilder(ModBlocks.AMETHYST_STAIRS.get(), Ingredient.of(Blocks.AMETHYST_BLOCK))
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK),has(Blocks.AMETHYST_BLOCK))
                .group("amethyst")
                .save(output, "vanillavariants:amethyst_stairs_from_amethyst_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_STAIRS.get(), Ingredient.of(Blocks.AMETHYST_BLOCK))
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK),has(Blocks.AMETHYST_BLOCK))
                .group("amethyst")
                .save(output, "vanillavariants:amethyst_slab_from_amethyst_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_WALL, Blocks.COAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_STAIRS, Blocks.COAL_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_SLAB, Blocks.COAL_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_WALL.get(), Ingredient.of(Blocks.COAL_BLOCK))
                .unlockedBy(getHasName(Blocks.COAL_BLOCK),has(Blocks.COAL_BLOCK))
                .group("coal")
                .save(output, "vanillavariants:coal_wall_from_coal_block");
        stairBuilder(ModBlocks.COAL_STAIRS.get(), Ingredient.of(Blocks.COAL_BLOCK))
                .unlockedBy(getHasName(Blocks.COAL_BLOCK),has(Blocks.COAL_BLOCK))
                .group("coal")
                .save(output, "vanillavariants:coal_stairs_from_coal_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_STAIRS.get(), Ingredient.of(Blocks.COAL_BLOCK))
                .unlockedBy(getHasName(Blocks.COAL_BLOCK),has(Blocks.COAL_BLOCK))
                .group("coal")
                .save(output, "vanillavariants:coal_slab_from_coal_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_WALL, Blocks.IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS, Blocks.IRON_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Blocks.IRON_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_WALL.get(), Ingredient.of(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.IRON_BLOCK),has(Blocks.IRON_BLOCK))
                .group("iron")
                .save(output, "vanillavariants:iron_wall_from_iron_block");
        stairBuilder(ModBlocks.IRON_STAIRS.get(), Ingredient.of(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.IRON_BLOCK),has(Blocks.IRON_BLOCK))
                .group("iron")
                .save(output, "vanillavariants:iron_stairs_from_iron_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS.get(), Ingredient.of(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.IRON_BLOCK),has(Blocks.IRON_BLOCK))
                .group("iron")
                .save(output, "vanillavariants:iron_slab_from_iron_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_WALL, Blocks.GOLD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS, Blocks.GOLD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_WALL.get(), Ingredient.of(Blocks.GOLD_BLOCK))
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK),has(Blocks.GOLD_BLOCK))
                .group("gold")
                .save(output, "vanillavariants:gold_wall_from_gold_block");
        stairBuilder(ModBlocks.GOLD_STAIRS.get(), Ingredient.of(Blocks.GOLD_BLOCK))
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK),has(Blocks.GOLD_BLOCK))
                .group("gold")
                .save(output, "vanillavariants:gold_stairs_from_gold_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS.get(), Ingredient.of(Blocks.GOLD_BLOCK))
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK),has(Blocks.GOLD_BLOCK))
                .group("gold")
                .save(output, "vanillavariants:gold_slab_from_gold_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_WALL, Blocks.EMERALD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_STAIRS, Blocks.EMERALD_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_WALL.get(), Ingredient.of(Blocks.EMERALD_BLOCK))
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK),has(Blocks.EMERALD_BLOCK))
                .group("emerald")
                .save(output, "vanillavariants:emerald_wall_from_emerald_block");
        stairBuilder(ModBlocks.EMERALD_STAIRS.get(), Ingredient.of(Blocks.EMERALD_BLOCK))
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK),has(Blocks.EMERALD_BLOCK))
                .group("emerald")
                .save(output, "vanillavariants:emerald_stairs_from_emerald_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_STAIRS.get(), Ingredient.of(Blocks.EMERALD_BLOCK))
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK),has(Blocks.EMERALD_BLOCK))
                .group("emerald")
                .save(output, "vanillavariants:emerald_slab_from_emerald_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_WALL, Blocks.DIAMOND_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIRS, Blocks.DIAMOND_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_WALL.get(), Ingredient.of(Blocks.DIAMOND_BLOCK))
                .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK),has(Blocks.DIAMOND_BLOCK))
                .group("diamond")
                .save(output, "vanillavariants:diamond_wall_from_diamond_block");
        stairBuilder(ModBlocks.DIAMOND_STAIRS.get(), Ingredient.of(Blocks.DIAMOND_BLOCK))
                .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK),has(Blocks.DIAMOND_BLOCK))
                .group("diamond")
                .save(output, "vanillavariants:diamond_stairs_from_diamond_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIRS.get(), Ingredient.of(Blocks.DIAMOND_BLOCK))
                .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK),has(Blocks.DIAMOND_BLOCK))
                .group("diamond")
                .save(output, "vanillavariants:diamond_slab_from_diamond_block");

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_WALL, Blocks.NETHERITE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_STAIRS, Blocks.NETHERITE_BLOCK);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SLAB, Blocks.NETHERITE_BLOCK);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_WALL.get(), Ingredient.of(Blocks.NETHERITE_BLOCK))
                .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK),has(Blocks.NETHERITE_BLOCK))
                .group("netherite")
                .save(output, "vanillavariants:netherite_wall_from_netherite_block");
        stairBuilder(ModBlocks.NETHERITE_STAIRS.get(), Ingredient.of(Blocks.NETHERITE_BLOCK))
                .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK),has(Blocks.NETHERITE_BLOCK))
                .group("netherite")
                .save(output, "vanillavariants:netherite_stairs_from_netherite_block");
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_STAIRS.get(), Ingredient.of(Blocks.NETHERITE_BLOCK))
                .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK),has(Blocks.NETHERITE_BLOCK))
                .group("netherite")
                .save(output, "vanillavariants:netherite_slab_from_netherite_block");

    }
}
