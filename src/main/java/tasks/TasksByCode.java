package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class TasksByCode {

    //Написать метод который определяет является ли строка палиндромом
    public static String reverseString(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; --i)
            rev += word.charAt(i);
        return rev;

    }

    //Написать метод который определяет является ли строка палиндромом
    public static Boolean isPalindrome(String word) {
        if (word.equals(reverseString(word))) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
        return word.equals(reverseString(word));

    }

    //Написать метод который определяет является ли слово анаграммой
    public static String sortWord(String firstWord) {
        char[] content = firstWord.toCharArray();
        Arrays.sort(content);
        return String.valueOf(content);
    }

    //Метод вычесляющий факториал
    public static int calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String textOne = "love on the world";

        //Перевернуть строку
        StringBuffer stringBuffer = new StringBuffer(textOne);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //Заменить символ в строке
        stringBuffer.reverse();
        stringBuffer.setCharAt(1, 'i');
        System.out.println(stringBuffer);

        //Удалить символ в строке
        stringBuffer.deleteCharAt(15);
        System.out.println(stringBuffer);

        //Подсчитать сколько раз символ встречается в строке, учитывая различные раскладки
        char[] symbol = textOne.toCharArray();
        int count = 0;
        for (int i = 0; i < symbol.length; ++i)
            if (symbol[i] == 'o')
                ++count;
        System.out.println(count);

        //Вывести строку указанное число раз с разделителем
        for (int i = 0; i < 5; i++) {
            textOne.split(";");
            //System.out.print(stringBuffer + "; ");
        }
        System.out.println();

//      String inputWord = scan.next();
//      isPalindrome(inputWord);
        isPalindrome(textOne);
        System.out.println();

        //Является ли слово анаграммой
        String firstWord = scan.nextLine();
        String secondWord = scan.nextLine();
        if (sortWord(firstWord).equals(sortWord(secondWord))) {
            System.out.print("Анаграмма");
        } else {
            System.out.print("Не анаграмма");
        }

        System.out.println();

        //Вычислить число Фибоначчи
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();

        //Вычислить факториал
        System.out.println(calculateFactorial(4));

    }

}



