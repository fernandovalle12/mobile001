package geometry;

public class Circle extends Mold{
	protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.setRadius(radius);
    }

    public Circle(double radius, String color, boolean full) {
        super(color, full);
        this.setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", full" + full +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pi = 3.1416;
        return pi * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        double pi = 3.1416;
        return 2 * pi * radius;
    }

}
