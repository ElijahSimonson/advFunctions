package nz.castorgaming.advFunctions.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register(){
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubberBlock), "XXX", "XXX", "XXX", 'X', ModItems.rubberBall);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rubberBall, 9), ModBlocks.rubberBlock);
		
	}
	
}
