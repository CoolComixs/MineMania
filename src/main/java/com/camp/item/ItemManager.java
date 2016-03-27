package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager {
     
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
     
    public static Item HB;
    
    
    public static Item customItem;
   
    
    public static ToolMaterial customToolMaterial = EnumHelper.addToolMaterial("LShot", 0, 1001, 9, 15, 24);
    
          
    public static void initializeItem() {
        customItem = new CustomItem(customToolMaterial);
        HB = new CustomFood(10, 0.6F, true).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("HolyRoot").setTextureName(StringLibrary.MODID + ":HR");
    }
         
    public static void registerItem() {
         GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
         GameRegistry.registerItem(HB, HB.getUnlocalizedName());
         
    }
         
}