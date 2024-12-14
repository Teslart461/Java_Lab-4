import java.util.ArrayList;
import java.util.Scanner;

private static int totalMenusCreated = 0; // Статическое поле
    private ArrayList<Meal> meals;

    public Menu() {
        this.meals = new ArrayList<>();
        totalMenusCreated++; // Увеличиваем счётчик при создании нового объекта
    }

    public static int getTotalMenusCreated() { // Статический метод
        return totalMenusCreated;
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public double calculateCalories() {
        return meals.stream()
                .mapToDouble(Meal::calculateCalories)
                .sum();
    }

    public void input(Scanner scanner) {
        System.out.print("Введите количество приемов пищи в меню: ");
        int numMeals = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        for (int i = 0; i < numMeals; i++) {
            System.out.println("Прием пищи " + (i + 1) + ":");
            Meal meal = new Meal();
            meal.input(scanner);
            addMeal(meal);
        }
    }
}
