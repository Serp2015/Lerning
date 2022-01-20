import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class IoNio {
    public static void main(String[] args) {
        fileChannel();
    }

    public static void fileChannel() {
        try (FileInputStream fis = new FileInputStream("d:\\Java\\Courses\\IO_NIO.mp4");
             FileOutputStream fos = new FileOutputStream("d:\\Java\\Courses\\IO_NIO_test.mp4");
             FileChannel in = fis.getChannel();
             FileChannel out = fos.getChannel()
        ) {
            in.transferTo(0, in.size(), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
