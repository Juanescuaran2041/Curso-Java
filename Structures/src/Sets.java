import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {

        //Declaration

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Size
        System.out.println(names.size());
        names.add("Juan");
        names.add("Jhon");
        names.add("NAW");
        names.add("Juanes");
        System.out.println(names.size());

        //Access
        System.out.println(names);

        //Search
        System.out.println(names.contains("Juan"));

        //Remove
        names.remove("Juan");
        System.out.println(names.size());
        System.out.println(names);

        //names.add("Juanes"); --> No lo agrega
        //names.add("Juanes");
        System.out.println(names);

        //conjuntos
        var countries = new HashSet<String>();

        countries.add("Colombia");
        countries.add("Nigeria");
        countries.add("Rome");

        names.addAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

    }
}
