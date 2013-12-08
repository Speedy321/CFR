package speedy3210.cfr;

import speedy3210.cfr.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSimpleFoiled;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=modInfos.ID, name=modInfos.NAME, version=modInfos.VERS)
@NetworkMod(channels = {modInfos.CHAN}, clientSideRequired=true, serverSideRequired=false)
public class cfr {

        // The instance of your mod that Forge uses.
        @Instance(modInfos.ID)
        public static cfr instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="speedy3210.cfr.proxies.ClientProxy", serverSide="speedy3210.cfr.proxies.CommonProxy")
        public static CommonProxy proxy;
        
        //items
        
        //ids
    	
    	//others
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {

        	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        	
        	config.load();
        	
        	config.save();
        	
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //items
               
                //basic frame
    			addRecipes();
                addNames();
        }
        
        //basic frame
        private void addRecipes() {
        	
        	
        	
		}
        
        //basic frame
		private void addNames() {
			
			
			
		}
		
		@EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
