package java6;

import java.util.Scanner;

public class NotepadScaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("delete")){
         //   public void delete();
        }else if (str.equals("print")) {
          //  public void print ();
        }else if (str.startsWith("add")){
            String[] parameters = str.split(" ");
        }
    }
}
