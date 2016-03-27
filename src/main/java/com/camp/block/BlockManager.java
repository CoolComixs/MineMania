package com.camp.block;
import net.minecraft.block.material.Material;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
public class BlockManager {

	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	public static Block customBlock;
	public static void initializeBlock() {
		customBlock = new EClust(Material.iron);
	}

	public static void registerBlock() {

		GameRegistry.registerBlock(customBlock, customBlock.getUnlocalizedName());


	}

}