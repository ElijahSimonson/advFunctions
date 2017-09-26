package nz.castorgaming.advFunctions.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nz.castorgaming.advFunctions.AdvFunctions;
import nz.castorgaming.advFunctions.init.ItemInit;
import nz.castorgaming.advFunctions.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		AdvFunctions.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
