package org.civilization.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.civilization.client.Civilization;

public class BaseItem extends Item{
    protected String name;

    public BaseItem(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(){
        Civilization.proxy.registerItemRender(this, 0, name);
    }

    @Override
    public BaseItem setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
