package org.civilization.client;

@Mod(modid = Civilization.MODID, name = Civilization.NAME, version = Civilization.VERSION)
public class Civilization
{
    public static final String MODID = "Civilization";
    public static final String NAME = "Civilization Mod";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}