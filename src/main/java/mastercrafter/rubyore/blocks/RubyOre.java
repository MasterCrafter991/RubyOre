package mastercrafter.rubyore.blocks;

import java.util.Random;

import mastercrafter.rubyore.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyOre extends Block {

    private String texturePath = "masterores:";  
    
    public RubyOre (Material blockMaterial, String textureName) {
        
        super(blockMaterial);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(textureName);
        texturePath += textureName;
    }
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
    	return Main.Ruby;
    }
    
    public int quantityDropped(Random random)
    {
        return 1;
    }

    public void registerIcons(IIconRegister IIconRegister)
    {
        this.blockIcon = IIconRegister.registerIcon(texturePath);
    }
    
}

