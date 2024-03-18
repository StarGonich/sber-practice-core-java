package Classes;

public class Circle {
    private final double radius;
    private final String color;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "radius = " + radius + ", color = " + color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.toString());
    }
}
