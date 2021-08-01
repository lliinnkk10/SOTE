package com.github.atheera.swordsoftheend.inits;

import com.github.atheera.swordsoftheend.objects.blocks.BlockInfuser;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.github.atheera.swordsoftheend.Main.MOD_ID;

public class BlockInit {

    // Initiate
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final CreativeModeTab bTab = CreativeTabInit.SOTE_B_CMT;
        // Block Properties
    private static final BlockBehaviour.Properties oreProperties = BlockBehaviour.Properties.of(Material.STONE).strength(1.0f)
                         .sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops();
    private static final BlockBehaviour.Properties smeltProperties = BlockBehaviour.Properties.of(Material.METAL).strength(1.5f)
                         .sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops();

    // Create

        // * * * * * * * * * * * * Blocks * * * * * * * * * * * * \\
            // Ores
    public static final RegistryObject<Block> BLOCK_ORE_SHADITE = BLOCKS.register("block_ore_shadite",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_GOLD = BLOCKS.register("block_ore_gold",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_LUMIN = BLOCKS.register("block_ore_lumin",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_DEEP_GOLD = BLOCKS.register("block_ore_deep_gold",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_DEEP_LUMIN = BLOCKS.register("block_ore_deep_lumin",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_MAGIC = BLOCKS.register("block_ore_magic",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_DEEP_MAGIC = BLOCKS.register("block_ore_deep_magic",
        () -> new Block(oreProperties));
                // Raw
    public static final RegistryObject<Block> BLOCK_MAGIC = BLOCKS.register("block_magic",
        () -> new Block(smeltProperties));
    public static final RegistryObject<Block> BLOCK_RAW_SHADITE = BLOCKS.register("block_raw_shadite",
        () -> new Block(smeltProperties));
    public static final RegistryObject<Block> BLOCK_RAW_GOLD = BLOCKS.register("block_raw_gold",
        () -> new Block(smeltProperties));
    public static final RegistryObject<Block> BLOCK_RAW_LUMIN = BLOCKS.register("block_raw_lumin",
        () -> new Block(smeltProperties));
                // Processed
    public static final RegistryObject<Block> BLOCK_SMELT_SHADITE = BLOCKS.register("block_smelt_shadite",
        () -> new Block(smeltProperties));
    public static final RegistryObject<Block> BLOCK_SMELT_GOLD = BLOCKS.register("block_smelt_gold",
        () -> new Block(smeltProperties));
    public static final RegistryObject<Block> BLOCK_SMELT_LUMIN = BLOCKS.register("block_smelt_lumin",
        () -> new Block(smeltProperties));

            // Clusters
    public static final RegistryObject<Block> BLOCK_CLUSTER_RUBY = BLOCKS.register("block_cluster_ruby",
        () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST)
        .noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((p_152651_) -> 5)));
    public static final RegistryObject<Block> BLOCK_BUD_LARGE_RUBY = BLOCKS.register("block_bud_large_ruby",
        () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_RUBY.get())
        .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152639_) -> 3)));
    public static final RegistryObject<Block> BLOCK_BUD_MEDIUM_RUBY = BLOCKS.register("block_bud_medium_ruby",
        () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_RUBY.get())
        .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152632_) -> 2)));
    public static final RegistryObject<Block> BLOCK_BUD_SMALL_RUBY = BLOCKS.register("block_bud_small_ruby",
        () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_RUBY.get())
        .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block> BLOCK_CLUSTER_SAPPHIRE = BLOCKS.register("block_cluster_sapphire",
        () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST)
        .noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5f).lightLevel((p_152651_) -> 5)));
    public static final RegistryObject<Block> BLOCK_BUD_LARGE_SAPPHIRE = BLOCKS.register("block_bud_large_sapphire",
        () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_SAPPHIRE.get())
        .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152639_) -> 3)));
    public static final RegistryObject<Block> BLOCK_BUD_MEDIUM_SAPPHIRE = BLOCKS.register("block_bud_medium_sapphire",
        () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_SAPPHIRE.get())
        .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152632_) -> 2)));
    public static final RegistryObject<Block> BLOCK_BUD_SMALL_SAPPHIRE = BLOCKS.register("block_bud_small_sapphire",
        () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(BLOCK_CLUSTER_SAPPHIRE.get())
        .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
            // Full blocks
    public static final RegistryObject<Block> BLOCK_CRYSTAL_RUBY = BLOCKS.register("block_crystal_ruby",
        () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE)
        .strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLOCK_CRYSTAL_SAPPHIRE = BLOCKS.register("block_crystal_sapphire",
        () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE)
        .strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLOCK_ENCHANT_INFUSER = BLOCKS.register("block",
        () -> new BlockInfuser(BlockBehaviour.Properties.of(Material.STONE).strength(15.0f, 26.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));

        // * * * * * * * * * * * * Temporary * * * * * * * * * * * * \\
    public static final RegistryObject<Block> BLOCK_ORE_RUBY = BLOCKS.register("block_ore_ruby",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_DEEP_RUBY = BLOCKS.register("block_ore_deep_ruby",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_SAPPHIRE = BLOCKS.register("block_ore_sapphire",
        () -> new Block(oreProperties));
    public static final RegistryObject<Block> BLOCK_ORE_DEEP_SAPPHIRE = BLOCKS.register("block_ore_deep_sapphire",
        () -> new Block(oreProperties));

    public static final RegistryObject<Item> ITEM_BLOCK_ORE_RUBY = ITEMS.register("block_ore_ruby",
            () -> new BlockItem(BLOCK_ORE_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_DEEP_RUBY= ITEMS.register("block_ore_deep_ruby",
            () -> new BlockItem(BLOCK_ORE_DEEP_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_SAPPHIRE = ITEMS.register("block_ore_sapphire",
            () -> new BlockItem(BLOCK_ORE_SAPPHIRE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_DEEP_SAPPHIRE = ITEMS.register("block_ore_deep_sapphire",
            () -> new BlockItem(BLOCK_ORE_DEEP_SAPPHIRE.get(), new Item.Properties().tab(bTab)));


        // * * * * * * * * * * * * Block items * * * * * * * * * * * * \\
            // Ores
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_SHADITE = ITEMS.register("block_ore_shadite",
        () -> new BlockItem(BLOCK_ORE_SHADITE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_GOLD = ITEMS.register("block_ore_gold",
        () -> new BlockItem(BLOCK_ORE_GOLD.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_LUMIN = ITEMS.register("block_ore_lumin",
        () -> new BlockItem(BLOCK_ORE_LUMIN.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_DEEP_GOLD = ITEMS.register("block_ore_deep_gold",
        () -> new BlockItem(BLOCK_ORE_DEEP_GOLD.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_DEEP_LUMIN = ITEMS.register("block_ore_deep_lumin",
        () -> new BlockItem(BLOCK_ORE_DEEP_LUMIN.get(), new Item.Properties().tab(bTab)));

    public static final RegistryObject<Item> ITEM_BLOCK_ORE_MAGIC = ITEMS.register("block_ore_magic",
        () -> new BlockItem(BLOCK_ORE_MAGIC.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_ORE_DEEP_MAGIC = ITEMS.register("block_ore_deep_magic",
        () -> new BlockItem(BLOCK_ORE_DEEP_MAGIC.get(), new Item.Properties().tab(bTab)));

            // Raw
    public static final RegistryObject<Item> ITEM_BLOCK_RAW_SHADITE = ITEMS.register("block_raw_shadite",
        () -> new BlockItem(BLOCK_RAW_SHADITE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_RAW_GOLD = ITEMS.register("block_raw_gold",
        () -> new BlockItem(BLOCK_RAW_GOLD.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_RAW_LUMIN = ITEMS.register("block_raw_lumin",
        () -> new BlockItem(BLOCK_RAW_LUMIN.get(), new Item.Properties().tab(bTab)));
            // Processed
    public static final RegistryObject<Item> ITEM_BLOCK_MAGIC = ITEMS.register("block_magic",
        () -> new BlockItem(BLOCK_MAGIC.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_SMELT_SHADITE = ITEMS.register("block_smelt_shadite",
        () -> new BlockItem(BLOCK_SMELT_SHADITE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_SMELT_GOLD = ITEMS.register("block_smelt_gold",
        () -> new BlockItem(BLOCK_SMELT_GOLD.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_SMELT_LUMIN = ITEMS.register("block_smelt_lumin",
        () -> new BlockItem(BLOCK_SMELT_LUMIN.get(), new Item.Properties().tab(bTab)));

            // Gems
    public static final RegistryObject<Item> ITEM_BLOCK_CLUSTER_RUBY = ITEMS.register("block_cluster_ruby",
        () -> new BlockItem(BLOCK_CLUSTER_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_LARGE_RUBY = ITEMS.register("block_bud_large_ruby",
        () -> new BlockItem(BLOCK_BUD_LARGE_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_MEDIUM_RUBY = ITEMS.register("block_bud_medium_ruby",
        () -> new BlockItem(BLOCK_BUD_MEDIUM_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_SMALL_RUBY = ITEMS.register("block_bud_small_ruby",
        () -> new BlockItem(BLOCK_BUD_SMALL_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_CLUSTER_SAPPHIRE = ITEMS.register("block_cluster_sapphire",
        () -> new BlockItem(BLOCK_CLUSTER_SAPPHIRE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_LARGE_SAPPHIRE = ITEMS.register("block_bud_large_sapphire",
        () -> new BlockItem(BLOCK_BUD_LARGE_SAPPHIRE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_MEDIUM_SAPPHIRE = ITEMS.register("block_bud_medium_sapphire",
        () -> new BlockItem(BLOCK_BUD_MEDIUM_SAPPHIRE.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_BUD_SMALL_SAPPHIRE = ITEMS.register("block_bud_small_sapphire",
        () -> new BlockItem(BLOCK_BUD_SMALL_SAPPHIRE.get(), new Item.Properties().tab(bTab)));
                // Full blocks
    public static final RegistryObject<Item> ITEM_BLOCK_CRYSTAL_RUBY = ITEMS.register("block_crystal_ruby",
        () -> new BlockItem(BLOCK_CRYSTAL_RUBY.get(), new Item.Properties().tab(bTab)));
    public static final RegistryObject<Item> ITEM_BLOCK_CRYSTAL_SAPPHIRE = ITEMS.register("block_crystal_sapphire",
        () -> new BlockItem(BLOCK_CRYSTAL_SAPPHIRE.get(), new Item.Properties().tab(bTab)));

}