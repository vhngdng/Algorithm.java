package HW;

import java.util.List;

public class Student{
    public String fullName;
    public int age;
    public int GPA;

    public Student() {
    }

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "\n" +"Student{"  + 
        "full name ='" + fullName + '\''  + 
        ", age = " + age + " , \t GPA = " + GPA + "}";
    }

    public static void changeValue (Student student1, Student student2) {
        String fullName = student2.fullName;
        int age = student2.age;
        int GPA = student2.GPA;

        student1.fullName = fullName;
        student1.age = age;
        student1.GPA = GPA;

    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGPA() {
        return GPA;
    }

    // support for question 3
    public String getFirstName() {
        String[] arrayName = this.fullName.split(" ");
        return arrayName[arrayName.length - 1];
    }
}

