import java.util.Scanner;

public class ScannerExample {
    public ScannerExample() {
    }

    public static void main(String[] args) {
        byte bytevalue = 75;
        int intvalue = 30;
        int MAX_VALUE = bytevalue;
        int MIN_VALUE = intvalue;
        System.out.println("byte: " + bytevalue);
        System.out.println("int: " + intvalue);
        System.out.println("Max: " + MAX_VALUE);
        System.out.println("Min: " + MIN_VALUE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тип даних Float: ");
        scanner.nextLine();
        Float float1 = 3.65F;
        double double1 = (double)float1;
        System.out.println("double значення: " + float1);
        System.out.println("int значення: " + double1);
    }
}
