/**
 * Text
 */
public class Text extends Element{
    String str;

    Text (String str){
        this.str = str;
    }
    
    @Override
    void print() {
        System.out.print("<t>");
        System.out.print(str);
        System.out.println("</t>");
    }
}