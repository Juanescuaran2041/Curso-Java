import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 0;
        while (index < 10) {
            System.out.println(index+1);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("---------------");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("PHP");
        languages.add("Python");

        index = 0;

        do {
            System.out.println(languages.get(index));
            index++;
        }while(index < languages.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("---------------");
        for (int i = 1; i<=50; i++){
            if(i%5 == 0){
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        System.out.println("---------------");
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("---------------");

        String[] countries = new String[2];
        countries[0] = "Colombia";
        countries[1] = "Ecuador";
        for (String country : countries){
            System.out.println(country);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("---------------");

        HashMap<String, Integer> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Juanes", 112424);
        phoneNumbers.put("Maria", 112424);

        HashSet<String> vulnerabilities = new HashSet<>();
        vulnerabilities.add("Ransomware");
        vulnerabilities.add("Troyans");

        for (String vulns : vulnerabilities){
            System.out.println(vulns);
        }

        for (Map.Entry<String, Integer> phoneNumber : phoneNumbers.entrySet()){
            System.out.println(phoneNumber.getKey());
            System.out.println(phoneNumber.getValue());
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("---------------");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("---------------");
        for (int i = 1; i<=20; i++){
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        System.out.println("---------------");
        float[] numbers = new float[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = -3;
        numbers[3] = 4;

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] < 0){
                break;
            }
            System.out.println(numbers[i]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("---------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial =1;
        if (number<0){
            System.out.println("Invalid number");
        }else{
            for (int i = 1; i <= number; i++){
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
