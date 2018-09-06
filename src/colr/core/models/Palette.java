package colr.core.models;

public class Palette {
    private final Color[] colors;

    private String title;

    public Palette(String title) {
        this.colors = new Color[5];
        this.title = title;
    }

    public Color add(Color color) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == null){
                colors[i] = color;
                return color;
            }
        }

        System.out.println("Palette is full already... please remove a color");
        return null;
    }

    public Color get(int index) {
        return colors[index];
    }

    public Color remove(int index) {
        if (0 <= index && index < 6){
            Color c = colors[index];
            colors[index] = null;
            return c;
        } else {
            System.out.println("Invalid index");
            return null;
        }
    }

    public Color remove(Color color) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == color)
                return remove(i);
        }

        return null;
    }
}
