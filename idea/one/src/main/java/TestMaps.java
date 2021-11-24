import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args){

        Map<Integer, String> lh = new LinkedHashMap<>();//save order
        Map<Integer, String> tm = new TreeMap<>();//sort by key

//        testMap(lh);
        testMap(tm);
    }

    public static void testMap(Map<Integer, String> tmap){
        tmap.put(28, "Non");
        tmap.put(22, "Don");
        tmap.put(43, "Gon");

        for(Map.Entry<Integer, String> ent : tmap.entrySet()){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }
}
