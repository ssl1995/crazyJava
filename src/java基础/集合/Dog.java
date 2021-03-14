package java基础.集合;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Comparable<Dog> {
    private int id;
    private String name;
    private int age;

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new Dog(3, "a", 1));
        list.add(new Dog(2, "b", 3));
        list.add(new Dog(1, "c", 4));
        System.out.println(list);
    }

    // 实现Comparable重写compareTo对Cat1的name进行排序
    @Override
    public int compareTo(Dog o) {
        return this.getName().compareTo(o.getName());
    }

    public Dog() {
    }

    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
