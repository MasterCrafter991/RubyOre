package mastercrafter.rubyore.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DragoniumShovel extends ItemSpade {

	private String texturePath = "masterores:";

	public DragoniumShovel(ToolMaterial material, String textureName) {
		super(material);
		this.setUnlocalizedName(textureName);
		texturePath += textureName;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister IIconRegister) {
		this.itemIcon = IIconRegister.registerIcon(texturePath);
	}
}