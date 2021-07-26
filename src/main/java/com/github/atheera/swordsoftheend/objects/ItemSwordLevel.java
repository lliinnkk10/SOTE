package com.github.atheera.swordsoftheend.objects;

import java.util.List;

import com.github.atheera.swordsoftheend.materials.Rarities;
import com.github.atheera.swordsoftheend.utils.KeyboardHelper;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class ItemSwordLevel extends ItemSword {

	public String tagLevel = "level";
	public int level;
	public int ms1 = 5, ms2 = 10, ms3 = 20, ms4 = 30, ms5 = 40, ms6 = 50, ms7 = 60, ms8 = 70, ms9 = 80, ms10 = 90;
	public int fms1 = 50, fms2 = 125, fms3 = 250, fms4 = 500, fms5 = 750, fms6 = 1000, fms7 = 1250, fms8 = 1500, fms9 = 2000, fms10 = 2500;

	public String tagDragon = "dragon";
	public boolean dragon;
	public String tagDragonLvl = "dragonLvl";
	public int dragonLvl;

	public String tagWither = "wither";
	public boolean wither;
	public String tagWitherLvl = "witherLvl";
	public boolean witherLvl;

	public String tagAdded = "added";
	public boolean added;

	public ItemSwordLevel(Tier tier, int damage, float speed, Properties prop) {
		super(tier, damage, speed, prop);
	}

	public void levelUp(ItemStack stack, EMobType type) {
		CompoundTag nbt = stack.getOrCreateTag();
		this.level = nbt.getInt(this.tagLevel);
		switch (type) { // Levels up and sets milestone tags
			case DRAGON -> {
				nbt.putInt(this.tagLevel, level + 25);
				nbt.putBoolean(this.tagDragon, true);
				nbt.putInt(this.tagDragonLvl, nbt.getInt(tagDragonLvl) + 1);
			}
			case WITHER -> {
				nbt.putInt(this.tagLevel, level + 10);
				nbt.putBoolean(this.tagWither, true);
				nbt.putInt(this.tagWitherLvl, nbt.getInt(tagWitherLvl) + 1);
			}
			case REGULAR -> nbt.putInt(this.tagLevel, level + 1);
		}
	}

	@Override
	public void inventoryTick(ItemStack stack, Level world, Entity entity, int time, boolean held) {
		CompoundTag nbt = stack.getOrCreateTag();
		/*if(!nbt.getBoolean(this.tagAdded)) {
			this.dragon = nbt.getBoolean(this.tagDragon);
			nbt.putBoolean(this.tagDragon, false);
			this.wither = nbt.getBoolean(this.tagWither);
			nbt.putBoolean(this.tagWither, false);
			this.level = nbt.getInt(this.tagLevel);
			nbt.putInt(this.tagLevel, 0);
			this.added = nbt.getBoolean(this.tagAdded);
			nbt.putBoolean(this.tagAdded, true);
		}*/

		super.inventoryTick(stack, world, entity, time, held);
	}

	public void setAbilities(ItemStack stack) {
		CompoundTag nbt = stack.getOrCreateTag();
		this.level = nbt.getInt(this.tagLevel);

		if(checkMS(stack) == 0) {

		} else if(checkMS(stack) == 1) {

		} else if(checkMS(stack) == 2) {

		} else if(checkMS(stack) == 3) {

		} else if(checkMS(stack) == 4) {

		} else if(checkMS(stack) == 5) {

		} else if(checkMS(stack) == 6) {

		} else if(checkMS(stack) == 7) {

		} else if(checkMS(stack) == 8) {

		} else if(checkMS(stack) == 9) {

		} else if(checkMS(stack) == 10) {

		} else {

		}

	}

	// Checks the level of the stack and returns it as an int of the milestone
	public int checkMS(ItemStack stack) {
		CompoundTag nbt = stack.getOrCreateTag();
		int lvl = nbt.getInt(this.tagLevel);
		boolean wthr = nbt.getBoolean(this.tagWither);
		boolean drgn = nbt.getBoolean(this.tagDragon);

		boolean cWD = (wthr && drgn);
		boolean cwd = (!wthr && !drgn);

		if(lvl >= ms1 && lvl < ms2) { return 1; }
		else if(lvl >= ms2 && lvl < ms3) { return 2; }
		else if(lvl >= ms3 && lvl < ms4) { return 3; }
		else if(lvl >= ms4 && lvl < ms5) { return 4; }
		else if(lvl >= ms5 && lvl < ms6) { return 5; }
		else if(((lvl >= ms6 && lvl < ms7) && cwd) || ((lvl > ms6) && cwd)) { return 6; }
		else if(((lvl >= ms7 && lvl < ms8) && wthr) || ((lvl > ms8) && wthr)) { return 7; }
		else if(((lvl >= ms8 && lvl < ms9) && wthr) || ((lvl > ms9) && wthr)) { return 8; }
		else if(((lvl >= ms9 && lvl < ms10) && wthr) || ((lvl > ms10) && wthr)) { return 9; }
		else if((lvl >= ms10) && cWD) { return 10; }
		else return 0;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
		Multimap<Attribute, AttributeModifier> map = HashMultimap.create();

		if(slot == EquipmentSlot.MAINHAND) {
			map.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -2.4f, AttributeModifier.Operation.ADDITION));
			if(checkMS(stack) == 0) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 9, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 1) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 10, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 2) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 11, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 3) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 12, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 4) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 13, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 5) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 14, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 6) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 15, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 7) {
				map.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -2.2f, AttributeModifier.Operation.ADDITION));
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 16, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 8) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 17, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 9) {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 18, AttributeModifier.Operation.ADDITION));
			} else if(checkMS(stack) == 10) {
				map.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", -2.0f, AttributeModifier.Operation.ADDITION));
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 19, AttributeModifier.Operation.ADDITION));
			} else {
				map.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", 9, AttributeModifier.Operation.ADDITION));
			}
		}

		return map;
	}

	public enum EMobType {
		WITHER,
		DRAGON,
		REGULAR
	}

	@Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flagIn) {
		ChatFormatting aqua = ChatFormatting.AQUA;
		ChatFormatting green = ChatFormatting.GREEN;
		ChatFormatting white = ChatFormatting.WHITE;
		ChatFormatting purple = ChatFormatting.LIGHT_PURPLE;
		CompoundTag nbt = stack.getOrCreateTag();
		int lvl = nbt.getInt(this.tagLevel);
		boolean wthr = nbt.getBoolean(this.tagWither);
		boolean drgn = nbt.getBoolean(this.tagDragon);

		tooltip.add(new TextComponent(aqua + "Currently absorbed " + green + lvl + aqua + " souls"));
		tooltip.add(new TextComponent(aqua + "Currently absorbed " + green + nbt.getInt(tagWitherLvl) + aqua + " wither souls : " + green + wthr));
		tooltip.add(new TextComponent(aqua + "Currently absorbed " + green + nbt.getInt(tagDragonLvl) + aqua + " dragon souls: " + green + drgn));
		tooltip.add(new TextComponent(aqua + "Milestone: " + green + checkMS(stack)));
		if(KeyboardHelper.isHoldingShift()) { // SHIFT information
			if(lvl == 0) {
				tooltip.add(new TextComponent(aqua + "Crafted with a dull edge that can absorb souls from slain foes"));
				tooltip.add(new TextComponent(aqua + "Passing certain thresholds, the sword greatly increases in power, gaining damage every level"));
				tooltip.add(new TextComponent(aqua + "At maximum capacity, " + green + ms10 + aqua + ", the sword obliterates everything hit"));
			}
			if(checkMS(stack) == 0) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms1 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "slowness and lifesteal" + aqua + " to attacks"));
			}
			if(checkMS(stack) == 1) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms2 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "speed 1 and jump boost 1" + aqua + " to right click"));
			}
			if(checkMS(stack) == 2) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms3 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "poison 1 and lifesteal 2" + aqua + " to attacks"));
			}
			if(checkMS(stack) == 3) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms4 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "strength 1 and resistance 1" + aqua + " to right click"));
			}
			if(checkMS(stack) == 4) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms5 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "slowness 2 and lifesteal 3" + aqua + " to attacks"));
			}
			if(checkMS(stack) == 5) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms6 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "jump boost 2 and fire resistance" + aqua + " to right click"));
			}
			if(checkMS(stack) == 6) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms7 - lvl) + aqua + " souls is required for the next evolution:"));
				if(!wthr) tooltip.add(new TextComponent(aqua + "The sword also requires a " + green + "wither boss" + aqua + " soul to improve further"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "poison 2 and wither 2" + aqua + " to attacks"));
				tooltip.add(new TextComponent(aqua + "And increased " + green + "attack speed"));
			}
			if(checkMS(stack) == 7) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms8 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "speed 3 and strength 3" + aqua + " to right click"));
			}
			if(checkMS(stack) == 8) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms9 - lvl) + aqua + " souls is required for the next evolution:"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "lifesteal 4" + aqua + " to attacks"));
				tooltip.add(new TextComponent(aqua + "And " + green + "haste 1 and resistance 2" + aqua + " to right click"));
			}
			if(checkMS(stack) == 9) {
				tooltip.add(new TextComponent(aqua + "Another " + green + (ms10 - lvl) + aqua + " souls is required for the next evolution:"));
				if(!drgn) tooltip.add(new TextComponent(aqua + "The sword also requires a " + green + "dragon boss" + aqua + " soul to improve further"));
				tooltip.add(new TextComponent(aqua + "Add " + green + "poison 3, lifesteal 5 and fire aspect" + aqua + " to attacks"));
				tooltip.add(new TextComponent(aqua + "And " + green + "all right click effects" + aqua + " permanently when holding the sword"));
				tooltip.add(new TextComponent(aqua + "And increased " + green + "attack speed"));
			}
			if(checkMS(stack) == 10) {
				tooltip.add(new TextComponent(aqua + "No more buffs to acquire, fully evolved sword"));
				tooltip.add(new TextComponent(white + "Hold " + purple + "CTRL" + white + " to see all current buffs"));
			}
		} else if(KeyboardHelper.isHoldingCtrl()) { // CTRL information
			tooltip.add(new TextComponent(aqua + "The current buffs are:"));
			if(lvl == 0) {
				tooltip.add(new TextComponent(aqua + "You have not absorbed any souls yet"));
				tooltip.add(new TextComponent(aqua + "Kill something to absorb their power"));
				tooltip.add(new TextComponent(aqua + "and infuse the sword for powerful effects"));
			} else if(checkMS(stack) == 0) {
				tooltip.add(new TextComponent(aqua + "Not enough souls for improvement yet"));
			} else if(checkMS(stack) == 1) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 1 and lifesteal 1"));
			} else if(checkMS(stack) == 2) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 1 and lifesteal 1"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1 and jump boost 1"));
			} else if(checkMS(stack) == 3) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 1 and lifesteal 2"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1 and jump boost 1"));
			} else if(checkMS(stack) == 4) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 1, lifesteal 2 and poison 1"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1, jump boost 1, strength 1 and resistance 1"));
			} else if(checkMS(stack) == 5) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 1, lifesteal 3 and poison 1"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1, jump boost 1, strength 1 and resistance 1"));
			} else if(checkMS(stack) == 6) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 2, lifesteal 3 and poison 1"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1, jump boost 2, strength 1, resistance 1 and fire resistance"));
			} else if(checkMS(stack) == 7) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 2, lifesteal 3, poison 2 and wither 2"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 1, jump boost 2, strength 1, resistance 1 and fire resistance"));
			} else if(checkMS(stack) == 8) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 2, lifesteal 3, poison 2 and wither 2"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 3, jump boost 2, strength 3, resistance 1 and fire resistance"));
			} else if(checkMS(stack) == 9) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 2, lifesteal 4, poison 2 and wither 2"));
				tooltip.add(new TextComponent(aqua + "Right click: " + green + "speed 3, jump boost 2, strength 3, resistance 2, fire resistance and haste 1"));
			} else if(checkMS(stack) == 10) {
				tooltip.add(new TextComponent(aqua + "Attacks: " + green + "slowness 2, lifesteal 5, poison 3, wither 2 and fire aspect"));
				tooltip.add(new TextComponent(aqua + "Holding sword: " + green + ""));
			}
		} else {
			tooltip.add(new TextComponent(white + "Hold " + purple + "SHIFT" + white + " for more information"));
			tooltip.add(new TextComponent(white + "Hold " + purple + "CTRL" + white + " to see all current buffs"));
		}
		super.appendHoverText(stack, world, tooltip, flagIn);
	}

	@Override
	public Rarity getRarity(ItemStack stack) {
		if(checkMS(stack) >= 2 && checkMS(stack) < 4) return Rarities.GREEN;
		else if(checkMS(stack) >= 4 && checkMS(stack) < 7) return Rarities.BLUE;
		else if(checkMS(stack) >= 7 && checkMS(stack) < 10) return Rarities.PURPLE;
		else if(checkMS(stack) == 10) return Rarities.GOLD;
		return Rarity.COMMON;
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return (checkMS(stack) == 10);
	}
}