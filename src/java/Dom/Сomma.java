package Dom;

public class Сomma extends Form {

    public String format(double value) {
        return super.formatDo(value) + "," + super.formatPosle(value);
    }
}
