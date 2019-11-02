package com.moreoresmod._L0st_.init;

import java.util.ArrayList;
import java.util.List;

import com.moreoresmod._L0st_.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS=new ArrayList<Block>();
	
	public static final Block COPPER_ORE=new BlockBase("copper_ore", Material.ROCK);
	public static final Block COPPER_BLOCK=new BlockBase("copper_block", Material.IRON);
	public static final Block RUBY_ORE=new BlockBase("ruby_ore", Material.ROCK);
	public static final Block RUBY_BLOCK=new BlockBase("ruby_block", Material.IRON);
	public static final Block SAPPHIRE_ORE=new BlockBase("sapphire_ore", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK=new BlockBase("sapphire_block", Material.IRON);
	public static final Block COBALT_ORE=new BlockBase("cobalt_ore", Material.ROCK);
	public static final Block COBALT_BLOCK=new BlockBase("cobalt_block", Material.IRON);
	public static final Block STEEL_BLOCK=new BlockBase("steel_block", Material.IRON);
}
