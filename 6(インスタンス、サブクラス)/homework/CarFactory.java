/**
 * CarFactory
 */
public class CarFactory extends Factory {
    CarFactory() {
        super("é‘çHèÍ");
    }

    @Override
    String produce() {
        return "é‘";
    }
}