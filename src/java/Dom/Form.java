package Dom;

public class Form {
    public String formatDo(double value) {
        String string = String.valueOf(value);
        String one = string.substring(0, string.indexOf("."));
       // String two = string.substring(string.indexOf(".") + 1);
        return one;
    }
    public String formatPosle(double value) {
        String string = String.valueOf(value);
       // String one = string.substring(0, string.indexOf("."));
         String two = string.substring(string.indexOf(".") + 1);
        return two;
    }
}