import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("ALL")
public class TryCatchExample {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("foo.txt"));
            printFileContents(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printFileContents(InputStream inputStream) throws IOException {
        int content;
        while ((content = inputStream.read()) != -1) {
            System.out.print((char) content);
        }
    }
}
