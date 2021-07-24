package com.github.atheera.swordsoftheend.inits;

import com.github.atheera.swordsoftheend.Main;
import com.github.atheera.swordsoftheend.materials.ModToolTier;
import com.github.atheera.swordsoftheend.materials.Rarities;
import com.github.atheera.swordsoftheend.objects.ItemEnchanted;
import com.github.atheera.swordsoftheend.objects.ItemSwordAmethyst;
import com.github.atheera.swordsoftheend.objects.ItemSwordBase;
import com.github.atheera.swordsoftheend.objects.ItemSwordDiamond;
import com.github.atheera.swordsoftheend.objects.ItemSwordEmerald;
import com.github.atheera.swordsoftheend.objects.ItemSwordEnd;
import com.github.atheera.swordsoftheend.objects.ItemSwordLumin;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	// Initiate
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
	private static CreativeModeTab iTab = CreativeTabInit.SOTE_I_CMT;
	private final static Rarity GOLD = Rarities.GOLD;
	
	// Create
		// Gems
	public static final RegistryObject<Item> ITEM_GEM_DIAMOND_E = ITEMS.register("item_gem_diamond", 
		() -> new ItemEnchanted(new Item.Properties().tab(iTab)));
	
		// Crafting
	
		// Swords
	public static final RegistryObject<Item> ITEM_SWORD_BASE = ITEMS.register("item_sword_base", () -> new ItemSwordBase(ModToolTier.BASE, 8, -2.4f, new Item.Properties().tab(iTab).rarity(Rarities.PURPLE)));
	public static final RegistryObject<Item> ITEM_SWORD_AMETHYST = ITEMS.register("item_sword_amethyst", () -> new ItemSwordAmethyst(ModToolTier.TIERONE, 13, -2.6f, new Item.Properties().tab(iTab).rarity(GOLD)));
	public static final RegistryObject<Item> ITEM_SWORD_DIAMOND = ITEMS.register("item_sword_diamond", () -> new ItemSwordDiamond(ModToolTier.TIERONE, 10, -2.2f, new Item.Properties().tab(iTab).rarity(GOLD)));
	public static final RegistryObject<Item> ITEM_SWORD_EMERALD = ITEMS.register("item_sword_emerald", () -> new ItemSwordEmerald(ModToolTier.TIERONE, 15, -2.0f, new Item.Properties().tab(iTab).rarity(GOLD)));
	public static final RegistryObject<Item> ITEM_SWORD_END = ITEMS.register("item_sword_end", () -> new ItemSwordEnd(ModToolTier.TIERONE, 10, -2.4f, new Item.Properties().tab(iTab).rarity(GOLD)));
	public static final RegistryObject<Item> ITEM_SWORD_LUMIN = ITEMS.register("item_sword_lumin", () -> new ItemSwordLumin(ModToolTier.TIERONE, 10, -2.4f, new Item.Properties().tab(iTab).rarity(GOLD)));
	
}