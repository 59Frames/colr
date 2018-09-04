package colr.extensions;

import colr.core.models.ARGB;
import colr.core.models.Color;

public final class ColorUtil {
    public static ARGB argbOf(Color color){
        return new ARGB(color.alpha(), color.red(), color.green(), color.blue());
    }

    public static ARGB rgbOf(Color color){
        return new ARGB(color.red(), color.green(), color.blue());
    }

    public static int valueOf(Color color){
        return color.value();
    }

    public static String hashHexCodeWithAlpha(Color color){
        ARGB argb = argbOf(color);
        return String.format("#%02X%02X%02X%02X", argb.getAlpha(), argb.getRed(), argb.getGreen(), argb.getBlue());
    }

    public static String hashHexCode(Color color){
        ARGB argb = rgbOf(color);
        return String.format("#%02X%02X%02X", argb.getRed(), argb.getGreen(), argb.getBlue());
    }

    public static String hexaDeciCodeWithAlpha(Color color){
        ARGB argb = argbOf(color);
        return String.format("0x%02X%02X%02X%02X", argb.getAlpha(), argb.getRed(), argb.getGreen(), argb.getBlue());
    }

    public static String hexaDeciCode(Color color){
        ARGB argb = rgbOf(color);
        return String.format("0x%02X%02X%02X", argb.getRed(), argb.getGreen(), argb.getBlue());
    }
}
