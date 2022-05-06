package by.nikalaichanka;

import by.nikalaichanka.spring.mvc.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.*;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee("Stepan", "Ivanov", 100500, "IT");
        out.println(employee.hashCode());

        Map<Integer, String> map = new HashMap<>(16, 0.75f);

        Person p1 = new Person(1, "Sasha");
        Person p2 = new Person(2, "Pasha");
        Person p3 = new Person(3, "Masha");

        map.put(p1.getId(), p1.getName());
        map.put(p2.getId(), p2.getName());
        map.put(p3.getId(), p3.getName());

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}