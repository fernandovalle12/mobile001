package rectangle;

public class Rectangle {
	private float longitude;
    private float width;

	public void perimeterCalculator() {
		this.validator();
        float longitude = this.getLongitude() * 2;
        float width = this.getWidth() * 2;
        float perimeter = width + longitude;

        System.out.println("PERIMETER:" + perimeter);
    }

    public void areaCalculator() {
    	this.validator();
        float longitude = this.getLongitude();
        float width = this.getWidth();
        float area = width * longitude;

        System.out.println("AREA:" + area);
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    private void validator() {
    	if (getLongitude() == 0 || getWidth() == 0){
            System.out.println("Um dos lados do retângulo é igual ou menor que zero.");
        }
    }
}
