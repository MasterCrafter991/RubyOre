package mastercrafter.masterores.items;

import mastercrafter.masterores.Main;
import net.minecraft.item.Item;

public class HardenedStick extends Item {
	
	public HardenedStick(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(Main.tabMasterOres);
		this.setTextureName(Main.MODID + ":" + "HardenedStick");
	}
}