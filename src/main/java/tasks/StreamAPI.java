package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        //преобразование отрицательных чисел в положительные
        List<Integer> numbers = Arrays.asList(1, 5, -3, 7);
        System.out.println(positive(numbers));
        System.out.println();

        //Четные умножить на 100, от нечетных отнять 100
        List<Integer> num = Arrays.asList(1, 2, 5, 3, 7, 10, 11, 14, 16);
        System.out.println(evenOdd(num));
        System.out.println();

        //Вытащить фамилии которые начинаются на "А"
        List<String> lastName = Arrays.asList("Артемов", "Вальма", "Анохин", "Кузнецов", "Евстахий", "Абакун", "Авраам");
        System.out.println(lastName1(lastName));

    }

    public static List<Integer> positive(List<Integer> input) {
        return input.stream().map(s -> Math.abs(s)).collect(Collectors.toList());

    }

    public static List<Integer> evenOdd(List<Integer> list) {
        return list.stream().map(s -> s % 2 == 0 ? s * 100 : s - 100).collect(Collectors.toList());

    }

    public static List<String> lastName1(List<String> input) {
        return input.stream().filter(s -> s.startsWith("А")).collect(Collectors.toList());

    }
}

