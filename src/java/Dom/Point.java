package Dom;

public class Point extends Form {

 public String format(double value) {
     return super.formatDo(value) + "." + super.formatPosle(value);
 }
}
