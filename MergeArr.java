import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, };
        int[] arr2 = {12, 13, 14, 15, 16, 18, 19, 20, 21, 1};

        int[] res = new int [arr1.length + arr2.length];
        int index = 0;
        for(int value: arr1){
            res[index++] = value;
        }
        for(int value: arr2){
            res[index++] = value;
        }
        System.out.println(Arrays.toString(res));

    }
}
