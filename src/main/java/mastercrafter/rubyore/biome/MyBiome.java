package mastercrafter.rubyore.biome;

import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class MyBiome extends BiomeGenBase
{
    public MyBiome(int par1)
    {
        super(par1);
        
        this.setBiomeName("TestBiome");
        
        this.topBlock = Blocks.stone;
        this.fillerBlock = Blocks.stone;
        
        // Per Chunk Generators
        /** EXAMPLE: this.theBiomeDecorator.grassPerChunk = 60; */

        this.spawnableCreatureList.add(new SpawnListEntry(EntitySilverfish.class, 3, 2, 7));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 6, 4, 12));
        this.spawnableCreatureList.remove(EntityPig.class);
        
        this.setHeight(new Height(0.1F, 0.5F));
        this.setTemperatureRainfall(1.5F, 0.2F);
   
    }
}