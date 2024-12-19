import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");

        // Создаем пользователя
        User user = new User();
        user.input();
        System.out.println("Привет, " + user.getName() + "!");

        // Создаем меню
        Menu menu = new Menu();
        System.out.println("Создание меню:");
        menu.input(scanner);

        // Вычисляем общее количество калорий в меню
        double totalCalories = menu.calculateCalories();
        System.out.println("Общее количество калорий в меню: " + totalCalories + " ккал");

        // Ввод данных о физической активности
        PhysicalActivity activity = new PhysicalActivity();
        System.out.println("Введите данные о физической активности:");
        activity.input(scanner);
        double caloriesBurned = activity.getCaloriesBurned();
        System.out.println("Сожжено калорий: " + caloriesBurned + " ккал");

        // Использование статического метода
        System.out.println("Всего создано меню: " + Menu.getTotalMenusCreated());

        // Сортировка блюд в меню
        menu.sortMealsByCalories();
        System.out.println("Меню после сортировки приёмов пищи по калорийности:");
        menu.printMeals();

        // Поиск блюда по имени
        System.out.print("Введите имя блюда для поиска: ");
        String dishName = scanner.nextLine();
        Dish foundDish = menu.findDishByName(dishName);
        if (foundDish != null) {
            System.out.println("Найдено блюдо: " + foundDish.getName() + " с калорийностью " + foundDish.calculateCalories() + " ккал");
        } else {
            System.out.println("Блюдо не найдено.");
        }

        // Вычисляем баланс калорий
        double netCalories = totalCalories - caloriesBurned;
        System.out.println("Итоговый баланс калорий: " + netCalories + " ккал");

        scanner.close();
    }
}
