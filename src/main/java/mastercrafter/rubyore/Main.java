package mastercrafter.rubyore;

import mastercrafter.rubyore.armor.DragoniumArmor;
import mastercrafter.rubyore.blocks.DragoniumOre;
import mastercrafter.rubyore.blocks.DragoniumOreGen;
import mastercrafter.rubyore.blocks.RubyOreGen;
import mastercrafter.rubyore.items.ApplePie;
import mastercrafter.rubyore.items.DragoniumIngot;
import mastercrafter.rubyore.items.DragoniumPickaxe;
import mastercrafter.rubyore.items.DragoniumShovel;
import mastercrafter.rubyore.items.DragoniumSword;
import mastercrafter.rubyore.items.Ruby;
import mastercrafter.rubyore.items.RubyPickaxe;
import mastercrafter.rubyore.items.RubySword;
import mastercrafter.rubyore.proxies.CommonProxy;
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
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/* 	MOD INFO */
@Mod(modid = Main.MODID, name = "Master Ores", version = "1.0")
public class Main {

	public static final String MODID = "masterores";

	/* PROXY INFO */
	@SidedProxy(clientSide = "mastercrafter.rubyore.proxies.ClientProxy", serverSide = "mastercrafter.rubyore.proxies.CommonProxy")
	public static CommonProxy proxy;

	/**
	 * DECLARATION SECTION
	 * ***********************************************************
	 */
	// DECALRE THE AXE(S)

	// DECLARE THE SHOVEL(S)
	public static Item DragoniumShovel;

	// DECLARE THE SWORD(S)
	public static Item DragoniumSword;
	public static Item RubySword;

	// DECLARE THE PICKAXE(S)
	public static Item DragoniumPickaxe;
	public static Item RubyPickaxe;

	// DECLARE THE TOOL MATERIAL(S)
	/**
	 * DRAGONIUM MATERIALS /** Harvest Level, Max Uses, Efficiency (Float),
	 * Damage(Float), Enchantablility
	 */
	public static ToolMaterial DragoniumMaterial = EnumHelper.addToolMaterial("Dragonium", 3, 1000, 12.0F, 2.0F, 8);
	public static ToolMaterial DragoniumSwordMaterial = EnumHelper.addToolMaterial("DragoniumSword", 1, 1000, 3.0F, 6.0F, 8);
	public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("Ruby", 3, 750, 10.0F, 2.0F, 8);
	public static ToolMaterial RubySwordMaterial = EnumHelper.addToolMaterial("RubySword", 1, 750, 3.0F, 3.5F, 8);

	// DECLARE THE ARMOR MATERIAL(S)
	/** maxDamageFactor, damageReductionAmountArray, enchantability */
	public static ArmorMaterial DragoniumArmorMaterial = EnumHelper.addArmorMaterial("DragoniumArmor", 50, new int[] { 3, 9, 6, 2 }, 11);

	// DECLARE THE ITEM(S)
	public static Item DragoniumIngot;
	public static Item Ruby;

	// DECLARE THE FOOD(S)
	public static Item ApplePie;

	// DECLARE THE BLOCK(S)
	public static Block DragoniumOre;
	public static Block RubyOre;

	// DECLARE THE ARMOR(S)
	public static Item Dragonium_Helmet;
	public static Item Dragonium_Chestplate;
	public static Item Dragonium_Leggings;
	public static Item Dragonium_Boots;

	// DECLARE THE BIOME(S)
	public static BiomeGenBase MyBiome_1;

	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/**
		 * LOAD SECTION
		 * ***********************************************************
		 */
		// LOAD THE SHOVEL(S)
		DragoniumShovel = new DragoniumShovel(DragoniumMaterial, "DragoniumShovel");
		GameRegistry.registerItem(DragoniumShovel, "DragoniumShovel");
		LanguageRegistry.addName(DragoniumShovel, "DragoniumShovel");

		// LOAD THE SWORD(S)
		DragoniumSword = new DragoniumSword(DragoniumSwordMaterial, "DragoniumSword");
		GameRegistry.registerItem(DragoniumSword, "DragoniumSword");
		LanguageRegistry.addName(DragoniumSword, "Dragonium Sword");

		RubySword = new RubySword(RubySwordMaterial, "RubySword");
		GameRegistry.registerItem(RubySword, "RubySword");
		LanguageRegistry.addName(RubySword, "Ruby Sword");

		// LOAD THE PICKAXE(S)
		DragoniumPickaxe = new DragoniumPickaxe(DragoniumMaterial, "DragoniumPickaxe");
		GameRegistry.registerItem(DragoniumPickaxe, "DragoniumPickaxe");
		LanguageRegistry.addName(DragoniumPickaxe, "Dragonium Pickaxe");

		RubyPickaxe = new RubyPickaxe(RubyMaterial, "RubyPickaxe");
		GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
		LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");

		// LOAD THE ITEM(S)
		DragoniumIngot = new DragoniumIngot("DragoniumIngot").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
		GameRegistry.registerItem(DragoniumIngot, "DragoniumIngot");
		LanguageRegistry.addName(DragoniumIngot, "DragoniumIngot");

		Ruby = new Ruby("Ruby").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
		GameRegistry.registerItem(Ruby, "Ruby");
		LanguageRegistry.addName(Ruby, "Ruby");

