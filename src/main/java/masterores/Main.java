package masterores;

import masterores.armor.DragoniumArmor;
import masterores.blocks.CompressedChiseledBrick;
import masterores.blocks.CompressedCobblestone;
import masterores.blocks.CompressedCrackBrick;
import masterores.blocks.CompressedMossBrick;
import masterores.blocks.CompressedStone;
import masterores.blocks.CompressedStoneBrick;
import masterores.blocks.CompressedStoneGen;
import masterores.blocks.CorruptDiamondBlock;
import masterores.blocks.CorruptDiamondOre;
import masterores.blocks.DragoniumOre;
import masterores.blocks.DragoniumOreGen;
import masterores.blocks.InfernoChest;
import masterores.blocks.PureDiamondBlock;
import masterores.blocks.RubyOre;
import masterores.blocks.RubyOreGen;
import masterores.items.AdvancedWMC;
import masterores.items.ApplePie;
import masterores.items.BasicWMC;
import masterores.items.CorruptDiamond;
import masterores.items.DragoniumAxe;
import masterores.items.DragoniumIngot;
import masterores.items.DragoniumPickaxe;
import masterores.items.DragoniumShovel;
import masterores.items.DragoniumSword;
import masterores.items.HardenedStick;
import masterores.items.PureDiamond;
import masterores.items.PurePickaxe;
import masterores.items.Ruby;
import masterores.items.RubyPickaxe;
import masterores.items.RubySword;
import masterores.items.WorldEssence;
import masterores.items.ZoriumAxe;
import masterores.items.ZoriumIngot;
import masterores.items.ZoriumPickaxe;
import masterores.items.ZoriumSword;
import masterores.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/* 	MOD INFO */
@Mod(modid = Main.MODID, name = "Master Ores", version = "1.1")
public class Main {

	public static final String MODID = "MasterOres";

	/* PROXY INFO */
	@SidedProxy(clientSide = "masterores.proxies.ClientProxy", serverSide = "masterores.proxies.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tabMasterOres = new CreativeTabs(MODID) {

		@Override
		public Item getTabIconItem() {
			return DragoniumSword;
		}
	};
	
	/**
	 * DECLARATION SECTION
	 * ***********************************************************
	 */

	// DRAGONIUM TOOL DECLERATION
	public static Item DragoniumShovel;
	public static Item DragoniumAxe;
	public static Item DragoniumSword;
	public static Item DragoniumPickaxe;

	// DRAGONIUM ARMOR DECLERATION
	public static Item Dragonium_Helmet;
	public static Item Dragonium_Chestplate;
	public static Item Dragonium_Leggings;
	public static Item Dragonium_Boots;

	// PURE TOOL DECLERATION
	public static Item PurePickaxe;

	// RUBY TOOL DECLERATION
	public static Item Ruby;
	public static Item RubyPickaxe;
	public static Item RubySword;

	// ZORIUM TOOL DECLERATION
	public static Item ZoriumIngot;
	public static Item ZoriumPickaxe;
	public static Item ZoriumSword;
	public static Item ZoriumAxe;

	// ITEM DECLERATION
	public static Item DragoniumIngot;
	public static Item CorruptDiamond;
	public static Item PureDiamond;
	public static Item BasicWMC;
	public static Item AdvancedWMC;
	public static Item WorldEssence;
	public static Item HardenedStick;

	// FOOD DECLERATION
	public static Item ApplePie;
	public static Item GoldenApplePie;

	// BLOCK DECLERATION
	public static Block DragoniumOre;
	public static Block RubyOre;
	public static Block CompressedStone;
	public static Block CompressedCobblestone;
	public static Block CompressedStoneBrick;
	public static Block CompressedChiseledBrick;
	public static Block CompressedCrackBrick;
	public static Block CompressedMossBrick;
	public static Block CorruptDiamondOre;
	public static Block PureDiamondBlock;
	public static Block CorruptDiamondBlock;
	public static Block InfernoChest;

	// DECLARE THE BIOME(S)
    public static  BiomeGenBase MagmusBiome; 

