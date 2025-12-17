import java.util.Scanner;

public class Assignment1 {

    
    public static void marksProgram(int marks) {
        String result = (marks >= 90 && marks <= 100) ? "Distinction" :
                        (marks >= 81 && marks <= 89)  ? "Distinction" :
                        (marks >= 60 && marks <= 80)  ? "First Class" :
                        (marks >= 41 && marks <= 59)  ? "Second Class" :
                        (marks >= 35 && marks <= 40)  ? "Pass" : "Fail";

        System.out.println("Marks: " + marks + " -> " + result);
    }


    public static void oddEvenProgram(int num) {
        switch (num % 2) {
            case 0 -> System.out.println("Number: " + num + " -> Even Number");
            case 1 -> System.out.println("Number: " + num + " -> Odd Number");
        }
    }

    public static void positiveNegativeProgram(int num) {
        String result = (num > 0) ? "Positive Number" :
                        (num < 0) ? "Negative Number" : "Zero";

        System.out.println("Number: " + num + " -> " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        marksProgram(marks);


        System.out.print("Enter a number to check Odd/Even: ");
        int num1 = sc.nextInt();
        oddEvenProgram(num1);

      
        System.out.print("Enter a number to check Positive/Negative: ");
        int num2 = sc.nextInt();
        positiveNegativeProgram(num2);

        sc.close();
    }
}
