package mastercrafter.masterores.blocks;

import mastercrafter.masterores.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldPurifier extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	@SideOnly(Side.CLIENT)
	private IIcon sidesIcon;

	public WorldPurifier(Material blockMaterial, String textureName) {

		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == ForgeDirection.UP.ordinal()) {
			return topIcon;
		} else {
			return sidesIcon;
		}
	}

	@Override
	public void registerBlockIcons(IIconRegister register) {
		super.registerBlockIcons(register);
		this.topIcon = register.registerIcon(Main.MODID + ":" + "WorldPurifierTop");
		this.sidesIcon = this.blockIcon = register.registerIcon(Main.MODID + ":" + "WorldPurifierSides");
	}
}
