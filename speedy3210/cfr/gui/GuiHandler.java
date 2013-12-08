package speedy3210.cfr.gui;

import speedy3210.cfr.cfr;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(cfr.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		
		switch(ID) {
			default: return null;
			case 0: return new ClipboardContainer(player);
		}
		
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		switch(ID) {
			default: return null;
			case 0: return new ClipboardGUI(player);
		}
	}

}
