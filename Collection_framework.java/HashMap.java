import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Hashing2 {
    public static void main(String[] args) {
        //create hashmap
        //country - key(string) , population-value(integer)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("China",150);
        map.put("Bhutan",50);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //search
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key does not exist in map");
        }
//        int arr[] = {1,2,3,4,5,6};
//        for(int val:arr){
//            System.out.println(arr[val]+"");
//        }
//        System.out.println();
        //for(int val : arr) through entryset
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();
        //through keyset
        Set <String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+""+map.get(key));
        }
        //remove
        map.remove("China");
        System.out.println(map);

    }
}
