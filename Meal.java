import java.util.ArrayList;
import java.util.Scanner;

public class Meal {
    private String name;
    private ArrayList<Dish> dishes;

    public Meal() {
        this.name = "";
        this.dishes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public double calculateCalories() {
        return dishes.stream()
                .mapToDouble(Dish::calculateCalories)
                .sum();
    }
    
    public void input(Scanner scanner) {
	Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите название приема пищи: ");
        name = in.nextLine();
        System.out.print("Введите количество блюд на этом приеме пищи: ");
        int numDishes = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        for (int i = 0; i < numDishes; i++) {
            System.out.println("Блюдо " + (i + 1) + ":");
            Dish dish = new Dish();
            dish.input(scanner);
            addDish(dish);

        }
    }
}
