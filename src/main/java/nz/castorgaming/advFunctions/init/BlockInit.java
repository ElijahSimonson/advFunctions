package nz.castorgaming.advFunctions.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nz.castorgaming.advFunctions.objects.blocks.BlockBase;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>(); 
	
	//Metal Blocks
	
	//Misc Blocks
	public static final Block BLOCK_RUBBER = new BlockBase("block_rubber", Material.GROUND);
}
