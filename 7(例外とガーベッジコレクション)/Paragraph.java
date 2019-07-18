/** 
 * Paragraph
 */
public class Paragraph extends Element{
    static int num = 0;     // paragraphのインスタンス個数
    int myNum;              // 当該インスタンスの番号
    Element[] myElements = new Element[10]; // 内包する文書要素
    int myElementsNum = 0;  // 内包する文書要素の数

    Paragraph(){
        num++;
        myNum = num;
    }

    @Override
    void add(Element element) {
        myElements[myElementsNum] = element;
        myElementsNum++;
    }

    @Override
    void print() {
        System.out.println("<p" + myNum + ">");
        for(int i=0;i<myElementsNum;i++){
            myElements[i].print();
        }
        System.out.println("</p" + myNum + ">");
    }
}