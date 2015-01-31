package mastercrafter.rubyore.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DragoniumPickaxe extends ItemPickaxe {

	private String texturePath = "masterores:";

	public DragoniumPickaxe(ToolMaterial material,
			String textureName) {
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