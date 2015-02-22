package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ZoriumAxe extends ItemAxe {

	public ZoriumAxe(ToolMaterial material,
			String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + textureName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
