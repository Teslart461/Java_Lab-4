import java.util.Scanner;

public class Ingredient {
    private String name;
    private double calPer100g;
    private double weightInGrams;

    public Ingredient() {
        this.name = "";
        this.calPer100g = 0;
        this.weightInGrams = 0;
    }

    public String getName() {
        return name;
    }

    public double calculateCalories() {
        return (calPer100g * weightInGrams) / 100.0;
    }

    public void input(Scanner scanner) {
	Scanner in = new Scanner(System.in, "Cp866");
        System.out.print("Введите название ингредиента: ");
        name = in.nextLine();
        System.out.print("Введите калории на 100 грамм: ");
        calPer100g = scanner.nextDouble();
        System.out.print("Введите вес ингредиента в граммах: ");
        weightInGrams = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера
    }
}
