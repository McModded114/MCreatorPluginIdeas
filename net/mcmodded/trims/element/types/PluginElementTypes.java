
package net.mcmodded.trims.element.types;

import net.mcreator.element.BaseType;
import net.mcreator.element.ModElementType;
import net.mcreator.element.ModElementTypeLoader;
import net.mcmodded.trims.ui.modgui.TrimGUI;

public class PluginElementTypes {
    public static ModElementType<?> TRIM;

    public PluginElementTypes() {
    }

    public static void load() {
        TRIM = ModElementTypeLoader.register(new ModElementType("trim", 'T', BaseType.ITEM, TrimGUI::new, Trim.class));
    }
}
