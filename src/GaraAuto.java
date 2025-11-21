import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GaraAuto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Inserisci numero partecipanti:");
        int n = sc.nextInt();

        System.out.println("Inserisci lunghezza della gara in metri:");
        double lunghezza = sc.nextDouble();

        List<Auto> partecipanti = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nNome auto " + i + ":");
            String nome = sc.next();

            double vel = 50 + rand.nextDouble() * 40;  // 40 = (90 - 50)

            System.out.println("Velocità di " + nome + ": " + vel + " m/s");

            partecipanti.add(new Auto(nome, vel, lunghezza));
        }

        Giudice giudice = new Giudice(partecipanti, lunghezza);
        giudice.startGara();

        sc.close();
    }
}