	// TOOL MATERIAL DECLERATION
	/**
	 * Harvest Level, Max Uses, Efficiency (Float), Damage(Float),
	 * Enchantablility
	 */
	public static ToolMaterial DragoniumMaterial = EnumHelper.addToolMaterial("Dragonium", 3, 1000, 15.0F, 1.0F, 8);
	public static ToolMaterial DragoniumSwordMaterial = EnumHelper.addToolMaterial("DragoniumSword", 1, 1000, 3.0F, 6.0F, 8);
	public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("Ruby", 2, 750, 10.0F, 1.0F, 8);
	public static ToolMaterial RubySwordMaterial = EnumHelper.addToolMaterial("RubySword", 1, 750, 3.0F, 3.5F, 8);
	public static ToolMaterial PureMaterial = EnumHelper.addToolMaterial("PureMaterial", 2, 2500, 30.0F, 1.5F, 10);
	public static ToolMaterial PureSwordMaterial = EnumHelper.addToolMaterial("PureSword", 1, 2500, 3.0F, 8.0F, 10);
	public static ToolMaterial ZoriumMaterial = EnumHelper.addToolMaterial("Zorium", 3, 1500, 25F, 1.0F, 12);
	public static ToolMaterial ZoriumSwordMaterial = EnumHelper.addToolMaterial("ZoriumSword", 1, 1500, 3.0F, 11.0F, 12);

	// ARMOR MATERIAL DECLERATION
	/** maxDamageFactor, damageReductionAmountArray, enchantability */
	public static ArmorMaterial DragoniumArmorMaterial = EnumHelper.addArmorMaterial("DragoniumArmor", 50, new int[] { 3, 9, 6, 2 }, 11);

	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/**
		 * LOAD SECTION
		 * ***********************************************************
		 */

		// LOAD THE DRAGONIUM STUFF
		DragoniumIngot = new DragoniumIngot("DragoniumIngot");
		GameRegistry.registerItem(DragoniumIngot, "DragoniumIngot");

		DragoniumOre = new DragoniumOre(Material.rock, "DragoniumOre");
		GameRegistry.registerBlock(DragoniumOre, "DragoniumOre");
		DragoniumOre.setHarvestLevel("pickaxe", 2);

		DragoniumShovel = new DragoniumShovel(DragoniumMaterial, "DragoniumShovel");
		GameRegistry.registerItem(DragoniumShovel, "DragoniumShovel");

		DragoniumAxe = new DragoniumAxe(DragoniumMaterial, "DragoniumAxe");
		GameRegistry.registerItem(DragoniumAxe, "DragoniumAxe");

		DragoniumSword = new DragoniumSword(DragoniumSwordMaterial, "DragoniumSword");
		GameRegistry.registerItem(DragoniumSword, "DragoniumSword");

		DragoniumPickaxe = new DragoniumPickaxe(DragoniumMaterial, "DragoniumPickaxe");
		GameRegistry.registerItem(DragoniumPickaxe, "DragoniumPickaxe");

		Dragonium_Helmet = new DragoniumArmor(DragoniumArmorMaterial, 0, 0, "DragoniumHelmet");
		GameRegistry.registerItem(Dragonium_Helmet, "Dragonium_Helmet");

		Dragonium_Chestplate = new DragoniumArmor(DragoniumArmorMaterial, 0, 1, "DragoniumChestplate");
		GameRegistry.registerItem(Dragonium_Chestplate, "Dragonium_Chestplate");

		Dragonium_Leggings = new DragoniumArmor(DragoniumArmorMaterial, 0, 2, "DragoniumLeggings");
		GameRegistry.registerItem(Dragonium_Leggings, "Dragonium_Leggings");

		Dragonium_Boots = new DragoniumArmor(DragoniumArmorMaterial, 0, 3, "DragoniumBoots");
		GameRegistry.registerItem(Dragonium_Boots, "Dragonium_Boots");

		// LOAD THE RUBY STUFF
		Ruby = new Ruby("Ruby").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
		GameRegistry.registerItem(Ruby, "Ruby");

		RubySword = new RubySword(RubySwordMaterial, "RubySword");
		GameRegistry.registerItem(RubySword, "RubySword");

		RubyPickaxe = new RubyPickaxe(RubyMaterial, "RubyPickaxe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");

		RubyOre = new RubyOre(Material.rock, "RubyOre");
		GameRegistry.registerBlock(RubyOre, "RubyOre");
		RubyOre.setHarvestLevel("pickaxe", 2);

		// LOAD THE PURE AND CORRUPT STUFF
		PureDiamond = new PureDiamond("PureDiamond");
		GameRegistry.registerItem(PureDiamond, "PureDiamond");

