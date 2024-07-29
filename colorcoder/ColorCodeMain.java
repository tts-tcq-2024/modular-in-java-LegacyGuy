package colorcoder;

public class ColorCoderMain {
    public static void main(String[] args) {
        ColorCodeUtility.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCodeUtility.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorCodeUtility.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCodeUtility.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        ColorCodeUtility.printColorCodingReference();
    }
}
