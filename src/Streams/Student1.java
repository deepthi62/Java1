package Streams;

import java.util.ArrayList;
import java.util.List;

public class Student1 {
    int id;
    String name;
    int marks;
    String grade;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        List<Student1> stu = new ArrayList<>();
        Student1 s = new Student1();
        s.id = 111;
        s.name = "deepthi";
        s.marks = 98;

        Student1 s1 = new Student1();
        s1.id = 112;
        s1.name = "deepu";
        s1.marks = 90;

        Student1 s2 = new Student1();
        s2.id = 113;
        s2.name = "raju";
        s2.marks = 86;

        Student1 s3 = new Student1();
        s3.id = 113;
        s3.name = "ramu";
        s3.marks = 40;

        stu.add(s);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        stu.stream().map(st->{
            if(st.getMarks()>90){
                st.grade = "A";
            }else{
                st.grade = "B";
            }
            return st;
        }).filter(st->st.getGrade().equals("A")).forEach(x-> {
            System.out.println(x.getId());
            System.out.println(x.getName());
            System.out.println(x.getMarks());
            System.out.println(x.getGrade());
        });
    }
}

