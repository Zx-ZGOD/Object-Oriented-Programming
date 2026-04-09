class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Student Name: " + name;
    }
}

public class q9 {

    public static void main(String[] args) {
        Student s1 = new Student(19, "B");
        Student s2 = new Student(20, "A");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}