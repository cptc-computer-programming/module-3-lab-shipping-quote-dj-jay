public class ShippingQuote {
    private static final double BASE_COST = 2.0;

    public static void main(String[] args) {
        if (args.length < 4) { // Not enough args
            System.err.println("Usage: ShippingQuote <weight> <length> <width> <height>");
            return;
        }

        // Parse arguments into double type
        double[] argDoub = new double[4];
        for (int i = 0; i < 4; ++i) {
            try { argDoub[i] = Double.parseDouble(args[i]); }
            catch (NumberFormatException _e) { // Not a double
                System.err.println("Usage: ShippingQuote <weight> <length> <width> <height>");
                return;
            }
        }
        double weight = argDoub[0], length = argDoub[1], width = argDoub[2], height = argDoub[3];
    }

    /// This will calculate and print the total cost of shipping.
    double calculateTotalCost(double baseCost, double weight, double surfaceArea) {
        return 0;
    }

    /// This will calculate the volume based on dimensions
    double calculateVolume(double length, double width, double height) {
        return 0;
    }
}
