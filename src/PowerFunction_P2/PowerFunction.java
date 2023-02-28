package PowerFunction_P2;

public class PowerFunction {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
