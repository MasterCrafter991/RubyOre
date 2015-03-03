/**
 * 	Used to register sounds and textures that we want to load before our Mod is initialized
 */

package masterores.proxies;

import masterores.Main;
import masterores.render.InfernoChestRenderer;
import masterores.render.item.ItemRenderInfernoChest;
import masterores.render.tile_entity.TileEntityInfernoChest;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public void registerRederThings(){
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInfernoChest.class, new InfernoChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Main.InfernoChest), new ItemRenderInfernoChest());
		
	}

}
