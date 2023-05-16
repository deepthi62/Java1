package Statements;

public class Student {
    int id;
    int marks;
    String name;

    public static Student[] FilterdByMarks(Student[] arr){

       Student filteredArr[] = new Student[2];
       int x = 0;
       for(int i = 0;i<arr.length;i++){
           if(arr[i].marks>90){
               filteredArr[x] = arr[i];
               x++;

           }
       }

        return filteredArr;
    }

    public static void main(String[]args){

        Student arr[] = new Student[3];
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "ramu";
        s1.marks = 99;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "raju";
        s2.marks = 40;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "raj";
        s3.marks = 91;

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        FilterdByMarks(arr);

        Student[] filter = FilterdByMarks(arr);
        for(Student result : filter){
            System.out.println(result.id+" "+result.name+" "+result.marks);
        }

    }

}
