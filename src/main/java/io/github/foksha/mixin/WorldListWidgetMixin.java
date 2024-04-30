package io.github.foksha.mixin;

import net.minecraft.client.gui.screen.world.WorldListWidget;
import net.minecraft.world.level.storage.LevelStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldListWidget.class)
public class WorldListWidgetMixin {
	@Redirect(method = "loadLevels", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/storage/LevelStorage$LevelList;isEmpty()Z"))
	private boolean forceOpenScreen(LevelStorage.LevelList instance) {
		return false;
	}
}