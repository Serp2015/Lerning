import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class IoNio {
    public static void main(String[] args) {
//        fileChannel();
//        inputStream();
//        bufferedReader();
//        reader();
//        encodeReader();
    }

    public static void encodeReader() {
        try (FileInputStream fis = new FileInputStream("d:\\Java\\Courses\\Collections.txt");
             FileOutputStream fos = new FileOutputStream("d:\\Java\\Courses\\Collections_new.txt");
             Reader reader = new InputStreamReader(fis, StandardCharsets.ISO_8859_1);
             Writer writer = new OutputStreamWriter(fos, StandardCharsets.ISO_8859_1)) {
            char[] buffer = new char[4096];
            int r;
            while ((r = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, r);
            }
        } catch (IOException e) {
        }
    }

    public static void bufferedReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader("d:\\Java\\Courses\\Collections.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("d:\\Java\\Courses\\Collections_new.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
            }
        } catch (IOException e) {
        }
    }

    public static void reader() {
        try (Reader reader = new FileReader("d:\\Java\\Courses\\Collections.txt");
             Writer writer = new FileWriter("d:\\Java\\Courses\\Collections_new.txt")) {
            char[] buffer = new char[4096];
            int r;
            while ((r = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, r);
            }
        } catch (IOException e) {
        }
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
