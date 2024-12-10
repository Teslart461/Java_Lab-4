import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Meal> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public double calculateCalories() {
        return meals.stream()
                .mapToDouble(Meal::calculateCalories)
                .sum();
    }


        }
    }
}
