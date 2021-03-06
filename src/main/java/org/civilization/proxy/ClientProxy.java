package org.civilization.proxy;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.civilization.client.Civilization;

@Mod.EventBusSubscriber(modid = Civilization.MODID, value = Side.CLIENT)
public class ClientProxy extends  CommonProxy {

    @Override
    public void preInitializationEvent(FMLPreInitializationEvent event){
        super.preInitializationEvent(event);
    }

    @Override
    public void initializationEvent(FMLInitializationEvent event){
        super.initializationEvent(event);
    }

    @Override
    public void postInitializationEvent(FMLPostInitializationEvent event){
        super.postInitializationEvent(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){

    }

    @Override
    public void registerRenderers(){

    }

    /*Old version? public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Civilization.MODID + ":" + id, "inventory"));
    }*/
}
