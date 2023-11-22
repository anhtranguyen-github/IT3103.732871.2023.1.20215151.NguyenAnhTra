/*Nguyen_Anh_Tra_20215151 */
import javax.swing.JOptionPane;
public class Sumof2 {
    public static void main(String[] args){
        String StrNumb1,StrNumb2;
        String StrNotification = "Tong cua 2 so la: ";
        StrNumb1 = JOptionPane.showInputDialog(null,"Please enter your first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        StrNumb2 = JOptionPane.showInputDialog(null,"Please enter your second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(StrNumb1);
        double num2 = num1 + Double.parseDouble(StrNumb2);
        StrNotification += num2 ;
        JOptionPane.showMessageDialog(null, StrNotification,"Sum of 2",JOptionPane.INFORMATION_MESSAGE);

    }
}
