package Dom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        if (string1.equals("delete")) {
            notepad.delete();
        } else if (string1.equals("print")) {
              notepad.print ();
        } else if (string1.startsWith("add")) {
            String value = string1.substring(string1.indexOf("add") + 3);
            notepad.add(value);
        }
    }

}
