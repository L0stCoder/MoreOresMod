package com.moreoresmod._L0st_.util.handlers;

import com.moreoresmod._L0st_.init.BlockInit;
import com.moreoresmod._L0st_.init.ItemInit;
import com.moreoresmod._L0st_.recipes.CraftingRecipes;
import com.moreoresmod._L0st_.recipes.SmeltingRecipes;
import com.moreoresmod._L0st_.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
   
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ItemInit.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS) {
        	if(block instanceof IHasModel) {
        		((IHasModel)block).registerModels();
        	}
        }
    }
    @SubscribeEvent
    public static void onBlockRegistered(RegistryEvent.Register<Block> event) {
    	event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
   
    public static void preInitRegistries(){
       
    }
   
    public static void initRegistries(){
       SmeltingRecipes.init();
       CraftingRecipes.init();
    }
   
    public static void postInitRegistries(){
       
    }
   
    public static void serverRegistries(FMLServerStartingEvent event){
       
    }
}