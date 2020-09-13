package geometry;

public class Mold {
	 protected String color;
	    protected boolean full;

	    public Mold() {
	    }

	    public Mold(String color, boolean full) {
	        this.setColor(color);
	        this.setFull(full);
	    }

	    @Override
	    public String toString() {
	        return "Mold{" +
	                "color='" + color + '\'' +
	                ", full=" + full +
	                '}';
	    }

	    public double getArea() {
	        return 0;
	    }

	    public double getPerimeter() {
	        return 0;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean isFull() {
	        return full;
	    }

	    public void setFull(boolean full) {
	        this.full = full;
	    }
}
