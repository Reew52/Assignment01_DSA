package MemoryStack;

public class ConvertToBinary {
    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int decimal = 23;
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation of " + decimal + " is " + binary);
    }
}
