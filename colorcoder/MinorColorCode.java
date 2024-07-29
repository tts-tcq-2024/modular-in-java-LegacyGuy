package colorcoder;

/**
 * Enum representing the secondary colors in the color coding system.
 */
public enum SecondaryColorCodeEnum {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);

    private int index;

    private SecondaryColorCodeEnum(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static SecondaryColorCodeEnum fromIndex(int index) {
        for (SecondaryColorCodeEnum color : SecondaryColorCodeEnum.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid index for SecondaryColorCodeEnum: " + index);
    }
}
