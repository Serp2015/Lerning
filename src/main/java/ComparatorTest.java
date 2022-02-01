import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("bwer");
//        list.add("a");
//        list.add("hwe");
//        list.add("qw");
//        list.forEach(System.out::println);
//        System.out.println();
//
//        list.stream()
//                .sorted(new StringLengthComparator())
//                .forEach(System.out::println);

        List<PersonForComparator> person = new ArrayList<>();
        person.add(new PersonForComparator("Alex", 10));
        person.add(new PersonForComparator("Dana", 20));
        person.add(new PersonForComparator("John", 15));

        person.stream()
                .sorted(new Comparator<PersonForComparator>() {
                    @Override
                    public int compare(PersonForComparator o1, PersonForComparator o2) {
                        if (o1.age > o2.age) return 1;
                        else if (o1.age < o2.age) return -1;
                        return 0;
                    }
                })
                .forEach(System.out::println);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        return 0;
    }
}

class PersonForComparator {
    String name;
    int age;

    public PersonForComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonForComparator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}