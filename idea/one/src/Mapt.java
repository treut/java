import java.util.HashMap;
import java.util.Map;

public class Mapt {
    public static void main(String[] args){

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "one");
        mapa.put(2, "two");
        mapa.put(3, "three");

//        System.out.println(map);
//        map.put(3, "gggg");
//        System.out.println(map.get(5));

        for(Map.Entry<Integer, String> entry : mapa.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
