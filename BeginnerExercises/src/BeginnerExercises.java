//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BeginnerExercises {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Juan Esteban Cuaran";
        System.out.println(name);
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 18;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.7;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeProgramming = true;

        // 5. Declara una constante con tu email.
        final String email = "juan.cuaran@campusucc.edu.co";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'J';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Pasto";
        System.out.println(city);
        city = "Bogota";
        System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 1;
        int b = 10;
        System.out.println(a+b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(((Object) myInitial).getClass().getSimpleName());
        System.out.println(((Object) likeProgramming).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int number;
        number = 19;
        System.out.println(number);

    }
}
