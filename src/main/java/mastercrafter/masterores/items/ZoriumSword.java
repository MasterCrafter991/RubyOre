package mastercrafter.masterores.items;

import mastercrafter.masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ZoriumSword extends ItemSword {

	public ZoriumSword(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(Main.MODID + ":" + "ZoriumSword");
	}

}