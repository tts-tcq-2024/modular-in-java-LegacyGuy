package colorcoder;

/**
 * Utility class for color coding operations.
 */
public class ColorCodeUtilityFunctions {
    final static String[] PrimaryColorNames = {"White", "Red", "Black", "Yellow", "Violet"};
    final static int numberOfPrimaryColors = PrimaryColorNames.length;
    final static String[] SecondaryColorNames = {"Blue", "Orange", "Green", "Brown", "Slate"};
    final static int numberOfSecondaryColors = SecondaryColorNames.length;

    /**
     * Get the color pair corresponding to the given pair number.
     * 
     * @param pairNumber the pair number
     * @return the corresponding color pair
     */
    public static ColorPairRepresentation getColorFromPairNumber(int pairNumber) {
        if (pairNumber < 1 || pairNumber > numberOfPrimaryColors * numberOfSecondaryColors) {
            throw new IllegalArgumentException("Invalid pair number: " + pairNumber);
        }
        int zeroBasedPairNumber = pairNumber - 1;
        PrimaryColorCodeEnum primaryColor = PrimaryColorCodeEnum.fromIndex(zeroBasedPairNumber / numberOfSecondaryColors);
        SecondaryColorCodeEnum secondaryColor = SecondaryColorCodeEnum.fromIndex(zeroBasedPairNumber % numberOfSecondaryColors);
        return new ColorPairRepresentation(primaryColor, secondaryColor);
    }

    /**
     * Get the pair number corresponding to the given color pair.
     * 
     * @param primary the primary color
     * @param secondary the secondary color
     * @return the corresponding pair number
     */
    public static int getPairNumberFromColor(PrimaryColorCodeEnum primary, SecondaryColorCodeEnum secondary) {
        return primary.getIndex() * numberOfSecondaryColors + secondary.getIndex() + 1;
    }

    /**
     * Print the color coding reference manual.
     */
    public static void printColorCodingReference() {
        for (int i = 1; i <= numberOfPrimaryColors * numberOfSecondaryColors; i++) {
            ColorPairRepresentation pair = getColorFromPairNumber(i);
            System.out.println(i + " - " + pair.toString());
        }
    }
}
