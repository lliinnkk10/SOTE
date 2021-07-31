package com.github.atheera.swordsoftheend.inits;

import com.github.atheera.swordsoftheend.objects.blocks.BlockInfuser;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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

    // Create

        // Blocks
            // Ores
    public static final RegistryObject<OreBlock> BLOCK_ORE_SHADITE = BLOCKS.register("block_ore_shadite",
        () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 5.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<OreBlock> BLOCK_ORE_GOLD = BLOCKS.register("block_ore_gold",
        () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 5.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<OreBlock> BLOCK_ORE_LUMIN = BLOCKS.register("block_ore_lumin",
        () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 5.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<OreBlock> BLOCK_ORE_DEEP_GOLD = BLOCKS.register("block_ore_deep_gold",
        () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 5.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<OreBlock> BLOCK_ORE_DEEP_LUMIN = BLOCKS.register("block_ore_deep_lumin",
        () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 5.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));

    public static final RegistryObject<Block> BLOCK_ENCHANT_INFUSER = BLOCKS.register("block",
        () -> new BlockInfuser(BlockBehaviour.Properties.of(Material.STONE).strength(15.0f, 26.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));

        // Block items
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
}