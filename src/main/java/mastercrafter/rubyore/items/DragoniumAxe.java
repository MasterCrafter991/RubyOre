package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class DragoniumAxe extends ItemAxe {

	public DragoniumAxe(ToolMaterial material,
			String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "DragoniumAxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
