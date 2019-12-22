package Dom;

public class Сomma implements Format {
 /*   public static void main(String[] args) {
        Summa1 summa1 = new Summa1();
        System.out.println(summa1.format(14.45));
    }
*/
    @Override
    public String format(double value) {
        String string = String.valueOf(value);
        String one = string.substring(0, string.indexOf("."));
        String two = string.substring(string.indexOf(".") + 1);
        return one + "," + two;
    }
}
