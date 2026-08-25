//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Strings {
    public static void main(String[] args) {

        //Cadenas de texto

        //String name = "Juanes";
        String name = new String("Juan Esteban");
        String surname = new String("Cuaran Santander");

        //Concatenacion
        System.out.println("Nombre Completo: " + name + " " + surname);

        //Lenght
        System.out.println(name.length());

        //CharAt
        System.out.println(name.charAt(2));

        //substring
        System.out.println(name.substring(5)); //Esteban
        System.out.println(name.substring(5, 12)); //Esteban

        //toUpperCase / toLowerCase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //contains
        System.out.println(name.contains("Juan"));

        //equals
        System.out.println(name == "Juan Esteban");
        System.out.println(name.equals("Juan Esteban"));
        System.out.println(name.equalsIgnoreCase("juan esteban"));

        //trim
        System.out.println(" Hola me llamo juanes".trim()); //Limpia la entrada para no tener espacios
        System.out.println(" Hola me llamo juanes".replace("juanes", "Juanes").trim());

        //Format
        var age = 18;
        // %s para strings, %d para ints
        System.out.println(String.format("Mi nombre es %s Cuaran. Tengo %d años", name, age));

    }
}