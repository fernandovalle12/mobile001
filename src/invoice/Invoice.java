package invoice;

public class Invoice {
	private int quantity;
    private float value;
    private String code;
    private String description;

    public Invoice(int quantity, float value, String code, String description) {
        this.setQuantity(quantity);
        this.setValue(value);
        this.setCode(code);
        this.setDescription(description);
    }

    public float calculaValueTotal(){
        int qt = this.getQuantity();
        float preco = this.getValue();
        return qt * preco;
    }

    public void imprime(){
        System.out.println("CODE: " + this.getCode());
        System.out.println("DESCRIPTION: " + this.getDescription());
        System.out.println("TOTAL: " + this.calculaValueTotal());
    }

    private void setCode(String code) {
        this.code = code;
    }
    private String getCode() {
        return this.code;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    private String getDescription() {
        return this.description;
    }

    private void setValue(float value) {
        this.value = value;
    }
    private float getValue() {
        return this.value;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private int getQuantity() {
        return this.quantity;
    }
}
