package com.github.atheera.swordsoftheend;

import com.github.atheera.swordsoftheend.inits.BlockInit;
import com.github.atheera.swordsoftheend.inits.EnchantInit;
import com.github.atheera.swordsoftheend.inits.ItemInit;
import com.github.atheera.swordsoftheend.utils.ClientEventBus;
import com.github.atheera.swordsoftheend.utils.config.Config;
import com.github.atheera.swordsoftheend.world.OreGeneration;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

@Mod("swordsoftheend")
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "swordsoftheend";
    public static Main instance;

    public Main() {

        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config);

        try {
            Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("swordsoftheend.toml").toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::processIMC);
        modEventBus.addListener(this::doClientStuff);

        EnchantInit.ENCHANT.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BlockInit.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::addFeaturesToBiomes);
        
        MinecraftForge.EVENT_BUS.register(this);

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

        }
    }
}