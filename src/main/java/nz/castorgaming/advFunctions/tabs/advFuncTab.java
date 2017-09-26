package nz.castorgaming.advFunctions.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nz.castorgaming.advFunctions.init.ItemInit;

public class advFuncTab extends CreativeTabs{
	
	private ItemStack icon;

	public advFuncTab(String label, ItemStack item) {
		super(label);
		this.setBackgroundImageName("advFuncTab.png");
		icon = item;
	}

	@Override
	public ItemStack getTabIconItem() {
		return icon;
	}

}
