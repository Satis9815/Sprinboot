package org.example.stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//How to invoke static method and variables in spring expression language(spEl)
//          T(class).method(param)
//          T(class).Variable

//How to create objects
            // new Object(Value)
@Component("sp")
public class SpringExpressionLang {
    @Value("#{1+2+3}")
    private  double x;
    @Value("#{20+10}")

    private  double y;
    @Value("#{ T(java.lang.Math).sqrt(4) }")
    private  double z;
    @Value("#{  T(java.lang.Math).PI }")
    private  double e;
    @Value("#{ new java.lang.String('Satis Kumar Chaudhary') }")
    private String name;


    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }



    @Override
    public String toString() {
        return "SpringExpressionLang{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", The value of e =" + e +
                ", name =" + name +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
