import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        int x = new Random().nextInt(10);
        if (x>5){
            System.out.println("x>5");
        }
        if (x<5){
            System.out.println("x<5");
        }
        if (x==10){
            System.out.println("x==10");
        }
        if (x>=5){
            System.out.println("x>=5");
        }
        if (x<=5){
            System.out.println("x<=5");
        }
        if (x>3 && x<6) {
            System.out.println("x>3 && x<6");
        }
        }
    }

