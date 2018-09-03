# Lighter

Lighter is a Java based color tool.

## Getting Started

Download the .jar file from <a>here</a>

### Installing

A step by step series of examples that tell you how to get a development env running

01. Download .jar

02. Add .jar file to project as a library

03. Use it like this!

```java
import lighter.core.models.Color;
import lighter.core.schemes.FlatColors;
import lighter.core.schemes.MaterialColors;
import lighter.core.schemes.NatureColors;

public class Main {
    public static void main(String[] args) {
        Color amber = MaterialColors.AMBER;
        Color grass = NatureColors.GRASS;
        Color alizarin = FlatColors.ALIZARIN;

        System.out.println(amber);    // Prints out: lighter.core.models.Color[rgba(255, 193, 7, 0)]
        System.out.println(grass);    // Prints out: lighter.core.models.Color[rgba(72, 107, 0, 0)]
        System.out.println(alizarin); // Prints out: lighter.core.models.Color[rgba(231, 76, 60, 0)]
    }
}
```

## Authors

* **Daniel Seifert** - *Initial work* - [Brainker](https://github.com/Brainker)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
