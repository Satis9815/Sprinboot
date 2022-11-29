package org.example.javaConfig;

//@Component("emp")
public class Employee {
    private  Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Employee(Name name) {
        this.name = name;
    }

    public  void  work(){
        name.printName();
        System.out.println("Employeee is working...");
    }
}
