package offkilter.infohud.infoline

import net.minecraft.network.chat.Component
import offkilter.infohud.client.PerfCounters

class SpeedInfoLine: InfoLineBase("speed", SettingsCategory.LOCATION) {
    override fun getInfoString(env: InfoLineEnvironment): Component? {
        return Component.literal(String.format("Speed: %.2f m/s", PerfCounters.speed))
    }
}