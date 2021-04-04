import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int [size];
        System.out.println("Input number");
        for(int i = 0; i < size; i++){
            System.out.println("index: " + i );
            numbers[i]= scanner.nextInt();
        }
        int min = numbers[0];
        for(int i = 0; i < size; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            System.out.println("Min is: " + min);
        }
    }
}
