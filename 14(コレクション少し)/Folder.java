import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Folder
 */
public class Folder{
    String text;
    ArrayList<Folder> contents = new ArrayList<Folder>();

    Folder(){
        text = "";
    }

    public void add(Folder folder){
        contents.add(folder);
    }

    public void remove(Folder folder){
        if(contents.contains(folder)){
            contents.remove(folder);
        }
    }

    public String toString(){
        String mojiretu = text;

        for (Folder content : contents) {
            mojiretu += content.toString();
        }
        return mojiretu;
    }

    public String breadth(){
        String mojiretu = text;
        Queue<Folder> queue = new ArrayDeque<Folder>();

        for (Folder content : contents) {
            queue.add(content);
        }

        while(!queue.isEmpty()){
            Folder folder = queue.poll();
            mojiretu += folder.text;

            for (Folder content : folder.contents) {
                queue.add(content);
            }        
        }

        return mojiretu;
    }
}