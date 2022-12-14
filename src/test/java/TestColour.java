import org.junit.Assert;
import org.junit.Test;

/*
* The Colour class must implement the following functionality
* • A constructor for a Colour object with three parameters which specify the colour components, in
*   the order red, green and blue, using a floating point values in the range 0.0 to 1.0
* • A constructor for a Colour object that specifies one parameter which is a combined RGB value
*   consisting of the red component in bits 16-23, the green component in bits 8-15, and the blue
*   component in bits 0-7
* • It is not allowed to create a Colour object without specifying valid component values
* • Colours can be compared, to be equal they must have the same component values
*/

public class TestColour {

    @Test
    public void ColourFloatTest() {
        Object x = new Colour(0.1f, 0.1f, 0.1f);
        Assert.assertNotNull("Colour object not created", x);
    }

    @Test
    public void ColourFloatOutOfRangeTest() {
        Assert.assertThrows(IllegalArgumentException.class , () -> new Colour(1.1f, 5f, 0.1f));
        Assert.assertThrows(IllegalArgumentException.class , () -> new Colour(0.1f, -5f, -0.1f));
    }

    @Test
    public void ColourBitsTest() {
        Object x = new Colour("000011110000111100001111");
        Assert.assertNotNull("Colour object not created", x);
    }

    @Test
    public void ColourGettersSettersTest() {
        Colour x = new Colour(0.1f, 0.1f, 0.1f);

        assert (x.getRed() != 0.5f) : "Red getter/setter not working";
        assert (x.getGreen() != 0.7f) : "Green getter/setter not working";
        assert (x.getBlue() != 0.9f) : "Blue getter/setter not working";
    }

    @Test
    public void ColourEqualsTest() {
        Colour x = new Colour(0.1f, 0.1f, 0.1f);
        Colour y = new Colour(0.1f, 0.1f, 0.1f);
        assert x.equals(y) : "The colours match!";
    }
}

