package net.mcreator.century.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.century.network.CenturyModVariables;
import net.mcreator.century.init.CenturyModMobEffects;

public class Weight01Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CenturyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CenturyModVariables.PlayerVariables())).weight <= 100) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(CenturyModMobEffects.WEIGHT.get(), 20, 1));
		}
	}
}
