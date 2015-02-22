package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.item.Item;

public class BasicWMC extends Item {
	
	public BasicWMC(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(Main.tabMasterOres);
		this.setTextureName(Main.MODID + ":" + "BasicWorldManipulationCore");
	}
}