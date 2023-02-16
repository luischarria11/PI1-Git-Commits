import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car(true, i));
        }
<<<<<<< HEAD
        System.out.println(cars);
=======
        System.out.println("Ahh");
>>>>>>> 6e75cd7 (add list on main and add cars on for loop)
    }
}