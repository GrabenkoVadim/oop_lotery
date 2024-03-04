package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        int randomColor = new Random().nextInt(Color.values().length);
        return Color.values()[randomColor].toString();
    }
    public enum Color{
        RED,
        GREEN,
        BLUE,
        BLACK,
        WHITE,
        YELLOW,
        BROWN,
        GRAY,
        PINK,
        ORANGE
    }
}
