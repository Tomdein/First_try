package org.civilization.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.civilization.proxy.CommonProxy;

@SuppressWarnings("all")
@Mod(modid = Civilization.MODID, name = Civilization.NAME, version = Civilization.VERSION)
public class Civilization
{
    public static final String MODID = "civilization";
    public static final String NAME = "Civilization Mod";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @SidedProxy(serverSide = "org.civilization.proxy.ServerProxy", clientSide = "org.civilization.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static Civilization instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();

        proxy.preInitializationEvent(event);

        //org.civilization.items.ModItems.init();

        System.out.println(MODID + " is preLoad");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.initializationEvent(event);

        System.out.println(MODID + " is Loading");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInitializationEvent(event);

        System.out.println(MODID + " is postLoad");
    }

    public static String appendModID(String value){
        return MODID + ":" + value;
    }
}