package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.item.Item;

public class AdvancedWMC extends Item {
	
	public AdvancedWMC(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(Main.tabMasterOres);
		this.setTextureName(Main.MODID + ":" + "AdvancedWorldManipulationCore");
	}
}