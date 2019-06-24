import java.util.HashMap;

/**
 * HouseMain
 */
public class HouseMain {
    private int size = 0;
    private int maxSize = 20;
    private HashMap<String, Animal> map = new HashMap<String, Animal>();

    private void setAnimalToHouse(Animal animal){
        if(size + animal.getSize() <= maxSize){
            map.put(animal.getName(), animal);
            size += animal.getSize();
        }else{
            throw new RuntimeException();
        }
    }

    private void removeAnimalFromHouse(String name){
        size -= map.get(name).getSize();
        map.    remove(name);
    }

    private void listUpName(){
        for (String name : map.keySet()) {
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
        HouseMain house = new HouseMain();
        Human humanA = new Human("Taro");
        Human humanB = new Human("Jiro");
        // Human humanC = new Human("Saburo");
        // Human humanD = new Human("Siro");
        // Human humanE = new Human("Goro");
        Dog dogA = new Dog("Pochi");
        
        house.setAnimalToHouse(humanA);
        house.setAnimalToHouse(humanB);
        // house.setAnimalToHouse(humanC);
        // house.setAnimalToHouse(humanD);
        // house.setAnimalToHouse(humanE);
        house.setAnimalToHouse(dogA);
        house.listUpName();
        house.removeAnimalFromHouse("Taro");
        house.listUpName();
    }
}