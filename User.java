import java.util.Scanner;

public class User {
    private String name;

    public User() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void input(Scanner scanner) {
	Scanner in = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя пользователя: ");
        name = scanner.nextLine();
    }
}
