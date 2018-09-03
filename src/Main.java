import lighter.core.models.Color;
import lighter.core.schemes.FlatColors;
import lighter.core.schemes.MaterialColors;
import lighter.core.schemes.NatureColors;

public class Main {
    public static void main(String[] args) {
        Color amber = MaterialColors.AMBER;
        Color grass = NatureColors.GRASS;
        Color alizarin = FlatColors.ALIZARIN;

        System.out.println(amber);
        System.out.println(grass);
        System.out.println(alizarin);
    }
}
