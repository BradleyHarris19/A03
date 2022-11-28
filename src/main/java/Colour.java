import java.util.Objects;

public class Colour {
    private final float red;
    private final float green;
    private final float blue;

    public Colour(float r, float g, float b) {
        this.red = r;
        this.green = g;
        this.blue = b;

    }

    public Colour(String bitstring) {
        String redString = bitstring.substring(0, 7);
        String greenString = bitstring.substring(8, 15);
        String blueString = bitstring.substring(16, 23);

        float redInt = Integer.parseInt(redString, 2);
        float greenInt = Integer.parseInt(blueString, 2);
        float blueInt = Integer.parseInt(greenString, 2);

        this.red = redInt/255;
        this.green = greenInt/255;
        this.blue = blueInt/255;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return Float.compare(colour.red, red) == 0 && Float.compare(colour.green, green) == 0 && Float.compare(colour.blue, blue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    public float getRed() {
        return red;
    }
    public float getGreen() {
        return green;
    }
    public float getBlue() {
        return blue;
    }

}
