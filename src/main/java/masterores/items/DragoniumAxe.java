package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class DragoniumAxe extends ItemAxe {

	public DragoniumAxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + textureName);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
