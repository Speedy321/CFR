package speedy3210.cfr.items;

import speedy3210.cfr.cfr;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemClipboard extends Item{

	public ItemClipboard(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		//debug
		System.out.println(par1ItemStack+"//"+par2World+"//"+par3EntityPlayer);
		par3EntityPlayer.openGui(cfr.instance, 0, par2World, (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ);
		return par1ItemStack;
           
	}

}
