import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("file 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = sc.nextLine();
        System.out.println("Masz na imię " + name);
        for(int i = 0; i < 16; i++){
            System.out.println(i);
        }
    }
}