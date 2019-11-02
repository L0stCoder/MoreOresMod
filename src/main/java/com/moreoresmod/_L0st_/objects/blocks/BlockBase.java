package com.moreoresmod._L0st_.objects.blocks;

import com.moreoresmod._L0st_.MoreOres;
import com.moreoresmod._L0st_.init.BlockInit;
import com.moreoresmod._L0st_.init.ItemInit;
import com.moreoresmod._L0st_.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MoreOres.MOREORESMODTAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() {
		MoreOres.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory" );
	}
}
