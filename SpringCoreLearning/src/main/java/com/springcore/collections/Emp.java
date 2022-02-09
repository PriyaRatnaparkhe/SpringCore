// dependency injection with collection classes such as List ,Set and Map
package com.springcore.collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
// config1.xml

public class Emp {
    private String name;
    // taking list for multiple phone numbers.
    private List<String> phones;
    // taking a set for addresses.
    private Set<String> address;
    // map for course details taking course name and course duration.
    private Map<String,String> courses;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
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

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    public Emp() {
    }

    public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }
}

