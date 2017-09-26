package nz.castorgaming.advFunctions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nz.castorgaming.advFunctions.init.BlockInit;
import nz.castorgaming.advFunctions.init.ItemInit;
import nz.castorgaming.advFunctions.proxy.CommonProxy;
import nz.castorgaming.advFunctions.tabs.advFuncTab;
import nz.castorgaming.advFunctions.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class AdvFunctions {
	
	public static final CreativeTabs advFuncTools = new advFuncTab("advFuncTools", new ItemStack(ItemInit.SWORD_DIAMANTINE));
	public static final CreativeTabs advFuncArmors = new advFuncTab("advFuncArmors", new ItemStack(ItemInit.CHESTPLATE_RADIANT));
	public static final CreativeTabs advFuncItems = new advFuncTab("advFuncItems", new ItemStack(ItemInit.INGOT_RADIANT));
	public static final CreativeTabs advFuncBlocks = new advFuncTab("advFuncBlocks", new ItemStack(Item.getItemFromBlock(BlockInit.BLOCK_DIAMANTINE)));
	
	@Instance
	public static AdvFunctions instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}
	
}
