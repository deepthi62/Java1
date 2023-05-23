package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {

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
        List<Student> stu = new ArrayList<>();
        Student s = new Student();
        s.id = 111;
        s.name = "deepthi";
        s.marks = 98;

        Student s1 = new Student();
        s1.id = 112;
        s1.name = "deepu";
        s1.marks = 90;

        Student s2 = new Student();
        s2.id = 113;
        s2.name = "raju";
        s2.marks = 86;

        Student s3 = new Student();
        s3.id = 114;
        s3.name = "ramu";
        s3.marks = 40;

           stu.add(s);
           stu.add(s1);
           stu.add(s2);
           stu.add(s3);

        Function<Student,Student> gradeMapFun = st->{
            if(st.marks>85){
                st.grade = "A";
            }else{
                st.grade = "B";
            }
            return st;
            };

        Predicate<Student> gradePredicate = x->x.getGrade().equals("A");

        Consumer<Student> printConsumer = x-> System.out.println(x.getName());


        Comparator<Student> sortFun = (x,y)->{
            if(x.getMarks()<y.getMarks()){

            }
            return -1;
        };

        stu.stream().map(gradeMapFun)
                .filter(gradePredicate)
                .sorted(sortFun)
                .forEach(printConsumer);
    }
}
