package com.github.atheera.swordsoftheend.events;

import com.github.atheera.swordsoftheend.objects.ItemSwordLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.github.atheera.swordsoftheend.Main.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class LevelupSwordsEvent {

    @SubscribeEvent
    public static void levelupEvent(LivingDeathEvent event) {

        DamageSource source = event.getSource();
        Entity entity = event.getEntity();

        if(source.getEntity() instanceof Player player) {
            ItemStack stack = player.getMainHandItem();
            Item sword = stack.getItem();

            if(sword instanceof ItemSwordLevel) {
                System.out.println("entity killed!");
                if (entity instanceof WitherBoss) ((ItemSwordLevel)sword).levelUp(stack, ItemSwordLevel.EMobType.WITHER);
                else if (entity instanceof EnderDragon) ((ItemSwordLevel)sword).levelUp(stack, ItemSwordLevel.EMobType.DRAGON);
                else ((ItemSwordLevel)sword).levelUp(stack, ItemSwordLevel.EMobType.REGULAR);
            }

        }

    }

}
