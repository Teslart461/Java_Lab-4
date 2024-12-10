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


        }
    }
}
