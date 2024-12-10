import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем пользователя
        User user = new User();
        System.out.println("Введите данные пользователя:");
        user.input(scanner);
        System.out.println("Привет, " + user.getName() + "!");
    }
}
