import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int limit = 2;                                                  //Max liczba elementów.
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe pomiedzy 1 a "+limit));  //user input.

        while(userInput<=0||userInput>limit) {
            int trueFalse = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "Podano zla liczbe, sprobowac jeszcze raz?", "Uwaga", trueFalse);
            if (trueFalse == JOptionPane.YES_NO_OPTION) {
                userInput = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe pomiedzy 1 a " + limit));
            }
        }
        System.out.println("test");

    }
}
