package mymod.biome;

import mymod.Main;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;    
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class MyBiome extends BiomeGenBase
{
    public MyBiome(int par1)
    {
        super(par1);
        
        this.setBiomeName("TestBiome");
        
        this.topBlock = (byte)Block.stone.blockID;
        this.fillerBlock = (byte)Block.stone.blockID;
        
        // Per Chunk Generators
        /** EXAMPLE: this.theBiomeDecorator.grassPerChunk = 60; */

        this.spawnableCreatureList.add(new SpawnListEntry(EntitySilverfish.class, 3, 2, 7));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 6, 4, 12));
        this.spawnableCreatureList.remove(EntityPig.class);
        
        this.setMinMaxHeight(0.1F, 0.5F);
        this.setTemperatureRainfall(1.5F, 0.2F);
   
    }
}