/**
 * Text
 */
public class Text implements Countable {
    String text;

    Text(String text) {
        if (text == null) {
            this.text = "";
        } else {
            this.text = text;
        }
    }

    @Override
    public int count() {
        return text.length();
    }
}