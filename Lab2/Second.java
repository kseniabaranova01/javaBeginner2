package Lab2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        boolean lowWord = false;
        boolean upWord = false;
        boolean numWord = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль ");
        String password = scanner.nextLine();

        if (password.length()<8)
        {
            System.out.println("Пароль должен содержать минимум 8 символов");
            System.exit (1);
        }

        for (int i = 0; i < password.length(); i++){
            char word = password.charAt(i);

            if ('a' <= word && word <= 'z') {
                lowWord = true;
            }
            if('A' <= word && word <= 'Z'){
                upWord = true;
            }
            if('0' <= word && word <= '9') {
                numWord = true;
            }
            if (('a' <= word & word <= 'z') | ('A' <= word & word <= 'Z') | ('0' <= word & word <= '9')){
                boolean result = true;
            }else{
                System.out.println("Обьективно пароль слабый");
                System.exit (1);
            }

        }
        if (upWord & lowWord & numWord){
            System.out.println("Пароль норм");
        } else {
            System.out.println("Обьективно пароль говно");
        }

    }


}
