import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] ages = new int[5];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;
        ages[4] = 5;

        System.out.println(ages.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("-----------------");
        System.out.println(ages[1]);
        ages[1] = 4;
        System.out.println(ages[1]);
        // 3. Crea un ArrayList vacío.
        System.out.println("-----------------");
        ArrayList<String> names = new ArrayList<>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Juanes");
        names.add("Juan");
        names.add("Jhon");
        names.add("Andres");
        System.out.println(names);

        names.remove("Andres");
        System.out.println(names);

        // 5. Crea un HashSet con 2 valores diferentes.
        System.out.println("-----------------");
        HashSet<String> countries = new HashSet<>();

        countries.add("Colombia");
        countries.add("Ecuador");
        System.out.println(countries);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        System.out.println("-----------------");
        countries.add("Colombia");
        countries.add("Venezuela");
        System.out.println(countries);

        // 7. Elimina uno de los elementos del HashSet.
        System.out.println("-----------------");
        countries.remove("Venezuela");
        System.out.println(countries);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        System.out.println("-----------------");
        HashMap<String, Long> usersPhoneNumber = new HashMap<>();

        usersPhoneNumber.put("Juanes", 31569092414241L);
        usersPhoneNumber.put("Juan", 3156909241214L);
        usersPhoneNumber.put("Juan Esteban", 315690921424L);

        System.out.println(usersPhoneNumber);

        // 9. Modifica uno de los contactos y elimina otro.
        usersPhoneNumber.replace("Juanes", 31569L);
        System.out.println(usersPhoneNumber);

        usersPhoneNumber.remove("Juanes");
        System.out.println(usersPhoneNumber);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales
        System.out.println("-----------------");

        // Array
        String[] programmingLanguages = new String[]{"Java", "C#", "Python", "PHP"};

        //List
        ArrayList<String> languagesList = new ArrayList<>(Arrays.asList(programmingLanguages));

        //HashSet
        HashSet<String> languages = new HashSet<>(languagesList);

        //Map
        HashMap<String, String> mapa =  new HashMap<>();
        for (String key : languages) {
            mapa.put(key, key);
        }
        System.out.println("ArrayList: " + languagesList);
        System.out.println("HashSet: " + languages);
        System.out.println("HashMap: " + mapa);

    }
}