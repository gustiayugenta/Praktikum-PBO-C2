/**
 * File : Person.java
 * Deskripsi : Person database model
 */

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int id, String n){
        id = id;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}