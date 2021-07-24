package com.github.atheera.swordsoftheend.objects;

import java.util.List;

import com.github.atheera.swordsoftheend.utils.KeyboardHelper;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ItemSwordAmethyst extends ItemSword {

	public ItemSwordAmethyst(Tier tier, int damage, float speed, Properties prop) {
		super(tier, damage, speed, prop);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new TextComponent(ChatFormatting.AQUA + "Suck your enemies"));
			tooltip.add(new TextComponent(ChatFormatting.AQUA + "Drain the life of your foes, healing you with every hit and giving you temporary protection"));
		} else {
			tooltip.add(new TextComponent(ChatFormatting.WHITE + "Hold " + ChatFormatting.LIGHT_PURPLE + "SHIFT" + ChatFormatting.WHITE + " for description"));
		}
		super.appendHoverText(stack, world, tooltip, flagIn);
	}
	
	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		
		if(attacker instanceof Player) {
			attacker.heal(1.5f);
			attacker.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, sec*5));
		}
		
		return super.hurtEnemy(stack, target, attacker);
	}
	
}