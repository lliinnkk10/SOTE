package com.github.atheera.swordsoftheend.objects;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemEnchanted extends Item {

	public ItemEnchanted(Properties p_41383_) {
		super(p_41383_);
	}
	
	@Override
	public boolean isFoil(ItemStack p_41453_) {
		return true;
	}
	
}