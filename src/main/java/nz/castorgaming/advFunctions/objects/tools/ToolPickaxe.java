package nz.castorgaming.advFunctions.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import nz.castorgaming.advFunctions.AdvFunctions;
import nz.castorgaming.advFunctions.init.ItemInit;
import nz.castorgaming.advFunctions.util.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AdvFunctions.advFuncTools);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		AdvFunctions.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
