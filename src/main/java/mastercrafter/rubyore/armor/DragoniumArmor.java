package mastercrafter.rubyore.armor;

import mastercrafter.rubyore.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DragoniumArmor extends ItemArmor {

	private String texturePath = Main.MODID + ":textures/armor/";

	public DragoniumArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String myArmorName) {
		super(par2EnumArmorMaterial, par3, par4);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.SetArmorType("myarmor", par4);
		this.setTextureName(Main.MODID + ":" + myArmorName);
	}

	private void SetArmorType(String myArmorName, int par4) {
		switch (par4) {
		case 0:
			this.setUnlocalizedName("Dragonium_Helmet");
			this.texturePath += myArmorName + "_1.png";
			break;
		case 1:
			this.setUnlocalizedName("Dragonium_Chestplate");
			this.texturePath += myArmorName + "_1.png";
			break;
		case 2:
			this.setUnlocalizedName("Dragonium_Leggings");
			this.texturePath += myArmorName + "_2.png";
			break;
		case 3:
			this.setUnlocalizedName("Dragonium_Boots");
			this.texturePath += myArmorName + "_1.png";
			break;
		}
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return this.texturePath;
	}
}
