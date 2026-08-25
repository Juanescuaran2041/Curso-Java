//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConditionalExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 19;
        if  (edad >= 18) {
            System.out.println("El usuario puede votar");
        } else{
            System.out.println("El usuario no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int a = 10;
        int b = 5;

        if (a > b){
            System.out.println("El numero: " + a + " Es mayor a " + b);
        }else if (a == b){
            System.out.println("El numero: " + a + " Es igual a " + b);
        }else{
            System.out.println("El numero: " + a + " Es menor a " + b);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        var num = 1;
        if (num > 0){
            System.out.println("El numero: " + num + " Es positivo");
        } else if ( num == 0) {
            System.out.println("El numero: " + num + " Es igual a cero");
        }else{
            System.out.println("El numero: " + num + " Es negativo");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        if (num % 2 == 0){
            System.out.println("El numero: " + num + " Es par");
        }else{
            System.out.println("El numero: " + num + " Es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if (num>=1 && num<=100){
            System.out.println("El numero: " + num + " Se encuentra entre 1-100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 3;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un rango valido");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 85;

        if (nota >= 90 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60 && nota < 90) {
            System.out.println("Aprobado");
        } else if (nota >= 0 && nota < 60) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota no válida");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad2 = 14;
        boolean acompañado = true;

        if (edad2 >= 15 || acompañado == true){
            System.out.println("Puede entrar al cine");
        }else if (edad2 < 15 && acompañado == false){
            System.out.println("No puede entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'e';

        char letraMinuscula = Character.toLowerCase(letra);

        if (letraMinuscula == 'a' || letraMinuscula == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
            System.out.println("Vocal");
        } else if (letraMinuscula >= 'a' && letraMinuscula <= 'z') {
            System.out.println("Consonante");
        }else{
            System.out.println("El caracter ingresado no es una letra valida");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z ){
            System.out.println("El numero mayor es: " + x);
        }else if (y > x && y > z){
            System.out.println("El numero mayor es: " + y);
        }else{
            System.out.println("El numero mayor es: " + z);
        }
    }
}