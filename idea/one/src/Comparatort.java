import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatort {
    public static void main(String[] args){
        List<String> animals = new ArrayList<>();

        animals.add("bird");
        animals.add("frog");
        animals.add("dog");
        animals.add("cat");

        Collections.sort(animals, new SLComparator()); // new Comparator<String>{ public int compare(){} }
        System.out.println(animals);
    }
}

class SLComparator implements Comparator<String>{
    @Override
    public int compare(String s, String t1) {
        if(s.length()>t1.length()) return 1;
        else if(s.length()<t1.length()) return -1;
        else return 0;
    }

}