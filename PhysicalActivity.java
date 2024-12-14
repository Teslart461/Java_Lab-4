import java.util.Scanner;

public class PhysicalActivity {
    private double caloriesBurned;

    public PhysicalActivity() {
        this.caloriesBurned = 0;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void input(Scanner scanner) {
        boolean validInput = false; // Флаг для проверки корректности ввода
        while (!validInput) {
            try {
                System.out.print("Введите количество сожжённых калорий за физическую активность: ");
                caloriesBurned = scanner.nextDouble();
                scanner.nextLine(); // Очистка буфера

                if (caloriesBurned < 0) { // Проверка, что калории не отрицательные
                    throw new IllegalArgumentException("Количество сожжённых калорий не может быть отрицательным!");
                }

                validInput = true; // Если всё прошло успешно, завершаем цикл
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите число.");
                scanner.nextLine(); // Очистка буфера после некорректного ввода
            }
        }
    }
}
