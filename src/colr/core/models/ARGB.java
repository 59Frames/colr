package colr.core.models;

public class ARGB {
    private final int alpha;
    private final int red;
    private final int green;
    private final int blue;

    public ARGB(int red, int green, int blue) {
        this.alpha = 256;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public ARGB(int alpha, int red, int green, int blue) {
        this.alpha = alpha;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return ARGB.class.getName() + "[alpha="+alpha+", red="+red+", green="+green+", blue="+blue+"]";
    }
}
