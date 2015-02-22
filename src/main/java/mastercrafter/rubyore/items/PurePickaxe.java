package mastercrafter.rubyore.items;

import mastercrafter.rubyore.Main;
import net.minecraft.item.ItemPickaxe;

public class PurePickaxe extends ItemPickaxe {

	public PurePickaxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "PurePickaxe");
	}

}