package masterores.items;

import masterores.Main;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class GoldenApplePie extends ItemFood {

	public GoldenApplePie(int healAmount, Float saturationModifier, boolean isWolfsFavoriteMeat, String textureName) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		this.setUnlocalizedName(textureName);
		this.setTextureName(Main.MODID + ":" + "GoldenApplePie");
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}