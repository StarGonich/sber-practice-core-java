package Paint;

public class Rectangle extends Figure implements Drawable{
    private final double width;
    private final double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public void draw() {
        System.out.println("Нарисован прямоугольник с чёрным цветом и координатами: " + point.print());
    }

    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник с " + color + " цветом и координатами: " + point.print());
    }
}
