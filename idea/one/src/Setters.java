import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setters {
    public static void main(String[] args){
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();

        hs.add("ton");
        hs.add("don");
        hs.add("gon");
        hs.add("bon");
//        hs.add("gon");

//        for(String name : hs){
//            System.out.println("Naaame: "+name);
//        }
//        System.out.println(hs.contains("don"));

        System.out.println(hs.toArray()[1]);
    }
}
