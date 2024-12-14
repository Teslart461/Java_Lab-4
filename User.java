import java.util.Scanner;

public class User {
    private String name;

    public void input() {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите имя пользователя: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return this.name;
    }
}
