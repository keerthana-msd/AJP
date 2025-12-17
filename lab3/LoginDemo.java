import java.util.Scanner;

class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }

    public String getPassword() {
        return password;
    }
}

public class LoginDemo { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter username: ");
        login.setUsername(sc.nextLine());

        System.out.print("Enter password: ");
        login.setPassword(sc.nextLine());

        System.out.println("\nUsername: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());

        sc.close();
    }
}
