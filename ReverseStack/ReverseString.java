import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = sc.nextLine();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < origin.length(); i++) {
            st.push("" + origin.charAt(i));
        }

        String originreverse = "";
        for(int i = 0; i < origin.length(); i++) {
            originreverse += st.pop();
        }

        System.out.println(originreverse);
    }
}
