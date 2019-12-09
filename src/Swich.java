import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.nextLine();
        String d = scanner.nextLine();
        int rezult = 0;
        switch (d) {
            case "+":
                rezult = a + b;
                break;
            case "-":
                rezult = a - b;
                break;
            case "*":
                rezult = a * b;
                break;
            case "/":
                rezult = a / b;
                break;
        }

            System.out.println(rezult);

        }
    }

