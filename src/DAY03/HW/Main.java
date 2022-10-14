package DAY03.HW;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nguyễn Văn Anh", 22, 7));
        studentList.add(new Student("Nguyễn Văn A", 19, 8));
        studentList.add(new Student("Nguyễn Văn C", 17, 4));
        studentList.add(new Student("Nguyễn Thi A", 30, 8));
        studentList.add(new Student("Trần Văn D", 22, 5));
        studentList.add(new Student("Nguyễn Thị Anh", 21, 3));
        studentList.add(new Student("Vũ Văn F", 19, 9));
        studentList.add(new Student("Đặng Văn C", 30, 7));
        studentList.add(new Student("Nguyễn Văn A", 20, 6));

        System.out.println("[1] Arrange With full Name");
        System.out.println("[2] Arrange With age");
        System.out.println("[3] Arrange With Name");

        int num = 0;
        try (Scanner sc = new Scanner(System.in)) {
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1: {
                    arrangeWithFullName(studentList);
                    System.out.println(studentList);
                    break;
                }
                case 2: {
                    studentList = arrangeWithAge(studentList);
                    System.out.println(studentList.toString());
                    break;
                }
                case 3: {
                    studentList = arrangeWithName(studentList);
                    System.out.println(studentList.toString());
                    break;
                }
                default:
                    System.out.println("Show list");
                    System.out.println(studentList.toString());
            }
            
        } catch (Exception e) {
            System.out.println("Wrong number");
        }

    }

    // question 1
    public static void arrangeWithFullName(List<Student> sList) {
        for (int i = 0; i < sList.size(); i++) {
            for (int j = i + 1; j < sList.size(); j++) {
                if (sList.get(i).fullName.compareTo(sList.get(j).fullName) < 0) {
                    Student student = sList.get(j);
                    sList.set(j, sList.get(i));
                    sList.set(i, student);
                }
                if (sList.get(i).fullName.compareTo(sList.get(j).fullName) == 0
                        && sList.get(i).getAge() > sList.get(j).getAge()) {
                    Student student = sList.get(i);
                    sList.set(i, sList.get(j));
                    sList.set(j, student);

                }

            }
        }

    }

    // question 2
    public static List<Student> arrangeWithAge(List<Student> studentList) {
        Map<Integer, List<Student>> sMap = studentList.stream().collect(Collectors.groupingBy(Student::getAge));
        for (Map.Entry<Integer, List<Student>> entry : sMap.entrySet()) {
            List<Student> listStudentSameAge = entry.getValue();
            if (listStudentSameAge.size() > 1) {
                entry.setValue(listStudentSameAge.stream().sorted(Comparator.comparing(Student::getGPA).reversed())
                        .collect(Collectors.toList()));
            }
        }
        studentList = arrangeMapToList(sMap);
        return studentList;
    }

    //question 3
    public static List<Student> arrangeWithName(List<Student> studentList) {
        return studentList = studentList.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        
    }

    

    // support for question 2, solving by stream and map
    public static List<Student> arrangeMapToList(Map<Integer, List<Student>> sMap) {
        List<Student> students = new ArrayList<>();
        for (Map.Entry<Integer, List<Student>> entry : sMap.entrySet()) {
            entry.getValue().forEach((n) -> students.add(n));
        }

        return students;

    }

    // support for change position in List
    public static List<Student> arrange(List<Student> students, Student s1, Student s2) {
        int position1 = students.indexOf(s1);
        int position2 = students.indexOf(s2);
        Student student = s1;
        students.set(position1, s2);
        students.set(position2, student);

        return students;
    }
}
