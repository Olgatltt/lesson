public class Factorial {
    public static void main(String[] args) {
        int a = 6;
        int factorial = 1;
        while (a != 0) {
            factorial *= a;
            a--;
        }
        System.out.println(factorial);
    }
}
