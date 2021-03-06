package de.melanx.defaultworldtype;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.util.text.TranslationTextComponent;

public class Util {

    public static String getWorldTypeNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (BiomeGeneratorTypeScreens s : BiomeGeneratorTypeScreens.field_239068_c_) {
            if (s != null)
                stringBuilder.append("\n- ").append(((TranslationTextComponent) s.func_239077_a_()).getKey().replace("generator.", ""));
        }
        return stringBuilder.toString();
    }

    public static int countWorldTypes() {
        return BiomeGeneratorTypeScreens.field_239068_c_.size();
    }

}
