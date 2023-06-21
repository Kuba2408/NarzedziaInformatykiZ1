import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("file 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na nazwisko?");
        String surname = sc.nextLine();
        System.out.println("Masz na nazwisko " + surname);
        for(int i = 0; i < 16; i++){
            System.out.println(i);
        }
    }
}