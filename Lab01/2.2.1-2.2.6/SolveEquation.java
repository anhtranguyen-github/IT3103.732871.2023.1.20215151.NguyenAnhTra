/*Nguyen_Anh_Tra_20215151 */
import javax.swing.JOptionPane;
public class SolveEquation {
    public static void firstEquation(){
        String Numb1 = "",Numb2;
        String StrNotification = "Dap an cua bai toan: ";
        Short wong = 0;
        JOptionPane.showMessageDialog(null,
                "Dang phuong trinh bac1:\na*x+b=0","dang bai toan",JOptionPane.INFORMATION_MESSAGE);
        while(wong == 0){
            Numb1 = JOptionPane.showInputDialog(null,"Please enter a: ",
                    "Input the first number", JOptionPane.INFORMATION_MESSAGE);
            Double Num1 = Double.parseDouble(Numb1);
            if(Num1 != 0){ wong = 1; };
        };
        Numb2 = JOptionPane.showInputDialog(null,"Please enter b: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        Double Num2 = Double.parseDouble(Numb2);
        Double answer = - Num2 / (Double.parseDouble(Numb1)) ;
        StrNotification += answer;
        JOptionPane.showMessageDialog(null, StrNotification
                ,"ket qua bai toan",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void secondEquation(){
        JOptionPane.showMessageDialog(null,
                "Dang he phuong trinh 2 an:\na11*x1+a12*x2=b1\na21*x1+a22*x2=b2","dang bai toan",JOptionPane.INFORMATION_MESSAGE);

        String smth = JOptionPane.showInputDialog(null,"Please enter a11: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double a11 = Double.parseDouble(smth);
        smth = JOptionPane.showInputDialog(null,"Please enter a12: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double a12 = Double.parseDouble(smth);
        smth = JOptionPane.showInputDialog(null,"Please enter a21: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double a21 = Double.parseDouble(smth);
        smth = JOptionPane.showInputDialog(null,"Please enter a22: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double a22 = Double.parseDouble(smth);
        smth = JOptionPane.showInputDialog(null,"Please enter b1: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double b1 = Double.parseDouble(smth);
        smth = JOptionPane.showInputDialog(null,"Please enter b2: ",
                "Input the number", JOptionPane.INFORMATION_MESSAGE);
        Double b2 = Double.parseDouble(smth);
        Double D = a11 * a22 - a12 * a21;
        Double Dx = b1 * a22 - b2 * a12;
        Double Dy = a11 * b2 -a21 * b1;
        if(D == 0){
            JOptionPane.showMessageDialog(null,
                    "He phuong trinh vo nghiem", "Ket qua bai toan", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Double x1 = Dx / D;
            Double x2 = Dy / D;
            String StrNotification = "ket qua cua bai toan la: " ;
            StrNotification += x1.toString() ;
            StrNotification += " va " + x2.toString() ;
            JOptionPane.showMessageDialog(null,
                    StrNotification, "Ket qua bai toan", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void thirdEquation(){
        JOptionPane.showMessageDialog(null,
                "Dang phuong trinh bac 2\nax^2+bx+c=0", "dang bai toan", JOptionPane.INFORMATION_MESSAGE);
        String smt = JOptionPane.showInputDialog(null,
                "Please enter a: ", "Nhap a", JOptionPane.INFORMATION_MESSAGE);
        Double a = Double.parseDouble(smt);
        smt = JOptionPane.showInputDialog(null,
                "Please enter b: ", "Nhap b", JOptionPane.INFORMATION_MESSAGE);
        Double b = Double.parseDouble(smt);
        smt = JOptionPane.showInputDialog(null,
                "Please enter c: ", "Nhap c", JOptionPane.INFORMATION_MESSAGE);
        Double c = Double.parseDouble(smt);

        Double delta = b*b - 4*a*c;
        if(delta < 0){
            JOptionPane.showMessageDialog(null,
                    "Phuong trinh vo nghiem",  "khong co nghiem", JOptionPane.INFORMATION_MESSAGE);
        }else if(delta == 0){
            double x = -b/(2*a);
            String StrNotification = "Phuong trinh co 1 nghiem duy nhat:  " + x;
            JOptionPane.showMessageDialog(null,
                    StrNotification,  "1 nghiem", JOptionPane.INFORMATION_MESSAGE);
        }else{
            final double x1 = (-b + sqrt(delta))/(2*a);
            final double x2 = (-b + sqrt(delta))/(2*a);
            String StrNotification = "Phuong trinh co 2 ngiem: " + x1 + " va " +x2;
            JOptionPane.showMessageDialog(null,
                    StrNotification,  "2 nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static double sqrt(Double delta) {
        return 0;
    }


    public static void main(String[] args){
        String choice;
        choice = JOptionPane.showInputDialog(null ,
                "Please enter your choice:\n[1].Phuong trinh bac 1\n[2].He phuong trinh 2 an\n[3].Phuong trinh bac 2 ",
                "Show input choice", JOptionPane.INFORMATION_MESSAGE);
        short choicefield = Short.parseShort(choice);
        if(choicefield == 1){
            firstEquation();
        }else if (choicefield ==2) {
            secondEquation();
        } else if (choicefield ==3) {
            thirdEquation();
        };
    }
}
