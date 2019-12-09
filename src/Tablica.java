import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
    //    int y = scanner.nextInt();
        int[][] array = new int[x][x];
        for (int i = 1; i<= array.length; i++){
            for (int j = 1; j<= array.length; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
            }
    }
}
