public class Array2 {
    public static void main(String[] args) {
        int[][] vs = new int[][]{
        { 62, 90, 75 },
        { 100, 0, 50 },
        { 30, 40 }
        };

        int sum = 0;
        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < vs.length; i++) {
            for (int j = 0; j < vs[i].length; j++){
                sum += vs[i][j];
                if(vs[i][j] > max){
                    max = vs[i][j];
                }
                if(vs[i][j] < min){
                    min = vs[i][j];
                }
            }
        }
        System.out.println("ave : " + (double)sum/vs.length/vs[0].length);
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}