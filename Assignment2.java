import java.util.Scanner;

public class Assignment2 {

    public static void matrimonyValidation(Scanner sc) {
        System.out.print("Enter gender (male/female): ");
        String gender = sc.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        if (gender.equals("female")) {
            System.out.println((age >= 18) ? "Eligible for marriage" : "Not eligible for marriage");
        } else if (gender.equals("male")) {
            System.out.println((age >= 21) ? "Eligible for marriage" : "Not eligible for marriage");
        } else {
            System.out.println("Invalid gender");
        }
    }

    
    public static void homePatterns() {
        int rows = 8;
        int cols = 11;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 && j == 5) System.out.print("*");
                else if (i == 2 && (j == 3 || j == 7)) System.out.print("*");
                else if (i == 3 && (j == 2 || j == 10)) System.out.print("*");
                else if (i == 4 && (j == 1 || j == 5 || j == 8 || j == 10 || j == 11)) System.out.print("*");
                else if ((i == 5 || i == 6 || i == 7) && (j == 2 || j == 10)) System.out.print("*");
                else if (i == 8 && (j == 2 || j == 4 || j == 6 || j == 8 || j == 10)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

   
    public static void boxInsideXPattern() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1 || i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Matrimony Eligibility ===");
        matrimonyValidation(sc);

        System.out.println("\n=== Home Structure Pattern ===");
        homePatterns();

        System.out.println("\n=== Box Inside X Pattern ===");
        boxInsideXPattern();

        sc.close();
    }
}
