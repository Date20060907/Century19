
package net.mcreator.century.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WeightMobEffect extends MobEffect {
	public WeightMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.century.weight";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
