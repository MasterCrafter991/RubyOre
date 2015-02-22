package mastercrafter.masterores.blocks;

import mastercrafter.masterores.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DragoniumOre extends Block {

	public DragoniumOre(Material blockMaterial, String textureName) {

		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
		this.setBlockTextureName(Main.MODID + ":" + textureName);
		this.setHardness(2.0F);
		this.setResistance(15.0F);
		this.setStepSound(Block.soundTypeStone);
	}
}
