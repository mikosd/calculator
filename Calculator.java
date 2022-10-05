import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class Calculator{

    public void menu(){
        JMenu jMenuFile = new JMenu("Calculator");
        JMenuItem jMenuItem_Add = new JMenuItem("Add");
        JMenuItem jMenuItem_Subtract = new JMenuItem("Subtract");
        JMenuItem jMenuItem_Multiply = new JMenuItem("Multiply");
        JMenuItem jMenuItem_Divide = new JMenuItem("Divide");

        jMenuFile.add(jMenuItem_Add);
        jMenuFile.add(jMenuItem_Subtract);
        jMenuFile.add(jMenuItem_Multiply);
        jMenuFile.add(jMenuItem_Divide);

        jMenuFile.setSelected(true);
        jMenuFile.setPopupMenuVisible(true);
        jMenuDate 

    }


    public Calculator add(double a, double b){
        System.out.println("You want to add " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
        System.out.println("The result is: " + add(num1,num2));
    }

    public Calculator subtract(double a, double b){
        System.out.println("You want to subtract " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
        System.out.println("The result is: " + subtract(num1,num2));
    }

    public Calculator multiply(double a, double b){       
        System.out.println("You want to multiply " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
        System.out.println("The result is: " + multiply(num1,num2));
    }

    public Calculator divide(double a, double b){
        System.out.println("You want to divide " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
        System.out.println("The result is: " + divide(num1,num2));
    }

}