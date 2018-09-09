package colr.core.models;

import java.io.Serializable;

public class ARGB implements Serializable {
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

    public int alpha() {
        return alpha;
    }

    public int red() {
        return red;
    }

    public int green() {
        return green;
    }

    public int blue() {
        return blue;
    }

    @Override
    public String toString() {
        return ARGB.class.getName() + "[alpha="+alpha+", red="+red+", green="+green+", blue="+blue+"]";
    }
}
