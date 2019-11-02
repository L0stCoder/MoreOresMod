package com.moreoresmod._L0st_;

import com.moreoresmod._L0st_.proxy.CommonProxy;
import com.moreoresmod._L0st_.recipes.CraftingRecipes;
import com.moreoresmod._L0st_.recipes.SmeltingRecipes;
import com.moreoresmod._L0st_.tabs.MoreOresTab;
import com.moreoresmod._L0st_.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid=Reference.MOD_ID, version=Reference.VERSION, name=Reference.NAME)
public class MoreOres {
	@Instance
	public static MoreOres instance;
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final CreativeTabs MOREORESMODTAB=new MoreOresTab("moreoresmodtab");
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		SmeltingRecipes.init();
		CraftingRecipes.init();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	@EventHandler
	public void serverInit(FMLServerStartingEvent event) {
		
	}
}
