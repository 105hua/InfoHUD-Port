package offkilter.infohud.infoline

import net.minecraft.core.Registry
import net.minecraft.network.chat.Component

class TargetedEntityInfoLine : InfoLineBase("targeted-entity", SettingsCategory.BLOCK) {
    override fun getInfoString(env: InfoLineEnvironment): Component? {
        return env.minecraft.crosshairPickEntity?.let { entity ->
            Component.literal("Targeted Entity: " + Registry.ENTITY_TYPE.getKey(entity.type))
        }
    }
}