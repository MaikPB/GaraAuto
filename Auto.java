public class Auto extends Thread {

    private String nome;
    private double velocita; // metri al secondo
    private double posizione = 0; // metri percorsi
    private boolean inGara = true;
    private double lunghezzaGara; // riceve dal Giudice

    public Auto(String nome, double velocita, double lunghezzaGara) {
        this.nome = nome;
        this.velocita = velocita;
        this.lunghezzaGara = lunghezzaGara;
    }

    public String getNome() {
        return nome;
    }

    public double getPosizione() {
        return posizione;
    }

    @Override
    public void run() {
        try {
            while (inGara && posizione < lunghezzaGara) {
                posizione += velocita;
                System.out.println(nome + " ha percorso " + posizione + " metri.");
                Thread.sleep(1000); // simula 1 secondo
            }

            if (posizione >= lunghezzaGara) {
                System.out.println(">>> " + nome + " ha tagliato il traguardo!");
                Giudice.notificaArrivo(this);
            }

        } catch (InterruptedException e) {
            System.out.println(nome + " ha avuto un problema e si ferma.");
        }
    }

    public void ferma() {
        inGara = false;
    }
}
