package com.github.atheera.swordsoftheend;

import com.github.atheera.swordsoftheend.inits.EnchantInit;
import com.github.atheera.swordsoftheend.utils.ClientEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.atheera.swordsoftheend.inits.ItemInit;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("swordsoftheend")
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "swordsoftheend";
    public static Main instance;

    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::processIMC);
        modEventBus.addListener(this::doClientStuff);

        EnchantInit.ENCHANT.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        instance = this;
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    	event.enqueueWork(ClientEventBus::registerPropertyOverride);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
    	
    }

    private void processIMC(final InterModProcessEvent event) {
    	
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
    

}
