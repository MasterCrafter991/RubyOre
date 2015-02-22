package masterores.items;

import masterores.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class DragoniumPickaxe extends ItemPickaxe {

	public DragoniumPickaxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "DragoniumPickaxe");
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}