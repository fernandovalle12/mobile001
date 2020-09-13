package geometry;

public class Rectangle extends Mold {
	protected double base;
    protected double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double base, double height) {
        super();
        this.setBase(base);
        this.setHeight(height);
    }

    public Rectangle(double base, double height, String color, boolean full) {
        super(color, full);
        this.setBase(base);
        this.setHeight(height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", color=" + color +
                ", full=" + full +
                '}';
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
