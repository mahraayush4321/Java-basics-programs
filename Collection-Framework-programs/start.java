import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class start {
    public static void main(String[] args) {
        System.out.println("welcome to colletion framework basics");

        /*
         * 
         * Collection framework contains list as interface and this interface have
         * classes which
         * will implement this interface like
         * ArrayList,LinkedList,vector
         * 
         * List can be created in two types :->
         * 
         * Type safe
         * 
         * Type unsafe
         * 
         */

        // Type safe :->
        // Array List is based on proper indexing count and can contain duplicate
        // elemennts and its typesafe
        ArrayList<String> names = new ArrayList<>();

        names.add("Ayush");
        names.add("Mahra");
        // names.add(234) //this will throw error as type int is not assignable to tyoe
        // string
        names.add("sarthak");
        names.add("dani");
        names.add("random");

        // Remove from arraylist

        names.remove("Mahra");

        // How to get size of arraylist

        System.out.println("size :-> " + names.size());

        // How to set values in arraylist

        // names.set(0,"manish")

        names.add(0, "Tanishq");

        System.out.println(names);

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        // untype safe:->
        /*
         * linked list can be typesafe and untypesafe
         * linked list can store any type of data
         * It is not indexed based like arraylist
         */
        LinkedList<String> list = new LinkedList<>();
        list.add("Ayush");
        list.add("Mahra");
        // list.add(234);
        // list.add(56.56);
        System.out.println(list);

        Vector<String> v = new Vector<>();
        v.addAll(names);
        System.out.println("Vector :-> " + v);
    }
}
