# Colr

Colr is a Java based color tool.

## Getting Started

Download the .jar file from [here](https://github.com/Brainker/colr/raw/master/artifacts/colr.jar)

### Installing

01. Download .jar

02. Add .jar file to project as a library

03. Use it like this!

```java
import colr.core.models.Color;
import colr.core.schemes.FlatColors;
import colr.core.schemes.MaterialColors;
import colr.core.schemes.NatureColors;

public class Main {
    public static void main(String[] args) {
        Color amber = MaterialColors.AMBER;
        Color grass = NatureColors.GRASS;
        Color alizarin = FlatColors.ALIZARIN;

        System.out.println(amber);      // prints out: colr.core.models.Color[rgba(255, 193, 7, 0)]
        System.out.println(grass);      // prints out: colr.core.models.Color[rgba(72, 107, 0, 0)]
        System.out.println(alizarin);   // prints out: colr.core.models.Color[rgba(231, 76, 60, 0)]
    }
}
```

## Palettes

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
- ![#D9B44A](https://placehold.it/20/D9B44A/000000?text=+) SUNGLOW
- ![#E1b16A](https://placehold.it/20/E1b16A/000000?text=+) WARM
- ![#C99E10](https://placehold.it/20/C99E10/000000?text=+) GOLD
- ![#FFBB00](https://placehold.it/20/FFBB00/000000?text=+) SUNFLOWER
- ![#F98866](https://placehold.it/20/F98866/000000?text=+) PETAL
- ![#CE5A57](https://placehold.it/20/CE5A57/000000?text=+) PUNCH
- [see more...](COLORS.md)

## Authors

**Daniel Seifert** - *Initial work* - [Brainker](https://github.com/Brainker)

## Acknowledgments

* Inspirated by Flutters Colors class
