import java.io.*;
import java.nio.channels.FileChannel;

public class IoNio {
    public static void main(String[] args) {
//        fileChannel();
//        inputStream();
    }

    public static void inputStream() {
        try (InputStream is = new FileInputStream("d:\\Java\\Courses\\IO_NIO.mp4");
            OutputStream os = new FileOutputStream("d:\\Java\\Courses\\IO_NIO_test.mp4")) {
            byte[] buffer = new byte[4096];
            int r;
            while ((r = is.read(buffer)) != -1) {
                os.write(buffer, 0, r);
            }
        } catch (IOException e) {
        }
    }

    public static void fileChannel() {
        try (FileInputStream fis = new FileInputStream("d:\\Java\\Courses\\IO_NIO.mp4");
             FileOutputStream fos = new FileOutputStream("d:\\Java\\Courses\\IO_NIO_test.mp4");
             FileChannel in = fis.getChannel();
             FileChannel out = fos.getChannel()
        ) {
            in.transferTo(0, in.size(), out);
        } catch (IOException e) {
        }
    }
}
