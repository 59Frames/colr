package lighter.core.schemes;

import lighter.core.models.Color;
import lighter.core.models.Scheme;

public final class MaterialScheme extends Scheme {
    public static final Color RED = new Color(0xFFF44336);
    public static final Color PINK = new Color(0xFFE91E63);
    public static final Color PURPLE = new Color(0xFF9C27B0);
    public static final Color DEEP_PURPLE = new Color(0xFF673AB7);
    public static final Color INDIGO = new Color(0xFF3F51B5);
    public static final Color BLUE = new Color(0xFF2196F3);
    public static final Color LIGHT_BLUE = new Color(0xFF03A9F4);
    public static final Color CYAN = new Color(0xFF00BCD4);
    public static final Color TEAL = new Color(0xFF009688);
    public static final Color GREEN = new Color(0xFF4CAF50);
    public static final Color LIGHT_GREEN = new Color(0xFF8BC34A);
    public static final Color LIME = new Color(0xFFCDDC39);
    public static final Color YELLOW = new Color(0xFFFFEB3B);
    public static final Color AMBER = new Color(0xFFFFC107);
    public static final Color ORANGE = new Color(0xFFFF9800);
    public static final Color DEEP_ORANGE = new Color(0xFFFF5722);
    public static final Color BROWN = new Color(0xFF795548);
    public static final Color GREY = new Color(0xFF9E9E9E);
    public static final Color BLUE_GREY = new Color(0xFF607D8B);

    private MaterialScheme() throws IllegalAccessException {
        // private constructor to prevent initializing
    }
}
