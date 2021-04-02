import java.util.Scanner;

public class PracticeRectangle {
    double width, height;

    public PracticeRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{"+ "width =" + width + ", height=" + height + "}";
    }
    public static class Ex14_1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter width: ");
            double width = scanner.nextDouble();
            System.out.println("Enter height: ");
            double height = scanner.nextDouble();
        }

    }
    public static void main(String[] args) {
        PracticeRectangle rectangle = new PracticeRectangle(12, 13);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }

}
