package mastercrafter.masterores.items;

import mastercrafter.masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DragoniumIngot extends Item {

	public DragoniumIngot(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Main.MODID + ":" + "DragoniumIngot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}