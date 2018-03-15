package org.civilization.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.civilization.client.Civilization;

@Mod.EventBusSubscriber(modid = Civilization.MODID)
public class CommonProxy {

    public void preInitializationEvent(FMLPreInitializationEvent event){

    }

    public void initializationEvent(FMLInitializationEvent event){


    }

    public void postInitializationEvent(FMLPostInitializationEvent event){


    }


    /*Outdated minecraft?public void registerItemRender(Item item, int meta, String id){

    }*/

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){

    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event){

    }

    public void registerRenderers(){

    }

    public void registerRecipes(){}

}
