/**
 * University
 */
public class University {
    Student[] students;

    public void list() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "�͑��Ƃł���: " + students[i].isOK());
        }
    }
}