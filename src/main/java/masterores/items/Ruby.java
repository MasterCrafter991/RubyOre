package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Ruby extends Item {

	public Ruby(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Main.MODID + ":" + "Ruby");
	}

}