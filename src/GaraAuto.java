//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GaraAuto {
    public static void main(String[] args) {

        Auto a =  new Auto();
        Thread ta = new Thread(a);
        ta.start();
    }
}