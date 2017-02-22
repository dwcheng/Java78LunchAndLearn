class StringJoin {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 12, 5, 2, 7};
        System.out.println(joinWithCommas(nums));
    }

    private static String joinWithCommas(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder(nums.length);
        for (int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
            if (i < nums.length - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}