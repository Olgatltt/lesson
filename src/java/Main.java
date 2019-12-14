public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        for (int i = 0; i < 15; i++) {
            notepad.add("Кошка: " + i);
        }
        notepad.add("Собака");
        notepad.add("Собака");
        notepad.add("Собака");
        notepad.print();
    }
}