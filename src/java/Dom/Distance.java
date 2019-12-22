package Dom;

import java.text.DecimalFormat;

public class Distance implements Format {

  /*  public static void main(String[] args) {
        Summa3 summa3 = new Summa3();
        System.out.println(summa3.format(14.45));
    }
*/
    @Override
    public String format(double value) {
        String string = String.valueOf(value);
        String one = string.substring(0, string.indexOf("."));
        String two = string.substring(string.indexOf(".") + 1);
        return one + " " + two;
    }
}
