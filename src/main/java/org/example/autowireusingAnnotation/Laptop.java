package org.example.autowireusingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
//    @Autowired
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
    @Autowired
    @Qualifier("charger2")
    public void setCharger(Charger charger) {
        System.out.println("setting value...");
        this.charger = charger;
    }

    public Laptop(Charger charger) {
        this.charger = charger;
    }

    public Laptop() {
    }
}
