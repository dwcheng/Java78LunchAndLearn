package lambdas;

public class NumericLiterals {
    static int tenMillion = 10000000;
    static int tenMillionWithUnderscores = 10_000_000;

    public static void main(String[] args) {
        System.out.println("This has underscores " + tenMillionWithUnderscores);
        System.out.println("This does not have underscores " + tenMillion);
        System.out.println(tenMillion - tenMillionWithUnderscores);
    }
}
