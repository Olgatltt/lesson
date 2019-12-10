import java.util.Random;

public class HumanMain {
    public static void main(String[] args) {
        //   Human human = new Human("Вася", 30, 180, 80);
        //   Human human1 = new Human("Петя", 30, 180, 80);
        Random random = new Random();
        Human[] humans = new Human[10];
        for (int i = 0; i < humans.length; i++) {
            int age = random.nextInt(50);
            char[] chars = new char[50];
            chars[i] = (char) random.nextInt(150);
            Human human = new Human(new String(chars), age);
            humans[i] =human;
        }
    }
}



