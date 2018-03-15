/*package org.civilization.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static BaseItem ingot;

    public static void init(){
        ingot = register(new BaseItem("ingot"));
    }

    private static <T extends Item> T register(T item){
        GameRegistry.register(item);

        if(item instanceof BaseItem){
            ((BaseItem)item).registerItemModel();
        }

        return item;

    }
}
*/