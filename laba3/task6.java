import java.util.List;
import java.util.ArrayList;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }

    @Override
    double getArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    private double w, h;
    public Rectangle(double w, double h) { this.w = w; this.h = h; }

    @Override
    double getArea() { return w * h; }
}

class AreaCalculator {
    public static double calculateTotalArea(List<? extends Shape> shapes) {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        double total = calculateTotalArea(shapes);
        System.out.println("Total area = " + total);
    }
}