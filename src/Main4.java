import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String login = "Ольга";
        String parol = "55";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String inlogin = scanner.nextLine();
        if (login.equals(inlogin)) {
            System.out.println("Parol");
            String inParol = scanner.nextLine();
            if (parol.equals(inParol)) {
                System.out.println("Voshel");
            } else {
                System.out.println("Неверный пароль");
            }
        } else {
            System.out.println("Неверный логин");
        }

        }
    }

