/**
 * Park
 */
public class Park {
    String name;
    static String common;

    public void setName(String name) {
        this.name = name;
    }

    public static void setCommon(String c) {
        common = c;
    }

    public void print() {
        System.out.println(name + common);
    }
}