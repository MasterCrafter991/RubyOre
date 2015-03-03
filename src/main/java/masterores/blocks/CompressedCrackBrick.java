package masterores.blocks;

import masterores.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedCrackBrick extends Block {

	public CompressedCrackBrick(Material blockMaterial, String textureName) {

		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
		this.setBlockTextureName(Main.MODID + ":" + textureName);
		this.setHardness(4.0F);
		this.setResistance(35.0F);
		this.setStepSound(Block.soundTypeStone);
	}
}
