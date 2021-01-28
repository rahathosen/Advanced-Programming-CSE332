public class App {

    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(3, 7, 7, 6, 3, 0, 2, 2);
        Parallelogram parallelogram = new Parallelogram(0, 1, 1, 3, 4, 5, 0, 1);
        Rectangle rectangle = new Rectangle(1, 1, 8, 2, 5, 4, 3, 0);
        Square square = new Square(9, 0, 2, 0, 2, 3, 0, 2);

        System.out.printf("%nTrapezoid: %n%s", trapezoid);
        System.out.printf("%n%nParallelogram: %n%s", parallelogram);
        System.out.printf("%n%nRectangle: %n%s", rectangle);
        System.out.printf("%n%nSquare: %n%s%n", square);

    }
}
