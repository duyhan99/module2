import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        point3D = new Point3D(2, 4, 6);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        point3D.setXYZ(5, 5, 10);
        System.out.println(point3D);
    }
}
