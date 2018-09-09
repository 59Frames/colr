package colr.core.models;

import colr.extensions.ColorUtil;

import java.io.Serializable;

public class ColorThemeData implements Serializable {
    public Color primary;
    public Color secondary;
    public Color accent;
    public Color font;
    public Color icon;

    private ColorThemeData(){
        // private constructor to force initializing over Builder class
    }

    private ColorThemeData(Color primary, Color secondary, Color accent, Color font, Color icon) {
        this.primary = primary;
        this.secondary = secondary;
        this.accent = accent;
        this.font = font;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "primary: "+ primary.toString() + "\n" +
                "secondary: "+ secondary.toString() + "\n" +
                "accent: "+ accent.toString() + "\n" +
                "font: "+ font.toString() + "\n" +
                "icon: "+ icon.toString();
    }

    public final static class Builder {

        private Color primary;
        private Color secondary;
        private Color accent;
        private Color font;
        private Color icon;

        public Builder(){
            primary = null;
            secondary = null;
            accent = null;
            font = null;
            icon = null;
        }

        public Builder primary(Color color){
            this.primary = color;
            return this;
        }

        public Builder secondary(Color color){
            this.secondary = color;
            return this;
        }

        public Builder accent(Color color){
            this.accent = color;
            return this;
        }

        public Builder font(Color color){
            this.font = color;
            return this;
        }

        public Builder icon(Color color){
            this.icon = color;
            return this;
        }

        public ColorThemeData build() {
            if (primary == null)
                primary = new Color(0xFF9B59B6);

            if (secondary == null)
                secondary = primary.withRed((primary.red()+32)).withGreen((primary.green()+32)).withBlue((primary.blue()+32));

            if (accent == null)
                accent = primary.getContrastColor();

            if (font == null)
                font = ColorUtil.brightness(primary) < 130 ? new Color(0xFFFEFEFE) : new Color(0xFF262626);

            if (icon == null)
                icon = ColorUtil.brightness(primary) < 130 ? new Color(0xFFFEFEFE) : new Color(0xFF262626);

            return new ColorThemeData(primary, secondary, accent, font, icon);
        }
    }
}
