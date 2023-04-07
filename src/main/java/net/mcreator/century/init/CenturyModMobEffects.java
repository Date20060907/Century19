
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.century.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.century.potion.WeightMobEffect;
import net.mcreator.century.CenturyMod;

public class CenturyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CenturyMod.MODID);
	public static final RegistryObject<MobEffect> WEIGHT = REGISTRY.register("weight", () -> new WeightMobEffect());
}
