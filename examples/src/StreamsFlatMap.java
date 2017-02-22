import java.util.Random;

public class StreamsFlatMap {
    //Find the average of all locations that are less than 1000
    public static void main(String[] args) {
        int[][] grid = populateGrid();

        double count = 0;
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int current = grid[i][j];
                if (current < 1000) {
                    count++;
                    sum += current;
                }
            }
        }

        System.out.println(sum / count);
    }

    private static int[][] populateGrid() {
        int[][] result = new int[8][8];
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                result[i][j] = random.nextInt();
            }
        }

        return result;
    }
}
