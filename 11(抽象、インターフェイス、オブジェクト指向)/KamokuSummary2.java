import java.util.*;

/**
 * KamokuSummary2
 */
public class KamokuSummary2 {

    public static void main(String[] args) {
        int sum = 0;
        Map<String,Integer> map = new HashMap<String,Integer>();  
        map.put("����", 90);    
        map.put("�R�{", 90);      
        map.put("����", 100);      
        map.put("�c��", 80);      
        map.put("�n��", 75);      
  
        for (String name : map.keySet()) {
            sum += map.get(name);
            System.out.println(name + " => " + map.get(name));
        }
        
        System.out.println("���v: " + sum);
        System.out.println("����: " + sum/map.size());
    }
}