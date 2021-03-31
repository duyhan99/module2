import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap USD");
        int rate = 23000;
        int USD = scanner.nextInt();
        USD = USD*23000;
        System.out.println(USD + "VND");

    }
}
