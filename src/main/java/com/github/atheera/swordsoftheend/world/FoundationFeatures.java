package com.github.atheera.swordsoftheend.world;

import com.github.atheera.swordsoftheend.utils.config.OreConfig;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import com.github.atheera.swordsoftheend.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ReplaceBlockConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import javax.annotation.Nullable;
import java.util.Objects;

public class FoundationFeatures {

    private static ConfiguredFeature<?, ?> createOreFeature(Block block, RuleTest target, OreConfig config) {
        switch (config.getPlacement()) {
            case "range" -> {
                return Feature.ORE.configured(
                    new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeUniform(
                        VerticalAnchor.bottom(),
                        VerticalAnchor.absolute(config.getRange())
                ).squared().count(config.getCount());
            }
            case "triangle" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeTriangle(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared();
            }
            case "uniform" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeUniform(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared().count(config.getCount());
            }
        }
        throw new IllegalStateException("Undefined placement type");
    }

    private static ConfiguredFeature<?, ?> createOreFeature(ImmutableList<OreConfiguration.TargetBlockState> target, OreConfig config) {
        switch (config.getPlacement()) {
            case "range" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
                ).rangeUniform(
                        VerticalAnchor.bottom(),
                        VerticalAnchor.absolute(config.getRange())
                ).squared().count(config.getCount());
            }
            case "triangle" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
                ).rangeTriangle(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared();
            }
            case "uniform" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
                ).rangeUniform(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared().count(config.getCount());
            }
        }
        throw new IllegalStateException("Undefined placement type");
    }

    private static void register(Block block, ConfiguredFeature<?, ?> configuredFeature) {
        register(Objects.requireNonNull(block.getRegistryName()), configuredFeature);
    }

    private static void register(Block block, String prefix, ConfiguredFeature<?, ?> configuredFeature) {
        register(Objects.requireNonNull(setPrefixOnRegistryName(block.getRegistryName(), prefix)), configuredFeature);
    }

    public static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(ResourceLocation name, ConfiguredFeature<FC, ?> configuredFeature) {
        ConfiguredFeature<FC, ?> registeredFeature = (ConfiguredFeature<FC, ?>)Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
        Main.LOGGER.info("");
        return registeredFeature;
    }

    public static ConfiguredFeature<?, ?> registerOreFeature(ResourceLocation name, RuleTest blockType, BlockState oreBlock, int size, int count, int bottom, int top) {
        ConfiguredFeature<?, ?> feature = register(name, (ConfiguredFeature<?, ?>)((ConfiguredFeature)((ConfiguredFeature)Feature.ORE

                .configured((OreConfiguration) new OreConfiguration(blockType, oreBlock, size))

                .rangeUniform(
                        VerticalAnchor.absolute(bottom),
                        VerticalAnchor.absolute(top)))
                .squared()).count(count));
        Main.LOGGER.info("");
        return feature;
    }

    public static ConfiguredFeature<?, ?> registerReplaceBlockFeature(ResourceLocation name, BlockState replacementBlock, BlockState oreBlock, int count, int bottom, int top) {
        ConfiguredFeature<?, ?> feature = register(name, (ConfiguredFeature<?, ?>)((ConfiguredFeature)((ConfiguredFeature)Feature.REPLACE_SINGLE_BLOCK

                .configured((ReplaceBlockConfiguration) new ReplaceBlockConfiguration(replacementBlock, oreBlock))

                .rangeUniform(
                        VerticalAnchor.absolute(bottom),
                        VerticalAnchor.absolute(top)))
                .squared()).count(count));
        Main.LOGGER.info("");
        return feature;
    }

    public static ResourceLocation setPrefixOnRegistryName(@Nullable ResourceLocation registryName, String prefix) {
        return (registryName == null || prefix == null) ? null : new ResourceLocation(registryName.getNamespace(), String.format("%s_%s", new Object[] { prefix, registryName.getPath() }));
    }

}








