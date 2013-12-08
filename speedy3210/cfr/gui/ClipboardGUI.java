package speedy3210.cfr.gui;

import org.lwjgl.opengl.GL11;

import speedy3210.cfr.modInfos;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class ClipboardGUI extends GuiScreen{
	
	ResourceLocation guiTexture = new ResourceLocation(modInfos.ID.toLowerCase(), "textures/gui/clipboardGUI.png");
	
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 166;
	
	public ClipboardGUI(EntityPlayer player) {
		
	}
	
	@Override
	public void drawScreen(int x, int y, float f) {
		
		drawDefaultBackground();
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(guiTexture);
		
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);
		
		super.drawScreen(x, y, f);
		
	}
		
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	public void initGui() {
		
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		
		this.buttonList.add(new GuiButton(0, posX + 70, posY + 35, 50, 10, "create"));
		
		// failed attempt fontRenderer.drawString("test", posX + 10, posY + 10, 20);
				
	}
	
	public void actionPerformed(GuiButton button) {
		switch(button.id) {
		case 0: Minecraft.getMinecraft().thePlayer.addChatMessage("Recipe *not* created");
			break;
		default:
		}
	}

}
