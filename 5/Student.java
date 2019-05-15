/**
 * Student
 */
public class Student {
    String name;
    int credit;

    Student(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public boolean isOK() {
        return (credit >= 100);
    }
}