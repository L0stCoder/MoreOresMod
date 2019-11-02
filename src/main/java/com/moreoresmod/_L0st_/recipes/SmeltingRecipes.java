package com.moreoresmod._L0st_.recipes;

import com.moreoresmod._L0st_.init.BlockInit;
import com.moreoresmod._L0st_.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(BlockInit.COBALT_ORE), new ItemStack(ItemInit.COBALT_INGOT), 0.4F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER_INGOT), 0.4F);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.STEEL_INGOT), 0.4F);
	}
}
