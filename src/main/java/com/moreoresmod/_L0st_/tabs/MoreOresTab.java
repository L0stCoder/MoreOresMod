package com.moreoresmod._L0st_.tabs;

import com.moreoresmod._L0st_.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreOresTab extends CreativeTabs{
	public MoreOresTab(String label) {
		super("moreoresmodtab");
		this.setBackgroundImageName("tab_moreoresmod.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.OBSIDIAN_INGOT);
	}
}
