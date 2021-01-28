public class Trapezoid extends Quadrilateral {

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    public double height() {

        if (getP().getY() == getQ().getY())
            return Math.abs(getQ().getY() - getR().getY());
        else
            return Math.abs(getP().getY() - getQ().getY());
    }

    public double sum() {

        if (getP().getY() == getQ().getY())
            return Math.abs(getP().getX() - getQ().getX()) + Math.abs(getR().getX() - getS().getX());
        else
            return Math.abs(getQ().getX() - getR().getX()) + Math.abs(getS().getX() - getP().getX());
    }

    public double area() {
        return sum() * height() / 2.0;
    }

    public String printCoordinates() {
        return String.format("%s", super.toString());
    }

    public String toString() {
        return String.format("%s %n%s: %s", super.toString(), "Height", height(), "Area", area());
    }
}
