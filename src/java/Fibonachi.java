public class Fibonachi {
    public static void main(String[] args) {
        int shag = 0;
        int sled = 1;
        for (int i = 0; i < 10; i++) {
            sled = shag + sled;
            shag = sled - shag;
            System.out.println(sled);
        }
    }
}
// Плохо у меня с креативом) смысл в том, что меременная sled это выводимое в последовательности следующее число, а
// shag это его вычисление.
// sled (1) = 0 + 1
// shag (1)  = 1 - 0
//Дальше - цикл сначала:
// 2 = 1 + 1
// 1 = 2 - 1
//Дальше - цикл сначала:
//3 = 1 + 2
//2 = 3 - 1.... и так далее пока i<10