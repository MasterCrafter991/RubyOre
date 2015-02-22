package mastercrafter.masterores.blocks;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import mastercrafter.masterores.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CorruptDiamondOre extends Block {

	public CorruptDiamondOre(Material blockMaterial, String textureName) {
		super(blockMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(textureName);
		this.setBlockTextureName(Main.MODID + ":" + "CorruptDiamondOre");
		this.setHardness(2.0F);
		this.setResistance(15.0F);
		this.setStepSound(Block.soundTypeStone);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(Main.CorruptDiamond));
	}
}
