//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VariablesAndConstants {
    public static void main(String[] args) {
        String name = "Juan";
        System.out.println(name);

        name = "Juanes";
        System.out.println(name); //Juanes

        int age = 18;
        System.out.println(age);

        var email = "juan.cuaran@campusucc.edu.co"; // Tipo de variable que se infiere
        System.out.println(email);

        var year = 2026; //Tipo entero
        System.out.println(year);

        //constantes
        final String EMAIL = "juan.cuaran@campusucc.edu.co";
        System.out.println(EMAIL);

        //EMAIL = "23"; --> no puede variar



    }
}