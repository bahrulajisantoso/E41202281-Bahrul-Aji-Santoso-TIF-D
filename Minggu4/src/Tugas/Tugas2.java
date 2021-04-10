package Tugas;

public class Tugas2 {
    public static void main(String[] args) {

        System.out.println("\t\t Do-While");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("============================");

        int i = 2;
        do {
            System.out.print(i + " ");
            i += i;
        } while (i <= 100);
    }
}
