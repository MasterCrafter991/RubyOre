package mastercrafter.rubyore.blocks;

import java.util.Random;

import mastercrafter.rubyore.Main;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RubyOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for (int i = 0; i < 8; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(45);
			(new WorldGenMinable(Main.RubyOre, 9)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}

}
