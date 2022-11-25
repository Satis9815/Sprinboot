package org.example.constructorInjection;

//Ambiguity Problem -to solve define type and order in xml file
public class Person {
    private String name;
    private int personId;
     Phone phone;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", Phone=" + phone +
                '}';
    }

    public  Person(String name, int personId, Phone phone){
        this.name=name;
        this.personId=personId;
        this.phone=phone;

    }
}
