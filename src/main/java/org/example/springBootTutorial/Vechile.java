package org.example.springBootTutorial;

public interface Vechile {
    default void drive(){
        System.out.println("Drive ing from vechile interface");
    }

}
