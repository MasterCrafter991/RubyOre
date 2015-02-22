package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class DragoniumSword extends ItemSword {

	public DragoniumSword(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "DragoniumSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}