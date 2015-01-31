package mastercrafter.rubyore.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class DragoniumIngot extends Item {
    
    private String texturePath = "masterores:";
    
    public DragoniumIngot(String textureName)
    {
        super();
        this.setUnlocalizedName(textureName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        texturePath += textureName;
    }

@Override   
@SideOnly(Side.CLIENT)

    public void registerIcons(IIconRegister IIconRegister)
    {
        this.itemIcon = IIconRegister.registerIcon(texturePath);
    }   


}