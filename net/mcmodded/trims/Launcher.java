
package net.mcmodded.trims;

import net.mcreator.plugin.JavaPlugin;
import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.events.PreGeneratorsLoadingEvent;
import net.mcmodded.trims.element.types.PluginElementTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher extends JavaPlugin {
    private static final Logger LOG = LogManager.getLogger("ArmorTrims Plugin");

    public Launcher(Plugin plugin) {
        super(plugin);
        this.addListener(PreGeneratorsLoadingEvent.class, (e) -> {
            PluginElementTypes.load();
        });
        LOG.info("Plugin was loaded");
    }
}
