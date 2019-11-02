package com.moreoresmod._L0st_.objects.items;

import com.moreoresmod._L0st_.MoreOres;
import com.moreoresmod._L0st_.init.ItemInit;
import com.moreoresmod._L0st_.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreOres.MOREORESMODTAB);
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		MoreOres.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
