package nz.castorgaming.advFunctions.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nz.castorgaming.advFunctions.AdvFunctions;
import nz.castorgaming.advFunctions.items.ItemObsidianingot;
import nz.castorgaming.advFunctions.items.ItemRubberBall;


public class ModItems {

	public static Item obsidianingot;
	public static Item rubberBall;
	
	public static void init(){
		obsidianingot = new ItemObsidianingot();
		rubberBall = new ItemRubberBall();
	}
	
	public static void register(){
		registerItem(obsidianingot);
		registerItem(rubberBall);
	}
	
	public static void registerItem(Item item){
		GameRegistry.register(item);
		item.setCreativeTab(AdvFunctions.tabAdvFuncItems);
	}
	
	public static void registerRenders(){
		registerRender(obsidianingot);
		registerRender(rubberBall);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
