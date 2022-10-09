package Src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Hoang Van A", 18, 8));
        students.add(new Student("Hoang Van B", 18, 6));
        students.add(new Student("Nguyen Thi C", 23, 6));
        students.add(new Student("Tran Thi H", 20, 10));
        students.add(new Student("Ha Van B", 19, 9));
        students.add(new Student("Hoang Van F", 16, 6));
        students.add(new Student("Nguyen Van D", 30, 7));
        students.add(new Student("Nguyen Thi D", 25, 5));
        students.add(new Student("Hoang Van E", 25, 10));
        students.add(new Student("Hoang Van F", 23, 8));

        sortByFullName(students);
        students.forEach(System.out::println);

        System.out.println("-------------------------------------------");
        sortByLastName(students);
        students.forEach(System.out::println);
    }

    
    public static void sortByFullName(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.fullName.compareTo(o2.fullName);
                if (result == 0)
                    return o2.age - o1.age;
                else
                    return result;
            }
        });
    }

    public static void sortByLastName(List<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String lastNameO1 = o1.fullName.substring(o1.fullName.lastIndexOf(" ") + 1);
                String lastNameO2 = o2.fullName.substring(o2.fullName.lastIndexOf(" ") + 1);
                return lastNameO1.compareTo(lastNameO2);
                
            }
        });
    }

}