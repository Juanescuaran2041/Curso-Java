//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Operators {
    public static void main(String[] args) {

        //Operadores

        //Aritmeticos

        var a = 5;
        var b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Asignacion
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparacion

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logicos

        //Y (AND)
        System.out.println(true && false); //false
        System.out.println(3 > 2 && 5 ==2); //false

        //O (OR)
        System.out.println(true || false); //true
        System.out.println(3 > 2 || 5 ==2); //true

        //NO (NOT)
        System.out.println(!true || false); //false
        System.out.println(!(3 > 2) || 5 ==2); //false

        //Unarios
        System.out.println(-b); //-2
        System.out.println(++b); //3
        System.out.println(b++); //3
        System.out.println(b); //4
    }
}