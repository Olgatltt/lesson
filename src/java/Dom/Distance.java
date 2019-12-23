package Dom;

public class Distance extends Form {

  public String format(double value) {
      return super.formatDo(value) + " " + super.formatPosle(value);
  }
}
