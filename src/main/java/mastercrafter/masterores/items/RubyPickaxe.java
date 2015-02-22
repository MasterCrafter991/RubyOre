package mastercrafter.masterores.items;

import mastercrafter.masterores.Main;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe {

	public RubyPickaxe(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "RubyPickaxe");
	}

}