import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("file 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na nazwisko?");
        String surname = sc.nextLine();
        System.out.println("Masz na nazwisko " + surname);
    }
}