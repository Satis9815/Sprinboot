package org.example.autowireusingAnnotation;

public class Charger {
    private  String price;

    @Override
    public String toString() {
        return "Carger{" +
                "price='" + price + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
}
