package DAY04.Src;

public class Student {
    public String fullName;
    public int age;
    public double GPA;
    public Student(String fullName, int age, double gPA) {
        this.fullName = fullName;
        this.age = age;
        GPA = gPA;
    }
    @Override
    public String toString() {
        return "fullName =" + fullName + ", age =" + age + ", GPA =" + GPA;
    }


    
}
