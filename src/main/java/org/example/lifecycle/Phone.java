package org.example.lifecycle;

public class Phone {
    private  Double price;

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                '}';
    }

    public Phone(Double price) {
        this.price = price;
    }

    public Phone() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        System.out.println("Setting price...");
        this.price = price;
    }
    public void init(){
        System.out.println("Calling init fuction...");
    }
    public  void  destroy(){
        System.out.println("Calling destroy funtion...");
    }

}
