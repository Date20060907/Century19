
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.century.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.century.block.CopperoreBlock;
import net.mcreator.century.CenturyMod;

public class CenturyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CenturyMod.MODID);
	public static final RegistryObject<Block> COPPERORE = REGISTRY.register("copperore", () -> new CopperoreBlock());
}
