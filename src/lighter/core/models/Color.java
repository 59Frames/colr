package lighter.core.models;

import java.io.Serializable;

public class Color implements Serializable {
    private final int VALUE;

    public Color(int value) {
        this.VALUE = value;
    }

    public static Color fromARGB(int a, int r, int g, int b){
        int value = (((a & 0xff) << 24) | ((r & 0xff) << 16) | ((g & 0xff) << 8) | ((b & 0xff)));
        return new Color(value);
    }

    public int alpha(){
        int val = (0xff000000 & VALUE) >> 24;
        return val < 0 ? 0 : val;
    }

    public int red(){
        return (0x00ff0000 & VALUE) >> 16;
    }

    public int green(){
        return (0x0000ff00 & VALUE) >> 8;
    }

    public int blue(){
        return (0x000000ff & VALUE);
    }

    public java.awt.Color toAWTColor(){
        return new java.awt.Color(red(), green(), blue(), alpha());
    }

    public Color withAlpha(int a){
        return Color.fromARGB(a, red(), green(), blue());
    }

    public Color withOpacity(double opacity){
        if (!(opacity >= 0.0 && opacity <= 1.0))
            throw new IllegalArgumentException();

        double a = 255.0 * opacity;
        return withAlpha((int) a);
    }

    public Color withRed(int r){
        return Color.fromARGB(alpha(), r, green(), blue());
    }

    public Color withGreen(int g){
        return Color.fromARGB(alpha(), red(), g, blue());
    }

    public Color withBlue(int b){
        return Color.fromARGB(alpha(), red(), green(), b);
    }

    @Override
    public String toString() {
        return Color.class.getName()+"[rgba(" + red() + ", " + green() + ", " + blue() + ", " + alpha() + ")]";
    }
}
