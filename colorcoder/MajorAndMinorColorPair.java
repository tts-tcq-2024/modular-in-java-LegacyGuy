package colorcoder;

/**
 * Class representing a pair of primary and secondary colors.
 */
public class ColorPairRepresentation {
    private PrimaryColorCodeEnum primaryColor;
    private SecondaryColorCodeEnum secondaryColor;

    public ColorPairRepresentation(PrimaryColorCodeEnum primary, SecondaryColorCodeEnum secondary) {
        this.primaryColor = primary;
        this.secondaryColor = secondary;
    }

    public PrimaryColorCodeEnum getPrimary() {
        return primaryColor;
    }

    public SecondaryColorCodeEnum getSecondary() {
        return secondaryColor;
    }

    public String toString() {
        return primaryColor.name() + " " + secondaryColor.name();
    }
}
