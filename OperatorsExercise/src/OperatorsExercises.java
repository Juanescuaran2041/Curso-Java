//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OperatorsExercises {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 10+5;
        int resta = 10-5;
        int multiplicacion = 10*5;
        float division = 10/5;
        int residuo = 10%5;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(residuo);

        // 2. Crea una variable para cada tipo de operación de asignación.
        float x = 10;
        x += 2;
        System.out.println("");
        System.out.println(x);
        x -=2;
        System.out.println(x);
        x *=2;
        System.out.println(x);
        x /=2;
        System.out.println(x);
        x %=2;
        System.out.println(x);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(x < 1);
        System.out.println(x == 0);
        System.out.println(x <= 1);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println("");
        System.out.println(x > 1);
        System.out.println(x != 0);
        System.out.println(x == 1);

        // 5. Utiliza el operador lógico and.
        System.out.println("");
        System.out.println(true && false); //false
        System.out.println(true && true); // true

        // 6. Utiliza el operador lógico or.
        System.out.println("");
        System.out.println(true || false); //true
        System.out.println(true || true); //true

        // 7. Combina ambos operadores lógicos.
        System.out.println("");
        System.out.println((true && false) || (true && true));
        System.out.println(((true && false) || true) && (true && true) || false);

        // 8. Añade alguna negación.
        System.out.println("");
        System.out.println((true && false) || !(true && true));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("");
        int number = 5;
        System.out.println(-number); //-5
        System.out.println(++number); //6
        System.out.println(number++); //7 en memoria pero imprime 6
        System.out.println(number); //7

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean result = ((5*2)+3 > 1 && !(2/3 > 1));
        System.out.println("");
        System.out.println(result);
    }
}