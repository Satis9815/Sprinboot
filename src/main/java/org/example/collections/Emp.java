package org.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private  String name;

    public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
        this.name = name;
        Phone = phone;
        this.address = address;
        this.courses = courses;
    }

    public Emp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return Phone;
    }

    public void setPhone(List<String> phone) {
        Phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    private List<String> Phone;
    private Set<String> address;
    private Map<String,String> courses;
}