		PurePickaxe = new PurePickaxe(PureMaterial, "PurePickaxe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(PurePickaxe, "PurePickaxe");

		CorruptDiamond = new CorruptDiamond("CorruptDiamond");
		GameRegistry.registerItem(CorruptDiamond, "CorruptDimaond");

		CorruptDiamondOre = new CorruptDiamondOre(Material.rock, "CorruptDiamondOre");
		GameRegistry.registerBlock(CorruptDiamondOre, "CorruptDiamondOre");
		CorruptDiamondOre.setHarvestLevel("pickaxe", 2);

		PureDiamondBlock = new PureDiamondBlock(Material.iron, "PureDiamondBlock");
		GameRegistry.registerBlock(PureDiamondBlock, "PureDiamondBlock");
		PureDiamondBlock.setHarvestLevel("pickaxe", 2);

		CorruptDiamondBlock = new CorruptDiamondBlock(Material.iron, "CorruptDiamondBlock");
		GameRegistry.registerBlock(CorruptDiamondBlock, "CorruptDiamondBlock");
		CorruptDiamondBlock.setHarvestLevel("pickaxe", 2);

		// LOAD THE ZORIUM STUFF
		ZoriumIngot = new ZoriumIngot("ZoriumIngot");
		GameRegistry.registerItem(ZoriumIngot, "ZoriumIngot");

		ZoriumPickaxe = new ZoriumPickaxe(ZoriumMaterial, "ZoriumPickaxe");
		GameRegistry.registerItem(ZoriumPickaxe, "ZoriumPickaxe");

		ZoriumSword = new ZoriumSword(ZoriumSwordMaterial, "ZoriumSword");
		GameRegistry.registerItem(ZoriumSword, "ZoriumSword");
		
		ZoriumAxe = new ZoriumAxe(ZoriumMaterial, "ZoriumAxe");
		GameRegistry.registerItem(ZoriumAxe, "ZoriumAxe");

		// LOAD THE ITEMS
		BasicWMC = new BasicWMC("BasicWMC");
		GameRegistry.registerItem(BasicWMC, "BasicWMC");

		AdvancedWMC = new AdvancedWMC("AdvancedWMC");
		GameRegistry.registerItem(AdvancedWMC, "AdvancedWMC");

		WorldEssence = new WorldEssence("WorldEssence");
		GameRegistry.registerItem(WorldEssence, "WorldEssence");

		HardenedStick = new HardenedStick("HardenedStick");
		GameRegistry.registerItem(HardenedStick, "HardenedStick");

		// LOAD THE BLOCK(S)
		CompressedCobblestone = new CompressedCobblestone(Material.rock, "CompressedCobblestone");
		GameRegistry.registerBlock(CompressedCobblestone, "CompressedCobblestone");

		CompressedStone = new CompressedStone(Material.rock, "CompressedStone");
		GameRegistry.registerBlock(CompressedStone, "CompressedStone");

		CompressedStoneBrick = new CompressedStoneBrick(Material.rock, "CompressedStoneBrick");
		GameRegistry.registerBlock(CompressedStoneBrick, "CompressedStoneBrick");
		
		CompressedChiseledBrick = new CompressedChiseledBrick(Material.rock, "CompressedChiseledBrick");
		GameRegistry.registerBlock(CompressedChiseledBrick, "CompressedChiseledBrick");
		
		CompressedCrackBrick = new CompressedCrackBrick(Material.rock, "CompressedCrackBrick");
		GameRegistry.registerBlock(CompressedCrackBrick, "CompressedCrackBrick");
		
		CompressedMossBrick = new CompressedMossBrick(Material.rock, "CompressedMossBrick");
		GameRegistry.registerBlock(CompressedMossBrick, "CompressedMossBrick");
		
		InfernoChest = new InfernoChest(0).setBlockName("InfernoChest").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(Main.MODID + ":InferoChest_normal");
		GameRegistry.registerBlock(InfernoChest, InfernoChest.getUnlocalizedName());
		
		// LOAD THE FOOD(S)
		
		/**
		 * Heal Amount, Saturation Modifier (F), isWolfsFavorite, Icon Texture
		 */
		/** Duration, Strength, Probability of working. */
		
		ApplePie = new ApplePie(8, 5.0F, false, "ApplePie").setPotionEffect(Potion.moveSpeed.id, 8, 1, 0.8F).setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(ApplePie, "ApplePie");

		GoldenApplePie = new ApplePie(10, 9.6F, false, "GoldenApplePie").setPotionEffect(Potion.regeneration.id, 10, 5, 1.0F);
		GameRegistry.registerItem(GoldenApplePie, "GoldenApplePie");

	}

	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */
	@EventHandler
	public static void init(FMLInitializationEvent event) {

		// @formatter:off
		/**
		 * RECIPES SECTION
		 * ***********************************************************
		 */
		
		// SMELTING RECIPE(S)
		GameRegistry.addSmelting(DragoniumOre, (new ItemStack(DragoniumIngot, 1)), 15);
		GameRegistry.addSmelting(Blocks.planks, (new ItemStack(WorldEssence, 2)), 25);
		GameRegistry.addSmelting(Blocks.leaves, (new ItemStack(WorldEssence, 2)), 25);
		GameRegistry.addSmelting(CompressedStoneBrick, (new ItemStack(CompressedCrackBrick, 1)), 20);

		// SWORD RECIPE(S)
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PureDiamondBlock),
				"PPP",
				"PPP",
				"PPP",
			'P', Main.PureDiamond
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CorruptDiamondBlock),
				"CCC",
				"CCC",
				"CCC",
			'C', Main.CorruptDiamond
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PureDiamondBlock),
				"EEE",
				"ECE",
				"EEE",
			'C', Main.CorruptDiamond,
			'E', Main.WorldEssence
		));
		
		
		//SWORD RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DragoniumSword),
			"D",
			"D",
			"I",
		'I', "itemBlazeRod",
		'D', DragoniumIngot
		));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RubySword),

			"R",
			"R",
			"I",
		'I', "stickWood",
		'R', Ruby
		));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ZoriumSword),

			"Z",
			"Z",
			"I",
		'I', Items.stick,
		'Z', ZoriumIngot
		));
		
		// PICKAXE RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DragoniumPickaxe),

			"DDD",
			" I ",
			" I ",
		'I', "itemBlazeRod",
		'D', DragoniumIngot
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RubyPickaxe),

			"RRR",
			" I ",
			" I ",
		'I', Items.stick,
		'R', Ruby
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PurePickaxe),

			"PPP",
			" I ",
			" I ",
		'I', HardenedStick,
		'P', PureDiamond
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ZoriumPickaxe),
			"ZZZ",
			" I ",
			" I ",
		'I', Items.stick,
		'Z', ZoriumIngot
		));

		
		// SHOVEL RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DragoniumShovel),

			" D ",
			" I ",
			" I ",
		'I', Items.blaze_rod,
		'D', DragoniumIngot
		));
		
		
		// AXE RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DragoniumAxe),
			"DD",
			"DI",
			" I",
		'I', Items.blaze_rod,
		'D', DragoniumIngot
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ZoriumAxe),
			"ZZ",
			"ZI",
			" I",
		'I', Items.stick,
		'Z', ZoriumIngot
			));
		
		
		// ITEM RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DragoniumIngot, 64),

			"III",
			"IDI",
			"III",
		'I', Items.iron_ingot,
		'D', Blocks.dragon_egg
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ZoriumIngot, 1),
				
			"DW",
		'W', WorldEssence,
		'D', DragoniumIngot
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond, 2),
			"P",
		'P', Main.PureDiamond
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.PureDiamond, 1),
			"CW",
		'C', Main.CorruptDiamond,
		'W', Main.WorldEssence
		));
		
		
		//BLOCK RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.CompressedStoneBrick, 4),
			"SS",
			"SS",
		'S', Main.CompressedStone
		
		));
		
		GameRegistry.addRecipe(new ItemStack(Main.CompressedMossBrick, 1),
			"V",
			"B",
		'V', Blocks.vine,
		'B', CompressedStoneBrick
		);
		
		
		// FOOD RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ApplePie, 3),

			"WWW",
			"ASA",
			"WWW",
		'S', Items.sugar,
		'W', Items.wheat,
		'A', Items.apple
		));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GoldenApplePie, 4),
		
			"WWW",
			"GSG",
			"WWW",
		'S', Items.sugar,
		'G', new ItemStack(Items.golden_apple, 1, 1),
		'W', Items.wheat
		));
		
		
		// HELMET RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Dragonium_Helmet, 1), new Object[] { 
			
			"XXX",
			"X X",
		'X', DragoniumIngot, }
		));

		
		// CHESTPLATE RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Dragonium_Chestplate, 1), new Object[] {
			
			"X X",
			"XXX",
			"XXX",
		'X', DragoniumIngot, }
		));

		
		// LEGGINGS RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Dragonium_Leggings, 1), new Object[] { 
			
			"XXX",
			"X X",
			"X X",
		'X', DragoniumIngot, }
		));

		
		// BOOTS RECIPE(S)
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Dragonium_Boots, 1), new Object[] { 
			
			"X X",
			"X X",
		'X', DragoniumIngot, }
		));

		/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

		/**
		 * EXTRA METHODS SECTION
		 * ***********************************************************
		 */

		// REGISTER THE ORE GENERATION
		GameRegistry.registerWorldGenerator(new DragoniumOreGen(), 100);
		GameRegistry.registerWorldGenerator(new RubyOreGen(), 100);
		GameRegistry.registerWorldGenerator(new CompressedStoneGen(), 100);

		/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}

}
