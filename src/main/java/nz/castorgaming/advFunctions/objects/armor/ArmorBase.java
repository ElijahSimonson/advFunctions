package nz.castorgaming.advFunctions.objects.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import nz.castorgaming.advFunctions.AdvFunctions;
import nz.castorgaming.advFunctions.init.ItemInit;
import nz.castorgaming.advFunctions.util.IHasModel;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(AdvFunctions.advFuncArmors);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		AdvFunctions.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
