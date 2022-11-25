package org.example.constructorInjection;

public class Phone {
    String name;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }

    public Phone(String name) {
        this.name = name;
    }
}
