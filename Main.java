package mymod;

import mymod.armor.DragoniumArmor;
import mymod.biome.MyBiome;
import mymod.blocks.DragoniumOre;
import mymod.blocks.RubyOreGen;
import mymod.items.ApplePie;
import mymod.items.DragoniumIngot;
import mymod.items.Ruby;
import mymod.items.DragoniumPickaxe;
import mymod.items.RubyPickaxe;
import mymod.items.DragoniumSword;
import mymod.items.RubySword;
import mymod.items.DragoniumShovel;
import mymod.blocks.DragoniumOreGen;
import mymod.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


/* 	MOD INFO */
	@Mod( modid = "mymod", name = "My Awesome Mod", version = "1.0")
	@NetworkMod(clientSideRequired=true, serverSideRequired=false)


public class Main {

/*	PROXY INFO */
	@SidedProxy(clientSide = "mymod.proxies.ClientProxy", serverSide = "mymod.proxies.CommonProxy")
	public static CommonProxy proxy;		
	
/**	
 * DECLARATION SECTION 
 * *********************************************************** */
 //	DECALRE THE AXE(S)
 
//	DECLARE THE SHOVEL(S)
		public static Item DragoniumShovel;

//  DECLARE THE SWORD(S)
        public static Item DragoniumSword;
        public static Item RubySword;
        
//  DECLARE THE PICKAXE(S) 
        public static Item DragoniumPickaxe;
        public static Item RubyPickaxe;
        
//  DECLARE THE TOOL MATERIAL(S)
        /**DRAGONIUM MATERIALS
        /** Harvest Level, Max Uses, Efficiency (Float), Damage(Float), Enchantablility */
        public static EnumToolMaterial DragoniumMaterial = EnumHelper.addToolMaterial("Dragonium", 3, 1000, 12.0F, 2.0F, 8);  
        public static EnumToolMaterial DragoniumSwordMaterial = EnumHelper.addToolMaterial("DragoniumSword", 1, 1000, 3.0F, 6.0F, 8);
        public static EnumToolMaterial RubyMaterial = EnumHelper.addToolMaterial("Ruby", 3, 750, 10.0F, 2.0F, 8);
        public static EnumToolMaterial RubySwordMaterial = EnumHelper.addToolMaterial("RubySword", 1, 750, 3.0F, 3.5F, 8);
        
//  DECLARE THE ARMOR MATERIAL(S)
        /** maxDamageFactor, damageReductionAmountArray, enchantability*/
        public static EnumArmorMaterial DragoniumArmorMaterial = EnumHelper.addArmorMaterial("DragoniumArmor", 50, new int[]{3, 9, 6, 2}, 11);             

//  DECLARE THE ITEM(S)
        public static Item DragoniumIngot;
        public static Item Ruby;
        
//  DECLARE THE FOOD(S)
        public static Item ApplePie;
     
//  DECLARE THE BLOCK(S)
        public static Block DragoniumOre;
        public static Block RubyOre;
        
//  DECLARE THE ARMOR(S)
        public static Item Dragonium_Helmet;
        public static Item Dragonium_Chestplate;
        public static Item Dragonium_Leggings;
        public static Item Dragonium_Boots;

//  DECLARE THE BIOME(S)
        public static  BiomeGenBase MyBiome_1;

/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	


@EventHandler	
	public  void preInit( FMLPreInitializationEvent event ) 
	{
/**	
 * LOAD SECTION 
 * *********************************************************** */ 
//	LOAD THE SHOVEL(S)
		DragoniumShovel = new DragoniumShovel(2021, DragoniumMaterial, "DragoniumShovel");
		GameRegistry.registerItem(DragoniumShovel, "DragoniumShovel");
		LanguageRegistry.addName(DragoniumShovel, "DragoniumShovel");

//  LOAD THE SWORD(S)
        DragoniumSword = new DragoniumSword(2022, DragoniumSwordMaterial, "DragoniumSword");
        GameRegistry.registerItem(DragoniumSword, "DragoniumSword");
        LanguageRegistry.addName(DragoniumSword, "Dragonium Sword");
        
        RubySword = new RubySword(2023, RubySwordMaterial, "RubySword");
        GameRegistry.registerItem(RubySword, "RubySword");
        LanguageRegistry.addName(RubySword, "Ruby Sword");
        
//  LOAD THE PICKAXE(S)
        DragoniumPickaxe = new DragoniumPickaxe(2024, DragoniumMaterial, "DragoniumPickaxe");
        GameRegistry.registerItem(DragoniumPickaxe, "DragoniumPickaxe");
        LanguageRegistry.addName(DragoniumPickaxe, "Dragonium Pickaxe");
        
        RubyPickaxe = new RubyPickaxe(2025, RubyMaterial, "RubyPickaxe");
        GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
        LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");
        
//  LOAD THE ITEM(S)
        DragoniumIngot = new DragoniumIngot(2030, "DragoniumIngot").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
        GameRegistry.registerItem(DragoniumIngot, "DragoniumIngot");
        LanguageRegistry.addName(DragoniumIngot, "DragoniumIngot");
        
        Ruby = new Ruby(2031, "Ruby").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
        GameRegistry.registerItem(Ruby, "Ruby");
        LanguageRegistry.addName(Ruby, "Ruby");
        
        
//  LOAD THE BLOCK(S)
        DragoniumOre = new DragoniumOre(250, Material.rock, "DragoniumOre").setHardness(2.0F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep);
        GameRegistry.registerBlock(DragoniumOre, "DragoniumOre");
        LanguageRegistry.addName(DragoniumOre, "Dragonium Ore"); 
		MinecraftForge.setBlockHarvestLevel(DragoniumOre, "pickaxe", 2);
		
		RubyOre = new DragoniumOre(251, Material.rock, "RubyOre").setHardness(2.0F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep);
        GameRegistry.registerBlock(RubyOre, "RubyOre");
        LanguageRegistry.addName(RubyOre, "Ruby Ore"); 
		MinecraftForge.setBlockHarvestLevel(RubyOre, "pickaxe", 2);
		
//  LOAD THE FOOD(S)
        /** Item ID, Heal Amount, Saturation Modifier (F), isWolfsFavorite, Icon Texture */    /**Duration, Strength, Probability of working. */
        ApplePie = new ApplePie(2040, 8, 1.0F, false, "ApplePie").setPotionEffect(Potion.moveSpeed.id, 8, 1, 0.8F).setCreativeTab(CreativeTabs.tabFood);
        GameRegistry.registerItem(ApplePie, "ApplePie");
        LanguageRegistry.addName(ApplePie, "Apple Pie");
        
//  LOAD HELMET 
        Dragonium_Helmet = new DragoniumArmor(2060, DragoniumArmorMaterial, 0, 0, "myarmor");
        GameRegistry.registerItem(Dragonium_Helmet, "Dragonium_Helmet");
        LanguageRegistry.addName(Dragonium_Helmet, "Dragonium Helmet");      
    
//  LOAD CHESTPLATE
        Dragonium_Chestplate = new DragoniumArmor(2061, DragoniumArmorMaterial, 0, 1, "myarmor");
        GameRegistry.registerItem(Dragonium_Chestplate, "Dragonium_Chestplate");
        LanguageRegistry.addName(Dragonium_Chestplate, "Dragonium Chestplate");

//  LOAD LEGGINGS    
        Dragonium_Leggings = new DragoniumArmor(2062, DragoniumArmorMaterial, 0, 2, "myarmor");
        GameRegistry.registerItem(Dragonium_Leggings, "Dragonium_Leggings");
        LanguageRegistry.addName(Dragonium_Leggings, "Dragonium Leggings");

//  LOAD BOOTS   
        Dragonium_Boots = new DragoniumArmor(2063, DragoniumArmorMaterial, 0, 3, "myarmor");
        GameRegistry.registerItem(Dragonium_Boots, "Dragonium_Boots");
        LanguageRegistry.addName(Dragonium_Boots, "Dragonium Boots");

//  LOAD BIOME
        MyBiome_1 = new MyBiome(30);
        GameRegistry.addBiome(MyBiome_1);
        
 //  REMOVE OTHER BIOMES
        GameRegistry.removeBiome(BiomeGenBase.beach);
        GameRegistry.removeBiome(BiomeGenBase.desert);
        GameRegistry.removeBiome(BiomeGenBase.desertHills);
        GameRegistry.removeBiome(BiomeGenBase.desertHills);
        GameRegistry.removeBiome(BiomeGenBase.extremeHills);
        GameRegistry.removeBiome(BiomeGenBase.extremeHillsEdge);
        GameRegistry.removeBiome(BiomeGenBase.forest);
        GameRegistry.removeBiome(BiomeGenBase.forestHills);
        GameRegistry.removeBiome(BiomeGenBase.frozenOcean);
        GameRegistry.removeBiome(BiomeGenBase.frozenRiver);
        GameRegistry.removeBiome(BiomeGenBase.iceMountains);
        GameRegistry.removeBiome(BiomeGenBase.icePlains);
        GameRegistry.removeBiome(BiomeGenBase.jungle);
        GameRegistry.removeBiome(BiomeGenBase.jungleHills);
        GameRegistry.removeBiome(BiomeGenBase.mushroomIsland);
        GameRegistry.removeBiome(BiomeGenBase.ocean);
        GameRegistry.removeBiome(BiomeGenBase.plains);
        GameRegistry.removeBiome(BiomeGenBase.river);
        GameRegistry.removeBiome(BiomeGenBase.swampland);
        GameRegistry.removeBiome(BiomeGenBase.taiga);
        GameRegistry.removeBiome(BiomeGenBase.taigaHills);           

 
/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	}

@EventHandler
	public static void init( FMLInitializationEvent event ) 
	{
	
/**	
 * RECIPES SECTION 
 * *********************************************************** */
//  SMELTING RECIPE
        GameRegistry.addSmelting(DragoniumOre.blockID, (new ItemStack(DragoniumIngot, 1)), 15);
        
//  SWORD RECIPE  
        GameRegistry.addRecipe(new ItemStack(DragoniumSword),
        
                " D ",
                " D ",
                " I ",
            'I', Item.blazeRod,
            'D', DragoniumIngot
            );
            
        GameRegistry.addRecipe(new ItemStack(RubySword),
        
                " R ",
                " R ",
                " I ",
            'I', Item.stick,
            'R', Ruby
            );
        
//  PICKAXE RECIPE  
        GameRegistry.addRecipe(new ItemStack(DragoniumPickaxe),
        
                "DDD",
                " I ",
                " I ",
            'I', Item.blazeRod,
            'D', DragoniumIngot
            );
        
        GameRegistry.addRecipe(new ItemStack(RubyPickaxe),
        
                "RRR",
                " I ",
                " I ",
            'I', Item.stick,
            'R', Ruby
            );
            
//	SHOVEL RECIPE
        GameRegistry.addRecipe(new ItemStack(DragoniumShovel),
        
                " D ",
                " I ",
                " I ",
            'I', Item.blazeRod,
            'D', DragoniumIngot
            );
            
//  ITEM RECIPE
		GameRegistry.addRecipe(new ItemStack(DragoniumIngot, 64),
        
                "III",
                "IDI",
                "III",
            'I', Item.ingotIron,
            'D', Block.dragonEgg
            );        
//  FOOD RECIPE         
        GameRegistry.addRecipe(new ItemStack(ApplePie, 3),

                "WWW",
                "ASA",
                "WWW",
            'S', Item.sugar,
            'W', Item.wheat,
            'A', Item.appleRed
            )  ;      

//  HELMET RECIPE   
    GameRegistry.addRecipe(new ItemStack(Dragonium_Helmet, 1), new Object[]
    {
            "XXX",
            "X X",
        'X', DragoniumIngot,
    });         

//  CHESTPLATE RECIPE   
    GameRegistry.addRecipe(new ItemStack(Dragonium_Chestplate, 1), new Object[]
    {
            "X X",
            "XXX",
            "XXX",
        'X', DragoniumIngot,
    });         

//  LEGGINGS RECIPE 
    GameRegistry.addRecipe(new ItemStack(Dragonium_Leggings, 1), new Object[]
    {
            "XXX",
            "X X",
            "X X",
        'X', DragoniumIngot,
    });         

//  BOOTS RECIPE    
    GameRegistry.addRecipe(new ItemStack(Dragonium_Boots, 1), new Object[]
    {
            "X X",
            "X X",
        'X', DragoniumIngot,
    });

/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	
/**	
 * EXTRA METHODS SECTION 
 * *********************************************************** */

//  REGISTER THE ORE GENERATION 
    GameRegistry.registerWorldGenerator(new DragoniumOreGen());
    GameRegistry.registerWorldGenerator(new RubyOreGen());
        


/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	

	
	}

@EventHandler
	public static void postInit( FMLPostInitializationEvent event ) 
	{

	}
	
}
