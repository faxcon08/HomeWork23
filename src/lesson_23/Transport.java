package lesson_23;

public class Transport implements Comparable <Transport>{

    @Override
    public int compareTo(Transport o) {
        if(this.price<o.getPrice())
            return -1;
        if(this.price>o.getPrice())
            return 1;
        return 0;
    }

    private String brand = "default_Brand";
    private String model = "default_Model";

    private double price=100;

    public Transport(String brand, String model, double price) {
        this.brand=brand;
        this.model=model;
        if(price>0)
            this.price=price;
    }

    @Override
    public String toString() {
        return "Transport: Model ["+model+"] Brand ["+brand+"] "+price+"$";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price = price;
    }
}
