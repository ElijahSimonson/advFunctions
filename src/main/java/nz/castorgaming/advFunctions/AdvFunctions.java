package nz.castorgaming.advFunctions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nz.castorgaming.advFunctions.init.ModBlocks;
import nz.castorgaming.advFunctions.init.ModCrafting;
import nz.castorgaming.advFunctions.init.ModItems;
import nz.castorgaming.advFunctions.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class AdvFunctions {
	
	@Instance
	public static AdvFunctions Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event){
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModCrafting.register();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		proxy.init();
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabAdvFuncBlocks = new CreativeTabs("tab_advFuncBlocks") {
		
		@Override
		public ItemStack getTabIconItem(){
			return new ItemStack(ModBlocks.rubberBlock);
		}
		
	};

	
	public static CreativeTabs tabAdvFuncItems = new CreativeTabs("tab_advFuncItems"){
		
		@Override
		public ItemStack getTabIconItem(){
			return new ItemStack(ModItems.rubberBall);
		}
			
	};
}
