package mymod.blocks;

import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Item;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import mymod.*;

public class RubyOre extends Block {

    private String texturePath = "mymod:";  
    private int thisBlockID;
    
    public RubyOre (int par1, Material blockMaterial, String textureName) {
        
        super(par1, blockMaterial);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(textureName);
        texturePath += textureName;
        thisBlockID = par1;
    }
    
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return mymod.items.Ruby;
    }
    
    public int quantityDropped(Random random)
    {
        return 1;
    }

    public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(texturePath);
    }
    
}

