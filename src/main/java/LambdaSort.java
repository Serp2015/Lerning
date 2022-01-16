import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaSort {
    public static void main(String[] args) {
        List<LambdaSortObject> list = new ArrayList<>();
        list.add(new LambdaSortObject("4", 4));
        list.add(new LambdaSortObject("3", 3));
        list.add(new LambdaSortObject("2", 2));
        System.out.println(list);
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(list);
        Function<String, Integer> stringToInteger = Integer::valueOf;
        System.out.println(stringToInteger.apply("123"));
        String[] str = Stream.of("Hello", "world")
                .flatMap(x -> Arrays.stream(x.split("")))
                .toArray(String[]::new);
        Arrays.stream(str).forEach(x -> System.out.print(x + " "));
    }
}

class LambdaSortObject {
    String name;
    int id;

    public LambdaSortObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(LambdaSortObject b) {
        return 0;
    }

    @Override
    public String toString() {
        return "LambdaSortObject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

