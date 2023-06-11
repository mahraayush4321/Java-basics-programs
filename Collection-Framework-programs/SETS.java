import java.util.HashSet;
import java.util.TreeSet;

public class SETS {
    public static void main(String[] args) {
        System.out.println("welcome to basics of Sets in Collection Framework ");

        HashSet<Double> jojo = new HashSet<>();
        jojo.add(34.23);
        jojo.add(234.3452);
        jojo.add(564.8763);
        jojo.add(3.3);
        jojo.add(34.23); // duplicates not allowed in hashset

        /*
         * Treeset will sort the set
         */

        TreeSet<Double> tSet = new TreeSet<>();
        tSet.addAll(jojo);

        System.out.println(jojo);

        System.out.println(tSet);

    }
}
