package masterores.items;

import masterores.Main;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PureDiamond extends Item {

	public PureDiamond(String textureName) {
		super();
		this.setUnlocalizedName(textureName);
		this.setCreativeTab(Main.tabMasterOres);
		this.setTextureName(Main.MODID + ":" + "PureDiamond");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
}