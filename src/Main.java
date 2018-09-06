import colr.core.models.ColorTheme;
import colr.core.schemes.FlatColors;
import colr.core.schemes.NatureColors;

public class Main {
    public static void main(String[] args) {
        ColorTheme fullyImplementedTheme = new ColorTheme.Builder()
                .primary(FlatColors.WISTERIA)
                .secondary(FlatColors.AMETHYST)
                .accent(FlatColors.PETER_RIVER)
                .font(FlatColors.CLOUDS)
                .icon(FlatColors.CLOUDS)
                .build();

        System.out.println(fullyImplementedTheme);

        ColorTheme halfImplementedTheme = new ColorTheme.Builder()
                .primary(NatureColors.CRIMSON)
                .font(NatureColors.WHITE)
                .build();

        System.out.println(halfImplementedTheme);
    }
}
