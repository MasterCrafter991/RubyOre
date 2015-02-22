package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {

	public RubySword(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(Main.MODID + ":" + textureName);
	}

}