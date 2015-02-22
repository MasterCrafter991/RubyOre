package masterores.items;

import masterores.Main;
import net.minecraft.item.ItemPickaxe;

public class PurePickaxe extends ItemPickaxe {

	public PurePickaxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "PurePickaxe");
	}

}