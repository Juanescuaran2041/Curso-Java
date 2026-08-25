//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Juan Esteban";
        String surname = "Cuaran Santander";
        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(surname.charAt(0));
        System.out.println(surname.charAt(surname.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(surname.toUpperCase() + " / " + surname.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(surname.contains("Cuaran"));

        // 6. Formatea un string con un entero.
        var semester = 4;
        System.out.println(String.format("Hola estoy en %d semestre de ing de software", semester));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Programacion ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" Programacion ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String subject = "Programacion 1";
        var subj = "Programacion 1";
        System.out.println(subject.equals(subj));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println("Programacion 1".length() == subject.length());
    }
}