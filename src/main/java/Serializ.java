import java.io.*;

public class Serializ {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("");
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(oos);
        } catch (IOException e) {
        }
        try (InputStream is = new FileInputStream("");
             ObjectInputStream ois = new ObjectInputStream(is)) {
            SerialDemo sd = (SerialDemo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}

class SerialDemo implements Serializable {
    String name;
    int age;

    public SerialDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
