public class CalAdd {
        public static void main(String[] args) {
            QuadraticEquation math = new QuadraticEquation(0, 12, 24);
            if(math.numbera == 0){
                System.out.println("not bac 2");
            }
            else if(math.delta()<0){
                System.out.println("no Nghiem");
            } else if(math.delta()==0){
                System.out.println("nghiem kep x1, x2" + math.twice());
            } else {
                System.out.println("co 2 nghiem x1 = " + math.x1() + "and" + "x2 = " + math.x2());
            }
        }
}
