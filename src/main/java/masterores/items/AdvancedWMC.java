package masterores.items;

import masterores.Main;
import net.minecraft.item.Item;

public class AdvancedWMC extends Item {
	
	public AdvancedWMC(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(Main.tabMasterOres);
		this.setTextureName(Main.MODID + ":" + "AdvancedWorldManipulationCore");
	}
}