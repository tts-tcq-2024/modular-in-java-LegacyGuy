package colorcoder;

/**
 * Enum representing the primary colors in the color coding system.
 */
public enum PrimaryColorCodeEnum {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);

    private int index;

    private PrimaryColorCodeEnum(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static PrimaryColorCodeEnum fromIndex(int index) {
        for (PrimaryColorCodeEnum color : PrimaryColorCodeEnum.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid index for PrimaryColorCodeEnum: " + index);
    }
}
