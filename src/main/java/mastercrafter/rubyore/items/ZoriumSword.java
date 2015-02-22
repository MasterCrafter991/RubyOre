package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ZoriumSword extends ItemSword {

	public ZoriumSword(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(Main.MODID + ":" + "ZoriumSword");
	}

}