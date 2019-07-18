/** 
 * Paragraph
 */
public class Paragraph extends Element{
    static int num = 0;     // paragraph�̃C���X�^���X��
    int myNum;              // ���Y�C���X�^���X�̔ԍ�
    Element[] myElements = new Element[10]; // ����镶���v�f
    int myElementsNum = 0;  // ����镶���v�f�̐�

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