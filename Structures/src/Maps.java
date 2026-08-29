import java.util.HashMap;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {

        //key --> var
        HashMap<String, String> map = new HashMap<>();
        map.put("Juan", "Cuaran");
        map.put("Juanes", "Cuaran");
        map.put("Esteban", "Santander");
        System.out.println(map);

        //Size
        System.out.println(map.size());
        System.out.println(map);

        //Acceder
        System.out.println(map.get("Juanes")); //-> Cuaran
        //System.out.println(map.get("Es")); -> Null

        //Search
        System.out.println(map.containsKey("Es"));
        System.out.println(map.containsValue("Cuaran"));
        System.out.println(map);

        //remove
        map.remove("Juanes");
        System.out.println(map);
        System.out.println(map.remove("Esteban"));

        //clear
        map.clear();
        System.out.println(map);

        //Otras operaciones
        map.put("Juan", "CuaranSantander");
        System.out.println(map);

        map.replace("Juanes", "CuaranSantander"); //No lo añade
        System.out.println(map);

        map.putIfAbsent("Juanes", "CuaranSantander");
        System.out.println(map);

        var numbers = new HashMap<Integer, String>();
    }
}
