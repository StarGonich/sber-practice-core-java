package Paint;

public class PaintExample {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Circle circle = new Circle(p, 5);
        Rectangle rectangle = new Rectangle(p, 4, 6);
        FigureUtil.draw(circle);
        FigureUtil.draw(rectangle, Color.BLUE);
    }
}
