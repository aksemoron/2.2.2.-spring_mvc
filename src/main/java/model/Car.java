package model;

public class Car {


    private String model;

    private long price;

    private String brand;

    public Car(String model, String brand, long price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


}
