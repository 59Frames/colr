package colr.core.models;

import colr.extensions.ColorUtil;

import java.io.Serializable;

public class Color implements Serializable {
    private final int VALUE;

    public Color(int value) {
        this.VALUE = value;
    }

    public static Color fromARGB(int a, int r, int g, int b){
        if (!((0 <= a && a < 256) && (0 <= r && r < 256) && (0 <= g && g < 256) && (0 <= b && b < 256)))
            return new Color(0xFFFFFFFF);

        int value = (((a & 0xff) << 24) | ((r & 0xff) << 16) | ((g & 0xff) << 8) | ((b & 0xff)));
        return new Color(value);
    }

    public int value(){
        return this.VALUE;
    }

    public int alpha(){
        int val = (0xff000000 & VALUE) >> 24;
        return val < 0 ? 0xFF : val;
    }

    public boolean brighterThan(Color color){
        int sumThis = this.red() + this.green() + this.blue() - this.alpha();
        int sumComp = color.red() + color.green() + color.blue() - color.alpha();

        return sumThis > sumComp;
    }

    public int brightness(){
        return (int) Math.sqrt(
            (this.red() * this.red() * .241) +
            (this.green() * this.green() * .691) +
            (this.blue() * this.blue() * .068)
        );
    }

    public boolean darkerThan(Color color){
        return !brighterThan(color);
    }

    public Color getContrastColor() {
        return new Color((0xFFFFFF - this.VALUE) | 0xFF000000);
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
        return Color.class.getName()+"[" + ColorUtil.hexaDeciCodeWithAlpha(this) + "]";
    }
}
