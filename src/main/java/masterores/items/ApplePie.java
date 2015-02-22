package masterores.items;

import masterores.Main;
import net.minecraft.item.ItemFood;


public class ApplePie extends ItemFood {

	public ApplePie(int healAmount, Float saturationModifier, boolean isWolfsFavoriteMeat, String textureName) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + textureName);
	}
}