package com.github.atheera.swordsoftheend.objects;

import com.github.atheera.swordsoftheend.inits.ItemInit;
import com.github.atheera.swordsoftheend.utils.KeyboardHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemCore extends Item {
    public ItemCore(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flagIn) {
        Item item = stack.getItem();
        ChatFormatting aqua = ChatFormatting.AQUA;
        if(KeyboardHelper.isHoldingShift()) {

            if(item == ItemInit.ITEM_CORE_AMETHYST.get()) tooltip.add(new TextComponent(aqua + ""));

        } else {
            tooltip.add(new TextComponent(ChatFormatting.WHITE + "Hold " + ChatFormatting.LIGHT_PURPLE + "SHIFT" + ChatFormatting.WHITE + " for description"));
        }
        super.appendHoverText(stack, world, tooltip, flagIn);
    }
}