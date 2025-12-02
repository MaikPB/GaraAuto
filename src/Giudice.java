import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Giudice {

    private static List<Auto> classifica =
            Collections.synchronizedList(new ArrayList<>());

    private List<Auto> partecipanti;
    private double lunghezzaGara;
    private GestoreFile;

    public Giudice(List<Auto> partecipanti, double lunghezzaGara) {
        this.partecipanti = partecipanti;
        this.lunghezzaGara = lunghezzaGara;
    }

    public void startGara() {
        System.out.println("\n===== INIZIO GARA =====");

        for (Auto a : partecipanti) {
            a.start();
        }

        // attende la fine di tutti i thread
        for (Auto a : partecipanti) {
            try {
                a.join();
            } catch (InterruptedException e) {
                System.out.println("Errore durante join.");
            }
        }

        System.out.println("===== FINE GARA =====\n");
        stampaClassifica();
    }

    public static synchronized void notificaArrivo(Auto a) {
        classifica.add(a);
    }

    private void stampaClassifica() {
        System.out.println("----- CLASSIFICA -----");
        int pos = 1;
        for (Auto a : classifica) {
            System.out.println(pos + "° posto: " + a.getNome());
            pos++;
        }
    }


}
