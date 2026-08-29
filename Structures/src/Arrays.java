import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        //Declaracion y modificacion
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println("El numero mayor es: " + numbers[0]);


        String names[] = {"Juan", "Joseph", "Esteban"};
        System.out.println(names[0]);

        System.out.println((new String[3])[0]);

        //numbers[2] = null; Error

        boolean[] bools = new boolean[3];
        System.out.println(bools[0]);


    }
}