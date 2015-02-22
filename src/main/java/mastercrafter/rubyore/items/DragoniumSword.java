package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class DragoniumSword extends ItemSword {

	public DragoniumSword(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "DragoniumSword");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}