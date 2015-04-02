import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe pomiedzy 1 a "+Limit()));  //user input.
        Menu(userInput, Limit());
    }
    public static int Limit(){
        int limit = 2;
        return limit;
    }
//TODO bugfixes
    public static void Menu(int userInput, int limit){
        while(userInput<=0||userInput>limit) {
            int trueFalse = JOptionPane.showConfirmDialog(null, "Podano zla liczbe, sprobowac jeszcze raz?", "Uwaga", JOptionPane.YES_NO_OPTION);
            if (trueFalse==JOptionPane.YES_OPTION) {
                userInput = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe pomiedzy 1 a " + limit));
                Menu(userInput, limit);
            }else{
                System.exit(0);
            }
        }
        Result(userInput);
    }
    public static void TryAgain(){
        int trueFalse = JOptionPane.showConfirmDialog(null, "Jeszcze raz?", "Uwaga", JOptionPane.YES_NO_OPTION);
        if (trueFalse == JOptionPane.YES_OPTION) {
            int userInput = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe pomiedzy 1 a "+Limit()));
            Menu(userInput, Limit());
        }else{
            System.exit(0);
        }
    }
    public static void Result(int userInput){
        switch (userInput){
            case 1: System.out.println("I'm a vampire, I'm a vampire."); TryAgain(); break;
            case 2: System.out.println("Fucking iguanas..."); TryAgain(); break;
            default: System.out.println("Ummm wtf?");
        }
    }
}
