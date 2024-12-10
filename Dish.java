import java.util.ArrayList;
import java.util.Scanner;

public class Dish {
    private String name;
    private ArrayList<DetailedIngredient> ingredients;

    public Dish() {
        this.name = "";
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addIngredient(DetailedIngredient ingredient) {
        ingredients.add(ingredient);
    }

    public double calculateCalories() {
        return ingredients.stream()
                .mapToDouble(DetailedIngredient::calculateCalories)
                .sum();
    }


        }
    }
}
