package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.camp.lib.StringLibrary;
import net.minecraft.entity.Entity;
 
public class CustomItem extends ItemSword {
	
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
	    Entity bolt = new EntityLightningBolt(owner.worldObj, target.posX, target.posY, target.posZ);
	    owner.worldObj.addWeatherEffect(bolt);
	    return true;
    }
	
	public CustomItem(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
		this.setUnlocalizedName("CustomItem");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(64);
		this.setMaxStackSize(1);
		this.setTextureName(StringLibrary.MODID + ":BSword");
		
		
	}
 
}
