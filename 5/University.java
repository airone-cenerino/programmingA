/**
 * University
 */
public class University {
    Student[] students;

    public void list() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "‚Í‘²‹Æ‚Å‚«‚é: " + students[i].isOK());
        }
    }
}