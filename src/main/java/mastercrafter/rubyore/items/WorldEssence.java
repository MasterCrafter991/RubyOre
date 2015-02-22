package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WorldEssence extends Item {

	public WorldEssence(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Main.MODID + ":" + "WorldEssence");
	}

}