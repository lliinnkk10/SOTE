package com.github.atheera.swordsoftheend.objects.items;

import java.util.List;

import com.github.atheera.swordsoftheend.utils.KeyboardHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class ItemSwordRuby extends ItemSword {

	public ItemSwordRuby(Tier tier, int damage, float speed, Properties prop) {
		super(tier, damage, speed, prop);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new TextComponent(ChatFormatting.AQUA + "BOOOM!!"));
			tooltip.add(new TextComponent(ChatFormatting.AQUA + "Set your foes ablaze"));
			tooltip.add(new TextComponent(ChatFormatting.AQUA + "Rightclick to throw a powerful fireball"));
		} else {
			tooltip.add(new TextComponent(ChatFormatting.WHITE + "Hold " + ChatFormatting.LIGHT_PURPLE + "SHIFT" + ChatFormatting.WHITE + " for description"));
		}
		super.appendHoverText(stack, world, tooltip, flagIn);
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		if(target instanceof Mob)
			target.setSecondsOnFire(10);
			target.addEffect(new MobEffectInstance(MobEffects.WITHER, sec*10));
		return super.hurtEnemy(stack, target, attacker);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, sec*5));
		player.getCooldowns().addCooldown(this, sec*30);
		world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
		if(!world.isClientSide) {

		}
		return super.use(world, player, hand);
	}
}