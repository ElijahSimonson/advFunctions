package nz.castorgaming.advFunctions;

public class Reference {
	
	public static final String MOD_ID = "caf";
	public static final String NAME = "Advanced Functions";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "nz.castorgaming.advFunctions.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nz.castorgaming.advFunctions.proxy.ServerProxy";
	
	//Items
	public static enum AdvFunctionsItems {
		RUBBERBALL("rubberBall", "ItemRubberBall"),
		RUBY("ruby", "ItemRuby");
		
		private String unlocalizedName;
		private String registryName;
		
		AdvFunctionsItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
	
}
