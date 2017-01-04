public class NumericLiterals {

    public static void main(String[] args) {
        int tenMillionWithUnderscores = 10_000_000;
        int tenMillion = 10000000;

        System.out.println("This has underscores " + tenMillionWithUnderscores);
        System.out.println("This does not have underscores " + tenMillion);
        System.out.println(tenMillion - tenMillionWithUnderscores);
    }
}
