package Day19;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,25,50,90,100,34,21,45,56,28,89,76,72,93,63,83,84,85,68);
        long startTime = System.currentTimeMillis();
        numbers.stream().parallel()
                .filter(num->num>50)
                .map(num -> num*num)
                .limit(10)
                .forEach(num-> System.out.println(num));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

    }
}
