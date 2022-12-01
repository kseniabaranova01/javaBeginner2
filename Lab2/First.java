package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );
        System.out.println("Введите ч/м/г");
        String data = scanner.nextLine();
        String[] words = data.split("/");
        if (words.length != 3) {
            System.out.println("веденное выражение не соответствует заданному формату даты dd/mm/yyyy");
        } else {
            int[] array = Arrays.asList(words).stream().mapToInt(Integer::parseInt).toArray();
            if (array[0] > 31 | array[0] < 0 | array[1] > 12 | array[1] < 0 | array[2] > 9999 | array[2] < 1900){
                System.out.println("Введенное выражение не является датой");
            } else {
                System.out.println("Введенное выражение является датой");
            }
        }
    }
}
