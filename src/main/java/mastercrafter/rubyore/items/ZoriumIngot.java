package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZoriumIngot extends Item {

	public ZoriumIngot(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Main.MODID + ":" + "ZoriumIngot");
	}

}