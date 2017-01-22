import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class SharedMutable {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(6, 7, 8, 9));

        numbers.stream()
               .peek(numbers::remove)
               .forEach(System.out::println);
    }
}