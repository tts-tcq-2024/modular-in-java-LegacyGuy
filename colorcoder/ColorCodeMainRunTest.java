package colorcoder;

/**
 * Main class to run the color coding tests and print the reference manual.
 */
public class Main {
    public static void main(String[] args) {
        ColorCodeTestSuite.runTests();
        ColorCodeUtilityFunctions.printColorCodingReference();
    }
}
