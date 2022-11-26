package org.example.standaloneCollection;

import java.util.List;
import java.util.Map;

public class Employee {
    private List<String> EpmName;

    @Override
    public String toString() {
        return "Employee{" +
                "EpmName=" + EpmName +
                ", courses=" + courses +
                '}';
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    private Map<String,Integer> courses;

    public Employee(List<String> epmName) {
        EpmName = epmName;
    }

    public Employee() {
    }

    public List<String> getEpmName() {
        return EpmName;
    }

    public void setEpmName(List<String> epmName) {
        EpmName = epmName;
    }
}
