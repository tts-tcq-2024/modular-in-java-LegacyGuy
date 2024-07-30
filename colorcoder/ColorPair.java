package colorcoder;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor) {
        this.majorColor = major;
        this.minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    public String toString() {
        return ColorUtils.MajorColorNames[majorColor.getIndex()] + " " + ColorUtils.MinorColorNames[minorColor.getIndex()];
    }
}
