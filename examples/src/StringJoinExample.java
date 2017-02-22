class StringJoinExample {
    public static void main(String[] args) {
        String[] names = {"John", "Josh", "Bob", "Alex"};
        System.out.println(joinWithCommas(names));
    }

    private static String joinWithCommas(String[] names) {
        StringBuilder stringBuilder = new StringBuilder(names.length);
        for (int i = 0; i < names.length; i++) {
            stringBuilder.append(names[i]);
            if (i < names.length - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}