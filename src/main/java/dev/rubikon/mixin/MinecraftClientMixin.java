package dev.rubikon.mixin;

import dev.rubikon.api.renderer.core.imgui.ImGuiContext;
import dev.rubikon.api.renderer.core.nanovg.NVContext;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Inject(at = @At("TAIL"), method = "<init>")
	private void init(CallbackInfo info) {
		//only for initializing nanoVG and imgui
		NVContext.initialize();
		ImGuiContext.initialize();
	}
}
