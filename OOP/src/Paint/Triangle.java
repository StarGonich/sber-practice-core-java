package Paint;

public class Triangle extends Figure implements Drawable{
    private double a, b, c;

    public Triangle(Point point, double a, double b, double c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public void draw() {
        System.out.println("Нарисован треугольник с чёрным цветом и координатами: " + point.print());
    }

    public void draw(Color color) {
        System.out.println("Нарисована треугольник с " + color + " цветом и координатами: " + point.print());
    }
}
