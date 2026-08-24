//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorldExercises {
    public static void main(String[] args) {
        // 1. Imprimir el nombre
        System.out.println("Juan Esteban Cuaran");
        // 2. Imprimir Hola y Mundo en 2 lineas en un mismo println
        System.out.println("Hola\n" + "Mundo");

        /*
        4. Comentarioe en varias lineas
         */

        // 5. Imprimir Edad, Color favorito y Ciudad
        System.out.println("Edad:" + 18);
        System.out.println("Color Favorito:" + "azul");
        System.out.println("Ciudad:" + "Pasto");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Error");
        //System.exit(0);

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Aprender a programar");
        System.out.println("en Java");
        System.out.println("requiere práctica");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("   XXXXX   ");
        System.out.println("  X     X  ");
        System.out.println(" X  O  O  X ");
        System.out.println("X          X");
        System.out.println("X  \\____/  X");
        System.out.println(" X        X ");
        System.out.println("  X     X  ");
        System.out.println("   XXXXX   ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        /*
        ERROR EN TIEMPO DE EJECUCIÓN (Runtime Error):
        El código sí va a compilar (creará el archivo .class), pero al intentar
        ejecutarlo con el comando 'java Ejercicio9', la Máquina Virtual de Java (JVM)
        fallará y mostrará el siguiente mensaje en la consola:

        "Error: Main method not found in class Ejercicio9, please define the main method as:
        public static void main(String[] args)"
        */

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        /*
        ERROR DE COMPILACIÓN:
        Java arrojará el siguiente error:
        "class HelloWorldExercise is public, should be declared in a file named HelloWorldExercise.java"

        ¿POR QUÉ OCURRE?
        En Java, toda clase declarada como public debe coincidir exactamente
        con el nombre del archivo físico (incluyendo mayúsculas y minúsculas).

         */

        System.exit(0);
    }
}