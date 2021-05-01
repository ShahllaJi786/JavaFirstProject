package fourthpackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {

        // unique data --> no duplicate dada is allowed
        // hashset will remove the duplicate data
        HashSet<String> cities = new HashSet<>();
        cities.add("Rego Park");
        cities.add("Jamaica");
        cities.add("Medford");

        System.out.println(cities);

        Iterator it = cities.iterator();
        while (it.hasNext()){
            String city = (it.next().toString());
            System.out.println(city);
        }
    }
}
