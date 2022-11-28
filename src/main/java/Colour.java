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
}
