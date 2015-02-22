package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ZoriumPickaxe extends ItemPickaxe {

	public ZoriumPickaxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(Main.MODID + ":" + "ZoriumPickaxe");
	}

}