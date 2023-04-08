
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.century.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.century.item.SulfurItem;
import net.mcreator.century.item.SaltpeterorechipItem;
import net.mcreator.century.item.IronorechipItem;
import net.mcreator.century.item.Copperore1Item;
import net.mcreator.century.CenturyMod;

public class CenturyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CenturyMod.MODID);
	public static final RegistryObject<Item> COPPERORE = block(CenturyModBlocks.COPPERORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COPPERORE_1 = REGISTRY.register("copperore_1", () -> new Copperore1Item());
	public static final RegistryObject<Item> IRONORE = block(CenturyModBlocks.IRONORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRONORECHIP = REGISTRY.register("ironorechip", () -> new IronorechipItem());
	public static final RegistryObject<Item> SALTPETERORECHIP = REGISTRY.register("saltpeterorechip", () -> new SaltpeterorechipItem());
	public static final RegistryObject<Item> SALTPETERORE = block(CenturyModBlocks.SALTPETERORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SULFUR = REGISTRY.register("sulfur", () -> new SulfurItem());
	public static final RegistryObject<Item> SULFURORE = block(CenturyModBlocks.SULFURORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
