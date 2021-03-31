import java.util.Scanner;
public class ngayinthang {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which months you want to count?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
                System.out.println("28 or 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("not thing");


        }
    }
}
