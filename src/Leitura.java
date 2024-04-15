import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("What's your favourite film?");
        String film = read.nextLine();
        System.out.println(film);
    }
}
