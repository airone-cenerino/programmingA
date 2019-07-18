/**
 * Label
 */
public class Label {

    String caption;
    static String common;

    Label(String str) {
        caption = str;
    }

    void output() {
        System.out.println(common + ": " + caption);
    }
}