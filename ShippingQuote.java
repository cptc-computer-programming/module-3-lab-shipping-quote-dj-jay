public class ShippingQuote {
    private static final double BASE_COST = 2.0;

    static double calculateTotalCost(double weight, double surfaceArea) {
        return weight * Math.max(BASE_COST, Math.pow(weight, 1.5) / (1000 * (1 / (surfaceArea / 12))));
    }

    /// This will calculate the volume based on dimensions
    static double calculateVolume(double length, double width, double height) {
        return length*width*height;
    }

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
        double surfaceArea = 2 * (length + width + height);

        System.out.printf("Volume is %.2fin³\n", calculateVolume(length, width, height));
        System.out.printf("Surface Area is %.2fin²\n", surfaceArea);
        System.out.printf("Total Shipping Cost is $%.2f\n", calculateTotalCost(weight, surfaceArea));
    }
}
