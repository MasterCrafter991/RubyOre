package mastercrafter.rubyore.blocks;

import mastercrafter.rubyore.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CorruptDiamondBlock extends Block {

	public CorruptDiamondBlock(Material blockMaterial, String textureName) {

		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
		this.setBlockTextureName(Main.MODID + ":" + "CorruptDiamondBlock");
	}
}
