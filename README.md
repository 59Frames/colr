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

Here is one example:

### Material colors

- ![#F44336](https://placehold.it/20/f44336/000000?text=+) RED
- ![#E91E63](https://placehold.it/20/E91E63/000000?text=+) PINK       
- ![#9C27B0](https://placehold.it/20/9C27B0/000000?text=+) PURPLE     
- ![#673AB7](https://placehold.it/20/673AB7/000000?text=+) DEEP_PURPLE
- ![#3F51B5](https://placehold.it/20/3F51B5/000000?text=+) INDIGO     
- ![#2196F3](https://placehold.it/20/2196F3/000000?text=+) BLUE       
- ![#03A9F4](https://placehold.it/20/03A9F4/000000?text=+) LIGHT_BLUE 
- ![#00BCD4](https://placehold.it/20/00BCD4/000000?text=+) CYAN       
- ![#009688](https://placehold.it/20/009688/000000?text=+) TEAL       
- ![#4CAF50](https://placehold.it/20/4CAF50/000000?text=+) GREEN      
- ![#8BC34A](https://placehold.it/20/8BC34A/000000?text=+) LIGHT_GREEN
- ![#CDDC39](https://placehold.it/20/CDDC39/000000?text=+) LIME       
- ![#FFEB3B](https://placehold.it/20/FFEB3B/000000?text=+) YELLOW     
- ![#FFC107](https://placehold.it/20/FFC107/000000?text=+) AMBER      
- ![#FF9800](https://placehold.it/20/FF9800/000000?text=+) ORANGE     
- ![#FF5722](https://placehold.it/20/FF5722/000000?text=+) DEEP_ORANGE
- ![#795548](https://placehold.it/20/795548/000000?text=+) BROWN      
- ![#9E9E9E](https://placehold.it/20/9E9E9E/000000?text=+) GREY       
- ![#607D8B](https://placehold.it/20/607D8B/000000?text=+) BLUE_GREY

## Authors

**Daniel Seifert** - *Initial work* - [Brainker](https://github.com/Brainker)

## Acknowledgments

* Inspirated by Flutters Colors class
