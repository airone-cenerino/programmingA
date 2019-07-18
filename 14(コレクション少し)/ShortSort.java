/**
 * ShortSort
 */
public class ShortSort {
    private short[] values = {6,3,5,3,5,2,56,32,6,74,3,3,1};

    private void sort(){
        for(int i=0;i<values.length-1;i++){
            for(int j=i+1;j<values.length;j++){
                if(values[i]<values[j]){
                    short tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }
    }

    private void disp(){
        for(int i=0;i<values.length;i++){
            System.out.print(values[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ShortSort shortSort = new ShortSort();
        shortSort.sort();
        shortSort.disp();
    }
}