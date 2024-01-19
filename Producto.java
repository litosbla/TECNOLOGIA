package tecnologia;

public class Producto {
    private String name;
    private double price;
    private int referenceNumber;
    private int quantity;
    private int category;

    public Producto(String name, double price, int referenceNumber, int quantity, int category) {
        this.name = name;
        this.price = price;
        this.referenceNumber = referenceNumber;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    
}
