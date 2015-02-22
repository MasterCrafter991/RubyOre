package mastercrafter.masterores.items;

import mastercrafter.masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class DragoniumShovel extends ItemSpade {

	public DragoniumShovel(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "DragoniumShovel");
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}