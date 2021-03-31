package HomeWork.Teme7;

import java.util.stream.Stream;

public class Java8Fibonnaci {

    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .map(n -> n[0])
                .dropWhile(i -> i < 1)
                .takeWhile(i -> i <= 100)
                .forEach(System.out::println);



        }
    }
