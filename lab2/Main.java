class Printer {

    void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void printDetails(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printDetails("Keerthana", 23);
        printer.printDetails(23, "Keerthana");
    }
}
