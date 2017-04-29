package nz.castorgaming.advFunctions.proxy;

import nz.castorgaming.advFunctions.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		
		ModItems.registerRenders();
		
	}

}
