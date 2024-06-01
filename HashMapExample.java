import java.util.*;
public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Lemon");
        map.put(3,"Kiwi");
        map.put(4,"Apple");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
