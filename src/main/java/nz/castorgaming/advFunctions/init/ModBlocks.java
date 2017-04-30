package nz.castorgaming.advFunctions.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nz.castorgaming.advFunctions.AdvFunctions;
import nz.castorgaming.advFunctions.blocks.BlockRubber;



public class ModBlocks {

	public static Block rubberBlock;
	
	public static void init(){
		rubberBlock = new BlockRubber();
	}
	
	public static void register(){
		registerBlock(rubberBlock);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		block.setCreativeTab(AdvFunctions.tabAdvFuncBlocks);
	}
	
	public static void registerRenders(){
		registerRender(rubberBlock);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
