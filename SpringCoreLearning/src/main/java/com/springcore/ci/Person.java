package com.springcore.ci;
// config4.xml
/*
If the person class would have 2 constructors one accepting a string and int and the other one as string
then the preference will be given to constructor having both parameter as a string.in this case we need to specify the
type explicitly.
 type in config4.xml is used to resolve ambiguity.
 */
public class Person {
    private String name;
    private int personId;
    private Certi certi;

    public Person(String name, int personId, Certi certi) {
        this.name = name;
        this.personId = personId;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi.name +
                '}';
    }
}
