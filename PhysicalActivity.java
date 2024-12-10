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
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите количество сожженных калорий за физическую активность: ");
        caloriesBurned = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера
    }
}