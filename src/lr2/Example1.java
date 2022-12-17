package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверим, делится ли число на 3 без остатка: ");
        System.out.println("Введите число: ");
        int A = in.nextInt();
        int B = 3;
        int C = A % B;
        if(C == 0) {
            System.out.println("Число делится на 3 без остатка");
        }
        else {System.out.println("Число не делится на 3 без остатка");
            in.close();
        }
    }
}