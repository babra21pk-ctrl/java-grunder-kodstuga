public class Student {

    String name;
    int age;
    double grade;

    // Parameterized constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student student = new Student("Babra", 36, 85.5);

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade);
    }
}