package nz.castorgaming.advFunctions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nz.castorgaming.advFunctions.proxy.CommonProxy;
import nz.castorgaming.advFunctions.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class AdvFunctions {
	
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
