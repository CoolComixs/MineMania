package com.camp.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.camp.lib.StringLibrary;

public class RenderCustomBiped extends RenderCow {

	public RenderCustomBiped(ModelCow modelCow, float par2) {
		super(modelCow, par2);
		// TODO Auto-generated constructor stub
	}





	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return new ResourceLocation(StringLibrary.MODID + ":textures/entity/KMOO.png");
	}

}