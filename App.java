import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    

    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }


public static void main(String[] args) {
    Calculator calc = new Calculator();
    while(true){
        
    double num1 = getDouble("What is your first number?");
    double num2 = getDouble("What is your second number?");

    

  
    }


    
    inputScanner.nextLine();

    String s = getString("Do you want to continue? Y/N");
    if(s.equals("y")||s.equals("Y"))
        continue;
    else if(s.equals("n")|| s.equals("N")){
        System.out.println("Goodbye");
        break;
    }
}

}
}