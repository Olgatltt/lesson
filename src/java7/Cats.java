package java7;

public class Cats {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5, "red");
        Cat cat1 = new Cat("Vaska", 5, "red");
        Cat cat2 = new Cat("Pushok", 3, "white");
        Cat cat3 = new Cat("Cat", 3, "white");
        Cat cat4 = new Cat("Cat1", 3, "white");
        String[] arr = new String[5];
        arr[0] = "Vaska";
        arr[1] = "Vaska";
        arr[2] = "Pushok";
        arr[3] = "Cat";
        arr[4] = "Cat1";
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                arr[i].equals(arr[j + 1]);
            }
        }
    }
}
