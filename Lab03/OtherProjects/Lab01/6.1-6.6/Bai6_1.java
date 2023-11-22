/*Nguyen_Anh_Trà_20215151*/
import javax.swing.JOptionPane;

public class Bai6_1{
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class tikcet?");
        JOptionPane.showMessageDialog(null, "Youve choosen: "
                    + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
