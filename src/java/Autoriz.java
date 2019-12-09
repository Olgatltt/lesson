import java.util.Scanner;

public class Autoriz {
        public static void main(String[] args) {
            String login = "Ольга";
            String parol = "5555";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин:");
            while (true) {
                String inlogin = scanner.nextLine();
                if (login.equals(inlogin)) {
                    break;
                }
                    System.out.println("Неверный логин");
                }
            System.out.println("Введите пароль:");

            while (true) {
                String inParol = scanner.nextLine();
                if (parol.equals(inParol)) {
                    break;
                }
                System.out.println("Неверный пароль");
            }
            System.out.println("Добро пожаловать!");
        }
    }
