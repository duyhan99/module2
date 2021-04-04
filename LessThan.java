public class LessThan {
    public static void main(String[] args) {
        for(int i = 2; i< 100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        int over = (int) Math.sqrt(num);
        for (int i = 2; i< over;i++){
            if(i % num == 0){
                return false;
            }
        }
        return true;
    }
}
