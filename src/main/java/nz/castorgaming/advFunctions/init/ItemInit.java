package nz.castorgaming.advFunctions.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import nz.castorgaming.advFunctions.objects.armor.ArmorBase;
import nz.castorgaming.advFunctions.objects.items.ItemBase;
import nz.castorgaming.advFunctions.objects.tools.ToolAxe;
import nz.castorgaming.advFunctions.objects.tools.ToolHoe;
import nz.castorgaming.advFunctions.objects.tools.ToolPickaxe;
import nz.castorgaming.advFunctions.objects.tools.ToolShovel;
import nz.castorgaming.advFunctions.objects.tools.ToolSword;
import nz.castorgaming.advFunctions.util.Reference;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 200, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MOD_ID + ":copper", 13, new int[]{2, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 2, 280, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("armor_bronze", Reference.MOD_ID + ":bronze", 18, new int[]{2, 6, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ToolMaterial TOOL_RESONANT = EnumHelper.addToolMaterial("tool_resonant", 2, 200, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_RESONANT = EnumHelper.addArmorMaterial("armor_resonant", Reference.MOD_ID + ":resonant", 66, new int[]{3, 6, 8, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ToolMaterial TOOL_DIAMANTINE = EnumHelper.addToolMaterial("tool_diamantine", 2, 200, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_DIAMANTINE = EnumHelper.addArmorMaterial("armor_diamantine", Reference.MOD_ID + ":diamantine", 40, new int[]{3, 6, 8, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ToolMaterial TOOL_RADIANT = EnumHelper.addToolMaterial("tool_radiant", 2, 200, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_RADIANT = EnumHelper.addArmorMaterial("armor_radiant", Reference.MOD_ID + ":radiant", 10, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//Ingots
	public static final Item INGOT_OBSIDIAN = new ItemBase("ingot_obsidian");
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_TIN = new ItemBase("ingot_tin");
	public static final Item INGOT_SILVER = new ItemBase("ingot_silver");
	public static final Item INGOT_LEAD = new ItemBase("ingot_lead");
	public static final Item INGOT_FERROUS = new ItemBase("ingot_ferrous");
	public static final Item INGOT_PLATINUM = new ItemBase("ingot_platinum");
	public static final Item INGOT_ELECTRUM = new ItemBase("ingot_electrum");
	public static final Item INGOT_RESONANT = new ItemBase("ingot_resonant");
	public static final Item INGOT_REDSTONE = new ItemBase("ingot_redstone");
	public static final Item INGOT_DIAMANTINE = new ItemBase("ingot_diamantine");
	public static final Item INGOT_BRONZE = new ItemBase("ingot_bronze");
	public static final Item INGOT_RADIANT = new ItemBase("ingot_radiant");
	
	//Tools
		//Obsidian 
	/*
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	*/
		//Copper
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
		//Bronze
	public static final Item AXE_BRONZE = new ToolAxe("axe_bronze", TOOL_BRONZE);
	public static final Item SHOVEL_BRONZE = new ToolShovel("shovel_bronze", TOOL_BRONZE);
	public static final Item PICKAXE_BRONZE = new ToolPickaxe("pickaxe_bronze", TOOL_BRONZE);
	public static final Item HOE_BRONZE = new ToolHoe("hoe_bronze", TOOL_BRONZE);
	public static final Item SWORD_BRONZE = new ToolSword("sword_bronze", TOOL_BRONZE);
		//Resonant
	public static final Item AXE_RESONANT = new ToolAxe("axe_resonant", TOOL_RESONANT);
	public static final Item SHOVEL_RESONANT = new ToolShovel("shovel_resonant", TOOL_RESONANT);
	public static final Item PICKAXE_RESONANT = new ToolPickaxe("pickaxe_resonant", TOOL_RESONANT);
	public static final Item HOE_RESONANT = new ToolHoe("hoe_resonant", TOOL_RESONANT);
	public static final Item SWORD_RESONANT = new ToolSword("sword_resonant", TOOL_RESONANT);
		//Diamantine
	public static final Item AXE_DIAMANTINE = new ToolAxe("axe_diamantine", TOOL_DIAMANTINE);
	public static final Item SHOVEL_DIAMANTINE = new ToolShovel("shovel_diamantine", TOOL_DIAMANTINE);
	public static final Item PICKAXE_DIAMANTINE = new ToolPickaxe("pickaxe_diamantine", TOOL_DIAMANTINE);
	public static final Item HOE_DIAMANTINE = new ToolHoe("hoe_diamantine", TOOL_DIAMANTINE);
	public static final Item SWORD_DIAMANTINE = new ToolSword("sword_diamantine", TOOL_DIAMANTINE);
		//Radiant
	public static final Item AXE_RADIANT = new ToolAxe("axe_radiant", TOOL_RADIANT);
	public static final Item SHOVEL_RADIANT = new ToolShovel("shovel_radiant", TOOL_RADIANT);
	public static final Item PICKAXE_RADIANT = new ToolPickaxe("pickaxe_radiant", TOOL_RADIANT);
	public static final Item HOE_RADIANT = new ToolHoe("hoe_radiant", TOOL_RADIANT);
	public static final Item SWORD_RADIANT = new ToolSword("sword_radiant", TOOL_RADIANT);

	//Armor
		//Copper
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
		//Bronze
	public static final Item HELMET_BRONZE = new ArmorBase("helmet_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_BRONZE = new ArmorBase("chestplate_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_BRONZE = new ArmorBase("leggings_bronze", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_BRONZE = new ArmorBase("boots_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
		//Resonant
	public static final Item HELMET_RESONANT = new ArmorBase("helmet_resonant", ARMOR_RESONANT, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RESONANT = new ArmorBase("chestplate_resonant", ARMOR_RESONANT, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RESONANT = new ArmorBase("leggings_resonant", ARMOR_RESONANT, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RESONANT = new ArmorBase("boots_resonant", ARMOR_RESONANT, 1, EntityEquipmentSlot.FEET);
		//Diamantine
	public static final Item HELMET_DIAMANTINE = new ArmorBase("helmet_diamantine", ARMOR_DIAMANTINE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_DIAMANTINE = new ArmorBase("chestplate_diamantine", ARMOR_DIAMANTINE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_DIAMANTINE = new ArmorBase("leggings_diamantine", ARMOR_DIAMANTINE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_DIAMANTINE = new ArmorBase("boots_diamantine", ARMOR_DIAMANTINE, 1, EntityEquipmentSlot.FEET);
		//Radiant
	public static final Item HELMET_RADIANT = new ArmorBase("helmet_radiant", ARMOR_RADIANT, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RADIANT = new ArmorBase("chestplate_radiant", ARMOR_RADIANT, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RADIANT = new ArmorBase("leggings_radiant", ARMOR_RADIANT, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RADIANT = new ArmorBase("boots_radiant", ARMOR_RADIANT, 1, EntityEquipmentSlot.FEET);
		
	//Misc Items
	public static final Item BALL_RUBBER = new ItemBase("ball_rubber");
	
}
