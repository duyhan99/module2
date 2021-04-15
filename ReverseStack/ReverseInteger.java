import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = (int) (Math.random()* 21);
        int[] arr = new int[x];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < x; i++) {
            arr[i] = (int) (Math.random()* 81);
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }
        System.out.println(Arrays.toString(arr));
    }

}
