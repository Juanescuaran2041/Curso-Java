import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Loops {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //for
        for (int i = 0 ; i < 5; i++) {
            System.out.println("Repeticion: " + (i+1)+ ": " + "Hola Java");
        }

        String[] languages = new String[]{"Java", "C#", "Python", "PHP"};
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Lenguaje " + (i+1) + ": " + languages[i]);
        }

        for (String language : languages) {
            System.out.println("Lenguaje " + language);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println("Numero: " + number);

        }

        HashMap<String, String> mapEmails = new HashMap<>();
        mapEmails.put("John", "Johnson@gmail.com");
        mapEmails.put("Junaes", "Juanes@gmail.com");
        mapEmails.put("Joseph", "Josephson@gmail.com");

        for (Map.Entry<String, String> email : mapEmails.entrySet()) {
            System.out.println("Nombre: " + email.getKey() + ": " +  email.getValue());
        }

        //while
        int index = 0;
        while (index < 5) {
            System.out.println("Repeticion: " + (index+1)+ ": " + "Hola Java");
            index++;

        }

        index = 0;
        while (index < languages.length) {
            if (languages[index].equals("Java")) {
                System.out.println("Lenguaje Java se encuentra en el indice: " + index);
                break;
            }
            index++;
        }

        index = 0;
        // do-while
        do {
            System.out.println("Repeticion: " + (index+1)+ ": " + languages[index]);
            index++;
        }while (index < languages.length);

        //continue
        for (int i = 0 ; i < languages.length; i++) {
            if  (languages[i].equals("Python")) {
                continue;
            }
            System.out.println(languages[i]);
        }
    }
}