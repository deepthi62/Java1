package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student1 {
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
        if (!(o instanceof Student1 student1)) return false;
        return id == student1.id && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
    class Set1{
        public static void main(String[] args) {
            Set<Student> set = new HashSet();
            Student s = new Student();
            s.id = 1;
            s.name = "deepthi";

            Student s1 = new Student();
            s1.id = 2;
            s1.name = "deepu";

            Student s2 = new Student();
            s2.id = 3;
            s2.name = "aaaa";

            set.add(s);
            set.add(s1);
            set.add(s2);

            for(Student stu : set){
                System.out.println(stu.id);
                System.out.println(stu.name);
            }
        }
    }

