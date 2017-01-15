import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Margaret", "John", "Alphonse");

        Collections.sort(names);

        for (String s : names) {
            System.out.println(s);
        }
    }
}
