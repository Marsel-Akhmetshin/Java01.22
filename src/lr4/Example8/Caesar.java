package lr4.Example8;

import java.util.Arrays;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования" + Arrays.toString(chars));

        for(int i = 0; i < chars.length; i++){
            ints[i] = chars[i] + key;
        }

        System.out.println("ints до преобразования" + Arrays.toString(ints));

        for(int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];

            System.out.println("chars после преобразования" + Arrays.toString(chars));


        }
    }
}
