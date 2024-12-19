import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
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

    // Сортировка приемов пищи по калорийности
    public void sortMealsByCalories() {
        meals.sort(Comparator.comparingDouble(Meal::calculateCalories));
    }

    // Вывод приемов пищи в меню
    public void printMeals() {
        for (Meal meal : meals) {
            System.out.println("Прием пищи: " + meal.getName() + ", калорийность: " + meal.calculateCalories() + " ккал");
        }
    }

    // Поиск блюда по имени
    public Dish findDishByName(String name) {
        for (Meal meal : meals) {
            Dish dish = meal.findDishByName(name);
            if (dish != null) {
                return dish;
            }
        }
        return null; // Если блюдо не найдено
    }
}
