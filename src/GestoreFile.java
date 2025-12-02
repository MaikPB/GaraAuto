import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestoreFile {

    String nameFile;

    public void scriviFile(){

        private synchronized void saveCurrentRanking() {
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("Classifica dei passaggi:\n");
                for (Player player : players) {
                    writer.write("Giocatore " + player.getName() + ": " + player.getPassesMade() + " passaggi\n");
                }
                System.out.println("Classifica salvata nel file 'classifica.txt'.");
            } catch (IOException e) {
                System.err.println("Errore durante il salvataggio della classifica: " + e.getMessage());
            }
        }

    }

    public void leggiFile(){

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // try con risorse (gestisce in automatico l'apertura e la chiusura dello stream di lettura)
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Fine della classifica precedente.\n");
        } catch (IOException e) {
            System.err.println("Errore durante la lettura della classifica: " + e.getMessage());
        }

    }
}