		// LOAD THE BLOCK(S)
		DragoniumOre = new DragoniumOre(Material.rock, "DragoniumOre").setHardness(2.0F).setResistance(15.0F).setStepSound(Block.soundTypeStone);
		GameRegistry.registerBlock(DragoniumOre, "DragoniumOre");
		LanguageRegistry.addName(DragoniumOre, "Dragonium Ore");
		DragoniumOre.setHarvestLevel("pickaxe", 2);

		RubyOre = new DragoniumOre(Material.rock, "RubyOre").setHardness(2.0F).setResistance(15.0F).setStepSound(Block.soundTypeStone);
		GameRegistry.registerBlock(RubyOre, "RubyOre");
		LanguageRegistry.addName(RubyOre, "Ruby Ore");
		RubyOre.setHarvestLevel("pickaxe", 2);

		// LOAD THE FOOD(S)
		/**
		 * Item ID, Heal Amount, Saturation Modifier (F), isWolfsFavorite, Icon
		 * Texture
		 */
		/** Duration, Strength, Probability of working. */
		ApplePie = new ApplePie(8, 1.0F, false, "ApplePie").setPotionEffect(Potion.moveSpeed.id, 8, 1, 0.8F).setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(ApplePie, "ApplePie");
		LanguageRegistry.addName(ApplePie, "Apple Pie");

		// LOAD HELMET
		Dragonium_Helmet = new DragoniumArmor(DragoniumArmorMaterial, 0, 0, "DragoniumHelmet");
		GameRegistry.registerItem(Dragonium_Helmet, "Dragonium_Helmet");
		LanguageRegistry.addName(Dragonium_Helmet, "Dragonium Helmet");

		// LOAD CHESTPLATE
		Dragonium_Chestplate = new DragoniumArmor(DragoniumArmorMaterial, 0, 1, "DragoniumChestplate");
		GameRegistry.registerItem(Dragonium_Chestplate, "Dragonium_Chestplate");
		LanguageRegistry.addName(Dragonium_Chestplate, "Dragonium Chestplate");

		// LOAD LEGGINGS
		Dragonium_Leggings = new DragoniumArmor(DragoniumArmorMaterial, 0, 2, "DragoniumLeggings");
		GameRegistry.registerItem(Dragonium_Leggings, "Dragonium_Leggings");
		LanguageRegistry.addName(Dragonium_Leggings, "Dragonium Leggings");

		// LOAD BOOTS
		Dragonium_Boots = new DragoniumArmor(DragoniumArmorMaterial, 0, 3, "DragoniumBoots");
		GameRegistry.registerItem(Dragonium_Boots, "Dragonium_Boots");
		LanguageRegistry.addName(Dragonium_Boots, "Dragonium Boots");

		/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

		/**
		 * RECIPES SECTION
		 * ***********************************************************
		 */
		// SMELTING RECIPE
		GameRegistry.addSmelting(DragoniumOre, (new ItemStack(DragoniumIngot, 1)), 15);

		// SWORD RECIPE
		GameRegistry.addRecipe(new ItemStack(DragoniumSword),

		" D ", " D ", " I ", 'I', Items.blaze_rod, 'D', DragoniumIngot);

		GameRegistry.addRecipe(new ItemStack(RubySword),

		" R ", " R ", " I ", 'I', Items.stick, 'R', Ruby);

		// PICKAXE RECIPE
		GameRegistry.addRecipe(new ItemStack(DragoniumPickaxe),

		"DDD", " I ", " I ", 'I', Items.blaze_rod, 'D', DragoniumIngot);

		GameRegistry.addRecipe(new ItemStack(RubyPickaxe),

		"RRR", " I ", " I ", 'I', Items.stick, 'R', Ruby);

		// SHOVEL RECIPE
		GameRegistry.addRecipe(new ItemStack(DragoniumShovel),

		" D ", " I ", " I ", 'I', Items.blaze_rod, 'D', DragoniumIngot);

		// ITEM RECIPE
		GameRegistry.addRecipe(new ItemStack(DragoniumIngot, 64),

		"III", "IDI", "III", 'I', Items.iron_ingot, 'D', Blocks.dragon_egg);
		// FOOD RECIPE
		GameRegistry.addRecipe(new ItemStack(ApplePie, 3),

		"WWW", "ASA", "WWW", 'S', Items.sugar, 'W', Items.wheat, 'A', Items.apple);

		// HELMET RECIPE
		GameRegistry.addRecipe(new ItemStack(Dragonium_Helmet, 1), new Object[] { "XXX", "X X", 'X', DragoniumIngot, });

		// CHESTPLATE RECIPE
		GameRegistry.addRecipe(new ItemStack(Dragonium_Chestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', DragoniumIngot, });

		// LEGGINGS RECIPE
		GameRegistry.addRecipe(new ItemStack(Dragonium_Leggings, 1), new Object[] { "XXX", "X X", "X X", 'X', DragoniumIngot, });

		// BOOTS RECIPE
		GameRegistry.addRecipe(new ItemStack(Dragonium_Boots, 1), new Object[] { "X X", "X X", 'X', DragoniumIngot, });

		/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

		/**
		 * EXTRA METHODS SECTION
		 * ***********************************************************
		 */

		// REGISTER THE ORE GENERATION
		GameRegistry.registerWorldGenerator(new DragoniumOreGen(), 100);
		GameRegistry.registerWorldGenerator(new RubyOreGen(), 100);

		/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}

}
