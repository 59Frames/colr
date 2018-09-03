package lighter;

import lighter.core.schemes.MaterialColorScheme;

public class Lighter {
    public static void main(String[] args) {
        System.out.println(MaterialColorScheme.TEAL.withOpacity(1.0));

        System.out.println(MaterialColorScheme.BLUE_GREY);
        System.out.println(MaterialColorScheme.BLUE_GREY.toAWTColor());
    }
}
