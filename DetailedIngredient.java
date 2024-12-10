import java.util.Scanner;

public class DetailedIngredient {
    private Ingredient ingredient;

    public DetailedIngredient() {
        this.ingredient = new Ingredient();
    }

    public String getName() {
        return ingredient.getName();
    }

    public double calculateCalories() {
        return ingredient.calculateCalories();
    }

    public void input(Scanner scanner) {
        ingredient.input(scanner);
    }
}
