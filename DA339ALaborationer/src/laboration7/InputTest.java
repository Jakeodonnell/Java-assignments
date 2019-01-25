package laboration7;

import javax.swing.JOptionPane;

public class InputTest {
    public static void main(String[] args) {
        double nbr1, nbr2;
        nbr1 = Input.getDouble("Mata in ett heltal");
        nbr2 = Input.getDouble("Mata in ett heltal till");
        JOptionPane.showMessageDialog( null, "nbr1=" + nbr1 + "\nnbr2=" + nbr2 );
      
    }
}
