package Streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

  class Student2 implements Comparable {
    int id;
    String name;
    int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        Student2 s = (Student2)o;
        return Integer.compare(this.id,s.id);
//        return this.name.compareTo(s.name);

    }

}
  public  class TestStudent {
        public static void main(String[] args) {
            List<Student2> stu = new ArrayList<>();
            Student2 s = new Student2();
            s.id = 11;
            s.name = "raju";
            s.marks = 85;

            Student2 s1 = new Student2();
            s1.id = 13;
            s1.name = "shyam";
            s1.marks = 90;

            Student2 s2 = new Student2();
            s2.id = 12;
            s2.name = "deepthi";
            s2.marks = 70;

            Student2 s3 = new Student2();
            s3.id = 14;
            s3.name = "roja";
            s3.marks = 50;

            stu.add(s);
            stu.add(s1);
            stu.add(s2);
            stu.add(s3);

            Comparable<Student2> st = x -> {

                return 0;
            };
            stu.stream().sorted().forEach(x -> System.out.println(x.id + " " + x.name + " " + x.marks));

        }
    }
