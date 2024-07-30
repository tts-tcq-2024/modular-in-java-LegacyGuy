package colorcoder;

public class ColorUtils {
    final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };

    final static int numberOfMajorColors = MajorColorNames.length;

    final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };

    final static int numberOfMinorColors = MinorColorNames.length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
                MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void printReferenceManual() {
        System.out.println("Reference Manual:");
        for (int i = 1; i <= numberOfMajorColors * numberOfMinorColors; i++) {
            ColorPair pair = getColorFromPairNumber(i);
            System.out.println("Pair number: " + i + " - " + pair.toString());
        }
    }
}
