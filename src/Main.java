import colr.core.models.Color;
import colr.core.schemes.FlatColors;
import colr.core.schemes.MaterialColors;
import colr.core.schemes.NatureColors;

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
