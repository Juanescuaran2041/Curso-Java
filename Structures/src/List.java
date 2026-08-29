import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        //Declaration

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Access
        names.add("John");
        names.add("Joe");
        System.out.println(names);
        System.out.println(names.size());

        //get
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        //Modified
        names.set(1,"Juan");
        System.out.println(names.get(1));

        //Delete
        names.remove("Juan");
        System.out.println(names.size());

        boolean result = names.contains("Juan");
        System.out.println(result);

        //Clear
        names.clear();
        System.out.println(names.size());
    }
}
