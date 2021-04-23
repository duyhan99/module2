import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        point = new Point2D(3, 3);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

        point.setXY(20, 20);
        System.out.println(point);
    }

}
