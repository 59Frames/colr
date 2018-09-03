package lighter.core.utils;

import java.util.regex.Pattern;

public class ColorUtil {

    private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{8})$";

    private ColorUtil(){
        // private constructor to prevent initializing
    }

    public static int[] hex2rgba(String hex){
        if (isHex(hex)){
            int[] rgba = new int[4];

            rgba[3] = Integer.valueOf(hex.substring(1, 3), 16);
            rgba[0] = Integer.valueOf(hex.substring(3, 5), 16);
            rgba[1] = Integer.valueOf(hex.substring(5, 7), 16);
            rgba[2] = Integer.valueOf(hex.substring(7, 9), 16);

            return rgba;
        } else throw new IllegalArgumentException();
    }

    public static String rgba2hex(int[] rgb){
        if (isRGBA(rgb)){
            return String.format("#%02x%02x%02x%02x", rgb[0], rgb[1], rgb[2], rgb[3]);
        } else throw new IllegalArgumentException();
    }

    public static boolean isHex(String hex){
        return Pattern.compile(HEX_PATTERN).matcher(hex).matches();
    }

    public static boolean isRGBA(int[] rgba){
        return (rgba.length == 4 && (0 < rgba[0] && rgba[0] <= 256) && (0 < rgba[1] && rgba[1] <= 256) && (0 < rgba[2] && rgba[2] <= 256) && (0 < rgba[3] && rgba[3] <= 256));
    }
}
