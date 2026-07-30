package net.mim0.vanillavariants.datagen;

import net.mim0.vanillavariants.VanillaVariants;
import net.mim0.vanillavariants.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.block.CustomUnbakedBlockStateModel;
import net.neoforged.neoforge.client.model.generators.blockstate.CustomBlockStateModelBuilder;
import net.neoforged.neoforge.client.model.generators.blockstate.UnbakedMutator;

import java.util.function.BiConsumer;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, VanillaVariants.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.family(Blocks.PRISMARINE)
                .fullBlockVariant(ModBlocks.CHISELED_PRISMARINE_BLOCK.get());

        blockModels.family(Blocks.PURPUR_BLOCK)
                .fullBlockVariant(ModBlocks.CHISELED_PURPUR_BLOCK.get())
                .wall(ModBlocks.PURPUR_WALL.get());

        blockModels.family(Blocks.GRANITE)
                .fullBlockVariant(ModBlocks.CHISELED_GRANITE_BLOCK.get());

        blockModels.family(Blocks.POLISHED_GRANITE)
                .wall(ModBlocks.POLISHED_GRANITE_WALL.get());

        blockModels.family(Blocks.ANDESITE)
                .fullBlockVariant(ModBlocks.CHISELED_ANDESITE_BLOCK.get());

        blockModels.family(Blocks.POLISHED_ANDESITE)
                .wall(ModBlocks.POLISHED_ANDESITE_WALL.get());

        blockModels.family(Blocks.DIORITE)
                .fullBlockVariant(ModBlocks.CHISELED_DIORITE_BLOCK.get());

        blockModels.family(Blocks.POLISHED_DIORITE)
                .wall(ModBlocks.POLISHED_DIORITE_WALL.get());

        blockModels.family(Blocks.SMOOTH_STONE)
                .stairs(ModBlocks.SMOOTH_STONE_STAIRS.get())
                .wall(ModBlocks.SMOOTH_STONE_WALL.get());

        blockModels.family(Blocks.CUT_SANDSTONE)
                .stairs(ModBlocks.CUT_SANDSTONE_STAIRS.get());

        blockModels.family(Blocks.CUT_RED_SANDSTONE)
                .stairs(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get());

        blockModels.family(Blocks.STONE)
                .wall(ModBlocks.STONE_WALL.get());

        blockModels.family(Blocks.SMOOTH_SANDSTONE)
                .wall(ModBlocks.SMOOTH_SANDSTONE_WALL.get());

        blockModels.family(Blocks.SMOOTH_RED_SANDSTONE)
                .wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get());

        blockModels.family(Blocks.DARK_PRISMARINE)
                .wall(ModBlocks.DARK_PRISMARINE_WALL.get());


        TextureMapping quartz_wall_texture = new TextureMapping().put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_BLOCK, "_side"));
        BlockModelGenerators.BlockFamilyProvider quartz_wall_block_family_provider = blockModels.new BlockFamilyProvider(quartz_wall_texture);
        quartz_wall_block_family_provider.wall(ModBlocks.QUARTZ_WALL.get());

        blockModels.family(Blocks.SMOOTH_QUARTZ)
                .wall(ModBlocks.SMOOTH_QUARTZ_WALL.get());

        TextureMapping cut_sandstone_wall_texture = new TextureMapping().put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.CUT_SANDSTONE));
        BlockModelGenerators.BlockFamilyProvider cut_sandstone_wall_block_family_provider = blockModels.new BlockFamilyProvider(cut_sandstone_wall_texture);
        cut_sandstone_wall_block_family_provider.wall(ModBlocks.CUT_SANDSTONE_WALL.get());

        TextureMapping cut_red_sandstone_wall_texture = new TextureMapping().put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.CUT_RED_SANDSTONE));
        BlockModelGenerators.BlockFamilyProvider cut_red_sandstone_wall_block_family_provider = blockModels.new BlockFamilyProvider(cut_red_sandstone_wall_texture);
        cut_red_sandstone_wall_block_family_provider.wall(ModBlocks.CUT_RED_SANDSTONE_WALL.get());

        blockModels.family(Blocks.NETHERRACK)
                .wall(ModBlocks.NETHERRACK_WALL.get())
                .stairs(ModBlocks.NETHERRACK_STAIRS.get())
                .slab(ModBlocks.NETHERRACK_SLAB.get());

        blockModels.family(Blocks.END_STONE)
                .wall(ModBlocks.END_STONE_WALL.get())
                .stairs(ModBlocks.END_STONE_STAIRS.get())
                .slab(ModBlocks.END_STONE_SLAB.get());

        blockModels.family(Blocks.PACKED_MUD)
                .wall(ModBlocks.PACKED_MUD_WALL.get())
                .stairs(ModBlocks.PACKED_MUD_STAIRS.get())
                .slab(ModBlocks.PACKED_MUD_SLAB.get());

        blockModels.family(Blocks.CLAY)
                .wall(ModBlocks.CLAY_WALL.get())
                .stairs(ModBlocks.CLAY_STAIRS.get())
                .slab(ModBlocks.CLAY_SLAB.get());

        blockModels.family(Blocks.RESIN_BLOCK)
                .wall(ModBlocks.RESIN_WALL.get())
                .stairs(ModBlocks.RESIN_STAIRS.get())
                .slab(ModBlocks.RESIN_SLAB.get());

        blockModels.family(Blocks.PRISMARINE_BRICKS)
                .wall(ModBlocks.PRISMARINE_BRICK_WALL.get());


        TextureMapping basalt_block_family_texture = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.BASALT, "_side"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.BASALT, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.BASALT, "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.BASALT, "_top"));
        blockModels.new BlockFamilyProvider(basalt_block_family_texture)
                .wall(ModBlocks.BASALT_WALL.get())
                .stairs(ModBlocks.BASALT_STAIRS.get());
        Identifier basalt_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.BASALT_SLAB.get(), basalt_block_family_texture, blockModels.modelOutput);
        Identifier basalt_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.BASALT_SLAB.get(), basalt_block_family_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.BASALT_SLAB.get(),
                        BlockModelGenerators.plainVariant(basalt_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(basalt_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(Blocks.BASALT)) //Full Block MultiVariant
                )
        );

        TextureMapping polished_basalt_block_family_texture = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.POLISHED_BASALT, "_side"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.POLISHED_BASALT, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.POLISHED_BASALT, "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.POLISHED_BASALT, "_top"));
        blockModels.new BlockFamilyProvider(polished_basalt_block_family_texture)
                .wall(ModBlocks.POLISHED_BASALT_WALL.get())
                .stairs(ModBlocks.POLISHED_BASALT_STAIRS.get());
        Identifier polished_basalt_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.POLISHED_BASALT_SLAB.get(), polished_basalt_block_family_texture, blockModels.modelOutput);
        Identifier polished_basalt_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.POLISHED_BASALT_SLAB.get(), polished_basalt_block_family_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.POLISHED_BASALT_SLAB.get(),
                        BlockModelGenerators.plainVariant(polished_basalt_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(polished_basalt_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(Blocks.POLISHED_BASALT)) //Full Block MultiVariant
                )
        );

        blockModels.family(Blocks.SMOOTH_BASALT)
                .wall(ModBlocks.SMOOTH_BASALT_WALL.get())
                .stairs(ModBlocks.SMOOTH_BASALT_STAIRS.get())
                .slab(ModBlocks.SMOOTH_BASALT_SLAB.get());


        TextureMapping quartz_pillar_block_family_texture = new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.QUARTZ_PILLAR, "_side"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.QUARTZ_PILLAR, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.QUARTZ_PILLAR, "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.QUARTZ_PILLAR, "_top"));
        blockModels.new BlockFamilyProvider(quartz_pillar_block_family_texture)
                .wall(ModBlocks.QUARTZ_PILLAR_WALL.get())
                .stairs(ModBlocks.QUARTZ_PILLAR_STAIRS.get());
        Identifier quartz_pillar_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.QUARTZ_PILLAR_SLAB.get(), quartz_pillar_block_family_texture, blockModels.modelOutput);
        Identifier quartz_pillar_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.QUARTZ_PILLAR_SLAB.get(), quartz_pillar_block_family_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.QUARTZ_PILLAR_SLAB.get(),
                        BlockModelGenerators.plainVariant(quartz_pillar_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(quartz_pillar_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(Blocks.QUARTZ_PILLAR)) //Full Block MultiVariant
                )
        );

        TextureMapping chiseled_end_stone_texture = new TextureMapping()
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.CHISELED_END_STONE_BLOCK.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.CHISELED_END_STONE_BLOCK.get(), "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.CHISELED_END_STONE_BLOCK.get(), "_top"));

        Identifier chiseled_end_stone_identifier = ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.CHISELED_END_STONE_BLOCK.get(), chiseled_end_stone_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSimpleBlock(
                        ModBlocks.CHISELED_END_STONE_BLOCK.get(),
                        BlockModelGenerators.plainVariant(chiseled_end_stone_identifier)
                )
        );


        blockModels.family(Blocks.COPPER_BLOCK.weathering().unaffected())
                .stairs(ModBlocks.COPPER_STAIRS.get())
                .slab(ModBlocks.COPPER_SLAB.get())
                .stairs(ModBlocks.WAXED_COPPER_STAIRS.get())
                .slab(ModBlocks.WAXED_COPPER_SLAB.get());


        blockModels.family(Blocks.COPPER_BLOCK.weathering().exposed())
                .stairs(ModBlocks.EXPOSED_COPPER_STAIRS.get())
                .slab(ModBlocks.EXPOSED_COPPER_SLAB.get())
                .stairs(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get())
                .slab(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get());


        blockModels.family(Blocks.COPPER_BLOCK.weathering().weathered())
                .stairs(ModBlocks.WEATHERED_COPPER_STAIRS.get())
                .slab(ModBlocks.WEATHERED_COPPER_SLAB.get())
                .stairs(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get())
                .slab(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get());

        blockModels.family(Blocks.COPPER_BLOCK.weathering().oxidized())
                .stairs(ModBlocks.OXIDIZED_COPPER_STAIRS.get())
                .slab(ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .stairs(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get())
                .slab(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get());


        blockModels.family(ModBlocks.GRANITE_BRICKS_BLOCK.get())
                .wall(ModBlocks.GRANITE_BRICKS_WALL.get())
                .stairs(ModBlocks.GRANITE_BRICKS_STAIRS.get())
                .slab(ModBlocks.GRANITE_BRICKS_SLAB.get());


        blockModels.family(ModBlocks.ANDESITE_BRICKS_BLOCK.get())
                .wall(ModBlocks.ANDESITE_BRICKS_WALL.get())
                .stairs(ModBlocks.ANDESITE_BRICKS_STAIRS.get())
                .slab(ModBlocks.ANDESITE_BRICKS_SLAB.get());


        blockModels.family(ModBlocks.DIORITE_BRICKS_BLOCK.get())
                .wall(ModBlocks.DIORITE_BRICKS_WALL.get())
                .stairs(ModBlocks.DIORITE_BRICKS_STAIRS.get())
                .slab(ModBlocks.DIORITE_BRICKS_SLAB.get());

        blockModels.family(Blocks.DRIPSTONE_BLOCK)
                .wall(ModBlocks.DRIPSTONE_WALL.get())
                .stairs(ModBlocks.DRIPSTONE_STAIRS.get())
                .slab(ModBlocks.DRIPSTONE_SLAB.get());

        blockModels.family(ModBlocks.COLORED_BRICKS_BLOCK.get())
                .wall(ModBlocks.COLORED_BRICKS_WALL.get())
                .stairs(ModBlocks.COLORED_BRICKS_STAIRS.get())
                .slab(ModBlocks.COLORED_BRICKS_SLAB.get());

        blockModels.family(ModBlocks.GRANITE_TILES_BLOCK.get())
                .wall(ModBlocks.GRANITE_TILES_WALL.get())
                .stairs(ModBlocks.GRANITE_TILES_STAIRS.get())
                .slab(ModBlocks.GRANITE_TILES_SLAB.get());

        blockModels.family(ModBlocks.ANDESITE_TILES_BLOCK.get())
                .wall(ModBlocks.ANDESITE_TILES_WALL.get())
                .stairs(ModBlocks.ANDESITE_TILES_STAIRS.get())
                .slab(ModBlocks.ANDESITE_TILES_SLAB.get());


        blockModels.family(ModBlocks.DIORITE_TILES_BLOCK.get())
                .wall(ModBlocks.DIORITE_TILES_WALL.get())
                .stairs(ModBlocks.DIORITE_TILES_STAIRS.get())
                .slab(ModBlocks.DIORITE_TILES_SLAB.get());

        blockModels.family(ModBlocks.DRIPSTONE_TILES_BLOCK.get())
                .wall(ModBlocks.DRIPSTONE_TILES_WALL.get())
                .stairs(ModBlocks.DRIPSTONE_TILES_STAIRS.get())
                .slab(ModBlocks.DRIPSTONE_TILES_SLAB.get());

        blockModels.family(ModBlocks.SMOOTH_DEEPSLATE_BLOCK.get())
                .wall(ModBlocks.SMOOTH_DEEPSLATE_WALL.get())
                .stairs(ModBlocks.SMOOTH_DEEPSLATE_STAIRS.get())
                .slab(ModBlocks.SMOOTH_DEEPSLATE_SLAB.get());

        blockModels.family(ModBlocks.SANDSTONE_BRICKS_BLOCK.get())
                .wall(ModBlocks.SANDSTONE_BRICKS_WALL.get())
                .stairs(ModBlocks.SANDSTONE_BRICKS_STAIRS.get())
                .slab(ModBlocks.SANDSTONE_BRICKS_SLAB.get());

        blockModels.family(ModBlocks.RED_SANDSTONE_BRICKS_BLOCK.get())
                .wall(ModBlocks.RED_SANDSTONE_BRICKS_WALL.get())
                .stairs(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS.get())
                .slab(ModBlocks.RED_SANDSTONE_BRICKS_SLAB.get());

        blockModels.family(ModBlocks.DRIPSTONE_BRICKS_BLOCK.get())
                .wall(ModBlocks.DRIPSTONE_BRICKS_WALL.get())
                .stairs(ModBlocks.DRIPSTONE_BRICKS_STAIRS.get())
                .slab(ModBlocks.DRIPSTONE_BRICKS_SLAB.get());

        
        blockModels.family(Blocks.TERRACOTTA)
                .wall(ModBlocks.TERRACOTTA_WALL.get())
                .stairs(ModBlocks.TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.white())
                .wall(ModBlocks.WHITE_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.WHITE_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.lightGray())
                .wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.gray())
                .wall(ModBlocks.GRAY_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.GRAY_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.black())
                .wall(ModBlocks.BLACK_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BLACK_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.brown())
                .wall(ModBlocks.BROWN_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BROWN_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.red())
                .wall(ModBlocks.RED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.RED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.RED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.orange())
                .wall(ModBlocks.ORANGE_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.ORANGE_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.yellow())
                .wall(ModBlocks.YELLOW_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.YELLOW_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.lime())
                .wall(ModBlocks.LIME_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIME_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIME_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.green())
                .wall(ModBlocks.GREEN_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.GREEN_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.cyan())
                .wall(ModBlocks.CYAN_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.CYAN_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.lightBlue())
                .wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.blue())
                .wall(ModBlocks.BLUE_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BLUE_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.purple())
                .wall(ModBlocks.PURPLE_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.PURPLE_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.magenta())
                .wall(ModBlocks.MAGENTA_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.DYED_TERRACOTTA.pink())
                .wall(ModBlocks.PINK_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.PINK_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.PINK_TERRACOTTA_SLAB.get());

        

        blockModels.family(Blocks.CONCRETE.white())
                .wall(ModBlocks.WHITE_CONCRETE_WALL.get())
                .stairs(ModBlocks.WHITE_CONCRETE_STAIRS.get())
                .slab(ModBlocks.WHITE_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.lightGray())
                .wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get())
                .stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.gray())
                .wall(ModBlocks.GRAY_CONCRETE_WALL.get())
                .stairs(ModBlocks.GRAY_CONCRETE_STAIRS.get())
                .slab(ModBlocks.GRAY_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.black())
                .wall(ModBlocks.BLACK_CONCRETE_WALL.get())
                .stairs(ModBlocks.BLACK_CONCRETE_STAIRS.get())
                .slab(ModBlocks.BLACK_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.brown())
                .wall(ModBlocks.BROWN_CONCRETE_WALL.get())
                .stairs(ModBlocks.BROWN_CONCRETE_STAIRS.get())
                .slab(ModBlocks.BROWN_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.red())
                .wall(ModBlocks.RED_CONCRETE_WALL.get())
                .stairs(ModBlocks.RED_CONCRETE_STAIRS.get())
                .slab(ModBlocks.RED_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.orange())
                .wall(ModBlocks.ORANGE_CONCRETE_WALL.get())
                .stairs(ModBlocks.ORANGE_CONCRETE_STAIRS.get())
                .slab(ModBlocks.ORANGE_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.yellow())
                .wall(ModBlocks.YELLOW_CONCRETE_WALL.get())
                .stairs(ModBlocks.YELLOW_CONCRETE_STAIRS.get())
                .slab(ModBlocks.YELLOW_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.lime())
                .wall(ModBlocks.LIME_CONCRETE_WALL.get())
                .stairs(ModBlocks.LIME_CONCRETE_STAIRS.get())
                .slab(ModBlocks.LIME_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.green())
                .wall(ModBlocks.GREEN_CONCRETE_WALL.get())
                .stairs(ModBlocks.GREEN_CONCRETE_STAIRS.get())
                .slab(ModBlocks.GREEN_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.cyan())
                .wall(ModBlocks.CYAN_CONCRETE_WALL.get())
                .stairs(ModBlocks.CYAN_CONCRETE_STAIRS.get())
                .slab(ModBlocks.CYAN_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.lightBlue())
                .wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get())
                .stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.blue())
                .wall(ModBlocks.BLUE_CONCRETE_WALL.get())
                .stairs(ModBlocks.BLUE_CONCRETE_STAIRS.get())
                .slab(ModBlocks.BLUE_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.purple())
                .wall(ModBlocks.PURPLE_CONCRETE_WALL.get())
                .stairs(ModBlocks.PURPLE_CONCRETE_STAIRS.get())
                .slab(ModBlocks.PURPLE_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.magenta())
                .wall(ModBlocks.MAGENTA_CONCRETE_WALL.get())
                .stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS.get())
                .slab(ModBlocks.MAGENTA_CONCRETE_SLAB.get());

        blockModels.family(Blocks.CONCRETE.pink())
                .wall(ModBlocks.PINK_CONCRETE_WALL.get())
                .stairs(ModBlocks.PINK_CONCRETE_STAIRS.get())
                .slab(ModBlocks.PINK_CONCRETE_SLAB.get());


        blockModels.family(Blocks.WOOL.white())
                .wall(ModBlocks.WHITE_WOOL_WALL.get())
                .stairs(ModBlocks.WHITE_WOOL_STAIRS.get())
                .slab(ModBlocks.WHITE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.lightGray())
                .wall(ModBlocks.LIGHT_GRAY_WOOL_WALL.get())
                .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.gray())
                .wall(ModBlocks.GRAY_WOOL_WALL.get())
                .stairs(ModBlocks.GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.GRAY_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.black())
                .wall(ModBlocks.BLACK_WOOL_WALL.get())
                .stairs(ModBlocks.BLACK_WOOL_STAIRS.get())
                .slab(ModBlocks.BLACK_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.brown())
                .wall(ModBlocks.BROWN_WOOL_WALL.get())
                .stairs(ModBlocks.BROWN_WOOL_STAIRS.get())
                .slab(ModBlocks.BROWN_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.red())
                .wall(ModBlocks.RED_WOOL_WALL.get())
                .stairs(ModBlocks.RED_WOOL_STAIRS.get())
                .slab(ModBlocks.RED_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.orange())
                .wall(ModBlocks.ORANGE_WOOL_WALL.get())
                .stairs(ModBlocks.ORANGE_WOOL_STAIRS.get())
                .slab(ModBlocks.ORANGE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.yellow())
                .wall(ModBlocks.YELLOW_WOOL_WALL.get())
                .stairs(ModBlocks.YELLOW_WOOL_STAIRS.get())
                .slab(ModBlocks.YELLOW_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.lime())
                .wall(ModBlocks.LIME_WOOL_WALL.get())
                .stairs(ModBlocks.LIME_WOOL_STAIRS.get())
                .slab(ModBlocks.LIME_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.green())
                .wall(ModBlocks.GREEN_WOOL_WALL.get())
                .stairs(ModBlocks.GREEN_WOOL_STAIRS.get())
                .slab(ModBlocks.GREEN_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.cyan())
                .wall(ModBlocks.CYAN_WOOL_WALL.get())
                .stairs(ModBlocks.CYAN_WOOL_STAIRS.get())
                .slab(ModBlocks.CYAN_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.lightBlue())
                .wall(ModBlocks.LIGHT_BLUE_WOOL_WALL.get())
                .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.blue())
                .wall(ModBlocks.BLUE_WOOL_WALL.get())
                .stairs(ModBlocks.BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.BLUE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.purple())
                .wall(ModBlocks.PURPLE_WOOL_WALL.get())
                .stairs(ModBlocks.PURPLE_WOOL_STAIRS.get())
                .slab(ModBlocks.PURPLE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.magenta())
                .wall(ModBlocks.MAGENTA_WOOL_WALL.get())
                .stairs(ModBlocks.MAGENTA_WOOL_STAIRS.get())
                .slab(ModBlocks.MAGENTA_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.pink())
                .wall(ModBlocks.PINK_WOOL_WALL.get())
                .stairs(ModBlocks.PINK_WOOL_STAIRS.get())
                .slab(ModBlocks.PINK_WOOL_SLAB.get());


        blockModels.family(Blocks.GLAZED_TERRACOTTA.white())
                .wall(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.lightGray())
                .wall(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.gray())
                .wall(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.black())
                .wall(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.brown())
                .wall(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.red())
                .wall(ModBlocks.RED_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.orange())
                .wall(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.yellow())
                .wall(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.lime())
                .wall(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.green())
                .wall(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.cyan())
                .wall(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.lightBlue())
                .wall(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.blue())
                .wall(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.purple())
                .wall(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.magenta())
                .wall(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(Blocks.GLAZED_TERRACOTTA.pink())
                .wall(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL.get())
                .stairs(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get())
                .slab(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get());

        blockModels.family(ModBlocks.POLISHED_END_STONE_BLOCK.get())
                .wall(ModBlocks.POLISHED_END_STONE_WALL.get())
                .stairs(ModBlocks.POLISHED_END_STONE_STAIRS.get())
                .slab(ModBlocks.POLISHED_END_STONE_SLAB.get());

        TextureMapping sandstone_pillar_block_texture = new TextureMapping()
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.END, TextureMapping.getBlockTexture(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), "_side"));

        Identifier sandstone_pillar_identifier = ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.SANDSTONE_PILLAR_BLOCK.get(), sandstone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createAxisAlignedPillarBlock(
                        ModBlocks.SANDSTONE_PILLAR_BLOCK.get(),
                        BlockModelGenerators.plainVariant(sandstone_pillar_identifier)
                )
        );
        blockModels.new BlockFamilyProvider(sandstone_pillar_block_texture)
                .wall(ModBlocks.SANDSTONE_PILLAR_WALL.get())
                .stairs(ModBlocks.SANDSTONE_PILLAR_STAIRS.get());
        Identifier sandstone_pillar_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.SANDSTONE_PILLAR_SLAB.get(), sandstone_pillar_block_texture, blockModels.modelOutput);
        Identifier sandstone_pillar_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.SANDSTONE_PILLAR_SLAB.get(), sandstone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.SANDSTONE_PILLAR_SLAB.get(),
                        BlockModelGenerators.plainVariant(sandstone_pillar_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(sandstone_pillar_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(ModBlocks.SANDSTONE_PILLAR_BLOCK.get())) //Full Block MultiVariant
                )
        );

        TextureMapping red_sandstone_pillar_block_texture = new TextureMapping()
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.END, TextureMapping.getBlockTexture(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), "_side"));

        Identifier red_sandstone_pillar_identifier = ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(), red_sandstone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createAxisAlignedPillarBlock(
                        ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get(),
                        BlockModelGenerators.plainVariant(red_sandstone_pillar_identifier)
                )
        );
        blockModels.new BlockFamilyProvider(red_sandstone_pillar_block_texture)
                .wall(ModBlocks.RED_SANDSTONE_PILLAR_WALL.get())
                .stairs(ModBlocks.RED_SANDSTONE_PILLAR_STAIRS.get());
        Identifier red_sandstone_pillar_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(), red_sandstone_pillar_block_texture, blockModels.modelOutput);
        Identifier red_sandstone_pillar_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(), red_sandstone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.RED_SANDSTONE_PILLAR_SLAB.get(),
                        BlockModelGenerators.plainVariant(red_sandstone_pillar_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(red_sandstone_pillar_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(ModBlocks.RED_SANDSTONE_PILLAR_BLOCK.get())) //Full Block MultiVariant
                )
        );


        TextureMapping purpur_pillar_block_texture = new TextureMapping()
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.PURPUR_PILLAR, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.PURPUR_PILLAR, "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.PURPUR_PILLAR, "_top"))
                .put(TextureSlot.END, TextureMapping.getBlockTexture(Blocks.PURPUR_PILLAR, "_top"))
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(Blocks.PURPUR_PILLAR, "_side"));
        
        blockModels.new BlockFamilyProvider(purpur_pillar_block_texture)
                .wall(ModBlocks.PURPUR_PILLAR_WALL.get())
                .stairs(ModBlocks.PURPUR_PILLAR_STAIRS.get());
        Identifier purpur_pillar_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.PURPUR_PILLAR_SLAB.get(), purpur_pillar_block_texture, blockModels.modelOutput);
        Identifier purpur_pillar_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.PURPUR_PILLAR_SLAB.get(), purpur_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.PURPUR_PILLAR_SLAB.get(),
                        BlockModelGenerators.plainVariant(purpur_pillar_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(purpur_pillar_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(Blocks.PURPUR_PILLAR)) //Full Block MultiVariant
                )
        );

        TextureMapping end_stone_pillar_block_texture = new TextureMapping()
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.END_STONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.END_STONE_PILLAR_BLOCK.get(), "_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.END_STONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.END, TextureMapping.getBlockTexture(ModBlocks.END_STONE_PILLAR_BLOCK.get(), "_top"))
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(ModBlocks.END_STONE_PILLAR_BLOCK.get(), "_side"));

        Identifier end_stone_pillar_identifier = ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.END_STONE_PILLAR_BLOCK.get(), end_stone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createAxisAlignedPillarBlock(
                        ModBlocks.END_STONE_PILLAR_BLOCK.get(),
                        BlockModelGenerators.plainVariant(end_stone_pillar_identifier)
                )
        );
        blockModels.new BlockFamilyProvider(end_stone_pillar_block_texture)
                .wall(ModBlocks.END_STONE_PILLAR_WALL.get())
                .stairs(ModBlocks.END_STONE_PILLAR_STAIRS.get());
        Identifier end_stone_pillar_slab_bottom = ModelTemplates.SLAB_BOTTOM.create(ModBlocks.END_STONE_PILLAR_SLAB.get(), end_stone_pillar_block_texture, blockModels.modelOutput);
        Identifier end_stone_pillar_slab_top = ModelTemplates.SLAB_TOP.create(ModBlocks.END_STONE_PILLAR_SLAB.get(), end_stone_pillar_block_texture, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createSlab(
                        ModBlocks.END_STONE_PILLAR_SLAB.get(),
                        BlockModelGenerators.plainVariant(end_stone_pillar_slab_bottom), //MultiVariant for Bottom Slab
                        BlockModelGenerators.plainVariant(end_stone_pillar_slab_top), //MultiVariant for Top slab
                        BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(ModBlocks.END_STONE_PILLAR_BLOCK.get())) //Full Block MultiVariant
                )
        );


        blockModels.family(ModBlocks.PURPUR_BRICKS_BLOCK.get())
                .wall(ModBlocks.PURPUR_BRICKS_WALL.get())
                .stairs(ModBlocks.PURPUR_BRICKS_STAIRS.get())
                .slab(ModBlocks.PURPUR_BRICKS_SLAB.get());

        blockModels.family(Blocks.MUD)
                .wall(ModBlocks.MUD_WALL.get())
                .stairs(ModBlocks.MUD_STAIRS.get())
                .slab(ModBlocks.MUD_SLAB.get());

        blockModels.family(Blocks.CALCITE)
                .wall(ModBlocks.CALCITE_WALL.get())
                .stairs(ModBlocks.CALCITE_STAIRS.get())
                .slab(ModBlocks.CALCITE_SLAB.get());

        blockModels.family(Blocks.OBSIDIAN)
                .wall(ModBlocks.OBSIDIAN_WALL.get())
                .stairs(ModBlocks.OBSIDIAN_STAIRS.get())
                .slab(ModBlocks.OBSIDIAN_SLAB.get());

        blockModels.family(Blocks.CRYING_OBSIDIAN)
                .wall(ModBlocks.CRYING_OBSIDIAN_WALL.get())
                .stairs(ModBlocks.CRYING_OBSIDIAN_STAIRS.get())
                .slab(ModBlocks.CRYING_OBSIDIAN_SLAB.get());

        blockModels.family(Blocks.DEEPSLATE)
                .wall(ModBlocks.DEEPSLATE_WALL.get())
                .stairs(ModBlocks.DEEPSLATE_STAIRS.get())
                .slab(ModBlocks.DEEPSLATE_SLAB.get());
        
    }



}
