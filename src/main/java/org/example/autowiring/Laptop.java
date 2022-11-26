package org.example.autowiring;

public class Laptop {
    private Charger charger;

    @Override
    public String toString() {
        return "Laptop{" +
                "charger=" + charger +
                '}';
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public Laptop(Charger charger) {
        this.charger = charger;
    }

    public Laptop() {
    }
}
