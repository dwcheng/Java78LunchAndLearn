import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("ALL")
public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Margaret", "John", "Alphonse");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for (String s : names) {
            System.out.println(s);
        }
    }
}
