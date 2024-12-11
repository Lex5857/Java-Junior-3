package javaJunior.Lesson3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Василий", 30);

        save(person1);
        Person person2 = (Person)loading();
        
        System.out.println(person2);
    }

    public static void save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.out"))) {
            objectOutputStream.writeObject(serializable); 
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Object loading() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.out"))){
            Object object = objectInputStream.readObject();
            return object;
        } catch (Exception e) {
            return null;
        }
    }
}
