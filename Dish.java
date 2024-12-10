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
    
    public void input(Scanner scanner) {
	Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите название блюда: ");
        name = in.nextLine();
        System.out.print("Введите количество ингредиентов в блюде: ");
        int numIngredients = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        for (int i = 0; i < numIngredients; i++) {
            System.out.println("Ингредиент " + (i + 1) + ":");
            DetailedIngredient ingredient = new DetailedIngredient();
            ingredient.input(scanner);
            addIngredient(ingredient);
        }
    }
}
