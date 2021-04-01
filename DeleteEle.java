import java.util.Arrays;
import java.util.Scanner;

public class DeleteEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] numbers = new int [size];

        System.out.println("Input number: ");
        for(int i = 0; i < size; i++){
            System.out.println("index: " + i + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Remove value");
        int remove = scanner.nextInt();

        System.out.println("Before:" + Arrays.toString(numbers));
        int off = 0;
        for(int i = 0; i < size; i++){
            do {
                if(numbers[i] == remove) off++;
                numbers[i] = i + off < size ? numbers[i +off] : 0;
            } while (numbers[i] == remove);
        }
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
