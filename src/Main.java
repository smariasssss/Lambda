import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Николай", "Миклухо-Маклай", 41));
        people.add(new Person("Эдвин", "Ван дер Сар", 51));
        people.add(new Person("Иван", "Смирнов", 21));
        people.add(new Person("Зинаида", "Христорождественская", 101));
        people.add(new Person("Артём", "Пономарёв", 15));
        people.add(new Person("Екатерина", "Вознесенская", 12));


        people.removeIf(person -> person.getAge() < 18);
        people.forEach(System.out::println);

    }

}