
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        System.out.println("Traversing");

        ArrayList<String> names = new ArrayList<>();
        names.add("Ayush");
        names.add("Mahra");
        names.add("sarthak");
        names.add("dani");
        names.add("random");

        // for each

        for (String str : names) {

            System.out.println(str + "\t" + str.length() + "\t");
        }

        System.out.println("-------------------------------------");

        // forward traversing using iterator

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }

    }
}
