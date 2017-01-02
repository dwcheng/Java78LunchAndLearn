package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("ALL")
public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.forEach(System.out::println);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 == 0) { return Integer.compare(o1, o2); }
                if (o1 % 2 == 0) { return 1; }
                if (o2 % 2 == 0) { return -1; }
                return Integer.compare(o1, o2);
            }
        });
    }
}