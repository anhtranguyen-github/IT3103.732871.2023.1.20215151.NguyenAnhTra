/*Nguyen_Anh_Tra_20215151 */
import javax.swing.JOptionPane;
public class Show2Numbers {
    public static void main(String args[]){
        String StrNumb1,StrNumb2;
        String StrNotification = "You've just enter: ";
        StrNumb1 = JOptionPane.showInputDialog(null,"Please enter your first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        StrNotification += StrNumb1 + " and ";
        StrNumb2 = JOptionPane.showInputDialog(null,"Please enter your second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        StrNotification += StrNumb2 ;
        JOptionPane.showMessageDialog(null, StrNotification,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
