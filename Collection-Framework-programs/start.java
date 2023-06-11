import java.util.ArrayList;

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
        ArrayList<String> names = new ArrayList<>();

        names.add("Ayush");
        names.add("Mahra");
        // names.add(234) //this will throw error as type int is not assignable to tyoe
        // string
        names.add("sarthak");
        names.add("dani");
        names.add("random");

        System.out.println(names);
    }
}
