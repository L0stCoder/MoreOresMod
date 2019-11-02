package com.moreoresmod._L0st_.recipes;

import com.moreoresmod._L0st_.init.BlockInit;
import com.moreoresmod._L0st_.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	public static void init() {
		//Copper Block
		ItemStack copper_ingot=new ItemStack(ItemInit.COPPER_INGOT, 9);
		ItemStack copper_block=new ItemStack(BlockInit.COPPER_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("copper_ingot"), null, copper_ingot, Ingredient.fromStacks(copper_block));
		//Steel Block
		ItemStack steel_ingot=new ItemStack(ItemInit.STEEL_INGOT, 9);
		ItemStack steel_block=new ItemStack(BlockInit.STEEL_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("steel_ingot"), null, steel_ingot, Ingredient.fromStacks(steel_block));
		//Ruby Block
		ItemStack ruby=new ItemStack(ItemInit.RUBY, 9);
		ItemStack ruby_block=new ItemStack(BlockInit.RUBY_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("ruby"), null, ruby, Ingredient.fromStacks(ruby_block));
		//Sapphire Block
		ItemStack sapphire=new ItemStack(ItemInit.SAPPHIRE, 9);
		ItemStack sapphire_block=new ItemStack(BlockInit.SAPPHIRE_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("sapphire"), null, sapphire, Ingredient.fromStacks(sapphire_block));
		//Cobalt Block
		ItemStack cobalt_ingot=new ItemStack(ItemInit.COBALT_INGOT, 9);
		ItemStack cobalt_block=new ItemStack(BlockInit.COBALT_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("cobalt_ingot"), null, cobalt_ingot, Ingredient.fromStacks(cobalt_block));
	}
}
