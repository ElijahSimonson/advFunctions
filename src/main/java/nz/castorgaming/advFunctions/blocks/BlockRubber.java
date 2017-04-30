package nz.castorgaming.advFunctions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nz.castorgaming.advFunctions.Reference;

public class BlockRubber extends Block{

	public BlockRubber() {
		super(Material.SPONGE);
		
		setUnlocalizedName(Reference.AdvFuncBlocks.RUBBERBLOCK.getUnlocalizedName());
		setRegistryName(Reference.AdvFuncBlocks.RUBBERBLOCK.getRegistryName());
		
	}


}
