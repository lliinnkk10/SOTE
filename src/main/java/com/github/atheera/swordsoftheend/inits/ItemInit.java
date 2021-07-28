package com.github.atheera.swordsoftheend.inits;

import com.github.atheera.swordsoftheend.Main;
import com.github.atheera.swordsoftheend.materials.ModToolTier;
import com.github.atheera.swordsoftheend.materials.Rarities;
import com.github.atheera.swordsoftheend.objects.*;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	// Initiate
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
	private static final CreativeModeTab iTab = CreativeTabInit.SOTE_I_CMT;
	private static final CreativeModeTab sTab = CreativeTabInit.SOTE_S_CMT;
	private static final Rarity GOLD = Rarities.GOLD;
	
	// Create
		// Ingots
	public static final RegistryObject<Item> ITEM_INGOT_GOLD = ITEMS.register("item_ingot_gold",
		() -> new Item(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_INGOT_LUMIN = ITEMS.register("item_ingot_lumin",
		() -> new Item(new Item.Properties().tab(iTab)));
		// Gems
	public static final RegistryObject<Item> ITEM_GEM_AMETHYST = ITEMS.register("item_gem_amethyst",
		() -> new Item(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_GEM_RUBY = ITEMS.register("item_gem_ruby",
		() -> new Item(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_GEM_SAPPHIRE = ITEMS.register("item_gem_sapphire",
		() -> new Item(new Item.Properties().tab(iTab)));
			// Shards
	public static final RegistryObject<Item> ITEM_GEM_RUBY_S = ITEMS.register("item_shard_ruby",
		() -> new Item(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_GEM_SAPPHIRE_S = ITEMS.register("item_shard_sapphire",
		() -> new Item(new Item.Properties().tab(iTab)));
			// Enchanted
	public static final RegistryObject<ItemEnchanted> ITEM_DUST_MAGIC_E = ITEMS.register("item_dust_magic",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	public static final RegistryObject<ItemEnchanted> ITEM_GEM_AMETHYST_E = ITEMS.register("item_gem_amethyst_e",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	public static final RegistryObject<ItemEnchanted> ITEM_GEM_DIAMOND_E = ITEMS.register("item_gem_diamond_e",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	public static final RegistryObject<ItemEnchanted> ITEM_GEM_EMERALD_E = ITEMS.register("item_gem_emerald_e",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	public static final RegistryObject<ItemEnchanted> ITEM_GEM_RUBY_E = ITEMS.register("item_gem_ruby_e",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	public static final RegistryObject<ItemEnchanted> ITEM_GEM_SAPPHIRE_E = ITEMS.register("item_gem_sapphire_e",
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	
		// Crafting
			// Cores
	public static final RegistryObject<Item> ITEM_CORE_AMETHYST = ITEMS.register("item_core_amethyst",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_BASE = ITEMS.register("item_core_base",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_DIAMOND = ITEMS.register("item_core_diamond",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_EMERALD = ITEMS.register("item_core_emerald",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_END = ITEMS.register("item_core_end",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_LEVEL = ITEMS.register("item_core_level",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_LUMIN = ITEMS.register("item_core_lumin",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_RUBY = ITEMS.register("item_core_ruby",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_SAPPHIRE = ITEMS.register("item_core_sapphire",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_THUNDER = ITEMS.register("item_core_thunder",
		() -> new ItemCore(new Item.Properties().tab(iTab)));
	public static final RegistryObject<Item> ITEM_CORE_ULTIMATE = ITEMS.register("item_core_ultimate",
		() -> new ItemCore(new Item.Properties().tab(iTab)));

		// Tier 1


		// Swords
	public static final RegistryObject<ItemSwordBase> ITEM_SWORD_BASE = ITEMS.register("item_sword_base",
		() -> new ItemSwordBase(ModToolTier.BASE, 8, -2.4f, new Item.Properties().tab(sTab).rarity(Rarities.PURPLE)));

	public static final RegistryObject<ItemSwordAmethyst> ITEM_SWORD_AMETHYST = ITEMS.register("item_sword_amethyst",
		() -> new ItemSwordAmethyst(ModToolTier.TIERONE, 13, -2.0f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordDiamond> ITEM_SWORD_DIAMOND = ITEMS.register("item_sword_diamond",
		() -> new ItemSwordDiamond(ModToolTier.TIERONE, 11, -1.4f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordEmerald> ITEM_SWORD_EMERALD = ITEMS.register("item_sword_emerald",
		() -> new ItemSwordEmerald(ModToolTier.TIERONE, 16, -1.8f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordEnd> ITEM_SWORD_END = ITEMS.register("item_sword_end",
		() -> new ItemSwordEnd(ModToolTier.TIERONE, 13, -2.4f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordLumin> ITEM_SWORD_LUMIN = ITEMS.register("item_sword_lumin",
		() -> new ItemSwordLumin(ModToolTier.TIERONE, 11, -1.6f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordSapphire> ITEM_SWORD_SAPPHIRE = ITEMS.register("item_sword_sapphire",
		() -> new ItemSwordSapphire(ModToolTier.TIERONE, 12, -2.2f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordRuby> ITEM_SWORD_RUBY = ITEMS.register("item_sword_ruby",
		() -> new ItemSwordRuby(ModToolTier.TIERONE, 14, -2.4f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordThunder> ITEM_SWORD_THUNDER = ITEMS.register("item_sword_thunder",
		() -> new ItemSwordThunder(ModToolTier.TIERONE, 19, -2.8f, new Item.Properties().tab(sTab).rarity(GOLD)));
	public static final RegistryObject<ItemSwordLevel> ITEM_SWORD_LEVEL = ITEMS.register("item_sword_level",
		() -> new ItemSwordLevel(ModToolTier.TIERONE, 0, -2.4f, new Item.Properties().tab(sTab)));
	public static final RegistryObject<ItemSwordUltimate> ITEM_SWORD_ULTIMATE = ITEMS.register("item_sword_ultimate",
		() -> new ItemSwordUltimate(ModToolTier.TIERONE, 24, -1.6f, new Item.Properties().tab(sTab).rarity(GOLD)));
}