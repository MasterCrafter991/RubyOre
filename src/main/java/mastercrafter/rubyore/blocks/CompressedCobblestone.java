package mastercrafter.rubyore.blocks;

import mastercrafter.rubyore.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedCobblestone extends Block {

	public CompressedCobblestone(Material blockMaterial, String textureName) {

		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
		this.setBlockTextureName(Main.MODID + ":" + textureName);
		this.setHardness(4.5F);
		this.setResistance(35.0F);
		this.setStepSound(Block.soundTypeStone);
	}
}
