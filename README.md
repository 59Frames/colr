# Colr

Colr is a Java based color tool.

## Getting Started

Download the .jar file from [here](https://github.com/Brainker/colr/raw/master/artifacts/colr.jar)

If you want to check out the existing colors, click the COLORS.md file or just [here](COLORS.md)

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
        System.out.println(grass);      // prints out:colr.core.models.Color[rgba(72, 107, 0, 0)]
        System.out.println(alizarin);   // prints out: colr.core.models.Color[rgba(231, 76, 60, 0)]
    }
}
```

## Authors

**Daniel Seifert** - *Initial work* - [Brainker](https://github.com/Brainker)

## Acknowledgments

* Inspirated by Flutters Colors class
