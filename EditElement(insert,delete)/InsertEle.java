import java.util.Arrays;
import java.util.Scanner;

public class InsertEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] numbers = new int[size];
        System.out.println("input number: ");
        for(int i = 0; i< size; i++){
            System.out.println("index " + i + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Element insert: ");
        int element = scanner.nextInt();
        int index = -1;
        while (index<0 || index>size){
            System.out.println("Index: ");
            index = scanner.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(numbers));
        int prevElement = numbers[index];
        int currentElement;
        numbers[index] = element;
        for(int i = index + 1; i < size; i++){
            currentElement = numbers[i];
            numbers[i] = prevElement;
            prevElement = currentElement;
        }
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
