public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("program started ");
        int x = 34 + 45;
        System.out.println("sum is " + x);
        // current Thread

        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("current running thread is  " + tname);

        // setName

        t.setName("MyMain Thread");

        System.out.println(t.getName());

        try {
            Thread.sleep(5000);

        } catch (Exception e) {

        }

        System.out.println("program ended .......");
    }
}
