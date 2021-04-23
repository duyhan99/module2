import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Side A");
            int a = sc.nextInt();
            System.out.println("Side B");
            int b = sc.nextInt();
            System.out.println("Side C");
            int c = sc.nextInt();

            if (a <= 0 || b <= 0 || c <= 0){
                throw new IllegalTriangleException();
            }
            if(a >= b + c || b >= a + c || c >= a + b){
                throw new IllegalTriangleException("Greater than 2 others");
            }

            System.out.println("Invalid trigangle with 3 sides: " + a +" " + b +" " + c);

        }
        catch (IllegalTriangleException e){
                e.printStackTrace();
        }
    }
}
