# Colr

Colr is an revolutionary Java based color tool which helps you getting the perfect color for every moment.
Every color from the integrated palettes are handpicked by me.

## Getting Started

Download the .jar file from [here](https://github.com/Brainker/colr/raw/master/artifacts/colr.jar)

### Installing

01. Download .jar

02. Add .jar file to project as a library


### Usage
- How to use the *Colors classes

```java
import colr.core.models.Color;
import colr.core.schemes.*;

public class Main {
    public static void main(String[] args) {
        Color amber = MaterialColors.AMBER;
        Color grass = NatureColors.GRASS;
        Color alizarin = FlatColors.ALIZARIN;

        System.out.println(amber);      // Prints out: colr.core.models.Color[0xFFFFC107]
        System.out.println(grass);      // Prints out: colr.core.models.Color[0xFF486B00]
        System.out.println(alizarin);   // Prints out: colr.core.models.Color[0xFFE74C3C]
    }
}
```
- How to use it in an AWT application

```java
import colr.core.schemes.NatureColors;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");

        JPanel panel = new JPanel();
        panel.setBackground(NatureColors.DEEP_AQUA.toAWTColor());   // sets the background to NatureColors.DEEP_AQUA

        JButton button = new JButton("Test");
        button.setBackground(NatureColors.SEA_FOAM.toAWTColor());   // sets the background to NatureColors.SEA_FOAM

        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

```

- How to use the ColorUtil class

```java
import colr.core.models.ARGB;
import colr.core.models.Color;
import colr.extensions.ColorUtil;

public class Main {
    public static void main(String[] args) {
        Color color = new Color(0xFF2C7873);                //Creating a new Color
        ARGB argb = ColorUtil.argbOf(color);                //Getting the ARGB values of a color in a new ARGB-Object
        int colorValue = ColorUtil.valueOf(color);          //Get the int value of a color
        String hashHexCode = ColorUtil.hashHexCode(color);  //Get the hash code
        String hexDecCode = ColorUtil.hexaDeciCode(color);  //Get the Hex Decimal Code

        System.out.println(argb);                           //Prints out: colr.core.models.ARGB[alpha=255, red=44, green=120, blue=115]
        System.out.println(colorValue);                     //Prints out: -13862797
        System.out.println(hashHexCode);                    //Prints out: #2C7873
        System.out.println(hexDecCode);                     //Prints out: 0x2C7873
    }
}
```

- How to use a palette

```java
import colr.core.models.Color;
import colr.core.models.Palette;

public class Main {
    public static void main(String[] args){
        // Creates a new Palette object.
        // A Palette object can store a max. amount of 6 Colors.
        Palette palette = new Palette("BambooForest");
        
        palette.add(new Color(0xFFFFF6EE));
        palette.add(new Color(0xFFDB8360));
        palette.add(new Color(0xFFB2483D));
        palette.add(new Color(0xFF582F3B));
        palette.add(new Color(0xFF97B98A));
        
        Color color = palette.get(0);
        
        System.out.println(color);  // Prints out: colr.core.models.Color[0xFFFFF6EE]
    }
}
```

- How to use a ColorTheme

```java
import colr.core.models.ColorThemeData;
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

        // If the theme hasn't been fully implemented, it creates a theme based on the following rules:
        // 1. If no primary color is set, it takes a default color. Currently it is 0xFF9B59B6
        // 2. If no secondary color is set, it takes the primary color and makes it brighter by a given value. Currently by 32
        // 3. If no accent color is set, it creates a new color from the inverted primary color value
        // 4. If no font color is set, it calculates the brightness and whether the result is higher than 130 it takes a darker or brighter color
        // 5. If no icon color is set, it calculates the brightness and whether the result is higher than 130 it takes a darker or brighter color
        ColorTheme halfImplementedTheme = new ColorTheme.Builder()
                .primary(NatureColors.CRIMSON)
                .font(NatureColors.WHITE)
                .build();
        
        ColorTheme notImplementedTheme = new ColorTheme.Builder().build();
    }
}
```

## Integrated colors

If you'd like to see all palettes, please have a look at the [COLORS.md](COLORS.md) file.

Here are just a few examples:

### Material colors

- ![#F44336](https://placehold.it/20/f44336/000000?text=+) RED
- ![#E91E63](https://placehold.it/20/E91E63/000000?text=+) PINK       
- ![#9C27B0](https://placehold.it/20/9C27B0/000000?text=+) PURPLE     
- ![#673AB7](https://placehold.it/20/673AB7/000000?text=+) DEEP_PURPLE
- ![#3F51B5](https://placehold.it/20/3F51B5/000000?text=+) INDIGO     
- ![#2196F3](https://placehold.it/20/2196F3/000000?text=+) BLUE       
- ![#03A9F4](https://placehold.it/20/03A9F4/000000?text=+) LIGHT_BLUE 
- ![#00BCD4](https://placehold.it/20/00BCD4/000000?text=+) CYAN       
- [see more...](COLORS.md)

### Nature colors:

- ![#E6D72A](https://placehold.it/20/E6D72A/000000?text=+) CANARY_YELLOW
- ![#F4CC70](https://placehold.it/20/F4CC70/000000?text=+) SANDSTONE
- ![#D9B44A](https://placehold.it/20/D9B44A/000000?text=+) SUN_GLOW
- ![#E1b16A](https://placehold.it/20/E1b16A/000000?text=+) WARM
- ![#C99E10](https://placehold.it/20/C99E10/000000?text=+) GOLD
- ![#FFBB00](https://placehold.it/20/FFBB00/000000?text=+) SUNFLOWER
- ![#F98866](https://placehold.it/20/F98866/000000?text=+) PETAL
- ![#CE5A57](https://placehold.it/20/CE5A57/000000?text=+) PUNCH
- [see more...](COLORS.md)

## Authors

**Daniel Seifert** - *Initial work* - [59Frames](https://github.com/59Frames)

## Acknowledgments

* Inspired by Flutters Colors class
