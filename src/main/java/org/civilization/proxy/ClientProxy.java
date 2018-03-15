package org.civilization.proxy;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import org.civilization.client.Civilization;

public class ClientProxy extends  CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Civilization.MODID + ":" + id, "inventory"));
    }
}
