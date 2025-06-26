package ex_24082024;

import java.util.LinkedList;
import java.util.List;

public class Lab68 {
    public static void main(String[] args) {
        //Student

        Student s1=new Student(1,"lokesh");
        Student s2=new Student(2,"kumar");

        List arraylist=new LinkedList();
        arraylist.add(s1);
        arraylist.add(s2);
        System.out.println(arraylist);


    }
}

class Student{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}