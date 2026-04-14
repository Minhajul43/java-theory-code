//Main.java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(43, "Minhajul");
        System.out.println("My Name is :" +s1.n);
        System.out.println("Student ID is :" +s1.id);
    }
}
class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}
