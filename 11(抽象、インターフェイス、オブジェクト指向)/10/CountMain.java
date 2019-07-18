import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CountMain
 */
public class CountMain {

    public static void main(String[] args) {
        File file = new File(args[0]);
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        }catch(Exception e){}
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        while(sc.hasNext()){
            String str = sc.next();
            str = str.toLowerCase();
            if(map.containsKey(str)){
                map.replace(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }

        for (String str : map.keySet()) {
            System.out.println(str + ", " + map.get(str));
        }
    }
}