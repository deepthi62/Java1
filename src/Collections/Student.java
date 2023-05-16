package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

     class ListApp {
        public static void main(String[] args) {
            List<Student> list = new ArrayList();
            Student s = new Student();
            s.id = 1;
            s.name = "deepthi";

            Student s1 = new Student();
            s1.id = 2;
            s1.name = "deepu";

            list.add(s);
            list.add(s1);

            for(Student stu: list){
                System.out.println(stu.id);
                System.out.println(stu.name);
            }
        }
    }
