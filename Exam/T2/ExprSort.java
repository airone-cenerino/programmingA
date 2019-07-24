import java.util.*;

public class ExprSort {
    public static void sortExpr(ArrayList<Expr> elist) {
        int listNum = elist.size();
        ArrayList<Expr> tmpList = new ArrayList<>();

        for(int i=0;i<elist.size();i++){
            tmpList.add(elist.get(i));
        }

        elist.clear();

        // ‚±‚±‚Ü‚Å‚ÅtmpList‚É”ð“ï‚³‚¹‚½

        for(int j=0;j<listNum;j++){
            int min = 0;
            int minNum = 1000000;
            for(int i=0;i<tmpList.size();i++){
                if(minNum>tmpList.get(i).eval()){
                    min = i;
                    minNum = tmpList.get(i).eval();
                }
            }
            elist.add(tmpList.get(min));
            tmpList.remove(min);
        }
    }
}
