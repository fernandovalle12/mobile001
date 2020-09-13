package geometry;

public class Square extends Rectangle {

	public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean full) {
        super(side, side, color, full);
    }

    public double getSide() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
