package javaJunior.Lesson3;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString() {
        String personInfo = "";
        personInfo += "имя: " + name + System.lineSeparator()
                    + "возраст: " + age + System.lineSeparator();
        return personInfo;
    }
}
