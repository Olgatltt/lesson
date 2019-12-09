import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String d = scanner.next();
            char c = d.charAt(d.length()-1);
            int rezult = 0;
            switch (c) {
                case '+':
                    rezult = a + b;
                    break;
                case '-':
                    rezult = a - b;
                    break;
                case '*':
                    rezult = a * b;
                    break;
                case '/':
                    rezult = a / b;
                    break;
            }

            System.out.println(rezult);

        }
    }
