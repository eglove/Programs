public class LargeExponent {
    public static void main(String[] args) {
        System.out.print("Enter base: ");
        String base = System.console().readLine();
        System.out.print("Enter exponent: ");
        String exponent = System.console().readLine();

        System.out.println(calculate(Double.parseDouble(base), Double.parseDouble(exponent)));
    }

    private static double calculate(double base, double exponent) {
        if (exponent % 2 == 0) {
            base *= base;
            exponent /= 2;
            return Math.pow(base, exponent);
        } else {
            double baseSquared = base * base;
            exponent -= 1;
            exponent /= 2;
            base *= baseSquared;
            return Math.pow(base, exponent);
        }
    }
}
