import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем пользователя
        User user = new User();
        System.out.println("Введите данные пользователя:");
        user.input(scanner);
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

        // Вычисляем баланс калорий
        double netCalories = totalCalories - caloriesBurned;
        System.out.println("Итоговый баланс калорий: " + netCalories + " ккал");

        scanner.close();
    }
}
