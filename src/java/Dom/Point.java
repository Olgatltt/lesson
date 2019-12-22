package Dom;

import java.io.OutputStream;
import java.io.PrintStream;

public class Point implements Format {

  /*  public static void main(String[] args) {
        Summa2 summa2 = new Summa2();
        System.out.println(summa2.format(14.45));
    }
*/
    @Override
    public String format(double value) {
        String string = String.valueOf(value);
        String one = string.substring(0, string.indexOf("."));
        String two = string.substring(string.indexOf(".") + 1);
        return one + "." + two;
    }
}
