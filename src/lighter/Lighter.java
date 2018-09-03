package lighter;

import lighter.core.schemes.MaterialScheme;

public class Lighter {
    public static void main(String[] args) {
        System.out.println(MaterialScheme.TEAL.withOpacity(1.0));

        System.out.println(MaterialScheme.BLUE_GREY);
        System.out.println(MaterialScheme.BLUE_GREY.toAWTColor());
    }
}
