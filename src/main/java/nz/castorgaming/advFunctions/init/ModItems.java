package nz.castorgaming.advFunctions.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nz.castorgaming.advFunctions.items.ItemRubberBall;
import nz.castorgaming.advFunctions.items.ItemRuby;

public class ModItems {

	public static Item rubberBall;
	public static Item ruby;
	
	
	public static void init(){
		rubberBall = new ItemRubberBall();
		ruby = new ItemRuby();
	}
	
	public static void register(){
		GameRegistry.register(rubberBall);
		GameRegistry.register(ruby);
	}
	
	public static void registerRenders(){
		registerRender(rubberBall);
		registerRender(ruby);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
